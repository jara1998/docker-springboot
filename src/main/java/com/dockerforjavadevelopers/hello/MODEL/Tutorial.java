package com.dockerforjavadevelopers.hello.MODEL;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Tutorial {
    private long id;
    private String title;
    private String description;
    private boolean published;

    public Tutorial() {
    }


    public Tutorial(@JsonProperty("id") long id, @JsonProperty("title") String title, @JsonProperty("description") String description, @JsonProperty("published") boolean published) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.published = published;
    }

    public Tutorial(@JsonProperty("title") String title, @JsonProperty("description") String description, @JsonProperty("published") boolean published) {
        this.title = title;
        this.description = description;
        this.published = published;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
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
    public boolean isPublished() {
        return published;
    }
    public void setPublished(boolean isPublished) {
        this.published = isPublished;
    }
    @Override
    public String toString() {
        return "Tutorial [id=" + id + ", title=" + title + ", desc=" + description + ", published=" + published + "]";
    }
}
