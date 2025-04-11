// Generated from C:/Users/adamc/Documents/GitHub/Advanced-Search-Language/src/main/java/pl/pwr/ads/antlr4/AdvancedSearchLanguage.g4 by ANTLR 4.13.2
package pl.pwr.ads.antlr4;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AdvancedSearchLanguageParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AdvancedSearchLanguageVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link AdvancedSearchLanguageParser#query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery(AdvancedSearchLanguageParser.QueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link AdvancedSearchLanguageParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(AdvancedSearchLanguageParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AdvancedSearchLanguageParser#findTitleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFindTitleExpression(AdvancedSearchLanguageParser.FindTitleExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AdvancedSearchLanguageParser#findContentExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFindContentExpression(AdvancedSearchLanguageParser.FindContentExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AdvancedSearchLanguageParser#fromExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFromExpression(AdvancedSearchLanguageParser.FromExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AdvancedSearchLanguageParser#langExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLangExpression(AdvancedSearchLanguageParser.LangExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AdvancedSearchLanguageParser#sinceExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSinceExpression(AdvancedSearchLanguageParser.SinceExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AdvancedSearchLanguageParser#untilExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUntilExpression(AdvancedSearchLanguageParser.UntilExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AdvancedSearchLanguageParser#limitExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimitExpression(AdvancedSearchLanguageParser.LimitExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AdvancedSearchLanguageParser#filterExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilterExpression(AdvancedSearchLanguageParser.FilterExpressionContext ctx);
}