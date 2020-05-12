package visitors.semantics;

import AST.*;
import symbolTable.SymbolTable;

public class ReachabilityVisitor extends SemanticsVisitor {
    public ReachabilityVisitor(SymbolTable symTable) {
        super(symTable);
    }

    @Override
    public void visit(CodeBlockNode node) {
        symbolTable.openScope();
        if(node.children.size() > 0) {
            node.children.get(0).isReachable = node.isReachable;
        }
        visitChildren(node);
        for(int i = 1; i < node.children.size(); i++) {
            node.children.get(i).isReachable = node.children.get(i - 1).terminatesNormally;
        }
        if(node.children.size() > 0) {
            node.terminatesNormally = node.children.get(node.children.size() - 1).terminatesNormally; // Block only terminates normally if last statement does too
        }
        symbolTable.closeScope();
    }

    @Override
    public void visit(ElseStatementNode node) {
        visitChildren(node);
    }

    @Override
    public void visit(IfStatementNode node) {
        node.children.get(1).isReachable = true; // Code-block
        if(node.children.size() > 2) { // Does it have an else-statement?
            node.children.get(2).isReachable = true;
        }
        visitChildren(node);
        node.terminatesNormally = node.children.get(1).terminatesNormally || (node.children.size() > 2 && node.children.get(2).terminatesNormally);
    }

    @Override
    public void visit(WhileNode node) {
        node.terminatesNormally = true;
        node.children.get(1).isReachable = true;
        if(((LogicExpressionNode)node.children.get(0)).constantExpression) {
            node.terminatesNormally = false;
        } else {
            node.children.get(1).isReachable = false;
        }
        node.children.get(1).accept(this);
    }
}
