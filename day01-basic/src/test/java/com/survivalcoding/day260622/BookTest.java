package com.survivalcoding.day260622;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BookTest {
    private static final String TEST_BOOK_NAME = "자바의 정석";
    private static final int TEST_BOOK_PRICE = 30000;
    private static final String TEST_BOOK_COLOR = "Blue";
    private static final String TEST_BOOK_ISBN = "978-89-000-0000-0";
    private static final double TEST_BOOK_WEIGHT = 0.85;

    @Test
    @DisplayName("Book 인스턴스 생성 및 상속된 속성들이 정상적으로 설정되어야 한다")
    void bookCreationTest() {
        Book book = new Book(TEST_BOOK_NAME, TEST_BOOK_PRICE, TEST_BOOK_COLOR, TEST_BOOK_WEIGHT, TEST_BOOK_ISBN);

        assertEquals(TEST_BOOK_NAME, book.getName(), "이름이 일치해야 합니다.");
        assertEquals(TEST_BOOK_PRICE, book.getPrice(), "가격이 일치해야 합니다.");
        assertEquals(TEST_BOOK_COLOR, book.getColor(), "색상이 일치해야 합니다.");
        assertEquals(TEST_BOOK_ISBN, book.getIsbn(), "ISBN이 일치해야 합니다.");
        assertEquals(TEST_BOOK_WEIGHT, book.getWeight(), "무게가 일치해야 합니다.");
    }
}
