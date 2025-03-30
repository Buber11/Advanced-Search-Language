package pl.pwr.ads.service;

import jakarta.persistence.EntityGraph;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
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
import pl.pwr.ads.dto.PostDTO;
import pl.pwr.ads.model.Post;
import pl.pwr.ads.repository.PostRepository;

import java.util.List;

@Service
public class SearchServiceImpl implements SearchService {

    @PersistenceContext
    private EntityManager entityManager;

    private final PostRepository postRepository;

    public SearchServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public List<PostDTO> getArticles(String inquery) {
        String sql = generateSQL(inquery);

        List<PostDTO> posts = entityManager.createNativeQuery(sql,"PostDTOMapping").getResultList();

        return posts;
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
