package com.survivalcoding;

import java.util.Date;
import java.util.Objects;

public class Book implements Comparable<Book>, Cloneable {
    private String title;
    private Date publishDate;
    private String comment;

    public Book(String title, Date publishDate, String comment) {
        this.title = title;
        this.publishDate = publishDate;
        this.comment = comment;
    }

    public String GetTitle() {
        return this.title;
    }

    public void SetTitle(String newTitle) {
        this.title = newTitle;
    }

    public void SetDate(Date newDate) {
        this.publishDate = newDate;
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

    @Override
    public int compareTo(Book obj) {
        return this.publishDate.compareTo(obj.publishDate);
    }

    @Override
    public Book clone() {
        return new Book(this.title, this.publishDate, this.comment);
    }
}
