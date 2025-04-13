package pl.pwr.ads.dto;

import java.time.LocalDateTime;

public class PostDTO {
    private long id;

    private String title;

    private String description;

    private String language;

    private LocalDateTime created_at;

    private LocalDateTime updated_at;
    private Integer numberOfPages;

    private String author;

    public PostDTO() {
    }

    public PostDTO(long id,
                   String title,
                   String description,
                   String language,
                   LocalDateTime created_at,
                   LocalDateTime updated_at,
                   String author) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.language = language;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.author = author;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public LocalDateTime getCreated_at() {
        return created_at;
    }

    public void setCreated_at(LocalDateTime created_at) {
        this.created_at = created_at;
    }

    public LocalDateTime getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(LocalDateTime updated_at) {
        this.updated_at = updated_at;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(Integer numberOfPages) {
        this.numberOfPages = numberOfPages;
    }
}
