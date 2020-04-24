package Visitors;

import AST.*;
import symbolTable.SymbolTable;
import symbolTable.attributes.*;
import symbolTable.typeDescriptors.*;

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
        node.children.get(0).accept(new LHSSemanticsVisitor(symbolTable));
        node.children.get(0).accept(this);
        if(node.type.assignable(node.children.get(0).type)) {
            node.type = node.children.get(0).type;
        } else {
            // TODO: Add error. Right hand side expression not assignable to left hand side.
            node.type = new ErrorTypeDescriptor("Right hand side expression not assignable to left hand side");
        }
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
        VariableAttributes attrRef = (VariableAttributes)symbolTable.retrieveSymbol(node.name);
        if(attrRef == null) {
            // TODO: Add error. this id has not been declared.
            node.type = new ErrorTypeDescriptor("Id has not been declared.");
            node.attributesRef = null;
        } else {
            node.attributesRef = attrRef;
            node.type.kind = attrRef.variableType.kind; // TODO: More checking. Maybe. Page 327
        }
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
    public void visit(MatrixDeclarationNode node) {

    }

    @Override
    public void visit(MatrixExpressionNode node) {

    }

    @Override
    public void visit(ModuloNode node) {

    }

    @Override
    public void visit(MultiplicationNode node) {

    }

    @Override
    public void visit(NumberDeclarationNode node) {

    }

    @Override
    public void visit(NumberLiteralNode node) {
        node.type = new NumberTypeDescriptor();
    }

    @Override
    public void visit(VectorExpressionNode node) {

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
    public void visit(SubscriptingAssignmentNode node) {

    }

    @Override
    public void visit(SubscriptingNode node) {

    }

    @Override
    public void visit(SubtractionNode node) {

    }

    @Override
    public void visit(ValueIndexNode node) {

    }

    @Override
    public void visit(VectorDeclarationNode node) {

    }

    @Override
    public void visit(WhileNode node) {

    }

    @Override
    public void visit(ReferenceNode referenceNode) {

    }
}
