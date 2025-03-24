package pl.pwr.ads.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pl.pwr.ads.service.SearchService;

@Controller
@RequiredArgsConstructor
@RequestMapping("/api/v1/search/article")
public class SearchController {

    SearchService searchService;

    @GetMapping("")
    public ResponseEntity getArticle(@RequestParam("inquery") String inquery){

        return ResponseEntity.ok(null);
    }

}
