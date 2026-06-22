package com.survivalcoding;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Modifier;

import static org.junit.jupiter.api.Assertions.*;

class TangibleAssetTest {

    private static final String BOOK_NAME = "자바";
    private static final int BOOK_PRICE = 30000;
    private static final String BOOK_COLOR = "파랑";
    private static final String BOOK_ISBN = "111-111-111";

    private static final String COMPUTER_NAME = "노트북";
    private static final int COMPUTER_PRICE = 1500000;
    private static final String COMPUTER_COLOR = "은색";
    private static final String COMPUTER_MAKER_NAME = "LG";

    @Test
    @DisplayName("Book 이름, 가격, 색상, ISBN")
    void bookTest() {
        Book book = new Book(BOOK_NAME, BOOK_PRICE, BOOK_COLOR, BOOK_ISBN);

        assertEquals(BOOK_NAME, book.getName());
        assertEquals(BOOK_PRICE, book.getPrice());
        assertEquals(BOOK_COLOR, book.getColor());
        assertEquals(BOOK_ISBN, book.getIsbn());
    }

    @Test
    @DisplayName("Computer 이름, 가격, 색상, 제조사")
    void computerTest() {
        Computer computer = new Computer(
                COMPUTER_NAME,
                COMPUTER_PRICE,
                COMPUTER_COLOR,
                COMPUTER_MAKER_NAME
        );

        assertEquals(COMPUTER_NAME, computer.getName());
        assertEquals(COMPUTER_PRICE, computer.getPrice());
        assertEquals(COMPUTER_COLOR, computer.getColor());
        assertEquals(COMPUTER_MAKER_NAME, computer.getMakerName());
    }

    @Test
    @DisplayName("Book은 TangibleAsset을 상속")
    void bookExtendsTangibleAssetTest() {
        Book book = new Book(BOOK_NAME, BOOK_PRICE, BOOK_COLOR, BOOK_ISBN);

        assertInstanceOf(TangibleAsset.class, book);
    }

    @Test
    @DisplayName("Computer는 TangibleAsset을 상속")
    void computerExtendsTangibleAssetTest() {
        Computer computer = new Computer(
                COMPUTER_NAME,
                COMPUTER_PRICE,
                COMPUTER_COLOR,
                COMPUTER_MAKER_NAME
        );

        assertInstanceOf(TangibleAsset.class, computer);
    }

    @Test
    @DisplayName("TangibleAsset은 추상 클래스")
    void tangibleAssetIsAbstractTest() {
        assertTrue(Modifier.isAbstract(TangibleAsset.class.getModifiers()));
    }
}