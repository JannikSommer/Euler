import ANTLR.*;
import AST.*;
import symbolTable.SymbolTable;
import Visitors.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import Visitors.semantics.ReachabilityVisitor;
import Visitors.semantics.SemanticsVisitor;
import Visitors.semantics.TopDeclVisitor;

import java.io.IOException;

public class EulerCompiler {

    public static void main(String[] args) {
        CharStream input = null;
        String InputFile = System.getProperty("user.dir") + "/EulerLanguage/src/kurt.txt";
        // String InputFile = System.getProperty("C:/Users/janni/Documents/GitHub/P4---cEX/ANTLR/EulerLanguage/src/kurt.txt");
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
        // System.out.println(tree.toStringTree(parser)); // print LISP-style tree
        AstBuilderVisitor astBuilder = new AstBuilderVisitor();
        ASTNode node = astBuilder.visit(tree);
        if (node == null) {
            node = new ProgramNode(null);
        }

        // --- Semantics ---
        //SymbolTable symbolTable = new SymbolTable();
        //node.accept(new SemanticsVisitor(symbolTable));
        //node.accept(new TopDeclVisitor(symbolTable));
        //node.accept(new ReachabilityVisitor(symbolTable));

        int a = 1+1;
    }
}
