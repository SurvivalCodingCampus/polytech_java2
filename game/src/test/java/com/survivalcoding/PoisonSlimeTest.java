package com.survivalcoding;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PoisonSlimeTest {

    @Test
    void attack() {
        Hero h = new Hero(100);
        PoisonSlime ps = new PoisonSlime("홍길홍길");
        ps.attack(h);
        assertEquals(72, h.getHp());
        System.out.println("==========================");
    }
}