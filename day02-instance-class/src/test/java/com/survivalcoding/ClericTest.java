package com.survivalcoding;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClericTest {

    @Test
    @DisplayName("selfAid를 하면 HP를 최대로 회복한다")
    void selfAid() {
        final int initialhp = 5;
        final int initialmp = 10;

        Cleric cleric = new Cleric();

        cleric.hp = initialhp;
        cleric.mp = initialmp;

        cleric.selfAid();
        assertEquals(cleric.maxHp, cleric.hp);

        final int mpEdgeCase = 0;
        cleric.hp = initialhp;
        cleric.mp = mpEdgeCase;

        cleric.selfAid();
        assertEquals(cleric.maxHp, cleric.hp);


        // given (준비)

        // when (실행)


        // then (검증)

    }
}