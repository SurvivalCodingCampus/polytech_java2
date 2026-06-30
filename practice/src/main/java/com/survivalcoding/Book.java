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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(title, book.title) &&
                Objects.equals(publishDate, book.publishDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, publishDate);
    }

    //출간일 순서대로 정렬
    @Override
    public int compareTo(Book other) {
        return this.publishDate.compareTo(other.publishDate);
    }

    @Override
    public Book clone() {
        try {
            Book cloned = (Book) super.clone();
            cloned.publishDate = (Date) this.publishDate.clone();
            return cloned;
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

}
