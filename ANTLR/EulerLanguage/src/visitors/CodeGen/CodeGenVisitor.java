package visitors.CodeGen;

import visitors.IVisitor;
import AST.*;


public class CodeGenVisitor implements IVisitor {

    private CodeGenStringBuilder CGSBuilder;

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
        CGSBuilder.AppendDirectives();
        CGSBuilder.AppendStructures();
        CGSBuilder.AppendSpace();
        CGSBuilder.AppendPrototypes();
        CGSBuilder.AppendSpace();
        CGSBuilder.AppendMain();
    }

    private void PostWork(){
        CGSBuilder.AppendCloseMain();
        CGSBuilder.AppendFunctions();
        CGSBuilder.AppendSpace();
	}
    
    public void visit(AdditionNode node){

    }

    public void visit(AppendStringNode node){

    }

    public void visit(AssignmentNode node){

    }

    @Override
    public void visit(BinaryExpressionNode node) {

    }

    public void visit(CodeBlockNode node){

    }

    public void visit(DeclarationNode node){

    }

    public void visit(DivisionNode node){

    }

    public void visit(ElseIfStatementNode node){

    }

    public void visit(ElseStatementNode node){

    }

    @Override
    public void visit(ErrorNode node) {

    }

    @Override
    public void visit(ExpressionNode node) {

    }

    public void visit(IdentificationNode node){

    }

    public void visit(IfStatementNode node){

    }

    public void visit(InitializationNode node){

    }

    public void visit(LogicExpressionNode node){

    }

    public void visit(MatrixDeclarationNode node){

    }

    public void visit(ModuloNode node){

    }
    
    public void visit(MultiplicationNode node){

    }

    public void visit(NumberDeclarationNode node){

    }

    public void visit(NumberLiteralNode node){

    }

    public void visit(ParenthesesNode node){

    }

    public void visit(PrintNode node){
        
    }

    public void visit(ProgramNode node){
        
    }
	
    public void visit(StringNode node){
        
    }

    public void visit(StringStatementNode node){

    }

    public void visit(SubscriptingAssignmentNode node){

    }

    public void visit(SubscriptingNode node){

    }

    public void visit(SubtractionNode node){

    }
    
    public void visit(ValueIndexNode node){
        
    }

    public void visit(VectorDeclarationNode node){
        
    }

    public void visit(VectorExpressionNode node){
        
    }

    public void visit(WhileNode node){
        
    }

    public void visit(ReferenceNode node){

    }
    
    public void visit(MatrixExpressionNode node){

    }

    public void visit(SubscriptingReferenceNode node) {

    }
}