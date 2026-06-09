package com.survivalcoding;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClericTest {

    @Test
    void main() {


        Cleric cleric1 = new Cleric("아서스", 40, 5);

        System.out.println(cleric1.name + " " + cleric1.hp + " " + cleric1.mp);
        assertEquals("아서스", cleric1.name);
        assertEquals(40, cleric1.hp);
        assertEquals(5, cleric1.mp);

        Cleric cleric2 = new Cleric("아서스", 35);

        System.out.println(cleric2.name + " " + cleric2.hp + " " + cleric2.mp);
        assertEquals("아서스", cleric2.name);
        assertEquals(35, cleric2.hp);
        assertEquals(10, cleric2.mp);

        Cleric cleric3 = new Cleric("아서스");

        System.out.println(cleric3.name + " " + cleric3.hp + " " + cleric3.mp);
        assertEquals("아서스", cleric3.name);
        assertEquals(50, cleric3.hp);
        assertEquals(10, cleric3.mp);
    }


//    void selfAid() {
//        // given
//        final int MAX_HP = 50;
//        final int MAX_MP = 10;
//        int hp = 9;
//        // when
//        selfAid();
//        //then
//        assertEquals(14, hp);
//
//    }
//
//    @Test
//    void pray() {
//        // given
//        int prayTime = 3;
//        int result;
//
//        // when
//        //result = pray(prayTime);
//        //then
//        //assert(result >= 1 && result <= 6);
//
//    }
}
