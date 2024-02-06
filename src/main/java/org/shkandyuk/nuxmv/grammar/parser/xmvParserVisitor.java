// Generated from /home/denis/Documents/5_ITMO/NIR/nuXmv/src/main/java/org/shkandyuk/nuxmv/grammar/parser/xmvParser.g4 by ANTLR 4.13.1
package org.shkandyuk.nuxmv.grammar.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link xmvParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface xmvParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link xmvParser#module}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule(xmvParser.ModuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link xmvParser#moduleParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModuleParameters(xmvParser.ModuleParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link xmvParser#moduleContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModuleContent(xmvParser.ModuleContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link xmvParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(xmvParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link xmvParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(xmvParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link xmvParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(xmvParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link xmvParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(xmvParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link xmvParser#binaryOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryOp(xmvParser.BinaryOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link xmvParser#specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecification(xmvParser.SpecificationContext ctx);
}