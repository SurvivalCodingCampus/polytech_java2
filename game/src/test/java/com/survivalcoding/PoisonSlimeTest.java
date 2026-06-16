package com.survivalcoding;

import org.junit.jupiter.api.Test;

class PoisonSlimeTest {

    @Test
    void attack() {
        Hero h = new Hero(100);
        PoisonSlime ps = new PoisonSlime("홍길홍길");
        ps.attack(h);
        System.out.println("--------------------------");
        System.out.println("남은 HP : " + h.getHp());
        System.out.println("==========================");
    }
}