lexer grammar NuXmvLexer;

@header {package org.jetbrains.research.libsl;}

MODULE: 'MODULE';
IVAR: 'IVAR';
SEMI:':';
SEMICOLON : ';' ;
VAR:'VAR';
ASSIGN:'ASSIGN';
INIT: 'INIT';
L_BRACKET : '(' ;
R_BRACKET : ')' ;
TRANS: 'TRANS';
INVAR: 'INVAR';
INIT_ASSIGN: 'init';
ASSIGN_OP: ':=';
EXCLAMATION_EQ : '!=' ;
L_ARROW_EQ : '<=' ;
R_ARROW_EQ : '>=' ;
L_ARROW : '<' ;
R_ARROW : '>' ;
EQ : '=' ;
NEXT_ASSIGN: 'next';
CASE: 'case';
ESAC: 'esac';
BIT_OR : '|' ;
COND_EXPR: ' :';
BIT_AND : '&';
EXCLAMATION : '!' ;
TRUE: 'TRUE';
FALSE: 'FALSE';
REAL: 'Real';
L_BRACE : '{' ;
R_BRACE : '}' ;
COMMA : ',' ;
ID: [a-zA-Z_][a-zA-Z_0-9]*;
NUMBER: [0-9]+('.'[0-9]+)?;
X: 'X';
G: 'G';
F: 'F';
U: 'U';


WS: [ \t\r\n]+ -> skip;
COMMENT: '/*' .*? '*/' -> skip;
LINE_COMMENT: '--' ~[\r\n]* -> skip;
STRING: '"' ~["]* '"';
BOOLEAN: 'true' | 'false';
BR
   :   [\r\n\u000C]+ -> channel(HIDDEN)
   ;

BAD_CHARACTER
   :   .
   ;