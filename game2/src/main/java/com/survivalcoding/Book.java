package com.survivalcoding;

public class Book extends TangibleAsset {
    private String isbn;

    public Book(String name, int price, double weight, String color, String isbn) {
        super(name, price, weight, color);
        this.isbn = isbn;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
