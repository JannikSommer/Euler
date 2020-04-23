package Visitors;

import AST.*;

public interface IVisitor {
    
    public void visit(AdditionNode node);

    public void visit(AppendStringNode node);

    public void visit(AssignmentNode node);

    public void visit(DeclarationNode node);

    public void visit(DivisionNode node);

    public void visit(ElseIfStatementNode node);

    public void visit(ElseStatementNode node);

    public void visit(IfStatementNode node);

    public void visit(LogicExpressionNode node);

    public void visit(ModuloNode node);
    
    public void visit(MultiplicationNode node);

    public void visit(PrintNode node);

    public void visit(ProgramNode node);

    // public void visit(CodeBlockNode node); //Maybe?

    public void visit(StatementBlockNode node);

    public void visit(StringStatementNode node);

    public void visit(SubtractionNode node);
    
    public void visit(ValueIndexNode node);

    public void visit(WhileNode node);
}