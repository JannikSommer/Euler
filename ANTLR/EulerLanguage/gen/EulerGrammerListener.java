// Generated from C:/Users/janni/IdeaProjects/EulerLanguage/Grammar\EulerGrammer.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link EulerGrammerParser}.
 */
public interface EulerGrammerListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link EulerGrammerParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(EulerGrammerParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link EulerGrammerParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(EulerGrammerParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link EulerGrammerParser#dcls}.
	 * @param ctx the parse tree
	 */
	void enterDcls(EulerGrammerParser.DclsContext ctx);
	/**
	 * Exit a parse tree produced by {@link EulerGrammerParser#dcls}.
	 * @param ctx the parse tree
	 */
	void exitDcls(EulerGrammerParser.DclsContext ctx);
	/**
	 * Enter a parse tree produced by {@link EulerGrammerParser#dcl}.
	 * @param ctx the parse tree
	 */
	void enterDcl(EulerGrammerParser.DclContext ctx);
	/**
	 * Exit a parse tree produced by {@link EulerGrammerParser#dcl}.
	 * @param ctx the parse tree
	 */
	void exitDcl(EulerGrammerParser.DclContext ctx);
	/**
	 * Enter a parse tree produced by {@link EulerGrammerParser#stmts}.
	 * @param ctx the parse tree
	 */
	void enterStmts(EulerGrammerParser.StmtsContext ctx);
	/**
	 * Exit a parse tree produced by {@link EulerGrammerParser#stmts}.
	 * @param ctx the parse tree
	 */
	void exitStmts(EulerGrammerParser.StmtsContext ctx);
	/**
	 * Enter a parse tree produced by {@link EulerGrammerParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(EulerGrammerParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link EulerGrammerParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(EulerGrammerParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link EulerGrammerParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(EulerGrammerParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link EulerGrammerParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(EulerGrammerParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link EulerGrammerParser#ctrlstmt}.
	 * @param ctx the parse tree
	 */
	void enterCtrlstmt(EulerGrammerParser.CtrlstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link EulerGrammerParser#ctrlstmt}.
	 * @param ctx the parse tree
	 */
	void exitCtrlstmt(EulerGrammerParser.CtrlstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link EulerGrammerParser#ifstmt}.
	 * @param ctx the parse tree
	 */
	void enterIfstmt(EulerGrammerParser.IfstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link EulerGrammerParser#ifstmt}.
	 * @param ctx the parse tree
	 */
	void exitIfstmt(EulerGrammerParser.IfstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link EulerGrammerParser#elsestmts}.
	 * @param ctx the parse tree
	 */
	void enterElsestmts(EulerGrammerParser.ElsestmtsContext ctx);
	/**
	 * Exit a parse tree produced by {@link EulerGrammerParser#elsestmts}.
	 * @param ctx the parse tree
	 */
	void exitElsestmts(EulerGrammerParser.ElsestmtsContext ctx);
	/**
	 * Enter a parse tree produced by {@link EulerGrammerParser#elseifstmts}.
	 * @param ctx the parse tree
	 */
	void enterElseifstmts(EulerGrammerParser.ElseifstmtsContext ctx);
	/**
	 * Exit a parse tree produced by {@link EulerGrammerParser#elseifstmts}.
	 * @param ctx the parse tree
	 */
	void exitElseifstmts(EulerGrammerParser.ElseifstmtsContext ctx);
	/**
	 * Enter a parse tree produced by {@link EulerGrammerParser#printstmt}.
	 * @param ctx the parse tree
	 */
	void enterPrintstmt(EulerGrammerParser.PrintstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link EulerGrammerParser#printstmt}.
	 * @param ctx the parse tree
	 */
	void exitPrintstmt(EulerGrammerParser.PrintstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link EulerGrammerParser#stringstmt}.
	 * @param ctx the parse tree
	 */
	void enterStringstmt(EulerGrammerParser.StringstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link EulerGrammerParser#stringstmt}.
	 * @param ctx the parse tree
	 */
	void exitStringstmt(EulerGrammerParser.StringstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link EulerGrammerParser#appendsting}.
	 * @param ctx the parse tree
	 */
	void enterAppendsting(EulerGrammerParser.AppendstingContext ctx);
	/**
	 * Exit a parse tree produced by {@link EulerGrammerParser#appendsting}.
	 * @param ctx the parse tree
	 */
	void exitAppendsting(EulerGrammerParser.AppendstingContext ctx);
	/**
	 * Enter a parse tree produced by {@link EulerGrammerParser#valindex}.
	 * @param ctx the parse tree
	 */
	void enterValindex(EulerGrammerParser.ValindexContext ctx);
	/**
	 * Exit a parse tree produced by {@link EulerGrammerParser#valindex}.
	 * @param ctx the parse tree
	 */
	void exitValindex(EulerGrammerParser.ValindexContext ctx);
	/**
	 * Enter a parse tree produced by {@link EulerGrammerParser#iterstmt}.
	 * @param ctx the parse tree
	 */
	void enterIterstmt(EulerGrammerParser.IterstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link EulerGrammerParser#iterstmt}.
	 * @param ctx the parse tree
	 */
	void exitIterstmt(EulerGrammerParser.IterstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link EulerGrammerParser#whilestmt}.
	 * @param ctx the parse tree
	 */
	void enterWhilestmt(EulerGrammerParser.WhilestmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link EulerGrammerParser#whilestmt}.
	 * @param ctx the parse tree
	 */
	void exitWhilestmt(EulerGrammerParser.WhilestmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link EulerGrammerParser#assignstmt}.
	 * @param ctx the parse tree
	 */
	void enterAssignstmt(EulerGrammerParser.AssignstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link EulerGrammerParser#assignstmt}.
	 * @param ctx the parse tree
	 */
	void exitAssignstmt(EulerGrammerParser.AssignstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link EulerGrammerParser#addexpr}.
	 * @param ctx the parse tree
	 */
	void enterAddexpr(EulerGrammerParser.AddexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link EulerGrammerParser#addexpr}.
	 * @param ctx the parse tree
	 */
	void exitAddexpr(EulerGrammerParser.AddexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link EulerGrammerParser#multiexpr}.
	 * @param ctx the parse tree
	 */
	void enterMultiexpr(EulerGrammerParser.MultiexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link EulerGrammerParser#multiexpr}.
	 * @param ctx the parse tree
	 */
	void exitMultiexpr(EulerGrammerParser.MultiexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link EulerGrammerParser#primeexpr}.
	 * @param ctx the parse tree
	 */
	void enterPrimeexpr(EulerGrammerParser.PrimeexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link EulerGrammerParser#primeexpr}.
	 * @param ctx the parse tree
	 */
	void exitPrimeexpr(EulerGrammerParser.PrimeexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link EulerGrammerParser#logstmt}.
	 * @param ctx the parse tree
	 */
	void enterLogstmt(EulerGrammerParser.LogstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link EulerGrammerParser#logstmt}.
	 * @param ctx the parse tree
	 */
	void exitLogstmt(EulerGrammerParser.LogstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link EulerGrammerParser#logop}.
	 * @param ctx the parse tree
	 */
	void enterLogop(EulerGrammerParser.LogopContext ctx);
	/**
	 * Exit a parse tree produced by {@link EulerGrammerParser#logop}.
	 * @param ctx the parse tree
	 */
	void exitLogop(EulerGrammerParser.LogopContext ctx);
	/**
	 * Enter a parse tree produced by {@link EulerGrammerParser#ariop}.
	 * @param ctx the parse tree
	 */
	void enterAriop(EulerGrammerParser.AriopContext ctx);
	/**
	 * Exit a parse tree produced by {@link EulerGrammerParser#ariop}.
	 * @param ctx the parse tree
	 */
	void exitAriop(EulerGrammerParser.AriopContext ctx);
	/**
	 * Enter a parse tree produced by {@link EulerGrammerParser#mulop}.
	 * @param ctx the parse tree
	 */
	void enterMulop(EulerGrammerParser.MulopContext ctx);
	/**
	 * Exit a parse tree produced by {@link EulerGrammerParser#mulop}.
	 * @param ctx the parse tree
	 */
	void exitMulop(EulerGrammerParser.MulopContext ctx);
}