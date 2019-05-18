grammar regex;

parse
 : alternation EOF
 ;

// ALTERNATION
//
//         expr|expr|expr...
alternation
 : expr ('|' expr)*
 ;

expr
 : element*
 ;

element
 : atom quantifier?
 ;

// QUANTIFIERS
//
//         ?           0 or 1, greedy
//         *           0 or more, greedy
//         +           1 or more, greedy
//         {n}         exactly n
//         {n,m}       at least n, no more than m, greedy
//         {n,}        n or more, greedy
quantifier
 : '?' 
 | '+' 
 | '*' 
 | '{' number '}' 
 | '{' number ',' '}' 
 | '{' number ',' number '}' 
 ;


// CHARACTER CLASSES
//
//         [...]       positive character class
//         [^...]      negative character class
//         [x-y]       range 
//
//         alnum       alphanumeric
//         alpha       alphabetic
//         ascii       0-127
//         blank       space or tab
//         cntrl       control character
//         digit       decimal digit
//         graph       printing, excluding space
//         lower       lower case letter
//         print       printing, including space
//         punct       printing, excluding alphanumeric
//         space       white space
//         upper       upper case letter
//         word        same as \w
//         xdigit      hexadecimal digit
//
character_class
 : '[' '^' CharacterClassEnd Hyphen cc_atom+ ']'
 | '[' '^' CharacterClassEnd cc_atom* ']'
 | '[' '^' cc_atom+ ']'
 | '[' CharacterClassEnd Hyphen cc_atom+ ']'
 | '[' CharacterClassEnd cc_atom* ']'
 | '[' cc_atom+ ']'
 ;

// CAPTURING
//
//         (...)           capturing group
//         (?:...)         non-capturing group
//         (?|...)         non-capturing group; reset group numbers for
//                          capturing groups in each alternative
//
// ATOMIC GROUPS
//
//         (?>...)         atomic, non-capturing group
capture
 : '(' alternation ')'
 ;

non_capture
 : '(' '?' ':' alternation ')'
 | '(' '?' '|' alternation ')'
 | '(' '?' '>' alternation ')'
 ;

// COMMENT
//
//         (?#....)        comment 
comment
 : '(' '?' '#' non_close_parens ')'
 ;
// LOOKAHEAD AND LOOKBEHIND ASSERTIONS
//
//         (?=...)         positive look ahead
//         (?!...)         negative look ahead
//         (?<=...)        positive look behind
//         (?<!...)        negative look behind
//
//       Each top-level branch of a look behind must be of a fixed length.
look_around
 : '(' '?' '=' alternation ')'
 | '(' '?' '!' alternation ')'
 | '(' '?' '<' '=' alternation ')'
 | '(' '?' '<' '!' alternation ')'
 ;


atom
 : shared_atom
 | literal
 | character_class
 | capture
 | non_capture
 | comment
 | look_around
 | Dot
 | Caret
 | WordBoundary
 | NonWordBoundary
 | EndOfSubjectOrLine
 ;

cc_atom
 : cc_literal Hyphen cc_literal
 | shared_atom
 | cc_literal
 ;

shared_atom
 :  DecimalDigit
 | NotDecimalDigit
 | NotNewLine
 | NewLineSequence
 | WhiteSpace
 | NotWhiteSpace
 | WordChar
 | NotWordChar
 ;

literal
 : shared_literal
 | CharacterClassEnd
 ;

cc_literal
 : shared_literal
 | Dot
 | CharacterClassStart
 | Caret
 | QuestionMark
 | Plus
 | Star
 | WordBoundary
 | EndOfSubjectOrLine
 | Pipe
 | OpenParen
 | CloseParen
 ;

shared_literal
 : octal_char
 | letter
 | digit
 | EscapeChar
 | NewLine
 | CarriageReturn
 | Tab
 | Quoted
 | BlockQuoted
 | OpenBrace
 | CloseBrace
 | Comma
 | Hyphen
 | LessThan
 | GreaterThan
 | SingleQuote
 | Underscore
 | Colon
 | Hash
 | Equals
 | Exclamation
 | Ampersand
 | OtherChar
 ;

number
 : digits
 ;

octal_char
 : ( Backslash ('0' | '1' | '2' | '3') octal_digit octal_digit
   | Backslash octal_digit octal_digit
   )

 ;

