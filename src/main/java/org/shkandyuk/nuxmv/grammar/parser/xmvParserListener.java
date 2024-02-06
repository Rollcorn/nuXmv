// Generated from /home/denis/Documents/5_ITMO/NIR/nuXmv/src/main/java/org/shkandyuk/nuxmv/grammar/parser/xmvParser.g4 by ANTLR 4.13.1
package org.shkandyuk.nuxmv.grammar.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link xmvParser}.
 */
public interface xmvParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link xmvParser#module}.
	 * @param ctx the parse tree
	 */
	void enterModule(xmvParser.ModuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link xmvParser#module}.
	 * @param ctx the parse tree
	 */
	void exitModule(xmvParser.ModuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link xmvParser#moduleParameters}.
	 * @param ctx the parse tree
	 */
	void enterModuleParameters(xmvParser.ModuleParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link xmvParser#moduleParameters}.
	 * @param ctx the parse tree
	 */
	void exitModuleParameters(xmvParser.ModuleParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link xmvParser#moduleContent}.
	 * @param ctx the parse tree
	 */
	void enterModuleContent(xmvParser.ModuleContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link xmvParser#moduleContent}.
	 * @param ctx the parse tree
	 */
	void exitModuleContent(xmvParser.ModuleContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link xmvParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(xmvParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link xmvParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(xmvParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link xmvParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(xmvParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link xmvParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(xmvParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link xmvParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(xmvParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link xmvParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(xmvParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link xmvParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(xmvParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link xmvParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(xmvParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link xmvParser#binaryOp}.
	 * @param ctx the parse tree
	 */
	void enterBinaryOp(xmvParser.BinaryOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link xmvParser#binaryOp}.
	 * @param ctx the parse tree
	 */
	void exitBinaryOp(xmvParser.BinaryOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link xmvParser#specification}.
	 * @param ctx the parse tree
	 */
	void enterSpecification(xmvParser.SpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link xmvParser#specification}.
	 * @param ctx the parse tree
	 */
	void exitSpecification(xmvParser.SpecificationContext ctx);
}