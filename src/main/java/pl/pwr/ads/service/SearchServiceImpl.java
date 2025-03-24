package pl.pwr.ads.service;

import lombok.RequiredArgsConstructor;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.pwr.ads.antlr4.AdvancedSearchLanguageLexer;
import pl.pwr.ads.antlr4.AdvancedSearchLanguageParser;

@Service
public class SearchServiceImpl implements SearchService {


    @Override
    public String getArticles(String inquery) {
        String sql = generateSQL(inquery);

        return sql;
    }

    private String generateSQL(String input){

        CharStream cs = CharStreams.fromString(input);
        AdvancedSearchLanguageLexer lexer = new AdvancedSearchLanguageLexer(cs);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        AdvancedSearchLanguageParser parser = new AdvancedSearchLanguageParser(tokens);
        ParseTree tree = parser.query();
        AdvancedSearchLanguageImpl advancedSearchLanguage = new AdvancedSearchLanguageImpl();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(advancedSearchLanguage, tree);

        return advancedSearchLanguage.generateSql();
    }
}
