package com.books.library.model;

import jakarta.persistence.*;

@Entity
@Table(name = "shelf")
public class Books {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Long id;

    private String title;
    private String author;
    private int published;

    // No-args constructor
    public Books() {}

    // All-args constructor
    public Books(String title, String author, int published) {
        this.title = title;
        this.author = author;
        this.published = published;
    }

    // Getters & setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPublished() {
        return published;
    }

    public void setPublished(int published) {
        this.published = published;
    }

}
