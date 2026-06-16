package com.survivalcoding;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HeroTest {

    @Test
    @DisplayName("공격 하면 hp가 1씩 감소")
        //("체력이 1식 감소 하는지 테스트")
    void attack() {
        //given 준비
        Hero hero = new Hero();
        Hero hero1 = new Hero("홍길동");
        //when 실행
        hero.hp = 10;
        hero.attack(); //9
        hero.attack(); //8

        // then (검증)
        assertEquals(9, hero.hp);    // 9

        hero.attack();  // 8

        // then (검증)
        assertEquals(8, hero.hp);    // 8
    }
}