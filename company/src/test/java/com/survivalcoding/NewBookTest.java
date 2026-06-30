package com.survivalcoding;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class NewBookTest {
    final Date testDate = new Date(2026, 6, 30, 12, 0, 30);
    final Date anotherTime = new Date(2026, 6, 30, 12, 30, 30);
    final Date anotherDate = new Date(2026, 7, 1);
    final String testTitle = "testTitle";
    final String anotherTitle = "anotherTitle";
    final String testComment = "testComment";
    final String changeComment = "changeComment";
    NewBook book1;
    NewBook book2;
    NewBook book3;
    NewBook book4;
    NewBook book5;

    @BeforeEach
    void setUp() {
        book1 = new NewBook(testTitle, testDate, testComment);
        book2 = new NewBook(testTitle, anotherTime, testComment);
        book3 = new NewBook(anotherTitle, anotherDate);
        book4 = new NewBook(testTitle, anotherTime);
        book5 = new NewBook(anotherTitle, testDate);
    }


    @Test
    @DisplayName("동일 객체 테스트 book1과 book2의 제목과 발간일이 같음을 확인")
    void testEquals() {
        // Given
        // setUp()에서 준비함

        // when - then
        assertEquals(book1, book2);
    }

    @Test
    @DisplayName("컬렉션 정렬 테스트")
    void testSort() {
        // Given
        List<NewBook> books = new ArrayList<>();
        books.add(book1);
        books.add(book3);
        books.add(book2);
        books.add(book4);
        books.add(book5);

        // when
        Collections.sort(books);

        // then
        assertEquals(List.of(book3, book2, book4, book1, book5), books, "정렬이 예상과 맞지 않습니다.");

    }

    @Test
    @DisplayName("깊은 복사 테스트")
    void testDeepCopy() {
        // given
        // setUp() 에서 준비됨

        // when
        book2 = book1.clone();
        book1.setComment(changeComment);

        // then
        assertNotEquals(book1.getComment(), book2.getComment());

    }

    @Test
    @DisplayName("얕은 복사 테스트")
    void testShallowCopy() {
        // given
        // setUp() 에서 준비됨

        // when
        book2 = book1;
        book1.setComment(changeComment);

        // then
        assertEquals(book1.getComment(), book2.getComment());

    }
}