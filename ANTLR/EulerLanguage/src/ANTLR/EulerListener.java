// Generated from C:/Users/janni/Documents/GitHub/P4---cEX/ANTLR/EulerLanguage/Grammar\Euler.g4 by ANTLR 4.8
package ANTLR;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link EulerParser}.
 */
public interface EulerListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link EulerParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(EulerParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link EulerParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(EulerParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link EulerParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(EulerParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link EulerParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(EulerParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idInit}
	 * labeled alternative in {@link EulerParser#dcl}.
	 * @param ctx the parse tree
	 */
	void enterIdInit(EulerParser.IdInitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idInit}
	 * labeled alternative in {@link EulerParser#dcl}.
	 * @param ctx the parse tree
	 */
	void exitIdInit(EulerParser.IdInitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idAssign}
	 * labeled alternative in {@link EulerParser#dcl}.
	 * @param ctx the parse tree
	 */
	void enterIdAssign(EulerParser.IdAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idAssign}
	 * labeled alternative in {@link EulerParser#dcl}.
	 * @param ctx the parse tree
	 */
	void exitIdAssign(EulerParser.IdAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vecAssign}
	 * labeled alternative in {@link EulerParser#dcl}.
	 * @param ctx the parse tree
	 */
	void enterVecAssign(EulerParser.VecAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vecAssign}
	 * labeled alternative in {@link EulerParser#dcl}.
	 * @param ctx the parse tree
	 */
	void exitVecAssign(EulerParser.VecAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mtxAssign}
	 * labeled alternative in {@link EulerParser#dcl}.
	 * @param ctx the parse tree
	 */
	void enterMtxAssign(EulerParser.MtxAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mtxAssign}
	 * labeled alternative in {@link EulerParser#dcl}.
	 * @param ctx the parse tree
	 */
	void exitMtxAssign(EulerParser.MtxAssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link EulerParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(EulerParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link EulerParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(EulerParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link EulerParser#ifstmt}.
	 * @param ctx the parse tree
	 */
	void enterIfstmt(EulerParser.IfstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link EulerParser#ifstmt}.
	 * @param ctx the parse tree
	 */
	void exitIfstmt(EulerParser.IfstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link EulerParser#elsestmts}.
	 * @param ctx the parse tree
	 */
	void enterElsestmts(EulerParser.ElsestmtsContext ctx);
	/**
	 * Exit a parse tree produced by {@link EulerParser#elsestmts}.
	 * @param ctx the parse tree
	 */
	void exitElsestmts(EulerParser.ElsestmtsContext ctx);
	/**
	 * Enter a parse tree produced by {@link EulerParser#elseifstmts}.
	 * @param ctx the parse tree
	 */
	void enterElseifstmts(EulerParser.ElseifstmtsContext ctx);
	/**
	 * Exit a parse tree produced by {@link EulerParser#elseifstmts}.
	 * @param ctx the parse tree
	 */
	void exitElseifstmts(EulerParser.ElseifstmtsContext ctx);
	/**
	 * Enter a parse tree produced by {@link EulerParser#printstmt}.
	 * @param ctx the parse tree
	 */
	void enterPrintstmt(EulerParser.PrintstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link EulerParser#printstmt}.
	 * @param ctx the parse tree
	 */
	void exitPrintstmt(EulerParser.PrintstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link EulerParser#stringstmt}.
	 * @param ctx the parse tree
	 */
	void enterStringstmt(EulerParser.StringstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link EulerParser#stringstmt}.
	 * @param ctx the parse tree
	 */
	void exitStringstmt(EulerParser.StringstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link EulerParser#valindex}.
	 * @param ctx the parse tree
	 */
	void enterValindex(EulerParser.ValindexContext ctx);
	/**
	 * Exit a parse tree produced by {@link EulerParser#valindex}.
	 * @param ctx the parse tree
	 */
	void exitValindex(EulerParser.ValindexContext ctx);
	/**
	 * Enter a parse tree produced by {@link EulerParser#whilestmt}.
	 * @param ctx the parse tree
	 */
	void enterWhilestmt(EulerParser.WhilestmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link EulerParser#whilestmt}.
	 * @param ctx the parse tree
	 */
	void exitWhilestmt(EulerParser.WhilestmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link EulerParser#assignstmt}.
	 * @param ctx the parse tree
	 */
	void enterAssignstmt(EulerParser.AssignstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link EulerParser#assignstmt}.
	 * @param ctx the parse tree
	 */
	void exitAssignstmt(EulerParser.AssignstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link EulerParser#addexpr}.
	 * @param ctx the parse tree
	 */
	void enterAddexpr(EulerParser.AddexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link EulerParser#addexpr}.
	 * @param ctx the parse tree
	 */
	void exitAddexpr(EulerParser.AddexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link EulerParser#multiexpr}.
	 * @param ctx the parse tree
	 */
	void enterMultiexpr(EulerParser.MultiexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link EulerParser#multiexpr}.
	 * @param ctx the parse tree
	 */
	void exitMultiexpr(EulerParser.MultiexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link EulerParser#primeexpr}.
	 * @param ctx the parse tree
	 */
	void enterPrimeexpr(EulerParser.PrimeexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link EulerParser#primeexpr}.
	 * @param ctx the parse tree
	 */
	void exitPrimeexpr(EulerParser.PrimeexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link EulerParser#logstmt}.
	 * @param ctx the parse tree
	 */
	void enterLogstmt(EulerParser.LogstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link EulerParser#logstmt}.
	 * @param ctx the parse tree
	 */
	void exitLogstmt(EulerParser.LogstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link EulerParser#logop}.
	 * @param ctx the parse tree
	 */
	void enterLogop(EulerParser.LogopContext ctx);
	/**
	 * Exit a parse tree produced by {@link EulerParser#logop}.
	 * @param ctx the parse tree
	 */
	void exitLogop(EulerParser.LogopContext ctx);
	/**
	 * Enter a parse tree produced by {@link EulerParser#ariop}.
	 * @param ctx the parse tree
	 */
	void enterAriop(EulerParser.AriopContext ctx);
	/**
	 * Exit a parse tree produced by {@link EulerParser#ariop}.
	 * @param ctx the parse tree
	 */
	void exitAriop(EulerParser.AriopContext ctx);
	/**
	 * Enter a parse tree produced by {@link EulerParser#mulop}.
	 * @param ctx the parse tree
	 */
	void enterMulop(EulerParser.MulopContext ctx);
	/**
	 * Exit a parse tree produced by {@link EulerParser#mulop}.
	 * @param ctx the parse tree
	 */
	void exitMulop(EulerParser.MulopContext ctx);
}