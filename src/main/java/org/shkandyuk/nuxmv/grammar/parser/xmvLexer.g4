lexer grammar xmvLexer;

// Tokens
MODULE: 'MODULE';
VAR: 'VAR';
ASSIGN: 'ASSIGN';
SPEC: 'SPEC';
BOOLEAN: 'boolean';
INTEGER: 'integer';
REAL: 'real';
ARRAY: 'array';
OF: 'of';
TRUE: 'TRUE';
FALSE: 'FALSE';

// Operators
PLUS: '+';
MINUS: '-';
MUL: '*';
DIV: '/';
AND: 'and';
OR: 'or';
IMPLIES: '=>';
IFF: '<=>';
EQ: '=';
NEQ: '!=';

// Punctuation
LPAREN: '(';
RPAREN: ')';
LBRACK: '[';
RBRACK: ']';
COLON: ':';
SEMI: ';';
COMMA: ',';
DOTDOT: '..';

// Other tokens
ID: [a-zA-Z_] [a-zA-Z_0-9]*;
INT: [0-9]+;
WS: [ \t\r\n]+ -> skip;
COLONEQ: ':=';
