package com.codedifferently.review.parser;

public class Book {

    private String title;
    private Integer yearPublished;
    private String author;

    public Book() {
    }

    public Book(String title, Integer yearPublished, String author) {
        this.title = title;
        this.yearPublished = yearPublished;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(Integer yearPublished) {
        this.yearPublished = yearPublished;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", yearPublished=" + yearPublished +
                ", author='" + author + '\'' +
                '}';
    }
}
