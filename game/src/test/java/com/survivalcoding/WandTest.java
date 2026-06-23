//캡슐, 컬렉션
package com.survivalcoding;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WandTest {

    @Test
    void wand() {
        Wand wand = new Wand();
        wand.setName("홍길홍길지팡이");
        wand.setWandPower(50.0);
        wand.setMp(10);
        wand.setHp(-30);

        assertEquals("홍길홍길지팡이", wand.getName());
        assertEquals(50.0, wand.getWandPower());
        assertEquals(10, wand.getMp());
        assertEquals(-30, wand.getHp());
    }
}