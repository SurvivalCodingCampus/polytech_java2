package com.survivalcoding;

public class Book extends TangibleAsset {
    String isbn;

    Book(String name, int price, String color, String isbn) {
        super(name, price, color);
        this.isbn = isbn;
    }
}
