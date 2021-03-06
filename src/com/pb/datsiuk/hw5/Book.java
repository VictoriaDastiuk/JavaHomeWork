package com.pb.datsiuk.hw5;

public class Book {
    private String name;
    private String author;
    private String date;

    public Book(String name, String Author, String date) {
        this.name = name;
        this.author = Author;
        this.date = date;
    }

    public Book() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getInfo() {
        return "{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
