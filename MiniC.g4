grammar MiniC;

prog: T_INIT declara bloco T_END;

declara: T_DECLARE T_ID (T_COMMA T_ID)* T_FINAL;

bloco: (cmd)+;

cmd: (cmdRead | cmdWrite | cmdAssign | cmdCondition);

cmdRead: T_READ T_LP T_ID T_RP T_FINAL;

cmdWrite: T_WRITE T_LP (T_ID | text) T_RP T_FINAL;

cmdCondition:
	T_IF T_LP expression T_OPERATORS expression T_RP T_LCB (cmd)+ T_RCB (
		T_ELSE T_LCB (cmd)+ T_RCB
	)?;

cmdAssign: T_ID T_ASSIGN expression T_FINAL;

expression: term ((T_SUM | T_SUB) term)*;

term: factor ((T_MUL | T_DIV) factor)*;

factor: T_NUM | T_ID | (T_LP expression T_RP);

text: T_QUOTE ~(T_QUOTE)+ T_QUOTE;

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

T_OPERATORS:
	'<'
	| '>'
	| '<='
	| '>='
	| '!='
	| '=='
	| '||'
	| '&&';
T_SUM: '+';
T_SUB: '-';
T_MUL: '*';
T_DIV: '/';

T_ID: [a-zA-Z] [a-zA-Z0-9]*;
T_LETTER: [a-zA-Z];

T_NUM: [0-9]+;

T_FINAL: ';';
T_ASSIGN: '=';
T_LCB: '{';
T_RCB: '}';
T_LP: '(';
T_RP: ')';
T_COMMA: ',';
T_QUOTE: '"';