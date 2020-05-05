import ANTLR.EulerLexer;
import ANTLR.EulerParser;
import AST.ASTNode;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import symbolTable.SymbolTable;
import visitors.AstBuilderVisitor;
import visitors.CodeGen.CodeGenVisitor;
import visitors.semantics.ErrorVisitor;
import visitors.semantics.SemanticsVisitor;
import visitors.treeGeneration.TreeToGraphGen;
import static java.lang.Character.isLetter;
import java.io.File;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;



public class main {
    public static void main(String[] args) throws IOException {
        CharStream input = null;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        File file;
        String Path;
        boolean FileApproved = false;

        System.out.println("Filepath:\n");
        do {
            Path = reader.readLine();

            if(Path.equals("exit") || Path.equals("EXIT") || Path.equals("Exit")){
                return;
            } else if(Path.equals("help") || Path.equals("HELP") || Path.equals("Help")){
                System.out.println("You must type in the directory of a file of type \".euler\"\ntype \"exit\" to terminate the process");
            }

            if (isLetter(Path.charAt(0)) && Path.charAt(1) == ':' && (Path.charAt(2) == '/' || Path.charAt(2) == '\\')) {
                Path = Path.replace('/', '\\');
            } else {
                Path = System.getProperty("user.dir") + "\\" + Path.replace('/', '\\');
            }

            file = new File(Path);

            if(!file.exists()){
                System.out.println("File at \"" + Path + "\" did not exist\nPlease try again:\n");
            } else if(!Path.endsWith(".euler")){
                System.out.println("File at \"" + Path + "\" is not of type .euler\nPlease try again:\n");
            } else{
                FileApproved = true;
            }
        } while(!FileApproved);

        try {
            input = CharStreams.fromFileName(Path);
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

        String OutputName;
        Boolean OutputNameApproved = false;
        System.out.println("File successfully compiled, please type in name for output file:\n");
        do {
            OutputName = reader.readLine();

            if (OutputName.endsWith(".c")) {
                OutputNameApproved = true;
            } else if(!OutputName.contains(".")){
                OutputNameApproved = true;
                OutputName += ".c";
            } else{
                System.out.println("filename \"" + OutputName + "\" is not valid, please try again");
            }
        } while (!OutputNameApproved);

        try (PrintWriter out = new PrintWriter(OutputName)) {
            out.println(_CodeGenVisitor.GenerateCode(node));
        }
    }
}
