grammar AdvancedSearchLanguage;

options { caseInsensitive = true; }


query: expression* EOF;

expression
    :  findTitleExpression
    |  findContentExpression
    |  fromExpression
    |  sinceExpression
    |  untilExpression
    |  langExpression
    |  limitExpression
    |  offsetExpression
    |  orderByExpression
    |  sortByExpression
    ;

findTitleExpression: FIND_TITLE_KEYWORD COLON (QUOTED_WORD | WORD) ( (OR | AND) (QUOTED_WORD | WORD) )*;
findContentExpression: FIND_CONTENT_KEYWORD COLON (QUOTED_WORD | WORD) ( (OR | AND) (QUOTED_WORD | WORD) )*;
fromExpression: FROM_KEYWORD COLON ( WORD | QUOTED_WORD ) ( (OR | AND) ( WORD | QUOTED_WORD ) )*;
langExpression: LANG_KEYWORD COLON LANGUAGE ( (AND|OR) LANGUAGE )*;
sinceExpression: SINCE_KEYWORD COLON DATE;
untilExpression: UNTIL_KEYWORD COLON DATE;
limitExpression: LIMIT_KEYWORD COLON NUMBER;
offsetExpression: OFFSET_KEYWORD COLON NUMBER;
orderByExpression: ORDER_BY_KEYWORD COLON ORDER_BY_WORD;
sortByExpression: SORT_KEYWORD COLON SORT_BY_WORD(','SORT_BY_WORD)*;

//KEYWORD
FIND_TITLE_KEYWORD: 'findtitle';
FIND_CONTENT_KEYWORD: 'findcontent';
FROM_KEYWORD: 'from';
LANG_KEYWORD: 'lang';
LIMIT_KEYWORD: 'limit';
OFFSET_KEYWORD: 'offset';
ORDER_BY_KEYWORD: 'orderby';
SORT_KEYWORD: 'sortby';
SINCE_KEYWORD: 'since';
UNTIL_KEYWORD: 'until';
COLON: ':';
OR: 'OR';
AND: 'AND';

fragment DIGIT: [0-9];
fragment LETTER: [a-zA-Z];

DATE: DIGIT DIGIT DIGIT DIGIT ('/'|'-') DIGIT DIGIT ('/'|'-') DIGIT DIGIT;
LANGUAGE: LETTER LETTER;
NUMBER: DIGIT+;
ORDER_BY_WORD: ('asc'|'desc');
SORT_BY_WORD: ('author'|'date'|'title'|'lang');
WORD: LETTER+;
QUOTED_WORD: '"' ~["<>\r\n]* '"';

WS: [ \t\r\n]+ -> skip;