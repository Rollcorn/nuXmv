parser grammar xmvParser;

options { tokenVocab=xmvLexer; }

// Parser rules
module: MODULE ID LPAREN (moduleParameters)? RPAREN LBRACK (moduleContent)* RBRACK;

moduleParameters: ID (COMMA ID)*;

moduleContent: variableDeclaration
              | assignment
              | specification;

variableDeclaration: VAR ID COLON type SEMI;

type: BOOLEAN 
    | INTEGER 
    | REAL 
    | ARRAY LBRACK INT DOTDOT INT RBRACK OF type;

assignment: ASSIGN ID COLONEQ expression SEMI;

expression: ID
          | INT
          | TRUE
          | FALSE
          | expression binaryOp expression
          | LPAREN expression RPAREN;

binaryOp: PLUS | MINUS | MUL | DIV | AND | OR | IMPLIES | IFF | EQ | NEQ;

specification: SPEC expression SEMI;

// Utility rules
