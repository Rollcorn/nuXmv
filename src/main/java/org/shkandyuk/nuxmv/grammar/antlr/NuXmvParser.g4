parser grammar NuXmvParser;

@header {
    package org.shkandyuk.nuxmv.grammar.antlr;
}

options { tokenVocab = NuXmvLexer; }

// PARSER RULES
root: module* EOF;

module : MODULE IDENTIFICATOR variables_declarations? moduleBody ;

// VARIABLES DECLARATIONS
variables_declarations: L_BRACKET variables_list R_BRACKET;
variables_list: IDENTIFICATOR COMMA variables_list | IDENTIFICATOR;

moduleBody : varDeclaration assignment spec?;
varDeclaration : VAR (IDENTIFICATOR COLON (type |  L_BRACE expressions R_BRACE ) SEMICOLON)*;

// ASSIGN
assignment : ASSIGN assign_statment*;
assign_statment :
    assign_statment COLON  expression SEMICOLON |
    init_statement STATE_ASSIGN expression|
    init_statement ASSIGN_OP expression SEMICOLON |
    next_statement STATE_ASSIGN expression |
    next_statement (ASSIGN_OP  | COLON) expression SEMICOLON |
    assign_statment ASSIGN_OP expression |
    assign_statment STATE_ASSIGN expression|
    init |
    next;

init: init_statement ASSIGN_OP expression ;
init_statement: BI_INIT L_BRACKET IDENTIFICATOR R_BRACKET;

next: next_statement expression ;
next_statement: OP_NEXT  L_BRACKET IDENTIFICATOR R_BRACKET;

spec : LTLSPEC expression SEMICOLON;

expressions:
    | expression COMMA expressions
    | expression;

expression :
           value
           | expression bit_ops expression
           | expression spec_operators expression
           | expression (ASTERISK | SLASH) expression
           | expression (PLUS | MINUS) expression
           | L_BRACKET expression R_BRACKET
           | L_BRACE value_list R_BRACE
           | expression STATE_ASSIGN expression
           | case
           ;

unar_ops: EXCLAMATION;

spec_operators: OP_EX | OP_EG | OP_EF | OP_AX | OP_AG | OP_AF
    | OP_BU | OP_EBF |  OP_EBG |  OP_ABF | OP_ABG
    | OP_E | OP_F | OP_O | OP_G | OP_U | OP_H |OP_X
    | OP_Y | OP_Z | OP_A | OP_U | OP_S | OP_V | OP_T;

bit_ops: OP_AND | OP_OR | OP_XOR | OP_XNOR | OP_IN | OP_MOD ;

case: CASE (case_statment )* ESAC ;

case_statment:
    expression COLON expression SEMICOLON|
    assign_statment ;

type :
    T_BOOLEAN
    | T_INTEGER
    | T_REAL
    |  T_ARRAY L_SQUARE_BRACKET value_list? R_SQUARE_BRACKET T_OF type;

value_list: value
    | value COMMA value_list;

value: unar_ops value
    | IDENTIFICATOR
    | INTEGER;
