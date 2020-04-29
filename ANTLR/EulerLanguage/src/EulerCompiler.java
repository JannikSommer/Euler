import ANTLR.*;
import AST.*;
import symbolTable.SymbolTable;
import visitors.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import visitors.semantics.ErrorVisitor;
import visitors.semantics.ReachabilityVisitor;
import visitors.semantics.SemanticsVisitor;
import visitors.semantics.TopDeclVisitor;

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
        SymbolTable symbolTable = new SymbolTable();
        node.accept(new SemanticsVisitor(symbolTable));
        node.accept(new ErrorVisitor());
        // TODO: Need line number and line position in nodes for precise errors.
    }
}
