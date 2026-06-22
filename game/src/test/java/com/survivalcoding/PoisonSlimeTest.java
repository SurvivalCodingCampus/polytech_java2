package com.survivalcoding;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class PoisonSlimeTest {
    //public static void main(String[] args) {

    //용사 생성 (ram 메모리에 용사 데이터 올리기)
    @Test
    @DisplayName("독슬라임 독 공격 테스트")
    void test() {
        //given
        Hero hero = new Hero();
        PoisonSlime slimeA = new PoisonSlime("A");
        //when
        for (int i = 0; i < 10; i++) {
            slimeA.poisonSlimeAttack(hero);
        }
        //then
        assertTrue(hero.getHp() < 1000 - (10 * 10));
    }
}