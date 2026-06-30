package com.survivalcoding;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Objects;

public class Book implements Comparable<Book>, Cloneable {
    private String title;
    private Date publishDate;
    private String comment;
    private int year;
    private int month;
    private int day;

    public Book(String title, String publishDateStr, String comment) {
        this.title = title;
        this.comment = comment;

        try {
            this.publishDate = new SimpleDateFormat("yyyy-MM-dd").parse(publishDateStr);
        } catch (ParseException e) {
            throw new RuntimeException("날짜 형식이 잘못되었습니다.");
        }

        Calendar cal = Calendar.getInstance();
        cal.setTime(this.publishDate);
        this.year = cal.get(Calendar.YEAR);
        this.month = cal.get(Calendar.MONTH) + 1;
        this.day = cal.get(Calendar.DAY_OF_MONTH);
    }

    public Book(Book other) {
        this.title = other.title;
        this.publishDate = (Date) other.publishDate.clone();
        this.comment = other.comment;
        this.year = other.year;
        this.month = other.month;
        this.day = other.day;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
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
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(title, book.title) &&
                this.year == book.year && this.month == book.month && this.day == book.day;
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, year, month, day);
    }

    @Override
    public String toString() {
        return String.format("Book{%s-%d-%02d-%02d}", title, year, month, day);
    }

    @Override
    public int compareTo(Book o) {
        if (this.year != o.year) {
            return Integer.compare(this.year, o.year) * -1;
        }
        if (this.month != o.month) {
            return Integer.compare(this.month, o.month) * -1;
        }
        return Integer.compare(this.day, o.day) * -1;
    }
    
    @Override
    public Book clone() {
        return new Book(this);
    }
}