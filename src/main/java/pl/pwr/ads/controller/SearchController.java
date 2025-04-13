package pl.pwr.ads.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.properties.bind.DefaultValue;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pl.pwr.ads.dto.PostDTO;
import pl.pwr.ads.dto.Response;
import pl.pwr.ads.model.Post;
import pl.pwr.ads.service.SearchService;

import java.util.List;

@Controller
@RequestMapping("/api/v1/search/article")
public class SearchController {

    private final SearchService searchService;

    public SearchController(SearchService searchService) {
        this.searchService = searchService;
    }

    @GetMapping("/custom")
    public ResponseEntity<Response> getArticle(
            @RequestParam("query") String query,
            @RequestParam(value = "page", defaultValue = "1") int pageNumber){
        System.out.println("Query: " + query);
        Response posts = searchService.getArticles(query,pageNumber);
        System.out.println("Posts: " + posts.getPosts());
        return ResponseEntity.ok(posts);
    }

}
