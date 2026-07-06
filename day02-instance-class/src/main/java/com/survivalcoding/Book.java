package com.survivalcoding;

import java.util.Date;
import java.util.Objects;

public class Book implements Comparable<Book>, Cloneable {
    private String title;
    private Date publishDate;
    private String comment;

    @Override
    public boolean equals(Object o) {
        // Book 타입이면 true
        // 아니면 false
        // title, publishDate 비교
        if (this == o) {
            return true;
        }

        if (!(o instanceof Book)) {
            return false;
        }

        Book book = (Book) o;


        return Objects.equals(title, book.title)
                && Objects.equals(publishDate, book.publishDate);
    }


    @Override
    public int hashCode() {
        return Objects.hash(title, publishDate);
    }

    @Override
    public int compareTo(Book other) {
        return other.publishDate.compareTo(this.publishDate);
    }

    @Override
    public Book clone() {
        try {
            Book result = (Book) super.clone();
            result.publishDate = new Date(this.publishDate.getTime());
            return result;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
