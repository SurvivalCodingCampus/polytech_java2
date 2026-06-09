package com.survivalcoding;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClericTest {
    @Test
    @DisplayName("Cleric 상태 정보")
    void status() {
        final Cleric cleric = new Cleric("클레릭", 20, 5);

        cleric.status();

        assertEquals(20, cleric.hp);
        assertEquals(50, Cleric.MAX_HP);
        assertEquals(5, cleric.mp);
        assertEquals(10, Cleric.MAX_MP);
    }

    @Test
    @DisplayName("Mp 5를 소모하면 HP 전체회복")
    void selfAid() {
        final Cleric cleric = new Cleric("클레릭", 20, 5);

        cleric.selfAid();

        assertEquals(50, cleric.hp);
        assertEquals(0, cleric.mp);
    }

    @Test
    @DisplayName("기도를 하면 Mp를 초 + 0~2 만큼 회복")
    void pray() {
        final Cleric cleric = new Cleric("클레릭", 20, 5);
        int beforeMp = cleric.mp;
        int mpRecovery = cleric.pray(3);

        assertTrue(mpRecovery >= 3);
        assertTrue(mpRecovery <= 5);

        assertTrue(cleric.mp >= 8);
        assertTrue(cleric.mp <= 10);

        int resultMp = mpRecovery + beforeMp;
        assertEquals(resultMp, cleric.mp);

    }

    @Test
    @DisplayName("이름, HP, MP 지정")
    void Name_Hp_Mp() {
        final Cleric cleric = new Cleric("아서스", 40, 5);

        assertEquals("아서스", cleric.name);
        assertEquals(40, cleric.hp);
        assertEquals(5, cleric.mp);
    }

    @Test
    @DisplayName("이름, HP 지정")
    void Name_Hp() {
        final Cleric cleric = new Cleric("아서스", 35);

        assertEquals("아서스", cleric.name);
        assertEquals(35, cleric.hp);
        assertEquals(10, cleric.mp);
    }

    @Test
    @DisplayName("이름만 지정")
    void Name() {
        Cleric cleric = new Cleric("아서스");
        assertEquals("아서스", cleric.name);
        assertEquals(50, cleric.hp);
        assertEquals(10, cleric.mp);
    }

    @Test
    @DisplayName("이름도 지정 안함")
    void nullName() {
        assertThrows(NoSuchMethodException.class,
                Cleric.class::getDeclaredConstructor);
    }
}