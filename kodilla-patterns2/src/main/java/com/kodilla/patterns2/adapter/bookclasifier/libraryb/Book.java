package com.kodilla.patterns2.adapter.bookclasifier.libraryb;

public class Book {
    private final String author;
    private final String title;
    private final int yearOfPublicationl;

    public Book(String author, String title, int yearOfPublicationl) {
        this.author = author;
        this.title = title;
        this.yearOfPublicationl = yearOfPublicationl;
    }
    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getYearOfPublicationl() {
        return yearOfPublicationl;
    }
}
