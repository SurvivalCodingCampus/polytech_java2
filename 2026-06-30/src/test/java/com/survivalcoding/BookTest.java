package com.survivalcoding;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.text.SimpleDateFormat;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    private Date date(String yyyyMMdd) throws Exception {
        return new SimpleDateFormat("yyyy-MM-dd").parse(yyyyMMdd);
    }

    @Test
    @DisplayName("제목과 출간일이 같으면 equals()는 true를 반환한다")
    void equals_sameTitleAndDate_returnsTrue() throws Exception {
        // given
        Book book1 = new Book();
        book1.setTitle("자바의 정석");
        book1.setPublishDate(date("2024-01-01"));

        Book book2 = new Book();
        book2.setTitle("자바의 정석");
        book2.setPublishDate(date("2024-01-01"));

        // when
        boolean result = book1.equals(book2);

        // then
        assertTrue(result);
    }

    @Test
    @DisplayName("제목 또는 출간일이 다르면 equals()는 false를 반환한다")
    void equals_differentTitleOrDate_returnsFalse() throws Exception {
        // given
        Book book1 = new Book();
        book1.setTitle("자바의 정석");
        book1.setPublishDate(date("2024-01-01"));

        Book book2 = new Book();
        book2.setTitle("이펙티브 자바");
        book2.setPublishDate(date("2024-01-01"));

        // when
        boolean result = book1.equals(book2);

        // then
        assertFalse(result);
    }

    @Test
    @DisplayName("같다고 판단되는 두 Book은 hashCode도 동일하다")
    void hashCode_equalBooks_haveSameHashCode() throws Exception {
        // given
        Book book1 = new Book();
        book1.setTitle("자바의 정석");
        book1.setPublishDate(date("2024-01-01"));

        Book book2 = new Book();
        book2.setTitle("자바의 정석");
        book2.setPublishDate(date("2024-01-01"));

        // when
        int hash1 = book1.hashCode();
        int hash2 = book2.hashCode();

        // then
        assertEquals(hash1, hash2);
    }

    @Test
    @DisplayName("제목과 출간일이 같은 Book을 Set에 넣으면 동일 객체로 취급되어 하나만 저장된다")
    void set_sameTitleAndDateBooks_treatedAsSameObject() throws Exception {
        // given
        Book book1 = new Book();
        book1.setTitle("자바의 정석");
        book1.setPublishDate(date("2024-01-01"));

        Book book2 = new Book();
        book2.setTitle("자바의 정석");
        book2.setPublishDate(date("2024-01-01"));

        Set<Book> books = new HashSet<>();

        // when
        books.add(book1);
        books.add(book2);

        // then
        assertEquals(1, books.size());
    }

    @Test
    @DisplayName("제목과 출간일이 같은 Book을 Map의 key로 사용하면 동일 키로 취급된다")
    void map_sameTitleAndDateBooks_treatedAsSameKey() throws Exception {
        // given
        Book book1 = new Book();
        book1.setTitle("자바의 정석");
        book1.setPublishDate(date("2024-01-01"));

        Book book2 = new Book();
        book2.setTitle("자바의 정석");
        book2.setPublishDate(date("2024-01-01"));

        Map<Book, String> map = new HashMap<>();

        // when
        map.put(book1, "첫 번째 등록");
        map.put(book2, "두 번째 등록");

        // then
        assertEquals(1, map.size());
        assertEquals("두 번째 등록", map.get(book1));
    }

    @Test
    @DisplayName("Collections.sort()를 사용하면 출간일이 최신 순(내림차순)으로 정렬된다")
    void sort_books_orderedByPublishDateDescending() throws Exception {
        // given
        Book oldBook = new Book();
        oldBook.setTitle("오래된 책");
        oldBook.setPublishDate(date("2020-01-01"));

        Book newBook = new Book();
        newBook.setTitle("최신 책");
        newBook.setPublishDate(date("2024-01-01"));

        Book midBook = new Book();
        midBook.setTitle("중간 책");
        midBook.setPublishDate(date("2022-01-01"));

        List<Book> books = new ArrayList<>(List.of(oldBook, newBook, midBook));

        // when
        Collections.sort(books);

        // then
        assertEquals("최신 책", books.get(0).getTitle());
        assertEquals("중간 책", books.get(1).getTitle());
        assertEquals("오래된 책", books.get(2).getTitle());
    }

    @Test
    @DisplayName("clone()을 호출하면 필드 값이 동일한 새로운 객체가 생성된다")
    void clone_returnsBookWithSameFieldValues() throws Exception {
        // given
        Book original = new Book();
        original.setTitle("자바의 정석");
        original.setPublishDate(date("2024-01-01"));
        original.setComment("좋은 책");

        // when
        Book cloned = original.clone();

        // then
        assertEquals(original.getTitle(), cloned.getTitle());
        assertEquals(original.getPublishDate(), cloned.getPublishDate());
        assertEquals(original.getComment(), cloned.getComment());
    }

    @Test
    @DisplayName("clone()으로 생성된 객체는 원본과 다른 참조이다")
    void clone_returnsDifferentReferenceFromOriginal() throws Exception {
        // given
        Book original = new Book();
        original.setTitle("자바의 정석");
        original.setPublishDate(date("2024-01-01"));

        // when
        Book cloned = original.clone();

        // then
        assertNotSame(original, cloned);
    }

    @Test
    @DisplayName("clone()은 publishDate를 깊은 복사하므로, 복사본의 날짜를 변경해도 원본은 영향받지 않는다")
    void clone_publishDate_isDeepCopied() throws Exception {
        // given
        Book original = new Book();
        original.setTitle("자바의 정석");
        original.setPublishDate(date("2024-01-01"));

        Book cloned = original.clone();

        // when
        cloned.getPublishDate().setTime(0L); // 복사본의 날짜를 변경

        // then
        assertNotEquals(original.getPublishDate().getTime(), cloned.getPublishDate().getTime());
        assertNotSame(original.getPublishDate(), cloned.getPublishDate());
    }
}