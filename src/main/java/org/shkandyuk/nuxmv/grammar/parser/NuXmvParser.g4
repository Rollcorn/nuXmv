parser grammar NuXmvParser;

@header {package org.jetbrains.research.libsl;}

options { tokenVocab = NuXmvLexer; }


module: MODULE ID (ivar)* (var)* (assign)* (init)* (trans)* (invarspec)*;
ivar: IVAR ID SEMI type SEMICOLON;
var: VAR ID SEMI type SEMICOLON;
assign: ASSIGN assignList;
init: INIT L_BRACKET expr R_BRACKET;
trans: TRANS L_BRACKET expr R_BRACKET;
invarspec: INVAR L_BRACKET expr R_BRACKET;

assignList: (initAssign | nextAssign)+;
initAssign: INIT_ASSIGN L_BRACKET ID R_BRACKET ASSIGN_OP expr SEMICOLON;
nextAssign: NEXT_ASSIGN L_BRACKET ID R_BRACKET ASSIGN_OP expr SEMICOLON;

condition: CASE (condExpr)* ESAC;
condExpr: expr COND_EXPR expr SEMICOLON;
expr: orExpr;
orExpr: andExpr (BIT_OR andExpr)*;
andExpr: equalityExpr (BIT_AND equalityExpr)*;
equalityExpr: relationalExpr ((EQ | EXCLAMATION_EQ) relationalExpr)*;
relationalExpr: unaryExpr ((L_ARROW| L_ARROW_EQ | R_ARROW | R_ARROW_EQ) unaryExpr)*;
unaryExpr: (EXCLAMATION | X | G | F | U) unaryExpr | primaryExpr;
primaryExpr: ID | NUMBER | BOOLEAN | STRING | TRUE | FALSE | L_BRACKET expr R_BRACKET;

type: REAL | L_BRACE valueList R_BRACE;
valueList: expr (COMMA expr)*;


