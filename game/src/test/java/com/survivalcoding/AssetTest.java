package com.survivalcoding;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AssetTest {
    private final String BOOKNAME = "Java";
    private final String COMPUTERNAME = "Window";
    private final String PATENT_NAME = "특허권";
    private final int PRICE = 25000;
    private final String COLOR = "Orange";
    private final String ISBN = "RNT202";
    private final String MAKERNAME = "Mac";
    private final double BOOKWEIGHT = 1.5;
    private final double COMPUTERWEIGHT = 2.5;
    private final String PATENT_NUMBER = "RSU823";


    @Test
    @DisplayName("Book, Computer 무게가 입력되지 않았거나 무게가 다릅니다.")
    void weight() {
        Book book = new Book(BOOKNAME, PRICE, COLOR, ISBN);
        Computer computer = new Computer(COMPUTERNAME, PRICE, COLOR, MAKERNAME);

        book.setWeight(BOOKWEIGHT);
        assertEquals(1.5, book.weight(), "책 무게는 1.5 이여야 합니다.");

        computer.setWeight(COMPUTERWEIGHT);
        assertEquals(2.5, computer.weight(), "컴퓨터 무게는 2.5 이여야 합니다.");
    }

    @Test
    @DisplayName("Patent 는 무형자산, 특허권 번호가 입력되어야 합니다.")
    void PatentWeight() {
        Patent patent = new Patent(PATENT_NAME, PATENT_NUMBER);
        assertEquals("RSU823", patent.getPatentNumber(), "특허권 번호가 다릅니다.");

    }
}