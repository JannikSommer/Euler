package Visitors.CodeGen;

import Visitors.IVisitor;
import AST.*;


public class CodeGenVisitor implements IVisitor {

    private CodeGenStringBuilder CGSBuilder;
    private String currentString;

    public String Test(){
        CGSBuilder = new CodeGenStringBuilder();

        PreWork(); 
        PostWork();

        return CGSBuilder.ReturnString();
	}
    
    public String GenerateCode(ProgramNode node){
        CGSBuilder = new CodeGenStringBuilder();

        PreWork();
        visit(node);
        PostWork();
        return CGSBuilder.ReturnString();
	}

    private void PreWork(){
        CGSBuilder.AppendHeader();
        CGSBuilder.AppendMain();
    }

    private void PostWork(){
        CGSBuilder.AppendCloseMain();
        CGSBuilder.AppendFunctions();
        CGSBuilder.AppendSpace();
	}
    
    @Override
    public void visit(AdditionNode node){
        node.children.get(0).accept(this);
        currentString += " + ";
        node.children.get(1).accept(this);
    }
        
    @Override
    public void visit(AppendStringNode node){

    }

    @Override
    public void visit(AssignmentNode node){

    }

    @Override
    public void visit(BinaryExpressionNode node) {

    }

    @Override
    public void visit(CodeBlockNode node){
        for(ASTNode child : node.children){
            child.accept(this);  
		}
    }

    @Override
    public void visit(DeclarationNode node){

    }

    @Override
    public void visit(DivisionNode node){
        node.children.get(0).accept(this);
        currentString += " / ";
        node.children.get(1).accept(this);
    }

    @Override
    public void visit(ElseIfStatementNode node){

    }

    @Override
    public void visit(ElseStatementNode node){

    }

    @Override
    public void visit(ExpressionNode node) {

    }

    @Override
    public void visit(IdentificationNode node){
        currentString += node.name;
    }

    @Override
    public void visit(IfStatementNode node){

    }

    @Override
    public void visit(InitializationNode node){

    }

    @Override
    public void visit(LogicExpressionNode node){

    }

    @Override
    public void visit(MatrixDeclarationNode node){

    }

    @Override
    public void visit(ModuloNode node){
        node.children.get(0).accept(this);
        currentString += " % ";
        node.children.get(1).accept(this);
    }
    
    @Override
    public void visit(MultiplicationNode node){
        node.children.get(0).accept(this);
        currentString += " * ";
        node.children.get(1).accept(this);
    }

    @Override
    public void visit(NumberDeclarationNode node){
        currentString = "";
        node.children.get(0).accept(this); //IdentificationNode
        currentString += " = ";
        node.children.get(1).accept(this); //number or referance
        currentString += ";";
        CGSBuilder.AppendText(currentString);
    }

    @Override
    public void visit(NumberLiteralNode node){
        currentString += node.value;
    }

    @Override
    public void visit(ParenthesesNode node){

    }

    @Override
    public void visit(PrintNode node){
        
    }

    @Override
    public void visit(ProgramNode node){
        node.children.get(0).accept(this);
    }
	
    @Override
    public void visit(StringNode node){
        
    }

    @Override
    public void visit(StringStatementNode node){

    }

    @Override
    public void visit(SubscriptingAssignmentNode node){

    }

    @Override
    public void visit(SubscriptingNode node){

    }

    @Override
    public void visit(SubtractionNode node){
        node.children.get(0).accept(this);
        currentString += " - ";
        node.children.get(1).accept(this);
    }
    
    @Override
    public void visit(ValueIndexNode node){
        
    }

    @Override
    public void visit(VectorDeclarationNode node){
        
    }

    @Override
    public void visit(VectorExpressionNode node){
        
    }

    @Override
    public void visit(WhileNode node){
        
    }

    @Override
    public void visit(ReferenceNode node){

    }
    
    @Override
    public void visit(MatrixExpressionNode node){

    }
}