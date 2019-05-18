// Generated from regex.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link regexParser}.
 */
public interface regexListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link regexParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(regexParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link regexParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(regexParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by {@link regexParser#alternation}.
	 * @param ctx the parse tree
	 */
	void enterAlternation(regexParser.AlternationContext ctx);
	/**
	 * Exit a parse tree produced by {@link regexParser#alternation}.
	 * @param ctx the parse tree
	 */
	void exitAlternation(regexParser.AlternationContext ctx);
	/**
	 * Enter a parse tree produced by {@link regexParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(regexParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link regexParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(regexParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link regexParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(regexParser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link regexParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(regexParser.ElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link regexParser#quantifier}.
	 * @param ctx the parse tree
	 */
	void enterQuantifier(regexParser.QuantifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link regexParser#quantifier}.
	 * @param ctx the parse tree
	 */
	void exitQuantifier(regexParser.QuantifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link regexParser#character_class}.
	 * @param ctx the parse tree
	 */
	void enterCharacter_class(regexParser.Character_classContext ctx);
	/**
	 * Exit a parse tree produced by {@link regexParser#character_class}.
	 * @param ctx the parse tree
	 */
	void exitCharacter_class(regexParser.Character_classContext ctx);
	/**
	 * Enter a parse tree produced by {@link regexParser#capture}.
	 * @param ctx the parse tree
	 */
	void enterCapture(regexParser.CaptureContext ctx);
	/**
	 * Exit a parse tree produced by {@link regexParser#capture}.
	 * @param ctx the parse tree
	 */
	void exitCapture(regexParser.CaptureContext ctx);
	/**
	 * Enter a parse tree produced by {@link regexParser#non_capture}.
	 * @param ctx the parse tree
	 */
	void enterNon_capture(regexParser.Non_captureContext ctx);
	/**
	 * Exit a parse tree produced by {@link regexParser#non_capture}.
	 * @param ctx the parse tree
	 */
	void exitNon_capture(regexParser.Non_captureContext ctx);
	/**
	 * Enter a parse tree produced by {@link regexParser#comment}.
	 * @param ctx the parse tree
	 */
	void enterComment(regexParser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link regexParser#comment}.
	 * @param ctx the parse tree
	 */
	void exitComment(regexParser.CommentContext ctx);
	/**
	 * Enter a parse tree produced by {@link regexParser#look_around}.
	 * @param ctx the parse tree
	 */
	void enterLook_around(regexParser.Look_aroundContext ctx);
	/**
	 * Exit a parse tree produced by {@link regexParser#look_around}.
	 * @param ctx the parse tree
	 */
	void exitLook_around(regexParser.Look_aroundContext ctx);
	/**
	 * Enter a parse tree produced by {@link regexParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(regexParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link regexParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(regexParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link regexParser#cc_atom}.
	 * @param ctx the parse tree
	 */
	void enterCc_atom(regexParser.Cc_atomContext ctx);
	/**
	 * Exit a parse tree produced by {@link regexParser#cc_atom}.
	 * @param ctx the parse tree
	 */
	void exitCc_atom(regexParser.Cc_atomContext ctx);
	/**
	 * Enter a parse tree produced by {@link regexParser#shared_atom}.
	 * @param ctx the parse tree
	 */
	void enterShared_atom(regexParser.Shared_atomContext ctx);
	/**
	 * Exit a parse tree produced by {@link regexParser#shared_atom}.
	 * @param ctx the parse tree
	 */
	void exitShared_atom(regexParser.Shared_atomContext ctx);
	/**
	 * Enter a parse tree produced by {@link regexParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(regexParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link regexParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(regexParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link regexParser#cc_literal}.
	 * @param ctx the parse tree
	 */
	void enterCc_literal(regexParser.Cc_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link regexParser#cc_literal}.
	 * @param ctx the parse tree
	 */
	void exitCc_literal(regexParser.Cc_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link regexParser#shared_literal}.
	 * @param ctx the parse tree
	 */
	void enterShared_literal(regexParser.Shared_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link regexParser#shared_literal}.
	 * @param ctx the parse tree
	 */
	void exitShared_literal(regexParser.Shared_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link regexParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(regexParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link regexParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(regexParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link regexParser#octal_char}.
	 * @param ctx the parse tree
	 */
	void enterOctal_char(regexParser.Octal_charContext ctx);
	/**
	 * Exit a parse tree produced by {@link regexParser#octal_char}.
	 * @param ctx the parse tree
	 */
	void exitOctal_char(regexParser.Octal_charContext ctx);
	/**
	 * Enter a parse tree produced by {@link regexParser#octal_digit}.
	 * @param ctx the parse tree
	 */
	void enterOctal_digit(regexParser.Octal_digitContext ctx);
	/**
	 * Exit a parse tree produced by {@link regexParser#octal_digit}.
	 * @param ctx the parse tree
	 */
	void exitOctal_digit(regexParser.Octal_digitContext ctx);
	/**
	 * Enter a parse tree produced by {@link regexParser#digits}.
	 * @param ctx the parse tree
	 */
	void enterDigits(regexParser.DigitsContext ctx);
	/**
	 * Exit a parse tree produced by {@link regexParser#digits}.
	 * @param ctx the parse tree
	 */
	void exitDigits(regexParser.DigitsContext ctx);
	/**
	 * Enter a parse tree produced by {@link regexParser#digit}.
	 * @param ctx the parse tree
	 */
	void enterDigit(regexParser.DigitContext ctx);
	/**
	 * Exit a parse tree produced by {@link regexParser#digit}.
	 * @param ctx the parse tree
	 */
	void exitDigit(regexParser.DigitContext ctx);
	/**
	 * Enter a parse tree produced by {@link regexParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(regexParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link regexParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(regexParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link regexParser#alpha_nums}.
	 * @param ctx the parse tree
	 */
	void enterAlpha_nums(regexParser.Alpha_numsContext ctx);
	/**
	 * Exit a parse tree produced by {@link regexParser#alpha_nums}.
	 * @param ctx the parse tree
	 */
	void exitAlpha_nums(regexParser.Alpha_numsContext ctx);
	/**
	 * Enter a parse tree produced by {@link regexParser#non_close_parens}.
	 * @param ctx the parse tree
	 */
	void enterNon_close_parens(regexParser.Non_close_parensContext ctx);
	/**
	 * Exit a parse tree produced by {@link regexParser#non_close_parens}.
	 * @param ctx the parse tree
	 */
	void exitNon_close_parens(regexParser.Non_close_parensContext ctx);
	/**
	 * Enter a parse tree produced by {@link regexParser#non_close_paren}.
	 * @param ctx the parse tree
	 */
	void enterNon_close_paren(regexParser.Non_close_parenContext ctx);
	/**
	 * Exit a parse tree produced by {@link regexParser#non_close_paren}.
	 * @param ctx the parse tree
	 */
	void exitNon_close_paren(regexParser.Non_close_parenContext ctx);
	/**
	 * Enter a parse tree produced by {@link regexParser#letter}.
	 * @param ctx the parse tree
	 */
	void enterLetter(regexParser.LetterContext ctx);
	/**
	 * Exit a parse tree produced by {@link regexParser#letter}.
	 * @param ctx the parse tree
	 */
	void exitLetter(regexParser.LetterContext ctx);
}