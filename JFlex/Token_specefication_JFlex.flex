

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
AriOp				=	"+" | "-"
MultOp				=	"*" | "/" | "%"

%%	
	
/* statements */
	/* if */
	"if"																	{ found("symbol.if"); }
	
	/* then */
	"then"																	{ found("symbol.then"); }

	/* end if */
	"end" {WhiteSpace} "if"													{ found("symbol.if"); }

	/* if else */
	"if" {WhiteSpace} "else"								 				{ found("symbol.ifelse"); }

	/* else */
	"else"													 				{ found("symbol.else"); }
	
	/* while */
	"while"													 				{ found("symbol.while"); }
	
	/* end while */
	"end" {WhiteSpace} "while"												{ found("symbol.while"); }

	
	
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

	/* AriOp */
	{AriOp}																	{ found("symbol.AriOp"); }



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