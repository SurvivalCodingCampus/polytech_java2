package com.survivalcoding;

import java.util.Date;

public class Book /*extends TangibleAsset*/ {
//    다음 동작을 할 수 있도록 Book 클래스를 수정하시오.
//
//    제목과 출간일(예: 2024-01–01)이 같으면 같은 책으로 판단한다. 또한 List, Map, Set 등의 컬렉션에 넣어도 동일 객체로 판단한다.
//    Book 인스턴스를 담고 있는 컬렉션에 대해 Colections.sort() 를 사용하면 출간일이 신상 순서대로 정렬된다.
//    clone() 메서드를 제공하고, 깊은 복사를 수행한다.

    private String isbn;
    private String title;
    private long publishDate = Date.parse("2026-06-30");

    private String comment;
    public int borrow = 1;

    private int bookCount = 0;

    public Book(String title, long publishDate, String comment) {

        this.title = title;
        this.publishDate = publishDate;
        this.comment = comment;


    }

    public String getTitle() {
        return this.title;
    }

    public long getPublishDate() {
        return this.publishDate;
    }

    public String getComment() {
        return this.comment;
    }


//    public Book(String name, int price, String color, double weight, String assetType, String isbn) {
//        setName(name);
//        setPrice(price);
//        setColor(color);
//        setWeight(weight);
//        setAssetType(assetType);
//        this.isbn = isbn;
//    }
//
//    public String getIsbn() {
//        return isbn;
//    }
//
//    public void setIsbn(String isbn) {
//        this.isbn = isbn;
//    }
}

