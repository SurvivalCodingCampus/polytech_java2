package com.survivalcoding;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WandTest {
    private static final String VALID_WAND_NAME = "Magic Wand";
    private static final String SHORT_WAND_NAME = "W";
    private static final String NULL_WAND_NAME = null;

    private static final double VALID_POWER = 10.0;
    private static final double MIN_POWER = 0.5;
    private static final double MAX_POWER = 100.0;
    private static final double TOO_LOW_POWER = 0.4;
    private static final double TOO_HIGH_POWER = 100.1;
    private static final double ASSERTION_DELTA = 0.000001;

    @Test
    @DisplayName("지팡이의 마력을 조회한다")
    void getPowerReturnsPower() {
        Wand wand = new Wand();

        wand.setPower(VALID_POWER);

        assertEquals(VALID_POWER, wand.getPower(), ASSERTION_DELTA);
    }

    @Test
    @DisplayName("지팡이의 이름을 설정한다")
    void setNameSetsName() {
        Wand wand = new Wand();

        assertDoesNotThrow(() -> wand.setName(VALID_WAND_NAME));
        assertEquals(VALID_WAND_NAME, wand.getName());
    }

    @Test
    @DisplayName("지팡이 이름이 null이면 예외가 발생한다")
    void setNameThrowsExceptionWhenNameIsNull() {
        Wand wand = new Wand();

        assertThrows(
                IllegalArgumentException.class,
                () -> wand.setName(NULL_WAND_NAME)
        );
    }

    @Test
    @DisplayName("지팡이 이름이 3문자 미만이면 예외가 발생한다")
    void setNameThrowsExceptionWhenNameIsTooShort() {
        Wand wand = new Wand();

        assertThrows(
                IllegalArgumentException.class,
                () -> wand.setName(SHORT_WAND_NAME)
        );
    }

    @Test
    @DisplayName("지팡이의 마력을 설정한다")
    void setPowerSetsPower() {
        Wand wand = new Wand();

        assertDoesNotThrow(() -> wand.setPower(VALID_POWER));
        assertEquals(VALID_POWER, wand.getPower(), ASSERTION_DELTA);
    }

    @Test
    @DisplayName("지팡이의 최소 마력 0.5는 허용된다")
    void setPowerAcceptsMinimumPower() {
        Wand wand = new Wand();

        assertDoesNotThrow(() -> wand.setPower(MIN_POWER));
        assertEquals(MIN_POWER, wand.getPower(), ASSERTION_DELTA);
    }

    @Test
    @DisplayName("지팡이의 최대 마력 100.0은 허용된다")
    void setPowerAcceptsMaximumPower() {
        Wand wand = new Wand();

        assertDoesNotThrow(() -> wand.setPower(MAX_POWER));
        assertEquals(MAX_POWER, wand.getPower(), ASSERTION_DELTA);
    }

    @Test
    @DisplayName("지팡이의 마력이 0.5 미만이면 예외가 발생한다")
    void setPowerThrowsExceptionWhenPowerIsTooLow() {
        Wand wand = new Wand();

        assertThrows(
                IllegalArgumentException.class,
                () -> wand.setPower(TOO_LOW_POWER)
        );
    }

    @Test
    @DisplayName("지팡이의 마력이 100.0 초과이면 예외가 발생한다")
    void setPowerThrowsExceptionWhenPowerIsTooHigh() {
        Wand wand = new Wand();

        assertThrows(
                IllegalArgumentException.class,
                () -> wand.setPower(TOO_HIGH_POWER)
        );
    }
}