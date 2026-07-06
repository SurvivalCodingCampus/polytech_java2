package com.survivalcoding.instance;

import java.text.SimpleDateFormat;
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

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public final boolean equals(Object o) {
        if (!(o instanceof Book book)) return false;

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String formattedDate1 = sdf.format(publishDate);
        String formattedDate2 = sdf.format(book.publishDate);

        return Objects.equals(title, book.title) && Objects.equals(formattedDate1, formattedDate2);
    }

    @Override
    public int hashCode() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String formattedDate1 = sdf.format(publishDate);

        int result = Objects.hashCode(title);
        result = 31 * result + Objects.hashCode(formattedDate1);
        return result;
    }

    @Override
    public int compareTo(Book o) {
        return publishDate.compareTo(o.publishDate) * -1;
    }

    @Override
    public Book clone() {
        return new Book(title, (Date) publishDate.clone(), comment);
    }
}
