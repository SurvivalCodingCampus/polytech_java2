package com.survivalcoding;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class ClericTest {

    @Test
    void selfAid() {
        final int initialHp = 5;
        final int initialMp = 10;

        Cleric cleric = new Cleric();

        cleric.hp = initialHp;
        cleric.mp = initialMp;

        cleric.selfAid();
        assertEquals(cleric.maxHP, cleric.hp);

        final int mpEdgeCase = 0;
        cleric.hp = initialHp;
        cleric.mp = mpEdgeCase;

        cleric.selfAid();
        assertNotEquals(cleric.maxHP, cleric.hp);
    }
}