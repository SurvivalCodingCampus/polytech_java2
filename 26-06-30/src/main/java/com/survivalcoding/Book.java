package com.survivalcoding;

import java.util.Date;
import java.util.Objects;

public class Book {
    private String title;
    private Date publishDate;
    private String comment;

    public Book(String title, Date publishDate, String comment) {
        this.title = title;
        this.publishDate = publishDate;
        this.comment = comment;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Book book)) return false;

        return Objects.equals(this.title, book.title) && Objects.equals(this.publishDate, book.publishDate);

    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(title);
        result = 31 * result + Objects.hashCode(publishDate);
        return result;
    }
}
