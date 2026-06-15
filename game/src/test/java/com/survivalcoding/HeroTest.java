package com.survivalcoding;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class HeroTest {
    @Test
    @DisplayName("이름은 2이상이어야 한다")
    void setName() {
        Hero hero = new Hero();
        assertThrows(IllegalArgumentException.class, () -> {
            hero.setName("1");
        });
    }

    @Test
    @DisplayName("공격하면 내 hp 가 1씩 빠진다")
    void attack() {
        // given (준비)
        Hero hero = new Hero();

        // when (실행)
        hero.hp = 10;
        hero.attack();  // 9

        // then (검증)
        assertEquals(9, hero.hp);    // 9

        hero.attack();  // 8

        // then (검증)
        assertEquals(8, hero.hp);    // 8
    }
}