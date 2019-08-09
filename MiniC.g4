grammar MiniC;

prog: T_INIT declare+ block T_END;

declare: (T_INT | T_FLOAT) T_ID (T_COMMA T_ID)* T_FINAL;

block: (cmd)+;

cmd: (cmdRead | cmdWrite | cmdAssign | cmdCondition);

cmdRead: T_READ T_LP T_ID T_RP T_FINAL;

cmdWrite: T_WRITE T_LP (T_ID | STRING) T_RP T_FINAL;

cmdCondition: ifStmt (elseStmt)?;

ifStmt: T_IF T_LP condition T_RP T_LCB (cmd)+ T_RCB;

elseStmt: T_ELSE T_LCB (cmd)+ T_RCB;

condition: expression T_OPERATORS expression;

cmdAssign: T_ID T_ASSIGN expression T_FINAL;

expression: term (T_ARITH_1 term)*;

term: factor (T_ARITH_2 factor)*;

factor: T_NUM | T_ID | (T_LP expression T_RP);

/* Tokens */
T_BLANK: (' ' | '\n' | '\r' | '\t') -> skip;

T_INIT: 'programa';
T_END: 'fimPrograma';
T_DECLARE: 'var';
T_READ: 'leia';
T_WRITE: 'escreva';
T_IF: 'se';
T_THEN: 'entao';
T_ELSE: 'senao';
T_INT: 'int';
T_FLOAT: 'float';

T_OPERATORS:
	'<'
	| '>'
	| '<='
	| '>='
	| '!='
	| '=='
	| '||'
	| '&&';

T_ARITH_1: '+' | '-';
T_ARITH_2: '*' | '/';

T_ID: [a-zA-Z] [a-zA-Z0-9]*;
T_LETTER: [a-zA-Z];

T_NUM: ('-')? [0-9]+ ('.' [0-9]+)?;

// Regra de https://stackoverflow.com/questions/27915012/antlr4-ignore-white-spaces-in-the-input-but-not-those-in-string-literals
STRING: '"' ('\\' [\\"] | ~[\\"\r\n])* '"';

T_FINAL: ';';
T_ASSIGN: '=';
T_LCB: '{';
T_RCB: '}';
T_LP: '(';
T_RP: ')';
T_COMMA: ',';
T_QUOTE: '"';
T_SQUOTE: '\'';