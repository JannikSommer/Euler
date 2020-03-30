

%%

/* %debug */
%standalone

%{
   /*  Call me to say what you found */
   public void found(String str) {
      System.out.println();  System.out.flush();  /* flush std out */
      System.err.println("Found |" + str + "| from text -->" + yytext() + "<--");
   }
%}

WhiteSpace 			=	" " | "\n" | "\t"
Number 				=	[0-9]+("."[0-9]+)?
LogOp				=	"==" | "<" | ">" | "<=" | ">=" | "!="
MultOp				=	"*" | "/" | "%"
ID	 				=	[a-zA-Z0-9]*[a-zA-Z][a-zA-Z0-9]*
Ival				=	{Number} | {ID}
ReservedSymbols		=	"\"" | "\\"



%%	

/* TYPES */
	/* Vector */
	"<"{WhiteSpace}*{Ival}{WhiteSpace}*(","{WhiteSpace}*{Ival})*{WhiteSpace}*">"	
																				{ found("symbol.Vector"); }

	/* Matrix */
	"{"{WhiteSpace}*{Ival}({WhiteSpace}*","{WhiteSpace}*{Ival})+({WhiteSpace}*";"{WhiteSpace}*{Ival}({WhiteSpace}*","{WhiteSpace}*{Ival})+)+{WhiteSpace}*"}"						
																				{ found("symbol.Matrix"); }
																				
	/* Num */
	{Number}																	{ found("symbol.Number"); }
	
	/* String */
	"\""(!{ReservedSymbols}|"\\"{ReservedSymbols})*"\""							{ found("symbol.String"); }



/* statements */
	/* if */
	"if"																		{ found("symbol.if"); }
	
	/* then */	
	"then"																		{ found("symbol.then"); }

	/* if else */
	"if" {WhiteSpace}+ "else"								 					{ found("symbol.ifelse"); }

	/* else */
	"else"													 					{ found("symbol.else"); }
	
	/* while */
	"while"													 					{ found("symbol.while"); }
	
	/* do */
	"do"																		{ found("symbol.do"); }	
	
	/* end */
	"end"																		{ found("symbol.end"); }
	
	
	
/* Print statment */
	/* print */
	"print"																		{ found("symbol.print"); }
	
	/* string new line */
	"\n"																		{ found("symbol.NewLine"); }



/* Declaration */
	/* num */
	"num"																		{ found("symbol.numDLC"); }
	
	/* vector */
	"vector"																	{ found("symbol.vectorDLC"); }
	
	/* matrix */
	"matrix"																	{ found("symbol.matrixDLC"); }
	


/* ID */
	{ID}																		{ found("symbol.ID"); }
	
	
	

/* Encapsulations */
	/* Parentheses start */
	"("																			{ found("symbol.ParenthesesStart"); }

	/* Parentheses end */
	")"																			{ found("symbol.ParenthesesEnd"); }
	
	/* Squarebracket start */
	"["																			{ found("symbol.SquarebracketStart"); }

	/* Squarebracket end */
	"]"																			{ found("symbol.SquarebracketEnd"); }



/* Operators */
	/* Equal sign */
	"="																			{ found("symbol.EqualSign"); }

	/* LogOp */
	{LogOp}																		{ found("symbol.LogOP"); }

	/* MultOp */
	{MultOp}																	{ found("symbol.MultOp"); }

	/* plus */
	"+"																			{ found("symbol.plus"); }
	
	/* minus */
	"-"																			{ found("symbol.minus"); }
	
	
	
/* Seperator */
	","																			{ found("symbol.Seperator"); }
	
/* Line Terminator */
	";"																			{ found("symbol.LineTerminator"); }

/* WhiteSpace */
	{WhiteSpace}+																{ /* ignore */ }

/* End of program */
	"$"																			{ found("symbol.EOF"); }