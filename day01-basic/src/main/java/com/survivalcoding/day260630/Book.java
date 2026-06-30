package com.survivalcoding.day260630;

import java.util.Calendar;
import java.util.Date;
import java.util.Objects;

public class Book implements Comparable<Book>, Cloneable {
    private String title;
    private Date publishDate;
    private String comment;

    private static final int YEAR_NUM = 10000;
    private static final int MONTH_NUM = 100;
    private static final int NULL_DATE_VALUE= 0;

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

    private int getDate(Date date) {
        try {
            Calendar cal = Calendar.getInstance();
            cal.setTime(date);
            int year = cal.get(Calendar.YEAR);
            int month = cal.get(Calendar.MONTH);
            int day = cal.get(Calendar.DAY_OF_MONTH);
            return (year * YEAR_NUM) + ((month + 1) * MONTH_NUM) + day;
        } catch (NullPointerException e) {
            return NULL_DATE_VALUE;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;

        return Objects.equals(title, book.title) &&
                getDate(this.publishDate) == getDate(book.publishDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, getDate(publishDate));
    }

    @Override
    public int compareTo(Book book) {
        int thisDate = getDate(this.publishDate);
        int otherDate = getDate(book.publishDate);

        return Integer.compare(otherDate, thisDate);
    }

    @Override
    public Book clone() {
        try {
            Book result = (Book) super.clone();
            result.publishDate = new Date(this.publishDate.getTime());
            return result;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
