package pl.pwr.ads.dto;

import java.util.List;

public class Response {
    private List<PostDTO> posts;
    private int totalPages;

    public Response(List<PostDTO> posts, int totalPages) {
        this.posts = posts;
        this.totalPages = totalPages;
    }

    public List<PostDTO> getPosts() {
        return posts;
    }

    public void setPosts(List<PostDTO> posts) {
        this.posts = posts;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }
}
