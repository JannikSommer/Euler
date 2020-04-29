package visitors;

import AST.*;

public interface IVisitor {
    
    void visit(AdditionNode node);

    void visit(AppendStringNode node);

    void visit(AssignmentNode node);

    void visit(BinaryExpressionNode node);

    void visit(CodeBlockNode node);

    void visit(DeclarationNode node);

    void visit(DivisionNode node);

    void visit(ElseIfStatementNode node);

    void visit(ElseStatementNode node);

    void visit(ErrorNode node);

    void visit(ExpressionNode node);

    void visit(IdentificationNode node);

    void visit(IfStatementNode node);

    void visit(InitializationNode node);

    void visit(LogicExpressionNode node);

    void visit(MatrixDeclarationNode node);

    void visit(MatrixExpressionNode node);

    void visit(ModuloNode node);
    
    void visit(MultiplicationNode node);

    void visit(NumberDeclarationNode node);

    void visit(NumberLiteralNode node);

    void visit(ParenthesesNode node);

    void visit(PrintNode node);

    void visit(ProgramNode node);

    void visit(ReferenceNode node);
	
    void visit(StringNode node);

    void visit(StringStatementNode node);

    void visit(SubscriptingAssignmentNode node);

    void visit(SubscriptingNode node);

    void visit(SubscriptingReferenceNode node);

    void visit(SubtractionNode node);
    
    void visit(ValueIndexNode node);

    void visit(VectorDeclarationNode node);

    void visit(VectorExpressionNode node);

    void visit(WhileNode node);
}