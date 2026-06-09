package com.survivalcoding;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClericTest {
    @Test
    @DisplayName("조건1")
    void cleric1() {
        final String name = "아서스";
        final int hp = 40;
        final int mp = 5;

        Cleric cleric = new Cleric(name, hp, mp);

        assertEquals(name, cleric.name);
        assertEquals(hp, cleric.hp);
        assertEquals(mp, cleric.mp);
    }

    @Test
    @DisplayName("조건2")
    void cleric2() {
        final String name = "아서스";
        final int hp = 35;
        final int mp = Cleric.maxMp;

        Cleric cleric = new Cleric(name, hp);

        assertEquals(name, cleric.name);
        assertEquals(hp, cleric.hp);
        assertEquals(mp, cleric.mp);
    }

    @Test
    @DisplayName("조건3")
    void cleric3() {
        final String name = "아서스";
        final int hp = Cleric.maxHp;
        final int mp = Cleric.maxMp;

        Cleric cleric = new Cleric(name);

        assertEquals(name, cleric.name);
        assertEquals(hp, cleric.hp);
        assertEquals(mp, cleric.mp);
    }
}
//    @Test
//    @DisplayName("selfAid 사용시 마나10 소모해 HP풀회복")
//    void selfAid() {
//        final int initialHp = 5;
//        final int initialMp = 10;
//
//        Cleric cleric = new Cleric("Arthas");
//        cleric.hp = initialHp;
//        cleric.mp = initialMp;
//
//        cleric.selfAid();
//
//        assertEquals(Cleric.maxHp, cleric.hp);
//        assertEquals(initialMp - cleric.selfAidMpCost, cleric.mp);
//    }
//
