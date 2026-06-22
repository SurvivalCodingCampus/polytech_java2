package com.survivalcoding.day260615;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class ClericTest {

    @Test
    @DisplayName("생성자 테스트")
    void constructor_ValidData_CreatesObject() {
        Cleric cleric1 = new Cleric("성직자1");

        assertEquals("성직자1", cleric1.name);
        assertEquals(Cleric.maxHP, cleric1.hp);
        assertEquals(Cleric.maxMP, cleric1.mp);
    }

    @Test
    void selfAid() {
        final int initialHp = 5;
        final int initialMp = 10;

        Cleric cleric = new Cleric("성직자");

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
