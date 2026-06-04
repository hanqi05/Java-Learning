package com.hanqi.oop.book;

public class Book {
    private String name;
    private String author;
    private double price;
    private int pages;

    public Book() {
    }

    public Book(String name, String author, double price, int pages) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.pages = pages;
    }


    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public double getPrice() {
        return price;
    }

    public int getPages() {
        return pages;
    }

    public void read() {
        System.out.println("正在阅读《" + name + "》");
    }
}
