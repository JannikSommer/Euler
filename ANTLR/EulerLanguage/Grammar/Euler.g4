grammar Euler;

// Parser

program     : stmt*  DOLLAR
            ;

stmt        :	expr SEMI
            |   dcl SEMI
            |	ifstmt
            |	whilestmt
            |	assignstmt SEMI
            |   printstmt SEMI
            ;

dcl         :	NUM ID                                  #idInit
            |	NUM ID ASSIGN expr                      #idAssign
            |	VEC ID ASSIGN VECTOR                    #vecAssign
            |   MTX ID ASSIGN MATRIX                    #mtxAssign
            ;

expr        :	addexpr
            ;

ifstmt      :	IF logstmt THEN (stmt)+ elsestmts? END
            ;

elsestmts   :	elseifstmts* ELSE THEN (stmt)+
            |   elseifstmts+
            ;

elseifstmts :   ELSE IF logstmt THEN (stmt)+
            ;

printstmt   :   PRINT stringstmt (PLUS stringstmt)*
            ;

stringstmt  :   STRING
            |   NUM
            |   ID valindex?
            ;

valindex    :   LSQBRACK NUM RSQBRACK
            |   LSQBRACK NUM COMMA NUM RSQBRACK
            ;

whilestmt   :	WHILE logstmt DO (stmt)+ END
            ;

assignstmt  :	ID valindex? ASSIGN expr
            ;

addexpr     :	multiexpr
            |	multiexpr ariop addexpr
            ;

multiexpr   :	primeexpr
            |	primeexpr mulop multiexpr
            ;

primeexpr   :	ID valindex?
            |	NUM
            |	LPAREN addexpr RPAREN
            ;

logstmt     :   addexpr logop addexpr
            ;

logop       :	op=(EQEQ | BT | LT | BTEQ | LTEQ | NOTEQ)
            ;

ariop       :	op=('+'|'-')
            ;

mulop       :	op=('*' | '/' | '%')
            ;

// TOKENS

fragment LINE_TERMINATOR : '\r' '\n';

DOLLAR  : '$' ;
SEMI    : ';' ;
ASSIGN  : '=' ;

LT       :'<';
BT       :'>';
EQEQ     :'==';
NOTEQ    :'!=';
LTEQ     :'<=';
BTEQ     :'>=';

IF      : 'if';
THEN    : 'then';
ELSE    : 'else';
END     : 'end';
WHILE   : 'while';
DO      : 'do';

PRINT   : 'print';
NEWLINE : LINE_TERMINATOR;
WHITESPACE : [\n \t]+ -> skip;

PLUS    : '+';
MINUS   :'-';
MULT    :'*';
DIVID   :'/';
MOD     :'%';

LPAREN  :'(';
RPAREN  :')';
LSQBRACK:'[';
RSQBRACK:']';
COMMA   :',';

NUMB    : 'num';
VEC     : 'vec';
MTX     : 'mtx';

NUM     : [0-9]+('.'[0-9]+)? ;
MATRIX  : '{' WHITESPACE* (NUM|ID) WHITESPACE* (',' WHITESPACE* (NUM|ID))+ WHITESPACE* (';' WHITESPACE* (NUM|ID) WHITESPACE* (',' WHITESPACE* (NUM|ID))+ WHITESPACE* )+ WHITESPACE*'}';
VECTOR  : '<' WHITESPACE* (NUM|ID) WHITESPACE* (',' WHITESPACE* (NUM|ID) WHITESPACE* )* WHITESPACE* '>';
STRING  : '"'[a-zA-Z0-9_ ]*'"';
ID      : [a-zA-Z0-9]* [a-zA-Z] [a-zA-Z0-9]*;