package Visitors;

import AST.*;

public interface IVisitor {
    
    void visit(AdditionNode node);

    void visit(AppendStringNode node);

    void visit(AssignmentNode node);

    void visit(CodeBlockNode node);

    void visit(DeclarationNode node);

    void visit(DivisionNode node);

    void visit(ElseIfStatementNode node);

    void visit(ElseStatementNode node);

    void visit(IdentificationNode node);

    void visit(IfStatementNode node);

    void visit(InitializationNode node);

    void visit(LogicExpressionNode node);

    void visit(MatrixDeclarationNode node);

    void visit(ModuloNode node);
    
    void visit(MultiplicationNode node);

    void visit(NumberDeclarationNode node);

    void visit(NumberLiteralNode node);

    void visit(ParenthesesNode node);

    // public void visit(CodeBlockNode node); //Maybe?

    void visit(PrintNode node);

    void visit(ProgramNode node);
	
    void visit(StringNode node);

    void visit(StringStatementNode node);

    void visit(SubscriptingAssignmentNode node);

    void visit(SubscriptingNode node);

    void visit(SubtractionNode node);
    
    void visit(ValueIndexNode node);

    void visit(VectorDeclarationNode node);

    void visit(VectorExpressionNode node);

    void visit(WhileNode node);

    void visit(ReferenceNode node);
    
    void visit(MatrixExpressionNode node);
}