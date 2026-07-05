package com.survivalcoding;

import java.util.Objects;

public class Book extends TangibleAsset {
    private String isbn;

    public Book(String name, int price, String color, String isbn, double weight) {
        super(name, price, color, weight);
        this.isbn = isbn;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public final boolean equals(Object o) {
        if (!(o instanceof Book book)) return false;
        if (!super.equals(o)) return false;

        return Objects.equals(isbn, book.isbn);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + Objects.hashCode(isbn);
        return result;
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn='" + isbn + '\'' +
                '}';
    }
}
