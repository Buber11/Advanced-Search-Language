package pl.pwr.ads.service;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.springframework.stereotype.Service;
import pl.pwr.ads.antlr4.AdvancedSearchLanguageLexer;
import pl.pwr.ads.antlr4.AdvancedSearchLanguageParser;
import pl.pwr.ads.dto.PostDTO;
import pl.pwr.ads.dto.Response;
import pl.pwr.ads.repository.PostRepository;

import java.util.List;
import java.util.Map;


@Service
public class SearchServiceImpl implements SearchService {

    @PersistenceContext
    private EntityManager entityManager;

    private final PostRepository postRepository;

    public SearchServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public Response getArticles(String inquery, int pageNumber) {
        Map<String,String> queries = generateSQL(inquery, pageNumber);
        List<PostDTO> posts = entityManager
                .createNativeQuery(queries.get("sql"),"PostDTOMapping").getResultList();

        System.out.println(queries.get("sql"));
        System.out.println(queries.get("countSql"));

        int totalCount = Integer.parseInt( entityManager
                .createNativeQuery(queries.get("countSql")).getSingleResult().toString() );

        System.out.println("Total count: " + totalCount);
        return new Response(posts,totalCount);
    }

    private Map<String,String> generateSQL(String input, int pageNumber){

        CharStream cs = CharStreams.fromString(input);
        AdvancedSearchLanguageLexer lexer = new AdvancedSearchLanguageLexer(cs);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        AdvancedSearchLanguageParser parser = new AdvancedSearchLanguageParser(tokens);
        AdvancedSearchLanguageImpl advancedSearchLanguage = new AdvancedSearchLanguageImpl(pageNumber);
        ParseTree tree = parser.query();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(advancedSearchLanguage, tree);
        if(!input.isEmpty()) {

        }

        return advancedSearchLanguage.generateSql();
    }
}
