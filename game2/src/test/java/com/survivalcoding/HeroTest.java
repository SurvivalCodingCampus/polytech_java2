package com.survivalcoding;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HeroTest {

    @Test
    @DisplayName("공격하면 내 hp가 줄어든다")
    void attack() {
        Hero hero = new Hero();

        hero.getHp();
        hero.attack();
        hero.attack();

        assertEquals(8, hero.getHp());
    }

}