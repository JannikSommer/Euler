grammar Euler;

// Parser

program     : dcl* stmt* DOLLAR
            ;

dcl         :	ID SEMI                                 #idInit
            |	ID ASSIGN expr SEMI                     #idAssign
            |	ID ASSIGN VECTOR SEMI                   #vecAssign
            |   ID ASSIGN MATRIX SEMI                   #mtxAssign
            ;

stmt        :	expr SEMI
            |   dcl
            |	ifstmt
            |	whilestmt
            |	assignstmt SEMI
            |   printstmt SEMI
            ;

expr        :	addexpr
            ;

ifstmt      :	IF logstmt THEN (stmt)+ elsestmts END
            ;

elsestmts   :	elseifstmts ELSE THEN (stmt)+
            |   elseifstmts
            ;

elseifstmts :   (ELSE IF logstmt THEN (stmt)+)*
            ;

printstmt   :   PRINT stringstmt
            ;

stringstmt  :   appendsting? STRING
            |   appendsting? NUM
            |   appendsting? ID valindex?
            |   appendsting? NEWLINE
            ;

appendsting:    STRING PLUS appendsting?
            |   NUM PLUS appendsting?
            |   ID valindex? PLUS appendsting?
            |   NEWLINE PLUS appendsting?
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

logop       :	EQEQ
            |	BT
            |	LT
            |	BTEQ
            |	LTEQ
            |	NOTEQ
            ;

ariop       :	op=('+'|'-')
            ;

mulop       :	op=('*' | '/' | '%')
            ;

// TOKENS

fragment LINE_TERMINATOR : '/r' '\n';

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
WHITESPACE : [ \t]+ -> skip ;

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

NUM     : [0-9]+('.'[0-9]+)? ;
MATRIX  : '{'(NUM|ID)(','(NUM|ID))+(';'(NUM|ID)(','(NUM|ID))+)+'}';
VECTOR  : '<'(NUM|ID)(','(NUM|ID))*'>';
STRING  : '"'[a-zA-Z0-9_ ]*'"';
ID      : [a-zA-Z0-9]* [a-zA-Z] [a-zA-Z0-9]*;