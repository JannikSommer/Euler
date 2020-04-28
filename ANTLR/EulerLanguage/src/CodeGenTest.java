import Visitors.CodeGen.*;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class CodeGenTest {
    public static void main(String[] args) throws FileNotFoundException {

        CodeGenVisitor _CodeGenVisitor = new CodeGenVisitor();
        
        try (PrintWriter out = new PrintWriter("test.txt")) {
            out.println(_CodeGenVisitor.Test());
        }
    }
}