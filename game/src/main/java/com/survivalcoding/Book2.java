package com.survivalcoding;
import javax.xml.crypto.Data;
import java.util.Objects;



public class Book2 {
    private String title;
    private Data publishDate;
    private String comment;
    private Book2 Data;

    Book2(String title, Data publishDate, String comment) {
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

    public Data getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Data publishDate) {
        this.publishDate = publishDate;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }





    @Override
    public boolean equals(Object obj) {

        if (!(obj instanceof Book2)) return false;
        Book2 bb = (Book2) obj;
        return title.equals(bb.title);
        /*
        Book2 bb = (Book2) obj;
        String Data;
        return title == bb.title && Book2(equals(bb.Data));
        title.equals(Data);
        */
        //boolean Object;
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, publishDate, comment);
    }

    @Override
    public String toString() {
        return "Book2{" +
                "title='" + title + '\'' +
                ", publishDate=" + publishDate +
                ", comment='" + comment + '\'' +
                '}';
    }
}




