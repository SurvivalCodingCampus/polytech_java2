package com.survivalcoding;

import java.util.Date;
import java.util.Objects;

public class Book implements Comparable<Book>, Cloneable {
    private String title;
    private Date publishDate;
    private String comment;

    public Book() {
    }

    public Book(String title, Date publishDate, String comment) {
        this.title = title;
        this.publishDate = publishDate;
        this.comment = comment;
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

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", publishDate=" + publishDate +
                ", comment='" + comment + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        if (this.publishDate != null && book.publishDate != null) {
            // 년-월-일 형태로 포맷을 지정
            java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd");

            String d1 = sdf.format(this.publishDate);
            String d2 = sdf.format(book.publishDate);

            return Objects.equals(title, book.title) && d1.equals(d2);
        }
        return Objects.equals(title, book.title) && Objects.equals(publishDate, book.publishDate);
    }

    @Override
    public int hashCode() {
        if (this.publishDate != null) {
            java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd");
            String dateStr = sdf.format(this.publishDate);
            return Objects.hash(title, dateStr);
        }
        
        return Objects.hash(title, publishDate);
    }

    @Override
    public int compareTo(Book other) {
        if (this.publishDate == null || other.publishDate == null) {
            return 0;
        }
        return other.publishDate.compareTo(this.publishDate);
    }


    @Override
    public Book clone() {
        Book result = new Book();
        result.title = this.title;
        result.comment = this.comment;
        if (this.publishDate != null) {
            result.publishDate = (Date) this.publishDate.clone();
        }
        return result;
    }
}
