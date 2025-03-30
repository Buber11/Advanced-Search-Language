package pl.pwr.ads.service;

import pl.pwr.ads.dto.PostDTO;
import pl.pwr.ads.model.Post;

import java.util.List;

public interface SearchService {

    List<PostDTO> getArticles(String inquery);

}
