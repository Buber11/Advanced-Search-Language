grammar AdvancedSearchLanguage;

options { caseInsensitive = true; }

@parser::members {
    private Set<String> used = new HashSet<>();
}

query: expression+ EOF;

expression
    : {!used.contains("findTitle")}? findTitleExpression {used.add("findTitle");}
    | {!used.contains("findContent")}? findContentExpression {used.add("findContent");}
    | {!used.contains("from")}? fromExpression {used.add("from");}
    | {!used.contains("since")}? sinceExpression {used.add("since");}
    | {!used.contains("until")}? untilExpression {used.add("until");}
    | {!used.contains("lang")}? langExpression {used.add("lang");}
    | {!used.contains("limit")}? limitExpression {used.add("limit");}
    | {!used.contains("filter")}? filterExpression {used.add("filter");}
    ;

findTitleExpression: FIND_TITLE_KEYWORD COLON (QUOTED_WORD | WORD) ( (OR | AND) (QUOTED_WORD | WORD) )*;
findContentExpression: FIND_CONTENT_KEYWORD COLON (QUOTED_WORD | WORD) ( (OR | AND) (QUOTED_WORD | WORD) )*;
fromExpression: FROM_KEYWORD COLON (QUOTED_WORD | WORD) ( (OR | AND) (QUOTED_WORD | WORD) )*;
langExpression: LANG_KEYWORD COLON WORD ( (OR | AND) WORD )*;
sinceExpression: SINCE_KEYWORD COLON DATE;
untilExpression: UNTIL_KEYWORD COLON DATE;
limitExpression: LIMIT_KEYWORD COLON NUMBER;
filterExpression: FILTER_KEYWORD COLON FILTER ( (OR | AND) FILTER )*;

// Słowa kluczowe
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

DATE: [0-9]{2} '-' [0-9]{2} '-' [0-9]{4};
NUMBER: [0-9]+;
FILTER: 'photo' | 'video';
WORD: [a-zA-Z]+;
QUOTED_WORD: '"' ~["<>\r\n]* '"';

WS: [ \t\r\n]+ -> skip;
