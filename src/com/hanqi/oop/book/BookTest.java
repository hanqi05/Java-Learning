package com.hanqi.oop.book;

public class BookTest {
    public static void main(String[] args) {
        Book book = new Book("Never give up", "Trump", 19.9, 100);
        System.out.println(book.getName());
        System.out.println(book.getAuthor());
        System.out.println(book.getPrice());
        System.out.println(book.getPages());
        book.read();

        System.out.println("--------修改价格后--------");

        book.setPrice(29.9);
        System.out.println(book.getName());
        System.out.println(book.getAuthor());
        System.out.println(book.getPrice());
        System.out.println(book.getPages());
    }
}
