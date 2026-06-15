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
            wizard.setWizardName(null);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            wizard.setWizardName("ab");
        });
        assertThrows(IllegalArgumentException.class, () -> {
            wizard.setWizardMp(-1);
        });


        // Wand 이름, 마력 테스트
        assertThrows(IllegalArgumentException.class, () -> {
            wand.setWandName(null);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            wand.setWandName("ab");
        });
        assertThrows(IllegalArgumentException.class, () -> {
            wand.setWandPower(0.4);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            wand.setWandPower(100.1);
        });
    }
}