package pl.pwr.ads;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pl.pwr.ads.service.SearchService;

@SpringBootApplication
public class AdvancedSearchLanguageApplication {

	static SearchService searchService;

	public AdvancedSearchLanguageApplication(SearchService searchService) {
		this.searchService = searchService;
	}

	public static void main(String[] args) {
		SpringApplication.run(AdvancedSearchLanguageApplication.class, args);
	}

}
