lexer grammar NuXmvLexer;

@header {
    package org.shkandyuk.nuxmv.grammar.antlr;
}

// Reserved
MODULE : 'MODULE';
DEFINE : 'DEFINE';
MDEFINE : 'MDEFINE';
CONSTANTS : 'CONSTANTS';
VAR : 'VAR';
IVAR : 'IVAR';
PROCESS : 'process';
CASE : 'case';
ESAC : 'esac';

FROZENVAR : 'FROZENVAR';
TRANS : 'TRANS';
INVAR : 'INVAR';
SPEC : 'SPEC';
CTLSPEC : 'CTLSPEC';
LTLSPEC : 'LTLSPEC';
PSLSPEC : 'PSLSPEC';
COMPUTE : 'COMPUTE';
NAME : 'NAME';
INVARSPEC : 'INVARSPEC';
FAIRNESS : 'FAIRNESS';
JUSTICE : 'JUSTICE';
COMPASSION : 'COMPASSION';
ISA : 'ISA';
ASSIGN : 'ASSIGN';
CONSTRAINT : 'CONSTRAINT';
SIMPWFF : 'SIMPWFF';
CTLWFF : 'CTLWFF';
LTLWFF : 'LTLWFF';
PSLWFF : 'PSLWFF';
COMPWFF : 'COMPWFF';
IN : 'IN';
MIN : 'MIN';
MAX : 'MAX';
MIRROR : 'MIRROR';
PRED : 'PRED';
PREDICATES : 'PREDICATES';

//Built-in functions
BI_WORD1 : 'word1';
BI_BOOL : 'bool';
BI_SIGNED : 'signed';
BI_UNSIGNED : 'unsigned';
BI_EXTEND : 'extend';
BI_RESIZE : 'resize';
BI_SIZEOF : 'sizeof';
BI_UWCONST : 'uwconst';
BI_SWCONST : 'swconst';
BI_INIT : 'init';
BI_SELF : 'self';
BI_COUNT : 'count';
BI_ABS : 'abs';
BI_MAX : 'max';
BI_MIN : 'min';

//Types
T_ARRAY : 'array';
T_OF : 'of';
T_BOOLEAN : 'boolean';
T_INTEGER : 'integer';
T_REAL : 'real';
T_WORD : 'word';

// Operators
OP_EX : 'EX';
OP_AX : 'AX';
OP_EF : 'EF';
OP_AF : 'AF';
OP_EG : 'EG';
OP_AG : 'AG';
OP_E : 'E';
OP_F : 'F';
OP_O : 'O';
OP_G : 'G';
OP_H : 'H';
OP_X : 'X';
OP_Y : 'Y';
OP_Z : 'Z';
OP_A : 'A';
OP_U : 'U';
OP_S : 'S';
OP_V : 'V';
OP_T : 'T';
OP_BU : 'BU';
OP_EBF : 'EBF';
OP_ABF : 'ABF';
OP_EBG : 'EBG';
OP_ABG : 'ABG';
OP_NEXT : 'next';
OP_MOD : 'mod';
OP_UNION : 'union';
OP_IN : 'in';
OP_XOR : 'xor';
OP_XNOR : 'xnor';
OP_AND : '&';
OP_OR : '|';
EXCLAMATION : '!' ;
DOT : '.' ;

//Bin operators
PLUS : '+' ;
MINUS : '-' ;
MINUS_ARROW : '->' ;
L_ARROW : '<' ;
R_ARROW : '>' ;
ASTERISK : '*' ;
SLASH : '/' ;
EXCLAMATION_EQ : '!=' ;


// Names
IDENTIFICATOR : [a-zA-Z_-] [a-zA-Z_0-9-]*;
// Operators
ASSIGN_OP : ':=';
STATE_ASSIGN: '=';
//OPERATOR
L_SQUARE_BRACKET : '[' ;
R_SQUARE_BRACKET : ']' ;
L_BRACKET : '(' ;
R_BRACKET : ')' ;
L_BRACE : '{' ;
R_BRACE : '}' ;
SEMICOLON : ';' ;
COLON : ':' ;
COMMA : ',' ;

// Literals
INTEGER : [0-9]+;
BIN : '0' [su] 'b' [0-9]* '_' [01_]+;
OCT : '0' [su] 'o' [0-9]* '_' [0-7_]+;
DEC : '0' [su] 'd' [0-9]* '_' [0-9_]+;
HEX : '0' [su] 'h' [0-9]* '_' [0-9a-fA-F_]+;

// Comments
COMMENT: ('--' .*? '\n') ->  channel(HIDDEN);
LINE_COMMENT: ('/*' .*? '*/') ->  channel(HIDDEN);

// Whitespace, punctuation and the rest
WS : [ \t]+ ->  channel(HIDDEN);
BR
   :   [\r\n\u000C]+ -> channel(HIDDEN)
   ;

BAD_CHARACTER
    :   .
    ;
