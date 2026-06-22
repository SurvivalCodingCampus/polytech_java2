package com.survivalcoding;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

class WizardTest {
    private static final String NULL_NAME = null;
    private static final String TWO_NAME = "AB";
    private static final int SETMP = -1;
    private static final double SEP_MIN_POW = 0.4;
    private static final double SEP_MAX_POW = 100.1;

    @Test
    @DisplayName("Wand, Wizard 클래스 테스트")
    void Wizard() {
        Wand wand = new Wand("지팡이", 50);
        Wizard wizard = new Wizard("아서스", 100, 50, wand);


        // Wizard 이름 mp 테스트
        assertThrows(IllegalArgumentException.class, () -> {
            wizard.setName(NULL_NAME);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            wizard.setName(TWO_NAME);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            wizard.setMp(SETMP);
        });


        // Wand 이름, 마력 테스트
        assertThrows(IllegalArgumentException.class, () -> {
            wand.setName(NULL_NAME);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            wand.setName(TWO_NAME);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            wand.setPower(SEP_MIN_POW);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            wand.setPower(SEP_MAX_POW);
        });
    }
}