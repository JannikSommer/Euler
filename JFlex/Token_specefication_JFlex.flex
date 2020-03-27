

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

WhiteSpace 			=	[ \n\t]+
Number 				=	[0-9]+("."[0-9]+)?
LogOp				=	"==" | "<" | ">" | "<=" | ">=" | "!="
MultOp				=	"*" | "/" | "%"

%%	
	
/* statements */
	/* if */
	"if"																	{ found("symbol.if"); }
	
	/* then */
	"then"																	{ found("symbol.then"); }

	/* if else */
	"if" {WhiteSpace} "else"								 				{ found("symbol.ifelse"); }

	/* else */
	"else"													 				{ found("symbol.else"); }
	
	/* while */
	"while"													 				{ found("symbol.while"); }
	
	/* do */
	"do"																	{ found("symbol.do"); }	
	
	/* end */
	"end"																	{ found("symbol.end"); }



/* Print statment */
	/* print */
	"print"																	{ found("symbol.print"); }
	
	/* string new line */
	"\n"																	{ found("symbol.NewLine"); }
	
	
	
/* Encapsulations */
	/* Parentheses Start */
	"("																		{ found("symbol.ParenthesesStart"); }

	/* Parentheses end */
	")"																		{ found("symbol.ParenthesesEnd"); }



/* Operators */
	/* Equal sign */
	"="																		{ found("symbol.EqualSign"); }

	/* LogOp */
	{LogOp}																	{ found("symbol.LogOP"); }

	/* MultOp */
	{MultOp}																{ found("symbol.MultOp"); }

	/* plus */
	"+"																		{ found("symbol.plus"); }
	
	/* minus */
	"-"																		{ found("symbol.minus"); }



/* TYPES */
	/* ID */
	[a-zA-Z0-9]*[a-zA-Z][a-zA-Z0-9]*										{ found("symbol.ID"); }

	/* Num */
	{Number}																{ found("symbol.Number"); }

	/* Vector */
	"<"{Number}(","{Number})+">;"											{ found("symbol.Vector"); }

	/* Matrix */
	"{"{Number}(","{Number})+(";"{Number}(","{Number})+)+"};" 				{ found("symbol.Matrix"); }
	
	

/* Line Terminator */
	";"																		{ found("symbol.LineTerminator"); }

/* WhiteSpace */
	{WhiteSpace}															{ /* Ignore */ }

/* End of program */
	"$"																		{ found("symbol.EOF"); }