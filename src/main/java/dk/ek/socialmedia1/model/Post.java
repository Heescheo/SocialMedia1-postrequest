package dk.ek.socialmedia1.model;

import java.time.LocalDate;

public class Post {

    private String title;
    private String content;
    private LocalDate date;
    private boolean isPublic;

    public Post() {
    }

    public Post(String title, String content, LocalDate date, boolean isPublic) {
        this.title = title;
        this.content = content;
        this.date = date;
        this.isPublic = isPublic;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Boolean getPublic() {
        return isPublic;
    }

    public void setPublic(Boolean isPublic) {
        this.isPublic = isPublic;
    }
}
