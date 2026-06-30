package com.survivalcoding.day260630;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @Test
    @DisplayName("제목과 연-월-일이 같으면 시간이 달라도 equals와 hashCode가 동일.")
    void testEqualsAndHashCode() {
        Calendar cal1 = Calendar.getInstance();
        cal1.set(2026, Calendar.JUNE, 30, 9, 0, 0);

        Calendar cal2 = Calendar.getInstance();
        cal2.set(2026, Calendar.JUNE, 30, 21, 45, 30);

        Book book1 = new Book();
        book1.setTitle("클린 코드");
        book1.setPublishDate(cal1.getTime());

        Book book2 = new Book();
        book2.setTitle("클린 코드");
        book2.setPublishDate(cal2.getTime());

        assertEquals(book1, book2, "시간이 달라도 년-월-일과 제목이 같으면 동등.");
        assertEquals(book1.hashCode(), book2.hashCode(), "equals가 같으면 hashCode도 일치.");
    }

    @Test
    @DisplayName("출간일(publishDate)이 null인 경우에도 에러 없이 0으로 변환되어 정상 비교.")
    void testNullPublishDateHandling() {
        Book nullBook1 = new Book();
        nullBook1.setTitle("날짜 없는 책");
        nullBook1.setPublishDate(null);

        Book nullBook2 = new Book();
        nullBook2.setTitle("날짜 없는 책");
        nullBook2.setPublishDate(null);

        assertDoesNotThrow(() -> {
            assertEquals(nullBook1, nullBook2, "둘 다 출간일이 null이면 에러 없이 동등한 것으로 처리.");
        });

        List<Book> list = new ArrayList<>();
        list.add(nullBook1);

        Calendar cal = Calendar.getInstance();
        cal.set(2026, Calendar.JUNE, 30);
        Book normalBook = new Book();
        normalBook.setTitle("정상 책");
        normalBook.setPublishDate(cal.getTime());
        list.add(normalBook);

        assertDoesNotThrow(() -> Collections.sort(list));
    }

    @Test
    @DisplayName("Collections.sort() 정렬 시 최신 출간일 순서대로 정렬.")
    void testCompareToOrdering() {
        // Given
        Calendar past = Calendar.getInstance();
        past.set(2025, Calendar.DECEMBER, 25);

        Calendar present = Calendar.getInstance();
        present.set(2026, Calendar.JUNE, 30);

        Book oldBook = new Book();
        oldBook.setTitle("과거 책");
        oldBook.setPublishDate(past.getTime());

        Book newBook = new Book();
        newBook.setTitle("최신 책");
        newBook.setPublishDate(present.getTime());

        List<Book> books = new ArrayList<>();
        books.add(oldBook);
        books.add(newBook);

        // When: 정렬 수행
        Collections.sort(books);

        // Then: 내림차순(최신순) 정렬 검증
        assertEquals("최신 책", books.get(0).getTitle());
        assertEquals("과거 책", books.get(1).getTitle());
    }

    @Test
    @DisplayName("clone() 호출 시 깊은 복사가 수행되어 내부 Date 참조가 독립적이어야 함.")
    void testDeepCopy() {
        // Given
        Calendar cal = Calendar.getInstance();
        cal.set(2026, Calendar.JUNE, 30);

        Book original = new Book();
        original.setTitle("원본");
        original.setPublishDate(cal.getTime());

        // When
        Book cloned = original.clone();

        // 복사본의 날짜 데이터 자체를 수정해 봄 (setTime)
        cloned.getPublishDate().setTime(0); // 1970년으로 변경

        // Then
        assertNotSame(original, cloned, "두 인스턴스의 주소는 절대 같으면 안됨.");
        assertNotEquals(original.getPublishDate(), cloned.getPublishDate(), "복사본을 수정해도 원본의 날짜는 그대로 유지.");
    }

    @Test
    @DisplayName("예외 처리 검증 1: publishDate가 null일 때 hashCode()가 NPE 없이 0 기반의 해시값을 생성하는지 검증")
    void testHashCode_withNullPublishDate_shouldReturnZeroBasedHash() {
        Book nullBook = new Book();
        nullBook.setTitle("테스트 도서");
        nullBook.setPublishDate(null); // getDate()에서 NPE를 유발할 환경

        int expectedHashCode = Objects.hash("테스트 도서", 0);

        // When & Then
        assertDoesNotThrow(() -> {
            int actualHashCode = nullBook.hashCode();

            assertEquals(expectedHashCode, actualHashCode,
                    "catch 블록에서 0이 반환되지 않았다면 이 해시값은 일치할 수 없음.");
        });
    }

    @Test
    @DisplayName("예외 처리 검증 2: 한쪽만 publishDate가 null일 때 compareTo()가 NPE 없이 0과 정상 날짜를 비교하는지 검증")
    void testCompareTo_withOneNullPublishDate_shouldCompareWithZero() {
        // Given
        Book nullBook = new Book();
        nullBook.setTitle("날짜 없는 책");
        nullBook.setPublishDate(null); // getDate(null) -> catch 블록 거쳐 0 반환 예상

        Calendar cal = Calendar.getInstance();
        cal.set(2026, Calendar.JUNE, 30); // 20260630
        Book normalBook = new Book();
        normalBook.setTitle("정상 책");
        normalBook.setPublishDate(cal.getTime()); // getDate() -> 20260630 반환 예상

        // When & Then
        assertDoesNotThrow(() -> {
            // nullBook(0)과 normalBook(20260630)을 비교
            // 정렬 기준은 내림차순(other, this)이므로 Integer.compare(20260630, 0) -> 양수(1) 반환되어야 함
            int result = nullBook.compareTo(normalBook);

            assertTrue(result > 0, "null인 책이 정상 책보다 뒤로 가도록(정수 비교 기준) 양수가 반환.");
        });
    }

    @Test
    @DisplayName("예외 처리 검증 3: clone() 수행 시 publishDate가 null이면 복사본도 안전하게 null을 유지하는지 검증")
    void testClone_withNullPublishDate_shouldNotThrowNPE() {
        // Given
        Book original = new Book();
        original.setTitle("날짜 없는 원본");
        original.setPublishDate(null); // 깊은 복사 로직인 .getTime()에서 NPE를 유발할 수 있는 상태

        // When & Then
        assertDoesNotThrow(() -> {
            Book cloned = original.clone();

            assertNull(cloned.getPublishDate(), "원본이 null이면 복사본의 publishDate도 null이어야 함.");
            assertEquals(original.getTitle(), cloned.getTitle(), "제목은 정상적으로 복사되어야함.");
        });
    }
}