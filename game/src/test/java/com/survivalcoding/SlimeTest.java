package com.survivalcoding;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SlimeTest {

    @Test
    @DisplayName("Slime은 suffix를 받아 생성된다")
    void slimeConstructorTest() {
        Slime slime = new Slime("A");

        assertEquals("A", slime.getSuffix());
        assertEquals(50, slime.getHp());
    }

    @Test
    @DisplayName("Slime이 공격하면 용사의 HP가 10 감소한다")
    void slimeAttackTest() {
        Slime slime = new Slime("A");

        Hero hero = new Hero();
        hero.setHp(100);

        slime.attack(hero);

        assertEquals(90, hero.getHp());
    }
}