octal_digit
 : '0' | '1' | '2' | '3' | '4' | '5' | '6' | '7'
 ;

digits
 : digit+
 ;

digit
 : '0' | '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9'
 ;

name
 : alpha_nums
 ;

alpha_nums
 : (letter | Underscore) (letter | Underscore | digit)*
 ;

non_close_parens
 : non_close_paren+
 ;

non_close_paren
 : ~CloseParen
 ;

letter
 : 'a' | 'b' | 'c' | 'd' | 'e' | 'f' | 'g' | 'h' | 'i' | 'j' | 'k' | 'l' | 'm' | 'n' | 'o' | 'p' | 'q' | 'r' | 's' | 't' | 'u' | 'w' | 'x' | 'y' | 'z' |
   'A' | 'B' | 'C' | 'D' | 'E' | 'F' | 'G' | 'H' | 'I' | 'J' | 'K' | 'L' | 'M' | 'N' | 'O' | 'P' | 'Q' | 'R' | 'S' | 'T' | 'U' | 'W' | 'X' | 'Y' | 'Z'
 ;

// QUOTING
//
//         \x         where x is non-alphanumeric is a literal x
//         \Q...\E    treat enclosed characters as literal
Quoted      : '\\' NonAlphaNumeric;
BlockQuoted : '\\Q' .*? '\\E';

// CHARACTERS
//
//         \e         escape (hex 1B)
//         \n         newline (hex 0A)
//         \r         carriage return (hex 0D)
//         \t         tab (hex 09)
EscapeChar     : '\\e';
NewLine        : '\\n';
CarriageReturn : '\\r';
Tab            : '\\t';
Backslash      : '\\';

// CHARACTER TYPES
//
//         .          any character except newline;
//                      in dotall mode, any character whatsoever
//         \C         one data unit, even in UTF mode (best avoided)
//         \d         a decimal digit
//         \D         a character that is not a decimal digit
//         \N         a character that is not a newline
//         \R         a newline sequence
//         \s         a white space character
//         \S         a character that is not a white space character
//         \w         a "word" character
//         \W         a "non-word" character
//
Dot                     : '.';
DecimalDigit            : '\\d';
NotDecimalDigit         : '\\D';
NotNewLine              : '\\N';
NewLineSequence         : '\\R';
WhiteSpace              : '\\s';
NotWhiteSpace           : '\\S';
WordChar                : '\\w';
NotWordChar             : '\\W';

// CHARACTER CLASSES
//
//         [...]       positive character class
//         [^...]      negative character class
//         [x-y]       range (can be used for hex characters)
//
//         alnum       alphanumeric
//         alpha       alphabetic
//         ascii       0-127
//         blank       space or tab
//         cntrl       control character
//         digit       decimal digit
//         graph       printing, excluding space
//         lower       lower case letter
//         print       printing, including space
//         punct       printing, excluding alphanumeric
//         space       white space
//         upper       upper case letter
//         word        same as \w
//         xdigit      hexadecimal digit
//
CharacterClassStart  : '[';
CharacterClassEnd    : ']';
Caret                : '^';
Hyphen               : '-';

QuestionMark : '?';
Plus         : '+';
Star         : '*';
OpenBrace    : '{';
CloseBrace   : '}';
Comma        : ',';

// ANCHORS AND SIMPLE ASSERTIONS
//
//         \b          word boundary
//         \B          not a word boundary
//         ^           start of subject
//                      also after internal newline in multiline mode
//         $           end of subject
//                      also before newline at end of subject
//                      also before internal newline in multiline mode
WordBoundary                   : '\\b';
NonWordBoundary                : '\\B';

EndOfSubjectOrLine             : '$';


Pipe        : '|';
OpenParen   : '(';
CloseParen  : ')';
LessThan    : '<';
GreaterThan : '>';
SingleQuote : '\'';
Underscore  : '_';
Colon       : ':';
Hash        : '#';
Equals      : '=';
Exclamation : '!';
Ampersand   : '&';

OtherChar : . ;

// fragments
fragment UnderscoreAlphaNumerics : ('_' | AlphaNumeric)+;
fragment AlphaNumerics           : AlphaNumeric+;
fragment AlphaNumeric            : [a-zA-Z0-9];
fragment NonAlphaNumeric         : ~[a-zA-Z0-9];
fragment HexDigit                : [0-9a-fA-F];
fragment ASCII                   : [\u0000-\u007F];
