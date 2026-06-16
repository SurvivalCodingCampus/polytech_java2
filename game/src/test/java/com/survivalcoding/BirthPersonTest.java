package com.survivalcoding;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BirthPersonTest {

    @Test
    @DisplayName("Age 나이계산")
    void age() {
        BirthPerson birthPerson = new BirthPerson("아무개", 1996);
        birthPerson.getAge();

        assertEquals(2026 - 1996, birthPerson.getAge(), "나이가 맞지 않습니다.");
    }

}