// Generated from MiniC.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MiniCParser}.
 */
public interface MiniCListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MiniCParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(MiniCParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniCParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(MiniCParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniCParser#declare}.
	 * @param ctx the parse tree
	 */
	void enterDeclare(MiniCParser.DeclareContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniCParser#declare}.
	 * @param ctx the parse tree
	 */
	void exitDeclare(MiniCParser.DeclareContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniCParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(MiniCParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniCParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(MiniCParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniCParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterCmd(MiniCParser.CmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniCParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitCmd(MiniCParser.CmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniCParser#cmdRead}.
	 * @param ctx the parse tree
	 */
	void enterCmdRead(MiniCParser.CmdReadContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniCParser#cmdRead}.
	 * @param ctx the parse tree
	 */
	void exitCmdRead(MiniCParser.CmdReadContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniCParser#cmdWrite}.
	 * @param ctx the parse tree
	 */
	void enterCmdWrite(MiniCParser.CmdWriteContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniCParser#cmdWrite}.
	 * @param ctx the parse tree
	 */
	void exitCmdWrite(MiniCParser.CmdWriteContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniCParser#cmdCondition}.
	 * @param ctx the parse tree
	 */
	void enterCmdCondition(MiniCParser.CmdConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniCParser#cmdCondition}.
	 * @param ctx the parse tree
	 */
	void exitCmdCondition(MiniCParser.CmdConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniCParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void enterIfStmt(MiniCParser.IfStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniCParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void exitIfStmt(MiniCParser.IfStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniCParser#elseStmt}.
	 * @param ctx the parse tree
	 */
	void enterElseStmt(MiniCParser.ElseStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniCParser#elseStmt}.
	 * @param ctx the parse tree
	 */
	void exitElseStmt(MiniCParser.ElseStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniCParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(MiniCParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniCParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(MiniCParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniCParser#cmdAssign}.
	 * @param ctx the parse tree
	 */
	void enterCmdAssign(MiniCParser.CmdAssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniCParser#cmdAssign}.
	 * @param ctx the parse tree
	 */
	void exitCmdAssign(MiniCParser.CmdAssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniCParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(MiniCParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniCParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(MiniCParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniCParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(MiniCParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniCParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(MiniCParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniCParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(MiniCParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniCParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(MiniCParser.FactorContext ctx);
}