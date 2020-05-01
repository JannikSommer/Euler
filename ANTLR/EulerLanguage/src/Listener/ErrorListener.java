package Listener;

import ANTLR.*;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.misc.ParseCancellationException;

public class ErrorListener extends BaseErrorListener {

    public static final ErrorListener INSTANCE = new ErrorListener();

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e)  {
        System.out.println("Syntax error at line " + line + ":" + charPositionInLine + " ---> " + msg);
    }

    public void ReportErrorAST(int line, int charposition, String msg){
        System.out.println("Syntax error at line " + line+ ":" + charposition + " ---> " + msg);
    }
}
