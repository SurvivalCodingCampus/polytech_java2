package com.survivalcoding;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PoisonSlimeTest {
    private Hero hero;
    private PoisonSlime poisonSlime;
    private int HP = 200;

    @BeforeEach
    void Every() {
        hero = new Hero();
        hero.setHp(HP);
        poisonSlime = new PoisonSlime("A");
    }

    @Test
    @DisplayName("기본 공격 + Poison 1번 공격")
    void Attack() {
        poisonSlime.attack(hero);
        assertEquals(152, hero.getHp());
    }


    @Test
    @DisplayName("poisonCount가 0이 되어야 한다.")
    void Count() {
        for (int i = 0; i < 5; i++) {
            poisonSlime.attack(hero);
        }

        assertEquals(0, poisonSlime.getPoisonCount());
    }
}