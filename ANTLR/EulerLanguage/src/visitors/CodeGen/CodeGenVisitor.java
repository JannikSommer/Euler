package Visitors.CodeGen;

import Visitors.IVisitor;
import AST.*;


public class CodeGenVisitor implements IVisitor {

    private CodeGenStringBuilder CGSBuilder;
    private String currentString;
    private String[] DeclatedMatrices;

    
    public String GenerateCode(ASTNode node){
        CGSBuilder = new CodeGenStringBuilder();

        PreWork();
        node.accept(this);
        PostWork();
        return CGSBuilder.ReturnString();
	}

    private void PreWork(){
        CGSBuilder.AppendHeader();
        CGSBuilder.AppendMain();
    }

    private void PostWork(){
        FreeVectorMatrices();
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
        currentString = "";
        node.children.get(0).accept(this);
        currentString += " = ";
        node.children.get(1).accept(this);
        currentString += ";";
        CGSBuilder.AppendText(currentString);
    }

    @Override
    public void visit(BinaryExpressionNode node) {
        //Abstract class, do nothing
    }

    @Override
    public void visit(CodeBlockNode node){
        for(ASTNode child : node.children){
            child.accept(this);  
		}
    }

    @Override
    public void visit(DeclarationNode node) {
        //Abstract class, do nothing
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
        //Abstract class, do nothing
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
        node.children.get(0).accept(this);
    }

    @Override
    public void visit(LogicExpressionNode node){

    }

    @Override
    public void visit(MatrixDeclarationNode node){
        currentString = "";
        node.children.get(0).accept(this);
        currentString += " = ";
        node.children.get(1).accept(this);
    }

    @Override
    public void visit(ModuloNode node){
        node.children.get(0).accept(this);
        currentString += " % ";
        node.children.get(1).accept(this);
    }
    
    @Override
    public void visit(MultiplicationNode node){
        //TODO add vector and matrix handling
        node.children.get(0).accept(this);
        currentString += " * ";
        node.children.get(1).accept(this);
    }

    @Override
    public void visit(NumberDeclarationNode node){
        currentString = "double ";
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
        currentString += " (";
        node.children.get(0).accept(this);
        currentString += ") ";
    }

    @Override
    public void visit(PrintNode node){
        //TODO NOT DONE
        currentString += "printf(\"\")";
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
        currentString = "";
        node.children.get(0).accept(this);
        node.children.get(1).accept(this);
        currentString += " = ";
        node.children.get(2).accept(this);
        currentString += ";";
        CGSBuilder.AppendText(currentString);
    }

    @Override
    public void visit(SubscriptingNode node){
        for(int index : node.index){
            currentString += "[" + index + "]";
		}
    }

    @Override
    public void visit(SubtractionNode node){
        node.children.get(0).accept(this);
        currentString += " - ";
        node.children.get(1).accept(this);
    }
    
    @Override
    public void visit(ValueIndexNode node){
        currentString += "[" + node.indexA + "]";
        if(node.indexB != -1){
            currentString += "[" + node.indexB + "]";
		}
    }

    @Override
    public void visit(VectorDeclarationNode node){
        currentString = "Vector ";
        node.children.get(0).accept(this);
        currentString += " = ";
        node.children.get(1).accept(this);
        CGSBuilder.AppendText(currentString);

        int index = 0;
        for(ASTNode child : node.children.get(1).children){
            currentString = "";
            node.children.get(0).accept(this);
            currentString += ".elements[";
            currentString += index;
            currentString += "] = ";
            child.accept(this);
            currentString += ";";
            index++;
            CGSBuilder.AppendText(currentString);
        }
        CGSBuilder.AppendSpace();
    }

    @Override
    public void visit(VectorExpressionNode node){
        currentString += "CreateVector(";
        currentString += node.children.size();
        currentString += ");";
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