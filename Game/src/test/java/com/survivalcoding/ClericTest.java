package com.survivalcoding;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClericTest {
    @Test
    @DisplayName("생성자 조건1")
    void Cleric1() {

        //given
        final String name = "아서스";
        final int hp = 40;
        final int mp = 5;

        //when
        Cleric cleric1 = new Cleric(name, hp, mp);

        //then
        assertEquals(name, cleric1.name);
        assertEquals(hp, cleric1.hp);
        assertEquals(mp, cleric1.mp);
    }

    @Test
    @DisplayName("생성자 조건2")
    void Cleric2() {

        //given
        final String name = "아서스";
        final int hp = 35;
        final int mp = Cleric.MAX_MP;

        //when
        Cleric cleric1 = new Cleric(name, hp);

        //then
        assertEquals(name, cleric1.name);
        assertEquals(hp, cleric1.hp);
        assertEquals(mp, cleric1.mp);
    }

    @Test
    @DisplayName("생성자 조건3")
    void Cleric3() {

        //given
        final String name = "아서스";
        final int hp = Cleric.MAX_HP;
        final int mp = Cleric.MAX_MP;

        //when
        Cleric cleric1 = new Cleric(name);

        //then
        assertEquals(name, cleric1.name);
        assertEquals(hp, cleric1.hp);
        assertEquals(mp, cleric1.mp);
    }
   /* @Test
    void selfAid() {
        // given
        Cleric cleric6 = new Cleric(); //인스턴스 만들기
        cleric.hp = 10;
        cleric.mp = 10;

        // when
        cleric.selfAid();

        // then
        assertEquals(50, cleric.hp);
        assertEquals(5, cleric.mp);


    }

    @Test
    void pray() {
        //given
        Cleric cleric = new Cleric();
        cleric.mp = 5;

        //when
        int result = cleric.pray(3);

        // then
        assertTrue(result >= 3 && result <= 5);
        assertTrue(cleric.mp >= 8 && cleric.mp <= 10);
    }*/
}
