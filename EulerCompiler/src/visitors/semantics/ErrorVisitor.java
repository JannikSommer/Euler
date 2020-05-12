package visitors.semantics;

import AST.*;
import symbolTable.typeDescriptors.ErrorTypeDescriptor;
import symbolTable.typeDescriptors.TypeDescriptorKind;
import visitors.NodeVisitor;

import java.util.ArrayList;

public class ErrorVisitor extends NodeVisitor {

    public ArrayList<String> errors = new ArrayList<>();

    @Override
    public void visit(AdditionNode node) {
        GenericPrint(node);
    }

    @Override
    public void visit(AppendStringNode node) {
        GenericPrint(node);
    }

    @Override
    public void visit(AssignmentNode node) {
        GenericPrint(node);
    }

    @Override
    public void visit(BinaryExpressionNode node) {
        GenericPrint(node);
    }

    @Override
    public void visit(CodeBlockNode node) {
        GenericPrint(node);
    }

    @Override
    public void visit(DeclarationNode node) {
        GenericPrint(node);
    }

    @Override
    public void visit(DivisionNode node) {
        GenericPrint(node);
    }

    @Override
    public void visit(ElseIfStatementNode node) {
        GenericPrint(node);
    }

    @Override
    public void visit(ElseStatementNode node) {
        GenericPrint(node);
    }

    @Override
    public void visit(ErrorNode node) {
        GenericPrint(node);
    }

    @Override
    public void visit(ExpressionNode node) {
        GenericPrint(node);
    }

    @Override
    public void visit(IdentificationNode node) {
        GenericPrint(node);
    }

    @Override
    public void visit(IfStatementNode node) {
        GenericPrint(node);
    }

    @Override
    public void visit(InitializationNode node) {
        GenericPrint(node);
    }

    @Override
    public void visit(LogicExpressionNode node) {
        GenericPrint(node);
    }

    @Override
    public void visit(MatrixDeclarationNode node) {
        GenericPrint(node);
    }

    @Override
    public void visit(MatrixExpressionNode node) {
        GenericPrint(node);
    }

    @Override
    public void visit(ModuloNode node) {
        GenericPrint(node);
    }

    @Override
    public void visit(MultiplicationNode node) {
        GenericPrint(node);
    }

    @Override
    public void visit(NumberDeclarationNode node) {
        GenericPrint(node);
    }

    @Override
    public void visit(NumberLiteralNode node) {
        GenericPrint(node);
    }

    @Override
    public void visit(ParenthesesNode node) {
        GenericPrint(node);
    }

    @Override
    public void visit(PrintNode node) {
        GenericPrint(node);
    }

    @Override
    public void visit(ProgramNode node) {
        GenericPrint(node);
    }

    @Override
    public void visit(ReferenceNode node) {
        GenericPrint(node);
    }

    @Override
    public void visit(StringNode node) {
        GenericPrint(node);
    }

    @Override
    public void visit(StringStatementNode node) {
        GenericPrint(node);
    }

    @Override
    public void visit(SubscriptingAssignmentNode node) {
        GenericPrint(node);
    }

    @Override
    public void visit(SubscriptingNode node) {
        GenericPrint(node);
    }

    @Override
    public void visit(SubscriptingReferenceNode node) {
        GenericPrint(node);
    }

    @Override
    public void visit(SubtractionNode node) {
        GenericPrint(node);
    }

    @Override
    public void visit(ValueIndexNode node) {
        GenericPrint(node);
    }

    @Override
    public void visit(VectorDeclarationNode node) {
        GenericPrint(node);
    }

    @Override
    public void visit(VectorExpressionNode node) {
        GenericPrint(node);
    }

    @Override
    public void visit(WhileNode node) {
        GenericPrint(node);
    }

    private void GenericPrint(ASTNode node) {
        if(node.type != null && node.type.kind == TypeDescriptorKind.error) {
            saveError((ErrorTypeDescriptor) node.type);
        } else {
            visitChildren(node);
        }
    }

    private boolean hasError(ASTNode node) {
        return node.type != null && node.type.kind == TypeDescriptorKind.error;
    }

    public void printErrors(){
        for (String message : errors) {
            System.out.println(message);
        }
    }

    public boolean hasErrors() {
        return errors.size() != 0;
    }

    private void saveError(ErrorTypeDescriptor error) {
        errors.add(error.message);
    }
}
