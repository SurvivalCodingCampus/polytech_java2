package com.survivalcoding.day260622;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ComputerTest {
    private static final String TEST_COMP_NAME = "맥북 프로";
    private static final int TEST_COMP_PRICE = 2500000;
    private static final String TEST_COMP_COLOR = "Silver";
    private static final String TEST_COMP_MAKER = "Apple";
    private static final double TEST_COMP_WEIGHT = 1.45;

    @Test
    @DisplayName("Computer 인스턴스 생성 및 Thing 인터페이스 기능이 정상 작동해야 한다")
    void computerWeightTest() {
        Computer computer = new Computer(TEST_COMP_NAME, TEST_COMP_PRICE, TEST_COMP_COLOR, TEST_COMP_WEIGHT, TEST_COMP_MAKER);

        assertAll("Computer 속성 검증",
                () -> assertEquals(TEST_COMP_MAKER, computer.getMakerName()),
                () -> assertEquals(TEST_COMP_WEIGHT, computer.getWeight()),
                () -> assertEquals(TEST_COMP_PRICE, computer.getPrice())
        );
    }
}
