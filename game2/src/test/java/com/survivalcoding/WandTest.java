package com.survivalcoding;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

class WandTest {

    @Test
    @DisplayName("지팡이의 이름은 null이 아니거나 3문자 이상이어야 한다.")
    void setName() {
        String test = "H";
        String test2 = null;

        //Given
        Wand wand = new Wand();

        //Then
        assertThrows(IllegalArgumentException.class, () -> {
            wand.setName(test);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            wand.setName(test2);
        });
    }

    @Test
    @DisplayName("지팡이의 마력은 0.5 이상 100.0 이하여야 한다")
    void setPower() {
        double test = 0;
        double test2 = 101;

        //Given
        Wand wand = new Wand();

        //Then
        assertThrows(IllegalArgumentException.class, () -> {
            wand.setPower(test);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            wand.setPower(test2);
        });
    }


}