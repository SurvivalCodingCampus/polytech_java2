package com.survivalcoding;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

class WizardTest {

    @Test
    @DisplayName("Wand, Wizard 클래스 테스트")
    void Wizard() {
        Wand wand = new Wand("지팡이", 50);
        Wizard wizard = new Wizard("아서스", 100, 50, wand);

        // Wizard 이름 mp 테스트
        assertThrows(IllegalArgumentException.class, () -> {
            wizard.setName(null);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            wizard.setName("ab");
        });
        assertThrows(IllegalArgumentException.class, () -> {
            wizard.setMp(-1);
        });


        // Wand 이름, 마력 테스트
        assertThrows(IllegalArgumentException.class, () -> {
            wand.setName(null);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            wand.setName("ab");
        });
        assertThrows(IllegalArgumentException.class, () -> {
            wand.setPower(0.4);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            wand.setPower(100.1);
        });
    }
}