package Visitors;

import AST.*;
import symbolTable.SymbolTable;

public class SemanticsVisitor implements IVisitor {
    SymbolTable symbolTable;

    public SemanticsVisitor(SymbolTable symTable) {
        symbolTable = symTable;
    }

    @Override
    public void visit(AdditionNode node) {

    }

    @Override
    public void visit(AppendStringNode node) {

    }

    @Override
    public void visit(AssignmentNode node) {

    }

    @Override
    public void visit(DeclarationNode node) {

    }

    @Override
    public void visit(DivisionNode node) {

    }

    @Override
    public void visit(ElseIfStatementNode node) {

    }

    @Override
    public void visit(ElseStatementNode node) {

    }

    @Override
    public void visit(IdentificationNode node) {

    }

    @Override
    public void visit(IfStatementNode node) {

    }

    @Override
    public void visit(InitializationNode node) {

    }

    @Override
    public void visit(LogicExpressionNode node) {

    }

    @Override
    public void visit(ModuloNode node) {

    }

    @Override
    public void visit(MultiplicationNode node) {

    }

    @Override
    public void visit(NumberLiteral node) {

    }

    @Override
    public void visit(ParenthesesNode node) {

    }

    @Override
    public void visit(PrintNode node) {

    }

    @Override
    public void visit(ProgramNode node) {

    }

    @Override
    public void visit(CodeBlockNode node) {

    }

    @Override
    public void visit(StringStatementNode node) {

    }

    @Override
    public void visit(SubtractionNode node) {

    }

    @Override
    public void visit(ValueIndexNode node) {

    }

    @Override
    public void visit(WhileNode node) {

    }
}
