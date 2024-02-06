package org.shkandyuk.nuxmv.grammar.parser;

// Generated from /home/denis/Documents/5_ITMO/NIR/nuXmv/NuXmvParser.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link NuXmvParser}.
 */
public interface NuXmvParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link NuXmvParser#module}.
	 * @param ctx the parse tree
	 */
	void enterModule(NuXmvParser.ModuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuXmvParser#module}.
	 * @param ctx the parse tree
	 */
	void exitModule(NuXmvParser.ModuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuXmvParser#ivar}.
	 * @param ctx the parse tree
	 */
	void enterIvar(NuXmvParser.IvarContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuXmvParser#ivar}.
	 * @param ctx the parse tree
	 */
	void exitIvar(NuXmvParser.IvarContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuXmvParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(NuXmvParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuXmvParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(NuXmvParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuXmvParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(NuXmvParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuXmvParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(NuXmvParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuXmvParser#init}.
	 * @param ctx the parse tree
	 */
	void enterInit(NuXmvParser.InitContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuXmvParser#init}.
	 * @param ctx the parse tree
	 */
	void exitInit(NuXmvParser.InitContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuXmvParser#trans}.
	 * @param ctx the parse tree
	 */
	void enterTrans(NuXmvParser.TransContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuXmvParser#trans}.
	 * @param ctx the parse tree
	 */
	void exitTrans(NuXmvParser.TransContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuXmvParser#invarspec}.
	 * @param ctx the parse tree
	 */
	void enterInvarspec(NuXmvParser.InvarspecContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuXmvParser#invarspec}.
	 * @param ctx the parse tree
	 */
	void exitInvarspec(NuXmvParser.InvarspecContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuXmvParser#assignList}.
	 * @param ctx the parse tree
	 */
	void enterAssignList(NuXmvParser.AssignListContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuXmvParser#assignList}.
	 * @param ctx the parse tree
	 */
	void exitAssignList(NuXmvParser.AssignListContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuXmvParser#initAssign}.
	 * @param ctx the parse tree
	 */
	void enterInitAssign(NuXmvParser.InitAssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuXmvParser#initAssign}.
	 * @param ctx the parse tree
	 */
	void exitInitAssign(NuXmvParser.InitAssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuXmvParser#nextAssign}.
	 * @param ctx the parse tree
	 */
	void enterNextAssign(NuXmvParser.NextAssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuXmvParser#nextAssign}.
	 * @param ctx the parse tree
	 */
	void exitNextAssign(NuXmvParser.NextAssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuXmvParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(NuXmvParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuXmvParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(NuXmvParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuXmvParser#condExpr}.
	 * @param ctx the parse tree
	 */
	void enterCondExpr(NuXmvParser.CondExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuXmvParser#condExpr}.
	 * @param ctx the parse tree
	 */
	void exitCondExpr(NuXmvParser.CondExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuXmvParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(NuXmvParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuXmvParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(NuXmvParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuXmvParser#orExpr}.
	 * @param ctx the parse tree
	 */
	void enterOrExpr(NuXmvParser.OrExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuXmvParser#orExpr}.
	 * @param ctx the parse tree
	 */
	void exitOrExpr(NuXmvParser.OrExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuXmvParser#andExpr}.
	 * @param ctx the parse tree
	 */
	void enterAndExpr(NuXmvParser.AndExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuXmvParser#andExpr}.
	 * @param ctx the parse tree
	 */
	void exitAndExpr(NuXmvParser.AndExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuXmvParser#equalityExpr}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpr(NuXmvParser.EqualityExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuXmvParser#equalityExpr}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpr(NuXmvParser.EqualityExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuXmvParser#relationalExpr}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpr(NuXmvParser.RelationalExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuXmvParser#relationalExpr}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpr(NuXmvParser.RelationalExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuXmvParser#unaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpr(NuXmvParser.UnaryExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuXmvParser#unaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpr(NuXmvParser.UnaryExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuXmvParser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpr(NuXmvParser.PrimaryExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuXmvParser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpr(NuXmvParser.PrimaryExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuXmvParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(NuXmvParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuXmvParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(NuXmvParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuXmvParser#valueList}.
	 * @param ctx the parse tree
	 */
	void enterValueList(NuXmvParser.ValueListContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuXmvParser#valueList}.
	 * @param ctx the parse tree
	 */
	void exitValueList(NuXmvParser.ValueListContext ctx);
}