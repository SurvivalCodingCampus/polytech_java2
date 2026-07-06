package com.survivalcoding;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BookTest {

    @Test
    void testEquals() {
        java.util.Calendar cal1 = java.util.Calendar.getInstance();
        cal1.set(2024, java.util.Calendar.JANUARY, 1, 9, 0, 0); // 2024-01-01 09:00:00
        Date morningDate = cal1.getTime();

        java.util.Calendar cal2 = java.util.Calendar.getInstance();
        cal2.set(2024, java.util.Calendar.JANUARY, 1, 23, 59, 59); // 2024-01-01 23:59:59
        Date eveningDate = cal2.getTime();


        Book book1 = new Book();
        book1.setTitle("자바 마스터");
        book1.setPublishDate(morningDate);
        book1.setComment("첫 번째 책");

        Book book2 = new Book();
        book2.setTitle("자바 마스터");
        book2.setPublishDate(eveningDate);
        book2.setComment("내용만 다른 두 번쨰 책");

        assertEquals(book1, book2);
        assertEquals(book1.hashCode(), book2.hashCode());

        Set<Book> bookSet = new HashSet<>();
        bookSet.add(book1);
        bookSet.add(book2);

        assertEquals(1, bookSet.size());

    }

    @Test
    void compareTo() {
        Date date2024 = new Date(124, 0, 1);
        Date date2026 = new Date(126, 5, 30);

        Book oldBook = new Book();
        oldBook.setTitle("과거에 나온 책");
        oldBook.setPublishDate(date2024);

        Book newBook = new Book();
        newBook.setTitle("따끈따끈한 신상 책");
        newBook.setPublishDate(date2026);

        List<Book> bookList = new ArrayList<>();
        bookList.add(oldBook);
        bookList.add(newBook);

        Collections.sort(bookList);

        assertEquals(newBook, bookList.get(0));
        assertEquals(oldBook, bookList.get(1));
    }

    @Test
    void testClone() {
        Date originalDate = new Date(124, 0, 1);

        Book originalBook = new Book();
        originalBook.setTitle("원본 책");
        originalBook.setPublishDate(originalDate);

        Book clonedBook = originalBook.clone();

        Date newDate = new Date(126, 5, 30);
        clonedBook.getPublishDate().setTime(newDate.getTime());

        assertEquals(originalBook.getTitle(), clonedBook.getTitle());

        long originalTime = originalBook.getPublishDate().getTime();
        long expectedTime = originalDate.getTime();

        assertEquals(expectedTime, originalTime);
    }
}