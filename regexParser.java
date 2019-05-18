// Generated from regex.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class regexParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		T__59=60, Quoted=61, BlockQuoted=62, EscapeChar=63, NewLine=64, CarriageReturn=65, 
		Tab=66, Backslash=67, Dot=68, DecimalDigit=69, NotDecimalDigit=70, NotNewLine=71, 
		NewLineSequence=72, WhiteSpace=73, NotWhiteSpace=74, WordChar=75, NotWordChar=76, 
		CharacterClassStart=77, CharacterClassEnd=78, Caret=79, Hyphen=80, QuestionMark=81, 
		Plus=82, Star=83, OpenBrace=84, CloseBrace=85, Comma=86, WordBoundary=87, 
		NonWordBoundary=88, EndOfSubjectOrLine=89, Pipe=90, OpenParen=91, CloseParen=92, 
		LessThan=93, GreaterThan=94, SingleQuote=95, Underscore=96, Colon=97, 
		Hash=98, Equals=99, Exclamation=100, Ampersand=101, OtherChar=102;
	public static final int
		RULE_parse = 0, RULE_alternation = 1, RULE_expr = 2, RULE_element = 3, 
		RULE_quantifier = 4, RULE_character_class = 5, RULE_capture = 6, RULE_non_capture = 7, 
		RULE_comment = 8, RULE_look_around = 9, RULE_atom = 10, RULE_cc_atom = 11, 
		RULE_shared_atom = 12, RULE_literal = 13, RULE_cc_literal = 14, RULE_shared_literal = 15, 
		RULE_number = 16, RULE_octal_char = 17, RULE_octal_digit = 18, RULE_digits = 19, 
		RULE_digit = 20, RULE_name = 21, RULE_alpha_nums = 22, RULE_non_close_parens = 23, 
		RULE_non_close_paren = 24, RULE_letter = 25;
	private static String[] makeRuleNames() {
		return new String[] {
			"parse", "alternation", "expr", "element", "quantifier", "character_class", 
			"capture", "non_capture", "comment", "look_around", "atom", "cc_atom", 
			"shared_atom", "literal", "cc_literal", "shared_literal", "number", "octal_char", 
			"octal_digit", "digits", "digit", "name", "alpha_nums", "non_close_parens", 
			"non_close_paren", "letter"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'0'", "'1'", "'2'", "'3'", "'4'", "'5'", "'6'", "'7'", "'8'", 
			"'9'", "'a'", "'b'", "'c'", "'d'", "'e'", "'f'", "'g'", "'h'", "'i'", 
			"'j'", "'k'", "'l'", "'m'", "'n'", "'o'", "'p'", "'q'", "'r'", "'s'", 
			"'t'", "'u'", "'w'", "'x'", "'y'", "'z'", "'A'", "'B'", "'C'", "'D'", 
			"'E'", "'F'", "'G'", "'H'", "'I'", "'J'", "'K'", "'L'", "'M'", "'N'", 
			"'O'", "'P'", "'Q'", "'R'", "'S'", "'T'", "'U'", "'W'", "'X'", "'Y'", 
			"'Z'", null, null, "'\\e'", "'\\n'", "'\\r'", "'\\t'", "'\\'", "'.'", 
			"'\\d'", "'\\D'", "'\\N'", "'\\R'", "'\\s'", "'\\S'", "'\\w'", "'\\W'", 
			"'['", "']'", "'^'", "'-'", "'?'", "'+'", "'*'", "'{'", "'}'", "','", 
			"'\\b'", "'\\B'", "'$'", "'|'", "'('", "')'", "'<'", "'>'", "'''", "'_'", 
			"':'", "'#'", "'='", "'!'", "'&'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "Quoted", "BlockQuoted", "EscapeChar", "NewLine", "CarriageReturn", 
			"Tab", "Backslash", "Dot", "DecimalDigit", "NotDecimalDigit", "NotNewLine", 
			"NewLineSequence", "WhiteSpace", "NotWhiteSpace", "WordChar", "NotWordChar", 
			"CharacterClassStart", "CharacterClassEnd", "Caret", "Hyphen", "QuestionMark", 
			"Plus", "Star", "OpenBrace", "CloseBrace", "Comma", "WordBoundary", "NonWordBoundary", 
			"EndOfSubjectOrLine", "Pipe", "OpenParen", "CloseParen", "LessThan", 
			"GreaterThan", "SingleQuote", "Underscore", "Colon", "Hash", "Equals", 
			"Exclamation", "Ampersand", "OtherChar"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "regex.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public regexParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ParseContext extends ParserRuleContext {
		public AlternationContext alternation() {
			return getRuleContext(AlternationContext.class,0);
		}
		public TerminalNode EOF() { return getToken(regexParser.EOF, 0); }
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof regexListener ) ((regexListener)listener).enterParse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof regexListener ) ((regexListener)listener).exitParse(this);
		}
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			alternation();
			setState(53);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlternationContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> Pipe() { return getTokens(regexParser.Pipe); }
		public TerminalNode Pipe(int i) {
			return getToken(regexParser.Pipe, i);
		}
		public AlternationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alternation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof regexListener ) ((regexListener)listener).enterAlternation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof regexListener ) ((regexListener)listener).exitAlternation(this);
		}
	}

	public final AlternationContext alternation() throws RecognitionException {
		AlternationContext _localctx = new AlternationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_alternation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			expr();
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Pipe) {
				{
				{
				setState(56);
				match(Pipe);
				setState(57);
				expr();
				}
				}
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof regexListener ) ((regexListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof regexListener ) ((regexListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << Quoted) | (1L << BlockQuoted) | (1L << EscapeChar))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NewLine - 64)) | (1L << (CarriageReturn - 64)) | (1L << (Tab - 64)) | (1L << (Backslash - 64)) | (1L << (Dot - 64)) | (1L << (DecimalDigit - 64)) | (1L << (NotDecimalDigit - 64)) | (1L << (NotNewLine - 64)) | (1L << (NewLineSequence - 64)) | (1L << (WhiteSpace - 64)) | (1L << (NotWhiteSpace - 64)) | (1L << (WordChar - 64)) | (1L << (NotWordChar - 64)) | (1L << (CharacterClassStart - 64)) | (1L << (CharacterClassEnd - 64)) | (1L << (Caret - 64)) | (1L << (Hyphen - 64)) | (1L << (OpenBrace - 64)) | (1L << (CloseBrace - 64)) | (1L << (Comma - 64)) | (1L << (WordBoundary - 64)) | (1L << (NonWordBoundary - 64)) | (1L << (EndOfSubjectOrLine - 64)) | (1L << (OpenParen - 64)) | (1L << (LessThan - 64)) | (1L << (GreaterThan - 64)) | (1L << (SingleQuote - 64)) | (1L << (Underscore - 64)) | (1L << (Colon - 64)) | (1L << (Hash - 64)) | (1L << (Equals - 64)) | (1L << (Exclamation - 64)) | (1L << (Ampersand - 64)) | (1L << (OtherChar - 64)))) != 0)) {
				{
				{
				setState(63);
				element();
				}
				}
				setState(68);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementContext extends ParserRuleContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public QuantifierContext quantifier() {
			return getRuleContext(QuantifierContext.class,0);
		}
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof regexListener ) ((regexListener)listener).enterElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof regexListener ) ((regexListener)listener).exitElement(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			atom();
			setState(71);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(70);
				quantifier();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QuantifierContext extends ParserRuleContext {
		public TerminalNode QuestionMark() { return getToken(regexParser.QuestionMark, 0); }
		public TerminalNode Plus() { return getToken(regexParser.Plus, 0); }
		public TerminalNode Star() { return getToken(regexParser.Star, 0); }
		public TerminalNode OpenBrace() { return getToken(regexParser.OpenBrace, 0); }
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public TerminalNode CloseBrace() { return getToken(regexParser.CloseBrace, 0); }
		public TerminalNode Comma() { return getToken(regexParser.Comma, 0); }
		public QuantifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quantifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof regexListener ) ((regexListener)listener).enterQuantifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof regexListener ) ((regexListener)listener).exitQuantifier(this);
		}
	}

	public final QuantifierContext quantifier() throws RecognitionException {
		QuantifierContext _localctx = new QuantifierContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_quantifier);
		try {
			setState(91);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(73);
				match(QuestionMark);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(74);
				match(Plus);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(75);
				match(Star);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(76);
				match(OpenBrace);
				setState(77);
				number();
				setState(78);
				match(CloseBrace);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(80);
				match(OpenBrace);
				setState(81);
				number();
				setState(82);
				match(Comma);
				setState(83);
				match(CloseBrace);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(85);
				match(OpenBrace);
				setState(86);
				number();
				setState(87);
				match(Comma);
				setState(88);
				number();
				setState(89);
				match(CloseBrace);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Character_classContext extends ParserRuleContext {
		public TerminalNode CharacterClassStart() { return getToken(regexParser.CharacterClassStart, 0); }
		public TerminalNode Caret() { return getToken(regexParser.Caret, 0); }
		public List<TerminalNode> CharacterClassEnd() { return getTokens(regexParser.CharacterClassEnd); }
		public TerminalNode CharacterClassEnd(int i) {
			return getToken(regexParser.CharacterClassEnd, i);
		}
		public TerminalNode Hyphen() { return getToken(regexParser.Hyphen, 0); }
		public List<Cc_atomContext> cc_atom() {
			return getRuleContexts(Cc_atomContext.class);
		}
		public Cc_atomContext cc_atom(int i) {
			return getRuleContext(Cc_atomContext.class,i);
		}
		public Character_classContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_character_class; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof regexListener ) ((regexListener)listener).enterCharacter_class(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof regexListener ) ((regexListener)listener).exitCharacter_class(this);
		}
	}

	public final Character_classContext character_class() throws RecognitionException {
		Character_classContext _localctx = new Character_classContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_character_class);
		int _la;
		try {
			setState(150);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(93);
				match(CharacterClassStart);
				setState(94);
				match(Caret);
				setState(95);
				match(CharacterClassEnd);
				setState(96);
				match(Hyphen);
				setState(98); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(97);
					cc_atom();
					}
					}
					setState(100); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << Quoted) | (1L << BlockQuoted) | (1L << EscapeChar))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NewLine - 64)) | (1L << (CarriageReturn - 64)) | (1L << (Tab - 64)) | (1L << (Backslash - 64)) | (1L << (Dot - 64)) | (1L << (DecimalDigit - 64)) | (1L << (NotDecimalDigit - 64)) | (1L << (NotNewLine - 64)) | (1L << (NewLineSequence - 64)) | (1L << (WhiteSpace - 64)) | (1L << (NotWhiteSpace - 64)) | (1L << (WordChar - 64)) | (1L << (NotWordChar - 64)) | (1L << (CharacterClassStart - 64)) | (1L << (Caret - 64)) | (1L << (Hyphen - 64)) | (1L << (QuestionMark - 64)) | (1L << (Plus - 64)) | (1L << (Star - 64)) | (1L << (OpenBrace - 64)) | (1L << (CloseBrace - 64)) | (1L << (Comma - 64)) | (1L << (WordBoundary - 64)) | (1L << (EndOfSubjectOrLine - 64)) | (1L << (Pipe - 64)) | (1L << (OpenParen - 64)) | (1L << (CloseParen - 64)) | (1L << (LessThan - 64)) | (1L << (GreaterThan - 64)) | (1L << (SingleQuote - 64)) | (1L << (Underscore - 64)) | (1L << (Colon - 64)) | (1L << (Hash - 64)) | (1L << (Equals - 64)) | (1L << (Exclamation - 64)) | (1L << (Ampersand - 64)) | (1L << (OtherChar - 64)))) != 0) );
				setState(102);
				match(CharacterClassEnd);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(104);
				match(CharacterClassStart);
				setState(105);
				match(Caret);
				setState(106);
				match(CharacterClassEnd);
				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << Quoted) | (1L << BlockQuoted) | (1L << EscapeChar))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NewLine - 64)) | (1L << (CarriageReturn - 64)) | (1L << (Tab - 64)) | (1L << (Backslash - 64)) | (1L << (Dot - 64)) | (1L << (DecimalDigit - 64)) | (1L << (NotDecimalDigit - 64)) | (1L << (NotNewLine - 64)) | (1L << (NewLineSequence - 64)) | (1L << (WhiteSpace - 64)) | (1L << (NotWhiteSpace - 64)) | (1L << (WordChar - 64)) | (1L << (NotWordChar - 64)) | (1L << (CharacterClassStart - 64)) | (1L << (Caret - 64)) | (1L << (Hyphen - 64)) | (1L << (QuestionMark - 64)) | (1L << (Plus - 64)) | (1L << (Star - 64)) | (1L << (OpenBrace - 64)) | (1L << (CloseBrace - 64)) | (1L << (Comma - 64)) | (1L << (WordBoundary - 64)) | (1L << (EndOfSubjectOrLine - 64)) | (1L << (Pipe - 64)) | (1L << (OpenParen - 64)) | (1L << (CloseParen - 64)) | (1L << (LessThan - 64)) | (1L << (GreaterThan - 64)) | (1L << (SingleQuote - 64)) | (1L << (Underscore - 64)) | (1L << (Colon - 64)) | (1L << (Hash - 64)) | (1L << (Equals - 64)) | (1L << (Exclamation - 64)) | (1L << (Ampersand - 64)) | (1L << (OtherChar - 64)))) != 0)) {
					{
					{
					setState(107);
					cc_atom();
					}
					}
					setState(112);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(113);
				match(CharacterClassEnd);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(114);
				match(CharacterClassStart);
				setState(115);
				match(Caret);
				setState(117); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(116);
					cc_atom();
					}
					}
					setState(119); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << Quoted) | (1L << BlockQuoted) | (1L << EscapeChar))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NewLine - 64)) | (1L << (CarriageReturn - 64)) | (1L << (Tab - 64)) | (1L << (Backslash - 64)) | (1L << (Dot - 64)) | (1L << (DecimalDigit - 64)) | (1L << (NotDecimalDigit - 64)) | (1L << (NotNewLine - 64)) | (1L << (NewLineSequence - 64)) | (1L << (WhiteSpace - 64)) | (1L << (NotWhiteSpace - 64)) | (1L << (WordChar - 64)) | (1L << (NotWordChar - 64)) | (1L << (CharacterClassStart - 64)) | (1L << (Caret - 64)) | (1L << (Hyphen - 64)) | (1L << (QuestionMark - 64)) | (1L << (Plus - 64)) | (1L << (Star - 64)) | (1L << (OpenBrace - 64)) | (1L << (CloseBrace - 64)) | (1L << (Comma - 64)) | (1L << (WordBoundary - 64)) | (1L << (EndOfSubjectOrLine - 64)) | (1L << (Pipe - 64)) | (1L << (OpenParen - 64)) | (1L << (CloseParen - 64)) | (1L << (LessThan - 64)) | (1L << (GreaterThan - 64)) | (1L << (SingleQuote - 64)) | (1L << (Underscore - 64)) | (1L << (Colon - 64)) | (1L << (Hash - 64)) | (1L << (Equals - 64)) | (1L << (Exclamation - 64)) | (1L << (Ampersand - 64)) | (1L << (OtherChar - 64)))) != 0) );
				setState(121);
				match(CharacterClassEnd);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(123);
				match(CharacterClassStart);
				setState(124);
				match(CharacterClassEnd);
				setState(125);
				match(Hyphen);
				setState(127); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(126);
					cc_atom();
					}
					}
					setState(129); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << Quoted) | (1L << BlockQuoted) | (1L << EscapeChar))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NewLine - 64)) | (1L << (CarriageReturn - 64)) | (1L << (Tab - 64)) | (1L << (Backslash - 64)) | (1L << (Dot - 64)) | (1L << (DecimalDigit - 64)) | (1L << (NotDecimalDigit - 64)) | (1L << (NotNewLine - 64)) | (1L << (NewLineSequence - 64)) | (1L << (WhiteSpace - 64)) | (1L << (NotWhiteSpace - 64)) | (1L << (WordChar - 64)) | (1L << (NotWordChar - 64)) | (1L << (CharacterClassStart - 64)) | (1L << (Caret - 64)) | (1L << (Hyphen - 64)) | (1L << (QuestionMark - 64)) | (1L << (Plus - 64)) | (1L << (Star - 64)) | (1L << (OpenBrace - 64)) | (1L << (CloseBrace - 64)) | (1L << (Comma - 64)) | (1L << (WordBoundary - 64)) | (1L << (EndOfSubjectOrLine - 64)) | (1L << (Pipe - 64)) | (1L << (OpenParen - 64)) | (1L << (CloseParen - 64)) | (1L << (LessThan - 64)) | (1L << (GreaterThan - 64)) | (1L << (SingleQuote - 64)) | (1L << (Underscore - 64)) | (1L << (Colon - 64)) | (1L << (Hash - 64)) | (1L << (Equals - 64)) | (1L << (Exclamation - 64)) | (1L << (Ampersand - 64)) | (1L << (OtherChar - 64)))) != 0) );
				setState(131);
				match(CharacterClassEnd);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(133);
				match(CharacterClassStart);
				setState(134);
				match(CharacterClassEnd);
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << Quoted) | (1L << BlockQuoted) | (1L << EscapeChar))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NewLine - 64)) | (1L << (CarriageReturn - 64)) | (1L << (Tab - 64)) | (1L << (Backslash - 64)) | (1L << (Dot - 64)) | (1L << (DecimalDigit - 64)) | (1L << (NotDecimalDigit - 64)) | (1L << (NotNewLine - 64)) | (1L << (NewLineSequence - 64)) | (1L << (WhiteSpace - 64)) | (1L << (NotWhiteSpace - 64)) | (1L << (WordChar - 64)) | (1L << (NotWordChar - 64)) | (1L << (CharacterClassStart - 64)) | (1L << (Caret - 64)) | (1L << (Hyphen - 64)) | (1L << (QuestionMark - 64)) | (1L << (Plus - 64)) | (1L << (Star - 64)) | (1L << (OpenBrace - 64)) | (1L << (CloseBrace - 64)) | (1L << (Comma - 64)) | (1L << (WordBoundary - 64)) | (1L << (EndOfSubjectOrLine - 64)) | (1L << (Pipe - 64)) | (1L << (OpenParen - 64)) | (1L << (CloseParen - 64)) | (1L << (LessThan - 64)) | (1L << (GreaterThan - 64)) | (1L << (SingleQuote - 64)) | (1L << (Underscore - 64)) | (1L << (Colon - 64)) | (1L << (Hash - 64)) | (1L << (Equals - 64)) | (1L << (Exclamation - 64)) | (1L << (Ampersand - 64)) | (1L << (OtherChar - 64)))) != 0)) {
					{
					{
					setState(135);
					cc_atom();
					}
					}
					setState(140);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(141);
				match(CharacterClassEnd);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(142);
				match(CharacterClassStart);
				setState(144); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(143);
					cc_atom();
					}
					}
					setState(146); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << Quoted) | (1L << BlockQuoted) | (1L << EscapeChar))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NewLine - 64)) | (1L << (CarriageReturn - 64)) | (1L << (Tab - 64)) | (1L << (Backslash - 64)) | (1L << (Dot - 64)) | (1L << (DecimalDigit - 64)) | (1L << (NotDecimalDigit - 64)) | (1L << (NotNewLine - 64)) | (1L << (NewLineSequence - 64)) | (1L << (WhiteSpace - 64)) | (1L << (NotWhiteSpace - 64)) | (1L << (WordChar - 64)) | (1L << (NotWordChar - 64)) | (1L << (CharacterClassStart - 64)) | (1L << (Caret - 64)) | (1L << (Hyphen - 64)) | (1L << (QuestionMark - 64)) | (1L << (Plus - 64)) | (1L << (Star - 64)) | (1L << (OpenBrace - 64)) | (1L << (CloseBrace - 64)) | (1L << (Comma - 64)) | (1L << (WordBoundary - 64)) | (1L << (EndOfSubjectOrLine - 64)) | (1L << (Pipe - 64)) | (1L << (OpenParen - 64)) | (1L << (CloseParen - 64)) | (1L << (LessThan - 64)) | (1L << (GreaterThan - 64)) | (1L << (SingleQuote - 64)) | (1L << (Underscore - 64)) | (1L << (Colon - 64)) | (1L << (Hash - 64)) | (1L << (Equals - 64)) | (1L << (Exclamation - 64)) | (1L << (Ampersand - 64)) | (1L << (OtherChar - 64)))) != 0) );
				setState(148);
				match(CharacterClassEnd);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaptureContext extends ParserRuleContext {
		public TerminalNode OpenParen() { return getToken(regexParser.OpenParen, 0); }
		public AlternationContext alternation() {
			return getRuleContext(AlternationContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(regexParser.CloseParen, 0); }
		public CaptureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_capture; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof regexListener ) ((regexListener)listener).enterCapture(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof regexListener ) ((regexListener)listener).exitCapture(this);
		}
	}

	public final CaptureContext capture() throws RecognitionException {
		CaptureContext _localctx = new CaptureContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_capture);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(OpenParen);
			setState(153);
			alternation();
			setState(154);
			match(CloseParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Non_captureContext extends ParserRuleContext {
		public TerminalNode OpenParen() { return getToken(regexParser.OpenParen, 0); }
		public TerminalNode QuestionMark() { return getToken(regexParser.QuestionMark, 0); }
		public TerminalNode Colon() { return getToken(regexParser.Colon, 0); }
		public AlternationContext alternation() {
			return getRuleContext(AlternationContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(regexParser.CloseParen, 0); }
		public TerminalNode Pipe() { return getToken(regexParser.Pipe, 0); }
		public TerminalNode GreaterThan() { return getToken(regexParser.GreaterThan, 0); }
		public Non_captureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_non_capture; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof regexListener ) ((regexListener)listener).enterNon_capture(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof regexListener ) ((regexListener)listener).exitNon_capture(this);
		}
	}

	public final Non_captureContext non_capture() throws RecognitionException {
		Non_captureContext _localctx = new Non_captureContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_non_capture);
		try {
			setState(174);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(156);
				match(OpenParen);
				setState(157);
				match(QuestionMark);
				setState(158);
				match(Colon);
				setState(159);
				alternation();
				setState(160);
				match(CloseParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(162);
				match(OpenParen);
				setState(163);
				match(QuestionMark);
				setState(164);
				match(Pipe);
				setState(165);
				alternation();
				setState(166);
				match(CloseParen);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(168);
				match(OpenParen);
				setState(169);
				match(QuestionMark);
				setState(170);
				match(GreaterThan);
				setState(171);
				alternation();
				setState(172);
				match(CloseParen);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommentContext extends ParserRuleContext {
		public TerminalNode OpenParen() { return getToken(regexParser.OpenParen, 0); }
		public TerminalNode QuestionMark() { return getToken(regexParser.QuestionMark, 0); }
		public TerminalNode Hash() { return getToken(regexParser.Hash, 0); }
		public Non_close_parensContext non_close_parens() {
			return getRuleContext(Non_close_parensContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(regexParser.CloseParen, 0); }
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof regexListener ) ((regexListener)listener).enterComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof regexListener ) ((regexListener)listener).exitComment(this);
		}
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_comment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(OpenParen);
			setState(177);
			match(QuestionMark);
			setState(178);
			match(Hash);
			setState(179);
			non_close_parens();
			setState(180);
			match(CloseParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Look_aroundContext extends ParserRuleContext {
		public TerminalNode OpenParen() { return getToken(regexParser.OpenParen, 0); }
		public TerminalNode QuestionMark() { return getToken(regexParser.QuestionMark, 0); }
		public TerminalNode Equals() { return getToken(regexParser.Equals, 0); }
		public AlternationContext alternation() {
			return getRuleContext(AlternationContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(regexParser.CloseParen, 0); }
		public TerminalNode Exclamation() { return getToken(regexParser.Exclamation, 0); }
		public TerminalNode LessThan() { return getToken(regexParser.LessThan, 0); }
		public Look_aroundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_look_around; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof regexListener ) ((regexListener)listener).enterLook_around(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof regexListener ) ((regexListener)listener).exitLook_around(this);
		}
	}

	public final Look_aroundContext look_around() throws RecognitionException {
		Look_aroundContext _localctx = new Look_aroundContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_look_around);
		try {
			setState(208);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(182);
				match(OpenParen);
				setState(183);
				match(QuestionMark);
				setState(184);
				match(Equals);
				setState(185);
				alternation();
				setState(186);
				match(CloseParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(188);
				match(OpenParen);
				setState(189);
				match(QuestionMark);
				setState(190);
				match(Exclamation);
				setState(191);
				alternation();
				setState(192);
				match(CloseParen);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(194);
				match(OpenParen);
				setState(195);
				match(QuestionMark);
				setState(196);
				match(LessThan);
				setState(197);
				match(Equals);
				setState(198);
				alternation();
				setState(199);
				match(CloseParen);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(201);
				match(OpenParen);
				setState(202);
				match(QuestionMark);
				setState(203);
				match(LessThan);
				setState(204);
				match(Exclamation);
				setState(205);
				alternation();
				setState(206);
				match(CloseParen);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AtomContext extends ParserRuleContext {
		public Shared_atomContext shared_atom() {
			return getRuleContext(Shared_atomContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public Character_classContext character_class() {
			return getRuleContext(Character_classContext.class,0);
		}
		public CaptureContext capture() {
			return getRuleContext(CaptureContext.class,0);
		}
		public Non_captureContext non_capture() {
			return getRuleContext(Non_captureContext.class,0);
		}
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public Look_aroundContext look_around() {
			return getRuleContext(Look_aroundContext.class,0);
		}
		public TerminalNode Dot() { return getToken(regexParser.Dot, 0); }
		public TerminalNode Caret() { return getToken(regexParser.Caret, 0); }
		public TerminalNode WordBoundary() { return getToken(regexParser.WordBoundary, 0); }
		public TerminalNode NonWordBoundary() { return getToken(regexParser.NonWordBoundary, 0); }
		public TerminalNode EndOfSubjectOrLine() { return getToken(regexParser.EndOfSubjectOrLine, 0); }
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof regexListener ) ((regexListener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof regexListener ) ((regexListener)listener).exitAtom(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_atom);
		try {
			setState(222);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(210);
				shared_atom();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(211);
				literal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(212);
				character_class();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(213);
				capture();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(214);
				non_capture();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(215);
				comment();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(216);
				look_around();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(217);
				match(Dot);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(218);
				match(Caret);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(219);
				match(WordBoundary);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(220);
				match(NonWordBoundary);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(221);
				match(EndOfSubjectOrLine);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cc_atomContext extends ParserRuleContext {
		public List<Cc_literalContext> cc_literal() {
			return getRuleContexts(Cc_literalContext.class);
		}
		public Cc_literalContext cc_literal(int i) {
			return getRuleContext(Cc_literalContext.class,i);
		}
		public TerminalNode Hyphen() { return getToken(regexParser.Hyphen, 0); }
		public Shared_atomContext shared_atom() {
			return getRuleContext(Shared_atomContext.class,0);
		}
		public Cc_atomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cc_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof regexListener ) ((regexListener)listener).enterCc_atom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof regexListener ) ((regexListener)listener).exitCc_atom(this);
		}
	}

	public final Cc_atomContext cc_atom() throws RecognitionException {
		Cc_atomContext _localctx = new Cc_atomContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_cc_atom);
		try {
			setState(230);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(224);
				cc_literal();
				setState(225);
				match(Hyphen);
				setState(226);
				cc_literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(228);
				shared_atom();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(229);
				cc_literal();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Shared_atomContext extends ParserRuleContext {
		public TerminalNode DecimalDigit() { return getToken(regexParser.DecimalDigit, 0); }
		public TerminalNode NotDecimalDigit() { return getToken(regexParser.NotDecimalDigit, 0); }
		public TerminalNode NotNewLine() { return getToken(regexParser.NotNewLine, 0); }
		public TerminalNode NewLineSequence() { return getToken(regexParser.NewLineSequence, 0); }
		public TerminalNode WhiteSpace() { return getToken(regexParser.WhiteSpace, 0); }
		public TerminalNode NotWhiteSpace() { return getToken(regexParser.NotWhiteSpace, 0); }
		public TerminalNode WordChar() { return getToken(regexParser.WordChar, 0); }
		public TerminalNode NotWordChar() { return getToken(regexParser.NotWordChar, 0); }
		public Shared_atomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shared_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof regexListener ) ((regexListener)listener).enterShared_atom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof regexListener ) ((regexListener)listener).exitShared_atom(this);
		}
	}

	public final Shared_atomContext shared_atom() throws RecognitionException {
		Shared_atomContext _localctx = new Shared_atomContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_shared_atom);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			_la = _input.LA(1);
			if ( !(((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (DecimalDigit - 69)) | (1L << (NotDecimalDigit - 69)) | (1L << (NotNewLine - 69)) | (1L << (NewLineSequence - 69)) | (1L << (WhiteSpace - 69)) | (1L << (NotWhiteSpace - 69)) | (1L << (WordChar - 69)) | (1L << (NotWordChar - 69)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public Shared_literalContext shared_literal() {
			return getRuleContext(Shared_literalContext.class,0);
		}
		public TerminalNode CharacterClassEnd() { return getToken(regexParser.CharacterClassEnd, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof regexListener ) ((regexListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof regexListener ) ((regexListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_literal);
		try {
			setState(236);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case T__2:
			case T__3:
			case T__4:
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case T__22:
			case T__23:
			case T__24:
			case T__25:
			case T__26:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case T__35:
			case T__36:
			case T__37:
			case T__38:
			case T__39:
			case T__40:
			case T__41:
			case T__42:
			case T__43:
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case T__48:
			case T__49:
			case T__50:
			case T__51:
			case T__52:
			case T__53:
			case T__54:
			case T__55:
			case T__56:
			case T__57:
			case T__58:
			case T__59:
			case Quoted:
			case BlockQuoted:
			case EscapeChar:
			case NewLine:
			case CarriageReturn:
			case Tab:
			case Backslash:
			case Hyphen:
			case OpenBrace:
			case CloseBrace:
			case Comma:
			case LessThan:
			case GreaterThan:
			case SingleQuote:
			case Underscore:
			case Colon:
			case Hash:
			case Equals:
			case Exclamation:
			case Ampersand:
			case OtherChar:
				enterOuterAlt(_localctx, 1);
				{
				setState(234);
				shared_literal();
				}
				break;
			case CharacterClassEnd:
				enterOuterAlt(_localctx, 2);
				{
				setState(235);
				match(CharacterClassEnd);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cc_literalContext extends ParserRuleContext {
		public Shared_literalContext shared_literal() {
			return getRuleContext(Shared_literalContext.class,0);
		}
		public TerminalNode Dot() { return getToken(regexParser.Dot, 0); }
		public TerminalNode CharacterClassStart() { return getToken(regexParser.CharacterClassStart, 0); }
		public TerminalNode Caret() { return getToken(regexParser.Caret, 0); }
		public TerminalNode QuestionMark() { return getToken(regexParser.QuestionMark, 0); }
		public TerminalNode Plus() { return getToken(regexParser.Plus, 0); }
		public TerminalNode Star() { return getToken(regexParser.Star, 0); }
		public TerminalNode WordBoundary() { return getToken(regexParser.WordBoundary, 0); }
		public TerminalNode EndOfSubjectOrLine() { return getToken(regexParser.EndOfSubjectOrLine, 0); }
		public TerminalNode Pipe() { return getToken(regexParser.Pipe, 0); }
		public TerminalNode OpenParen() { return getToken(regexParser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(regexParser.CloseParen, 0); }
		public Cc_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cc_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof regexListener ) ((regexListener)listener).enterCc_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof regexListener ) ((regexListener)listener).exitCc_literal(this);
		}
	}

	public final Cc_literalContext cc_literal() throws RecognitionException {
		Cc_literalContext _localctx = new Cc_literalContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_cc_literal);
		try {
			setState(250);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case T__2:
			case T__3:
			case T__4:
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case T__22:
			case T__23:
			case T__24:
			case T__25:
			case T__26:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case T__35:
			case T__36:
			case T__37:
			case T__38:
			case T__39:
			case T__40:
			case T__41:
			case T__42:
			case T__43:
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case T__48:
			case T__49:
			case T__50:
			case T__51:
			case T__52:
			case T__53:
			case T__54:
			case T__55:
			case T__56:
			case T__57:
			case T__58:
			case T__59:
			case Quoted:
			case BlockQuoted:
			case EscapeChar:
			case NewLine:
			case CarriageReturn:
			case Tab:
			case Backslash:
			case Hyphen:
			case OpenBrace:
			case CloseBrace:
			case Comma:
			case LessThan:
			case GreaterThan:
			case SingleQuote:
			case Underscore:
			case Colon:
			case Hash:
			case Equals:
			case Exclamation:
			case Ampersand:
			case OtherChar:
				enterOuterAlt(_localctx, 1);
				{
				setState(238);
				shared_literal();
				}
				break;
			case Dot:
				enterOuterAlt(_localctx, 2);
				{
				setState(239);
				match(Dot);
				}
				break;
			case CharacterClassStart:
				enterOuterAlt(_localctx, 3);
				{
				setState(240);
				match(CharacterClassStart);
				}
				break;
			case Caret:
				enterOuterAlt(_localctx, 4);
				{
				setState(241);
				match(Caret);
				}
				break;
			case QuestionMark:
				enterOuterAlt(_localctx, 5);
				{
				setState(242);
				match(QuestionMark);
				}
				break;
			case Plus:
				enterOuterAlt(_localctx, 6);
				{
				setState(243);
				match(Plus);
				}
				break;
			case Star:
				enterOuterAlt(_localctx, 7);
				{
				setState(244);
				match(Star);
				}
				break;
			case WordBoundary:
				enterOuterAlt(_localctx, 8);
				{
				setState(245);
				match(WordBoundary);
				}
				break;
			case EndOfSubjectOrLine:
				enterOuterAlt(_localctx, 9);
				{
				setState(246);
				match(EndOfSubjectOrLine);
				}
				break;
			case Pipe:
				enterOuterAlt(_localctx, 10);
				{
				setState(247);
				match(Pipe);
				}
				break;
			case OpenParen:
				enterOuterAlt(_localctx, 11);
				{
				setState(248);
				match(OpenParen);
				}
				break;
			case CloseParen:
				enterOuterAlt(_localctx, 12);
				{
				setState(249);
				match(CloseParen);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Shared_literalContext extends ParserRuleContext {
		public Octal_charContext octal_char() {
			return getRuleContext(Octal_charContext.class,0);
		}
		public LetterContext letter() {
			return getRuleContext(LetterContext.class,0);
		}
		public DigitContext digit() {
			return getRuleContext(DigitContext.class,0);
		}
		public TerminalNode EscapeChar() { return getToken(regexParser.EscapeChar, 0); }
		public TerminalNode NewLine() { return getToken(regexParser.NewLine, 0); }
		public TerminalNode CarriageReturn() { return getToken(regexParser.CarriageReturn, 0); }
		public TerminalNode Tab() { return getToken(regexParser.Tab, 0); }
		public TerminalNode Quoted() { return getToken(regexParser.Quoted, 0); }
		public TerminalNode BlockQuoted() { return getToken(regexParser.BlockQuoted, 0); }
		public TerminalNode OpenBrace() { return getToken(regexParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(regexParser.CloseBrace, 0); }
		public TerminalNode Comma() { return getToken(regexParser.Comma, 0); }
		public TerminalNode Hyphen() { return getToken(regexParser.Hyphen, 0); }
		public TerminalNode LessThan() { return getToken(regexParser.LessThan, 0); }
		public TerminalNode GreaterThan() { return getToken(regexParser.GreaterThan, 0); }
		public TerminalNode SingleQuote() { return getToken(regexParser.SingleQuote, 0); }
		public TerminalNode Underscore() { return getToken(regexParser.Underscore, 0); }
		public TerminalNode Colon() { return getToken(regexParser.Colon, 0); }
		public TerminalNode Hash() { return getToken(regexParser.Hash, 0); }
		public TerminalNode Equals() { return getToken(regexParser.Equals, 0); }
		public TerminalNode Exclamation() { return getToken(regexParser.Exclamation, 0); }
		public TerminalNode Ampersand() { return getToken(regexParser.Ampersand, 0); }
		public TerminalNode OtherChar() { return getToken(regexParser.OtherChar, 0); }
		public Shared_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shared_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof regexListener ) ((regexListener)listener).enterShared_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof regexListener ) ((regexListener)listener).exitShared_literal(this);
		}
	}

	public final Shared_literalContext shared_literal() throws RecognitionException {
		Shared_literalContext _localctx = new Shared_literalContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_shared_literal);
		try {
			setState(275);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Backslash:
				enterOuterAlt(_localctx, 1);
				{
				setState(252);
				octal_char();
				}
				break;
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case T__22:
			case T__23:
			case T__24:
			case T__25:
			case T__26:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case T__35:
			case T__36:
			case T__37:
			case T__38:
			case T__39:
			case T__40:
			case T__41:
			case T__42:
			case T__43:
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case T__48:
			case T__49:
			case T__50:
			case T__51:
			case T__52:
			case T__53:
			case T__54:
			case T__55:
			case T__56:
			case T__57:
			case T__58:
			case T__59:
				enterOuterAlt(_localctx, 2);
				{
				setState(253);
				letter();
				}
				break;
			case T__0:
			case T__1:
			case T__2:
			case T__3:
			case T__4:
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
				enterOuterAlt(_localctx, 3);
				{
				setState(254);
				digit();
				}
				break;
			case EscapeChar:
				enterOuterAlt(_localctx, 4);
				{
				setState(255);
				match(EscapeChar);
				}
				break;
			case NewLine:
				enterOuterAlt(_localctx, 5);
				{
				setState(256);
				match(NewLine);
				}
				break;
			case CarriageReturn:
				enterOuterAlt(_localctx, 6);
				{
				setState(257);
				match(CarriageReturn);
				}
				break;
			case Tab:
				enterOuterAlt(_localctx, 7);
				{
				setState(258);
				match(Tab);
				}
				break;
			case Quoted:
				enterOuterAlt(_localctx, 8);
				{
				setState(259);
				match(Quoted);
				}
				break;
			case BlockQuoted:
				enterOuterAlt(_localctx, 9);
				{
				setState(260);
				match(BlockQuoted);
				}
				break;
			case OpenBrace:
				enterOuterAlt(_localctx, 10);
				{
				setState(261);
				match(OpenBrace);
				}
				break;
			case CloseBrace:
				enterOuterAlt(_localctx, 11);
				{
				setState(262);
				match(CloseBrace);
				}
				break;
			case Comma:
				enterOuterAlt(_localctx, 12);
				{
				setState(263);
				match(Comma);
				}
				break;
			case Hyphen:
				enterOuterAlt(_localctx, 13);
				{
				setState(264);
				match(Hyphen);
				}
				break;
			case LessThan:
				enterOuterAlt(_localctx, 14);
				{
				setState(265);
				match(LessThan);
				}
				break;
			case GreaterThan:
				enterOuterAlt(_localctx, 15);
				{
				setState(266);
				match(GreaterThan);
				}
				break;
			case SingleQuote:
				enterOuterAlt(_localctx, 16);
				{
				setState(267);
				match(SingleQuote);
				}
				break;
			case Underscore:
				enterOuterAlt(_localctx, 17);
				{
				setState(268);
				match(Underscore);
				}
				break;
			case Colon:
				enterOuterAlt(_localctx, 18);
				{
				setState(269);
				match(Colon);
				}
				break;
			case Hash:
				enterOuterAlt(_localctx, 19);
				{
				setState(270);
				match(Hash);
				}
				break;
			case Equals:
				enterOuterAlt(_localctx, 20);
				{
				setState(271);
				match(Equals);
				}
				break;
			case Exclamation:
				enterOuterAlt(_localctx, 21);
				{
				setState(272);
				match(Exclamation);
				}
				break;
			case Ampersand:
				enterOuterAlt(_localctx, 22);
				{
				setState(273);
				match(Ampersand);
				}
				break;
			case OtherChar:
				enterOuterAlt(_localctx, 23);
				{
				setState(274);
				match(OtherChar);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumberContext extends ParserRuleContext {
		public DigitsContext digits() {
			return getRuleContext(DigitsContext.class,0);
		}
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof regexListener ) ((regexListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof regexListener ) ((regexListener)listener).exitNumber(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			digits();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Octal_charContext extends ParserRuleContext {
		public TerminalNode Backslash() { return getToken(regexParser.Backslash, 0); }
		public List<Octal_digitContext> octal_digit() {
			return getRuleContexts(Octal_digitContext.class);
		}
		public Octal_digitContext octal_digit(int i) {
			return getRuleContext(Octal_digitContext.class,i);
		}
		public Octal_charContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_octal_char; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof regexListener ) ((regexListener)listener).enterOctal_char(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof regexListener ) ((regexListener)listener).exitOctal_char(this);
		}
	}

	public final Octal_charContext octal_char() throws RecognitionException {
		Octal_charContext _localctx = new Octal_charContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_octal_char);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(279);
				match(Backslash);
				setState(280);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(281);
				octal_digit();
				setState(282);
				octal_digit();
				}
				break;
			case 2:
				{
				setState(284);
				match(Backslash);
				setState(285);
				octal_digit();
				setState(286);
				octal_digit();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Octal_digitContext extends ParserRuleContext {
		public Octal_digitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_octal_digit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof regexListener ) ((regexListener)listener).enterOctal_digit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof regexListener ) ((regexListener)listener).exitOctal_digit(this);
		}
	}

	public final Octal_digitContext octal_digit() throws RecognitionException {
		Octal_digitContext _localctx = new Octal_digitContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_octal_digit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DigitsContext extends ParserRuleContext {
		public List<DigitContext> digit() {
			return getRuleContexts(DigitContext.class);
		}
		public DigitContext digit(int i) {
			return getRuleContext(DigitContext.class,i);
		}
		public DigitsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_digits; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof regexListener ) ((regexListener)listener).enterDigits(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof regexListener ) ((regexListener)listener).exitDigits(this);
		}
	}

	public final DigitsContext digits() throws RecognitionException {
		DigitsContext _localctx = new DigitsContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_digits);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(292);
				digit();
				}
				}
				setState(295); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DigitContext extends ParserRuleContext {
		public DigitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_digit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof regexListener ) ((regexListener)listener).enterDigit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof regexListener ) ((regexListener)listener).exitDigit(this);
		}
	}

	public final DigitContext digit() throws RecognitionException {
		DigitContext _localctx = new DigitContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_digit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NameContext extends ParserRuleContext {
		public Alpha_numsContext alpha_nums() {
			return getRuleContext(Alpha_numsContext.class,0);
		}
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof regexListener ) ((regexListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof regexListener ) ((regexListener)listener).exitName(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			alpha_nums();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alpha_numsContext extends ParserRuleContext {
		public List<LetterContext> letter() {
			return getRuleContexts(LetterContext.class);
		}
		public LetterContext letter(int i) {
			return getRuleContext(LetterContext.class,i);
		}
		public List<TerminalNode> Underscore() { return getTokens(regexParser.Underscore); }
		public TerminalNode Underscore(int i) {
			return getToken(regexParser.Underscore, i);
		}
		public List<DigitContext> digit() {
			return getRuleContexts(DigitContext.class);
		}
		public DigitContext digit(int i) {
			return getRuleContext(DigitContext.class,i);
		}
		public Alpha_numsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alpha_nums; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof regexListener ) ((regexListener)listener).enterAlpha_nums(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof regexListener ) ((regexListener)listener).exitAlpha_nums(this);
		}
	}

	public final Alpha_numsContext alpha_nums() throws RecognitionException {
		Alpha_numsContext _localctx = new Alpha_numsContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_alpha_nums);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case T__22:
			case T__23:
			case T__24:
			case T__25:
			case T__26:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case T__35:
			case T__36:
			case T__37:
			case T__38:
			case T__39:
			case T__40:
			case T__41:
			case T__42:
			case T__43:
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case T__48:
			case T__49:
			case T__50:
			case T__51:
			case T__52:
			case T__53:
			case T__54:
			case T__55:
			case T__56:
			case T__57:
			case T__58:
			case T__59:
				{
				setState(301);
				letter();
				}
				break;
			case Underscore:
				{
				setState(302);
				match(Underscore);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(310);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59))) != 0) || _la==Underscore) {
				{
				setState(308);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__10:
				case T__11:
				case T__12:
				case T__13:
				case T__14:
				case T__15:
				case T__16:
				case T__17:
				case T__18:
				case T__19:
				case T__20:
				case T__21:
				case T__22:
				case T__23:
				case T__24:
				case T__25:
				case T__26:
				case T__27:
				case T__28:
				case T__29:
				case T__30:
				case T__31:
				case T__32:
				case T__33:
				case T__34:
				case T__35:
				case T__36:
				case T__37:
				case T__38:
				case T__39:
				case T__40:
				case T__41:
				case T__42:
				case T__43:
				case T__44:
				case T__45:
				case T__46:
				case T__47:
				case T__48:
				case T__49:
				case T__50:
				case T__51:
				case T__52:
				case T__53:
				case T__54:
				case T__55:
				case T__56:
				case T__57:
				case T__58:
				case T__59:
					{
					setState(305);
					letter();
					}
					break;
				case Underscore:
					{
					setState(306);
					match(Underscore);
					}
					break;
				case T__0:
				case T__1:
				case T__2:
				case T__3:
				case T__4:
				case T__5:
				case T__6:
				case T__7:
				case T__8:
				case T__9:
					{
					setState(307);
					digit();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(312);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Non_close_parensContext extends ParserRuleContext {
		public List<Non_close_parenContext> non_close_paren() {
			return getRuleContexts(Non_close_parenContext.class);
		}
		public Non_close_parenContext non_close_paren(int i) {
			return getRuleContext(Non_close_parenContext.class,i);
		}
		public Non_close_parensContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_non_close_parens; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof regexListener ) ((regexListener)listener).enterNon_close_parens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof regexListener ) ((regexListener)listener).exitNon_close_parens(this);
		}
	}

	public final Non_close_parensContext non_close_parens() throws RecognitionException {
		Non_close_parensContext _localctx = new Non_close_parensContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_non_close_parens);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(313);
				non_close_paren();
				}
				}
				setState(316); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << Quoted) | (1L << BlockQuoted) | (1L << EscapeChar))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NewLine - 64)) | (1L << (CarriageReturn - 64)) | (1L << (Tab - 64)) | (1L << (Backslash - 64)) | (1L << (Dot - 64)) | (1L << (DecimalDigit - 64)) | (1L << (NotDecimalDigit - 64)) | (1L << (NotNewLine - 64)) | (1L << (NewLineSequence - 64)) | (1L << (WhiteSpace - 64)) | (1L << (NotWhiteSpace - 64)) | (1L << (WordChar - 64)) | (1L << (NotWordChar - 64)) | (1L << (CharacterClassStart - 64)) | (1L << (CharacterClassEnd - 64)) | (1L << (Caret - 64)) | (1L << (Hyphen - 64)) | (1L << (QuestionMark - 64)) | (1L << (Plus - 64)) | (1L << (Star - 64)) | (1L << (OpenBrace - 64)) | (1L << (CloseBrace - 64)) | (1L << (Comma - 64)) | (1L << (WordBoundary - 64)) | (1L << (NonWordBoundary - 64)) | (1L << (EndOfSubjectOrLine - 64)) | (1L << (Pipe - 64)) | (1L << (OpenParen - 64)) | (1L << (LessThan - 64)) | (1L << (GreaterThan - 64)) | (1L << (SingleQuote - 64)) | (1L << (Underscore - 64)) | (1L << (Colon - 64)) | (1L << (Hash - 64)) | (1L << (Equals - 64)) | (1L << (Exclamation - 64)) | (1L << (Ampersand - 64)) | (1L << (OtherChar - 64)))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Non_close_parenContext extends ParserRuleContext {
		public TerminalNode CloseParen() { return getToken(regexParser.CloseParen, 0); }
		public Non_close_parenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_non_close_paren; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof regexListener ) ((regexListener)listener).enterNon_close_paren(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof regexListener ) ((regexListener)listener).exitNon_close_paren(this);
		}
	}

	public final Non_close_parenContext non_close_paren() throws RecognitionException {
		Non_close_parenContext _localctx = new Non_close_parenContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_non_close_paren);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			_la = _input.LA(1);
			if ( _la <= 0 || (_la==CloseParen) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LetterContext extends ParserRuleContext {
		public LetterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof regexListener ) ((regexListener)listener).enterLetter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof regexListener ) ((regexListener)listener).exitLetter(this);
		}
	}

	public final LetterContext letter() throws RecognitionException {
		LetterContext _localctx = new LetterContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_letter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3h\u0145\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\3\2\3\2\3\2\3\3\3\3\3\3\7\3=\n\3\f\3\16\3@\13\3\3"+
		"\4\7\4C\n\4\f\4\16\4F\13\4\3\5\3\5\5\5J\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6^\n\6\3\7\3\7\3\7\3"+
		"\7\3\7\6\7e\n\7\r\7\16\7f\3\7\3\7\3\7\3\7\3\7\3\7\7\7o\n\7\f\7\16\7r\13"+
		"\7\3\7\3\7\3\7\3\7\6\7x\n\7\r\7\16\7y\3\7\3\7\3\7\3\7\3\7\3\7\6\7\u0082"+
		"\n\7\r\7\16\7\u0083\3\7\3\7\3\7\3\7\3\7\7\7\u008b\n\7\f\7\16\7\u008e\13"+
		"\7\3\7\3\7\3\7\6\7\u0093\n\7\r\7\16\7\u0094\3\7\3\7\5\7\u0099\n\7\3\b"+
		"\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\5\t\u00b1\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00d3\n\13\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00e1\n\f\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\5\r\u00e9\n\r\3\16\3\16\3\17\3\17\5\17\u00ef\n\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00fd\n\20\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0116\n\21\3\22\3\22\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u0123\n\23\3\24\3\24\3\25\6\25"+
		"\u0128\n\25\r\25\16\25\u0129\3\26\3\26\3\27\3\27\3\30\3\30\5\30\u0132"+
		"\n\30\3\30\3\30\3\30\7\30\u0137\n\30\f\30\16\30\u013a\13\30\3\31\6\31"+
		"\u013d\n\31\r\31\16\31\u013e\3\32\3\32\3\33\3\33\3\33\2\2\34\2\4\6\b\n"+
		"\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\2\b\3\2GN\3\2\3\6\3\2"+
		"\3\n\3\2\3\f\3\2^^\3\2\r>\2\u0178\2\66\3\2\2\2\49\3\2\2\2\6D\3\2\2\2\b"+
		"G\3\2\2\2\n]\3\2\2\2\f\u0098\3\2\2\2\16\u009a\3\2\2\2\20\u00b0\3\2\2\2"+
		"\22\u00b2\3\2\2\2\24\u00d2\3\2\2\2\26\u00e0\3\2\2\2\30\u00e8\3\2\2\2\32"+
		"\u00ea\3\2\2\2\34\u00ee\3\2\2\2\36\u00fc\3\2\2\2 \u0115\3\2\2\2\"\u0117"+
		"\3\2\2\2$\u0122\3\2\2\2&\u0124\3\2\2\2(\u0127\3\2\2\2*\u012b\3\2\2\2,"+
		"\u012d\3\2\2\2.\u0131\3\2\2\2\60\u013c\3\2\2\2\62\u0140\3\2\2\2\64\u0142"+
		"\3\2\2\2\66\67\5\4\3\2\678\7\2\2\38\3\3\2\2\29>\5\6\4\2:;\7\\\2\2;=\5"+
		"\6\4\2<:\3\2\2\2=@\3\2\2\2><\3\2\2\2>?\3\2\2\2?\5\3\2\2\2@>\3\2\2\2AC"+
		"\5\b\5\2BA\3\2\2\2CF\3\2\2\2DB\3\2\2\2DE\3\2\2\2E\7\3\2\2\2FD\3\2\2\2"+
		"GI\5\26\f\2HJ\5\n\6\2IH\3\2\2\2IJ\3\2\2\2J\t\3\2\2\2K^\7S\2\2L^\7T\2\2"+
		"M^\7U\2\2NO\7V\2\2OP\5\"\22\2PQ\7W\2\2Q^\3\2\2\2RS\7V\2\2ST\5\"\22\2T"+
		"U\7X\2\2UV\7W\2\2V^\3\2\2\2WX\7V\2\2XY\5\"\22\2YZ\7X\2\2Z[\5\"\22\2[\\"+
		"\7W\2\2\\^\3\2\2\2]K\3\2\2\2]L\3\2\2\2]M\3\2\2\2]N\3\2\2\2]R\3\2\2\2]"+
		"W\3\2\2\2^\13\3\2\2\2_`\7O\2\2`a\7Q\2\2ab\7P\2\2bd\7R\2\2ce\5\30\r\2d"+
		"c\3\2\2\2ef\3\2\2\2fd\3\2\2\2fg\3\2\2\2gh\3\2\2\2hi\7P\2\2i\u0099\3\2"+
		"\2\2jk\7O\2\2kl\7Q\2\2lp\7P\2\2mo\5\30\r\2nm\3\2\2\2or\3\2\2\2pn\3\2\2"+
		"\2pq\3\2\2\2qs\3\2\2\2rp\3\2\2\2s\u0099\7P\2\2tu\7O\2\2uw\7Q\2\2vx\5\30"+
		"\r\2wv\3\2\2\2xy\3\2\2\2yw\3\2\2\2yz\3\2\2\2z{\3\2\2\2{|\7P\2\2|\u0099"+
		"\3\2\2\2}~\7O\2\2~\177\7P\2\2\177\u0081\7R\2\2\u0080\u0082\5\30\r\2\u0081"+
		"\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2"+
		"\2\2\u0084\u0085\3\2\2\2\u0085\u0086\7P\2\2\u0086\u0099\3\2\2\2\u0087"+
		"\u0088\7O\2\2\u0088\u008c\7P\2\2\u0089\u008b\5\30\r\2\u008a\u0089\3\2"+
		"\2\2\u008b\u008e\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d"+
		"\u008f\3\2\2\2\u008e\u008c\3\2\2\2\u008f\u0099\7P\2\2\u0090\u0092\7O\2"+
		"\2\u0091\u0093\5\30\r\2\u0092\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094"+
		"\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0097\7P"+
		"\2\2\u0097\u0099\3\2\2\2\u0098_\3\2\2\2\u0098j\3\2\2\2\u0098t\3\2\2\2"+
		"\u0098}\3\2\2\2\u0098\u0087\3\2\2\2\u0098\u0090\3\2\2\2\u0099\r\3\2\2"+
		"\2\u009a\u009b\7]\2\2\u009b\u009c\5\4\3\2\u009c\u009d\7^\2\2\u009d\17"+
		"\3\2\2\2\u009e\u009f\7]\2\2\u009f\u00a0\7S\2\2\u00a0\u00a1\7c\2\2\u00a1"+
		"\u00a2\5\4\3\2\u00a2\u00a3\7^\2\2\u00a3\u00b1\3\2\2\2\u00a4\u00a5\7]\2"+
		"\2\u00a5\u00a6\7S\2\2\u00a6\u00a7\7\\\2\2\u00a7\u00a8\5\4\3\2\u00a8\u00a9"+
		"\7^\2\2\u00a9\u00b1\3\2\2\2\u00aa\u00ab\7]\2\2\u00ab\u00ac\7S\2\2\u00ac"+
		"\u00ad\7`\2\2\u00ad\u00ae\5\4\3\2\u00ae\u00af\7^\2\2\u00af\u00b1\3\2\2"+
		"\2\u00b0\u009e\3\2\2\2\u00b0\u00a4\3\2\2\2\u00b0\u00aa\3\2\2\2\u00b1\21"+
		"\3\2\2\2\u00b2\u00b3\7]\2\2\u00b3\u00b4\7S\2\2\u00b4\u00b5\7d\2\2\u00b5"+
		"\u00b6\5\60\31\2\u00b6\u00b7\7^\2\2\u00b7\23\3\2\2\2\u00b8\u00b9\7]\2"+
		"\2\u00b9\u00ba\7S\2\2\u00ba\u00bb\7e\2\2\u00bb\u00bc\5\4\3\2\u00bc\u00bd"+
		"\7^\2\2\u00bd\u00d3\3\2\2\2\u00be\u00bf\7]\2\2\u00bf\u00c0\7S\2\2\u00c0"+
		"\u00c1\7f\2\2\u00c1\u00c2\5\4\3\2\u00c2\u00c3\7^\2\2\u00c3\u00d3\3\2\2"+
		"\2\u00c4\u00c5\7]\2\2\u00c5\u00c6\7S\2\2\u00c6\u00c7\7_\2\2\u00c7\u00c8"+
		"\7e\2\2\u00c8\u00c9\5\4\3\2\u00c9\u00ca\7^\2\2\u00ca\u00d3\3\2\2\2\u00cb"+
		"\u00cc\7]\2\2\u00cc\u00cd\7S\2\2\u00cd\u00ce\7_\2\2\u00ce\u00cf\7f\2\2"+
		"\u00cf\u00d0\5\4\3\2\u00d0\u00d1\7^\2\2\u00d1\u00d3\3\2\2\2\u00d2\u00b8"+
		"\3\2\2\2\u00d2\u00be\3\2\2\2\u00d2\u00c4\3\2\2\2\u00d2\u00cb\3\2\2\2\u00d3"+
		"\25\3\2\2\2\u00d4\u00e1\5\32\16\2\u00d5\u00e1\5\34\17\2\u00d6\u00e1\5"+
		"\f\7\2\u00d7\u00e1\5\16\b\2\u00d8\u00e1\5\20\t\2\u00d9\u00e1\5\22\n\2"+
		"\u00da\u00e1\5\24\13\2\u00db\u00e1\7F\2\2\u00dc\u00e1\7Q\2\2\u00dd\u00e1"+
		"\7Y\2\2\u00de\u00e1\7Z\2\2\u00df\u00e1\7[\2\2\u00e0\u00d4\3\2\2\2\u00e0"+
		"\u00d5\3\2\2\2\u00e0\u00d6\3\2\2\2\u00e0\u00d7\3\2\2\2\u00e0\u00d8\3\2"+
		"\2\2\u00e0\u00d9\3\2\2\2\u00e0\u00da\3\2\2\2\u00e0\u00db\3\2\2\2\u00e0"+
		"\u00dc\3\2\2\2\u00e0\u00dd\3\2\2\2\u00e0\u00de\3\2\2\2\u00e0\u00df\3\2"+
		"\2\2\u00e1\27\3\2\2\2\u00e2\u00e3\5\36\20\2\u00e3\u00e4\7R\2\2\u00e4\u00e5"+
		"\5\36\20\2\u00e5\u00e9\3\2\2\2\u00e6\u00e9\5\32\16\2\u00e7\u00e9\5\36"+
		"\20\2\u00e8\u00e2\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e7\3\2\2\2\u00e9"+
		"\31\3\2\2\2\u00ea\u00eb\t\2\2\2\u00eb\33\3\2\2\2\u00ec\u00ef\5 \21\2\u00ed"+
		"\u00ef\7P\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ed\3\2\2\2\u00ef\35\3\2\2\2"+
		"\u00f0\u00fd\5 \21\2\u00f1\u00fd\7F\2\2\u00f2\u00fd\7O\2\2\u00f3\u00fd"+
		"\7Q\2\2\u00f4\u00fd\7S\2\2\u00f5\u00fd\7T\2\2\u00f6\u00fd\7U\2\2\u00f7"+
		"\u00fd\7Y\2\2\u00f8\u00fd\7[\2\2\u00f9\u00fd\7\\\2\2\u00fa\u00fd\7]\2"+
		"\2\u00fb\u00fd\7^\2\2\u00fc\u00f0\3\2\2\2\u00fc\u00f1\3\2\2\2\u00fc\u00f2"+
		"\3\2\2\2\u00fc\u00f3\3\2\2\2\u00fc\u00f4\3\2\2\2\u00fc\u00f5\3\2\2\2\u00fc"+
		"\u00f6\3\2\2\2\u00fc\u00f7\3\2\2\2\u00fc\u00f8\3\2\2\2\u00fc\u00f9\3\2"+
		"\2\2\u00fc\u00fa\3\2\2\2\u00fc\u00fb\3\2\2\2\u00fd\37\3\2\2\2\u00fe\u0116"+
		"\5$\23\2\u00ff\u0116\5\64\33\2\u0100\u0116\5*\26\2\u0101\u0116\7A\2\2"+
		"\u0102\u0116\7B\2\2\u0103\u0116\7C\2\2\u0104\u0116\7D\2\2\u0105\u0116"+
		"\7?\2\2\u0106\u0116\7@\2\2\u0107\u0116\7V\2\2\u0108\u0116\7W\2\2\u0109"+
		"\u0116\7X\2\2\u010a\u0116\7R\2\2\u010b\u0116\7_\2\2\u010c\u0116\7`\2\2"+
		"\u010d\u0116\7a\2\2\u010e\u0116\7b\2\2\u010f\u0116\7c\2\2\u0110\u0116"+
		"\7d\2\2\u0111\u0116\7e\2\2\u0112\u0116\7f\2\2\u0113\u0116\7g\2\2\u0114"+
		"\u0116\7h\2\2\u0115\u00fe\3\2\2\2\u0115\u00ff\3\2\2\2\u0115\u0100\3\2"+
		"\2\2\u0115\u0101\3\2\2\2\u0115\u0102\3\2\2\2\u0115\u0103\3\2\2\2\u0115"+
		"\u0104\3\2\2\2\u0115\u0105\3\2\2\2\u0115\u0106\3\2\2\2\u0115\u0107\3\2"+
		"\2\2\u0115\u0108\3\2\2\2\u0115\u0109\3\2\2\2\u0115\u010a\3\2\2\2\u0115"+
		"\u010b\3\2\2\2\u0115\u010c\3\2\2\2\u0115\u010d\3\2\2\2\u0115\u010e\3\2"+
		"\2\2\u0115\u010f\3\2\2\2\u0115\u0110\3\2\2\2\u0115\u0111\3\2\2\2\u0115"+
		"\u0112\3\2\2\2\u0115\u0113\3\2\2\2\u0115\u0114\3\2\2\2\u0116!\3\2\2\2"+
		"\u0117\u0118\5(\25\2\u0118#\3\2\2\2\u0119\u011a\7E\2\2\u011a\u011b\t\3"+
		"\2\2\u011b\u011c\5&\24\2\u011c\u011d\5&\24\2\u011d\u0123\3\2\2\2\u011e"+
		"\u011f\7E\2\2\u011f\u0120\5&\24\2\u0120\u0121\5&\24\2\u0121\u0123\3\2"+
		"\2\2\u0122\u0119\3\2\2\2\u0122\u011e\3\2\2\2\u0123%\3\2\2\2\u0124\u0125"+
		"\t\4\2\2\u0125\'\3\2\2\2\u0126\u0128\5*\26\2\u0127\u0126\3\2\2\2\u0128"+
		"\u0129\3\2\2\2\u0129\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012a)\3\2\2\2"+
		"\u012b\u012c\t\5\2\2\u012c+\3\2\2\2\u012d\u012e\5.\30\2\u012e-\3\2\2\2"+
		"\u012f\u0132\5\64\33\2\u0130\u0132\7b\2\2\u0131\u012f\3\2\2\2\u0131\u0130"+
		"\3\2\2\2\u0132\u0138\3\2\2\2\u0133\u0137\5\64\33\2\u0134\u0137\7b\2\2"+
		"\u0135\u0137\5*\26\2\u0136\u0133\3\2\2\2\u0136\u0134\3\2\2\2\u0136\u0135"+
		"\3\2\2\2\u0137\u013a\3\2\2\2\u0138\u0136\3\2\2\2\u0138\u0139\3\2\2\2\u0139"+
		"/\3\2\2\2\u013a\u0138\3\2\2\2\u013b\u013d\5\62\32\2\u013c\u013b\3\2\2"+
		"\2\u013d\u013e\3\2\2\2\u013e\u013c\3\2\2\2\u013e\u013f\3\2\2\2\u013f\61"+
		"\3\2\2\2\u0140\u0141\n\6\2\2\u0141\63\3\2\2\2\u0142\u0143\t\7\2\2\u0143"+
		"\65\3\2\2\2\32>DI]fpy\u0083\u008c\u0094\u0098\u00b0\u00d2\u00e0\u00e8"+
		"\u00ee\u00fc\u0115\u0122\u0129\u0131\u0136\u0138\u013e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}