package com.survivalcoding;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class WandTest {

    @Test
    @DisplayName("Wand Name Getter / Setter")
    void getName() {
        Wand wand = new Wand();

        wand.setName("기다란완드");

        assertEquals("기다란완드", wand.getName());
    }

    @Test
    @DisplayName("Wand Power Getter / Setter")
    void getPower() {
        Wand wand = new Wand();

        wand.setPower(5.0);

        assertEquals(5.0, wand.getPower());
    }

    @Test
    @DisplayName("지팡이 이름은 null일 수 없다")
    void setName_null() {
        Wand wand = new Wand();

        assertThrows(IllegalArgumentException.class, () -> {
            wand.setName(null);
        });
    }

    @Test
    @DisplayName("지팡이 이름은 3문자 이상이어야 한다")
    void setName_under3Characters() {
        Wand wand = new Wand();

        assertThrows(IllegalArgumentException.class, () -> {
            wand.setName("ab");
        });
    }

    @Test
    @DisplayName("지팡이 마력은 0.5 미만일 수 없다")
    void setPower_underMin() {
        Wand wand = new Wand();

        assertThrows(IllegalArgumentException.class, () -> {
            wand.setPower(0.4);
        });
    }

    @Test
    @DisplayName("지팡이 마력은 100.0 초과일 수 없다")
    void setPower_overMax() {
        Wand wand = new Wand();

        assertThrows(IllegalArgumentException.class, () -> {
            wand.setPower(100.1);
        });
    }
}