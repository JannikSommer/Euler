import ANTLR.EulerLexer;
import ANTLR.EulerParser;
import AST.ASTNode;
import AST.ProgramNode;
import symbolTable.SymbolTable;
import visitors.AstBuilderVisitor;
import visitors.CodeGen.*;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import visitors.semantics.ErrorVisitor;
import visitors.semantics.SemanticsVisitor;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class CodeGenTest {
    public static void main(String[] args) throws FileNotFoundException {

        CharStream input = null;
        String InputFile = System.getProperty("user.dir") + "/EulerLanguage/src/kurt.txt";
        try {
            input = CharStreams.fromFileName(InputFile);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        EulerLexer lexer = new EulerLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        EulerParser parser = new EulerParser(tokens);
        ParseTree tree = parser.program();
        System.out.println(parser.program().getText());

        AstBuilderVisitor astBuilder = new AstBuilderVisitor();
        ASTNode node = astBuilder.visit(tree);

        SymbolTable symbolTable = new SymbolTable();
        node.accept(new SemanticsVisitor(symbolTable));
        node.accept(new ErrorVisitor());

        CodeGenVisitor _CodeGenVisitor = new CodeGenVisitor();
        
        try (PrintWriter out = new PrintWriter("test.c")) {
            out.println(_CodeGenVisitor.GenerateCode(node));
        }
    }
}