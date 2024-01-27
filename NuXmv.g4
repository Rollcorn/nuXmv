grammar NuXmv;

module: 'MODULE' ID (ivar)* (var)* (assign)* (init)* (trans)* (invarspec)*;

ivar: 'IVAR' ID ':' type ';';
var: 'VAR' ID ':' type ';';
assign: 'ASSIGN' assignList;
init: 'INIT' '(' expr ')';
trans: 'TRANS' '(' expr ')';
invarspec: 'INVAR' '(' expr ')';

assignList: (initAssign | nextAssign)+;
initAssign: 'init' '(' ID ')' ':=' expr ';';
nextAssign: 'next' '(' ID ')' ':=' expr ';';

condition: 'case' (condExpr)* 'esac';
condExpr: expr ' :' expr ';';
expr: orExpr;
orExpr: andExpr ('|' andExpr)*;
andExpr: equalityExpr ('&' equalityExpr)*;
equalityExpr: relationalExpr (('=' | '!=') relationalExpr)*;
relationalExpr: unaryExpr (('<' | '<=' | '>' | '>=') unaryExpr)*;
unaryExpr: ('!' | 'X' | 'G' | 'F' | 'U') unaryExpr | primaryExpr;
primaryExpr: ID | NUMBER | 'TRUE' | 'FALSE' | '(' expr ')';

type: 'Real' | '{' valueList '}';
valueList: expr (',' expr)*;

ID: [a-zA-Z_][a-zA-Z_0-9]*;
NUMBER: [0-9]+('.'[0-9]+)?;

WS: [ \t\r\n]+ -> skip;
COMMENT: '/*' .*? '*/' -> skip;
LINE_COMMENT: '--' ~[\r\n]* -> skip;