package com.kodilla.patterns2.adapter.bookclasifier.librarya;

public class Book {
    private final String author;
    private final String title;
    private final int publicatioYear;
    private final String signature;

    public Book(String author, String title, int publicatioYear, String signature) {
        this.author = author;
        this.title = title;
        this.publicatioYear = publicatioYear;
        this.signature = signature;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getPublicatioYear() {
        return publicatioYear;
    }

    public String getSignature() {
        return signature;
    }
}
