// Generated from C:/Users/janni/IdeaProjects/EulerLanguage/Grammar\EulerGrammer.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link EulerGrammerParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface EulerGrammerVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link EulerGrammerParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(EulerGrammerParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link EulerGrammerParser#dcls}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDcls(EulerGrammerParser.DclsContext ctx);
	/**
	 * Visit a parse tree produced by {@link EulerGrammerParser#dcl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDcl(EulerGrammerParser.DclContext ctx);
	/**
	 * Visit a parse tree produced by {@link EulerGrammerParser#stmts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmts(EulerGrammerParser.StmtsContext ctx);
	/**
	 * Visit a parse tree produced by {@link EulerGrammerParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(EulerGrammerParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link EulerGrammerParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(EulerGrammerParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link EulerGrammerParser#ctrlstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCtrlstmt(EulerGrammerParser.CtrlstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link EulerGrammerParser#ifstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfstmt(EulerGrammerParser.IfstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link EulerGrammerParser#elsestmts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElsestmts(EulerGrammerParser.ElsestmtsContext ctx);
	/**
	 * Visit a parse tree produced by {@link EulerGrammerParser#elseifstmts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseifstmts(EulerGrammerParser.ElseifstmtsContext ctx);
	/**
	 * Visit a parse tree produced by {@link EulerGrammerParser#printstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintstmt(EulerGrammerParser.PrintstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link EulerGrammerParser#stringstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringstmt(EulerGrammerParser.StringstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link EulerGrammerParser#appendsting}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAppendsting(EulerGrammerParser.AppendstingContext ctx);
	/**
	 * Visit a parse tree produced by {@link EulerGrammerParser#valindex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValindex(EulerGrammerParser.ValindexContext ctx);
	/**
	 * Visit a parse tree produced by {@link EulerGrammerParser#iterstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIterstmt(EulerGrammerParser.IterstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link EulerGrammerParser#whilestmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhilestmt(EulerGrammerParser.WhilestmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link EulerGrammerParser#assignstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignstmt(EulerGrammerParser.AssignstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link EulerGrammerParser#addexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddexpr(EulerGrammerParser.AddexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link EulerGrammerParser#multiexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiexpr(EulerGrammerParser.MultiexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link EulerGrammerParser#primeexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimeexpr(EulerGrammerParser.PrimeexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link EulerGrammerParser#logstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogstmt(EulerGrammerParser.LogstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link EulerGrammerParser#logop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogop(EulerGrammerParser.LogopContext ctx);
	/**
	 * Visit a parse tree produced by {@link EulerGrammerParser#ariop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAriop(EulerGrammerParser.AriopContext ctx);
	/**
	 * Visit a parse tree produced by {@link EulerGrammerParser#mulop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulop(EulerGrammerParser.MulopContext ctx);
}