package com.survivalcoding;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BookTest {
    private final String BOOKNAME = "어린왕자";
    private final String BOOK_DAY = "2024-03-15";
    private final String COMMENT_B = "대여전";
    private final String COMMENT_A = "대여중";

    private final String BOOKNAME2 = "별헤는밤";
    private final String BOOK_DAY2 = "2011-02-06";
    private final String BOOKNAME3 = "Java";
    private final String BOOK_DAY3 = "2000-01-24";

    @Test
    @DisplayName("제목과 출간일이 같으면 같은 책으로 판단")
    void SameBook() {
        Book book1 = new Book(BOOKNAME, BOOK_DAY, COMMENT_B);
        Book book2 = new Book(BOOKNAME, BOOK_DAY, COMMENT_A);

        assertEquals(book1, book2);
    }

    @Test
    @DisplayName("List 동일한 객체면 삭제")
    void ListBook() {
        Book book3 = new Book(BOOKNAME2, BOOK_DAY2, COMMENT_B);
        Book book4 = new Book(BOOKNAME2, BOOK_DAY2, COMMENT_B);

        List<Book> bookList = new ArrayList<>();

        bookList.add(book3);
        bookList.remove(book4);

        assertEquals(0, bookList.size());
    }

    @Test
    @DisplayName("Set 동일한 객체면 중복으로 추가되지 않고 사이즈 1")
    void Set() {
        Book book3 = new Book(BOOKNAME2, BOOK_DAY2, COMMENT_B);
        Book book4 = new Book(BOOKNAME2, BOOK_DAY2, COMMENT_B);

        Set<Book> bookList = new HashSet<>();

        bookList.add(book3);
        bookList.add(book4);

        assertEquals(1, bookList.size());
    }

    @Test
    @DisplayName("날짜 출간일이 신상 순서대로 정렬")
    void sort() {
        Book book1 = new Book(BOOKNAME, BOOK_DAY, COMMENT_A);
        Book book2 = new Book(BOOKNAME2, BOOK_DAY2, COMMENT_A);
        Book book3 = new Book(BOOKNAME3, BOOK_DAY3, COMMENT_A);

        List<Book> bookList = new ArrayList<>();
        bookList.add(book3);
        bookList.add(book1);
        bookList.add(book2);

        Collections.sort(bookList);

        assertEquals(book1, bookList.get(0));
        assertEquals(book2, bookList.get(1));
        assertEquals(book3, bookList.get(2));
    }

    @Test
    @DisplayName("clone으로 값이 일치한지")
    void cloneTest() {
        Book book1 = new Book(BOOKNAME, BOOK_DAY, COMMENT_A);
        Book book2 = book1.clone();

        assertEquals(book1, book2);
    }
}