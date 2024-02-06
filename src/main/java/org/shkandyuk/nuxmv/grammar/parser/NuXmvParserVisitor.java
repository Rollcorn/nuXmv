package org.shkandyuk.nuxmv.grammar.parser;

// Generated from /home/denis/Documents/5_ITMO/NIR/nuXmv/NuXmvParser.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link NuXmvParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface NuXmvParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link NuXmvParser#module}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule(NuXmvParser.ModuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuXmvParser#ivar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIvar(NuXmvParser.IvarContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuXmvParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(NuXmvParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuXmvParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(NuXmvParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuXmvParser#init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit(NuXmvParser.InitContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuXmvParser#trans}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrans(NuXmvParser.TransContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuXmvParser#invarspec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInvarspec(NuXmvParser.InvarspecContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuXmvParser#assignList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignList(NuXmvParser.AssignListContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuXmvParser#initAssign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitAssign(NuXmvParser.InitAssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuXmvParser#nextAssign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNextAssign(NuXmvParser.NextAssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuXmvParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(NuXmvParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuXmvParser#condExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondExpr(NuXmvParser.CondExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuXmvParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(NuXmvParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuXmvParser#orExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpr(NuXmvParser.OrExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuXmvParser#andExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpr(NuXmvParser.AndExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuXmvParser#equalityExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpr(NuXmvParser.EqualityExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuXmvParser#relationalExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpr(NuXmvParser.RelationalExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuXmvParser#unaryExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpr(NuXmvParser.UnaryExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuXmvParser#primaryExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpr(NuXmvParser.PrimaryExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuXmvParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(NuXmvParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link NuXmvParser#valueList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueList(NuXmvParser.ValueListContext ctx);
}