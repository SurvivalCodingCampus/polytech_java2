package com.survivalcoding;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClericTest {
    @Test
    @DisplayName("selfAid를 하면 hp를 5 회복해야 한다")
    void heal() {
        //given(준비)
        final Cleric cleric = new Cleric("클래릭", 50, 9);

        //when(실행)
        cleric.attack();
        cleric.selfAid();
        cleric.selfAid();
        cleric.pray(3);
        cleric.selfAid();

        //test(검증) assertEquals(검증값,검증변수)
        assertEquals(50, cleric.hp);

    }
}