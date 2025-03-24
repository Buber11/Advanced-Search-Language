grammar AdvancedSearchLanguage;

options { caseInsensitive = true; }


query: expression+ EOF;

expression
    :  findTitleExpression
    |  findContentExpression
    |  fromExpression
    |  sinceExpression
    |  untilExpression
    |  langExpression
    |  limitExpression
    |  filterExpression
    ;

findTitleExpression: FIND_TITLE_KEYWORD COLON (QUOTED_WORD | WORD) ( (OR | AND) (QUOTED_WORD | WORD) )*;
findContentExpression: FIND_CONTENT_KEYWORD COLON (QUOTED_WORD | WORD) ( (OR | AND) (QUOTED_WORD | WORD) )*;
fromExpression: FROM_KEYWORD COLON WORD ( (OR | AND) WORD )*;
langExpression: LANG_KEYWORD COLON LANGUAGE ( (AND|OR) LANGUAGE )*;
sinceExpression: SINCE_KEYWORD COLON DATE;
untilExpression: UNTIL_KEYWORD COLON DATE;
limitExpression: LIMIT_KEYWORD COLON NUMBER;
filterExpression: FILTER_KEYWORD COLON FILTER ( (OR | AND) FILTER )*;

//KEYWORD
FIND_TITLE_KEYWORD: 'findtitle';
FIND_CONTENT_KEYWORD: 'findcontent';
FROM_KEYWORD: 'from';
LANG_KEYWORD: 'lang';
LIMIT_KEYWORD: 'limit';
FILTER_KEYWORD: 'filter';
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
FILTER: 'photo' | 'video';
WORD: [a-zA-Z]+;
QUOTED_WORD: '"' ~["<>\r\n]* '"';

WS: [ \t\r\n]+ -> skip;