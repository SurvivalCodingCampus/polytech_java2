package com.survivalcoding;

import java.util.Date;
import java.util.Objects;

/*
다음 동작을 할 수 있도록 Book 클래스를 수정하시오.

제목과 출간일(예: 2024-01–01)이 같으면 같은 책으로 판단한다. 또한 List, Map, Set 등의 컬렉션에 넣어도 동일 객체로 판단한다.
Book 인스턴스를 담고 있는 컬렉션에 대해 Collections.sort() 를 사용하면 출간일이 신상 순서대로 정렬된다.
clone() 메서드를 제공하고, 깊은 복사를 수행한다.
 */

public class NewBook implements Comparable<NewBook>, Cloneable {
    private String title;
    private Date publishDate;
    private String comment;

    public NewBook(String title, Date publishDate, String comment) {
        setTitle(title);
        setPublishDate(publishDate);
        setComment(comment);
    }

    public NewBook(String title, Date publishDate) {
        setTitle(title);
        setPublishDate(publishDate);
        this.comment = "";
    }

    @Override
    public int compareTo(NewBook o) {
//        연/월/일 뿐만이 아니라 시간을 포함해서 정렬하기에 개선이 필요함
//        if (this.publishDate.after(o.getPublishDate())) {
//            return -1;
//        } else if (this.publishDate.before(o.getPublishDate())) {
//            return 1;
//        }
//        return 0;

        if (this.getPublishDate().getYear() != o.getPublishDate().getYear()) {
            return o.getPublishDate().getYear() - this.getPublishDate().getYear();
        } else if (o.getPublishDate().getMonth() != this.getPublishDate().getMonth()) {
            return o.getPublishDate().getMonth() - this.getPublishDate().getMonth();
        } else if (o.getPublishDate().getDate() != this.getPublishDate().getDate()) {
            return o.getPublishDate().getDate() - this.getPublishDate().getDate();
        }
        return 0;
    }


    @Override
    public boolean equals(Object o) {
        if (!(o instanceof NewBook newBook)) return false;
        return Objects.equals(title, newBook.title)
                && Objects.equals(publishDate.getDate(), newBook.publishDate.getDate())
                && Objects.equals(publishDate.getMonth(), newBook.getPublishDate().getMonth())
                && Objects.equals(publishDate.getYear(), newBook.publishDate.getYear());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(title);
        result = 31 * result + Objects.hashCode(publishDate.getDate());
        result = 31 * result + Objects.hashCode(publishDate.getMonth());
        result = 31 * result + Objects.hashCode(publishDate.getYear());
        return result;
    }

    @Override
    public String toString() {
        return "NewBook{" +
                "title='" + title + '\'' +
                ", publishDate=" + publishDate.getYear() + "." + publishDate.getMonth() + "." + publishDate.getDate() +
                ", comment='" + comment + '\'' +
                '}';
    }


    public String getTitle() {
        return title;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public String getComment() {
        return comment;
    }

    public void setTitle(String title) {
        if (title == null || title.isEmpty()) {
            throw new IllegalArgumentException("책 제목은 비어있을 수 없습니다.");
        }
        this.title = title;
    }

    public void setPublishDate(Date publishDate) {
        if (publishDate == null) {
            throw new IllegalArgumentException("출간일은 비어있을 수 없습니다.");
        }
        this.publishDate = publishDate;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public NewBook clone() {
        try {
            NewBook clone = (NewBook) super.clone();
            clone.setPublishDate((Date) this.publishDate.clone());
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}