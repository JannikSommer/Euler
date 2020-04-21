// Generated from C:/Users/janni/IdeaProjects/EulerLanguage/Grammar\Euler.g4 by ANTLR 4.8
package ANTLR;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link EulerParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface EulerVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link EulerParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(EulerParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link EulerParser#dcl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDcl(EulerParser.DclContext ctx);
	/**
	 * Visit a parse tree produced by {@link EulerParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(EulerParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link EulerParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(EulerParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link EulerParser#ifstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfstmt(EulerParser.IfstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link EulerParser#elsestmts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElsestmts(EulerParser.ElsestmtsContext ctx);
	/**
	 * Visit a parse tree produced by {@link EulerParser#elseifstmts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseifstmts(EulerParser.ElseifstmtsContext ctx);
	/**
	 * Visit a parse tree produced by {@link EulerParser#printstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintstmt(EulerParser.PrintstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link EulerParser#stringstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringstmt(EulerParser.StringstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link EulerParser#appendsting}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAppendsting(EulerParser.AppendstingContext ctx);
	/**
	 * Visit a parse tree produced by {@link EulerParser#valindex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValindex(EulerParser.ValindexContext ctx);
	/**
	 * Visit a parse tree produced by {@link EulerParser#whilestmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhilestmt(EulerParser.WhilestmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link EulerParser#assignstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignstmt(EulerParser.AssignstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link EulerParser#addexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddexpr(EulerParser.AddexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link EulerParser#multiexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiexpr(EulerParser.MultiexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link EulerParser#primeexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimeexpr(EulerParser.PrimeexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link EulerParser#logstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogstmt(EulerParser.LogstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link EulerParser#logop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogop(EulerParser.LogopContext ctx);
	/**
	 * Visit a parse tree produced by {@link EulerParser#ariop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAriop(EulerParser.AriopContext ctx);
	/**
	 * Visit a parse tree produced by {@link EulerParser#mulop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulop(EulerParser.MulopContext ctx);
}