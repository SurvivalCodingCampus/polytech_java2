package com.survivalcoding.instance;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {
    Book book1;
    Book book2;

    @BeforeEach
    void setUp() {
        LocalDateTime localDateTime1 = LocalDateTime.of(2026, 7, 6, 14, 30, 0);
        LocalDateTime localDateTime2 = LocalDateTime.of(2026, 7, 6, 20, 30, 0);

        // 2. Date 객체로 변환 (시스템 기본 시간대 기준)
        Date date1 = Date.from(localDateTime1.atZone(ZoneId.systemDefault()).toInstant());
        Date date2 = Date.from(localDateTime2.atZone(ZoneId.systemDefault()).toInstant());

        assertNotEquals(date1, date2);

        book1 = new Book("title", date1, "1231");     // 2026-07-06
        book2 = new Book("title", date2, "66565");    // 2026-07-06
    }

    @Test
    @DisplayName("제목과 출간일(예: 2024-01–01)이 같으면 같은 책으로 판단한다")
    void equalsTest() {
        assertEquals(book1, book2);
    }

    @Test
    @DisplayName("또한 List, Map, Set 등의 컬렉션에 넣어도 동일 객체로 판단한다.")
    void collectionEqualsTest() {
        Set<Book> bookSet = new HashSet<>();
        bookSet.add(book1);
        bookSet.add(book2);

        assertEquals(book1.hashCode(), book2.hashCode());
        assertEquals(1, bookSet.size());
    }

    @Test
    @DisplayName("Book 인스턴스를 담고 있는 컬렉션에 대해 Collections.sort() 를 사용하면 출간일이 신상 순서대로 정렬된다.")
    void collectionSortTest() {
        LocalDateTime localDateTime1 = LocalDateTime.of(2026, 7, 6, 14, 30, 0);
        LocalDateTime localDateTime2 = LocalDateTime.of(2026, 8, 1, 20, 30, 0);     // 신상

        // 2. Date 객체로 변환 (시스템 기본 시간대 기준)
        Date date1 = Date.from(localDateTime1.atZone(ZoneId.systemDefault()).toInstant());
        Date date2 = Date.from(localDateTime2.atZone(ZoneId.systemDefault()).toInstant());

        book1.setPublishDate(date1);
        book2.setPublishDate(date2);

        List<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);

        Collections.sort(books);

        assertEquals(books.getFirst(), book2);
    }

    @Test
    @DisplayName("clone() 메서드를 제공하고, 깊은 복사를 수행한다.")
    void cloneTest() {
        Book book3 = book1.clone();

        assertEquals(book1, book3);
        assertNotSame(book1, book3);

        assertEquals(book1.getPublishDate(), book3.getPublishDate());
        assertNotSame(book1.getPublishDate(), book3.getPublishDate());
    }
}