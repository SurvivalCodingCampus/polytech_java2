package com.survivalcoding;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PoisonSlimeTest {

    @Test
    @DisplayName("PoisonSlime은 Slime을 상속받는다")
    void poisonSlimeIsSlime() {
        PoisonSlime poisonSlime = new PoisonSlime("A");

        assertInstanceOf(Slime.class, poisonSlime);
    }

    @Test
    @DisplayName("PoisonSlime은 suffix를 받아 생성되고 poisonCount 초기값은 5이다")
    void poisonSlimeConstructorTest() {
        PoisonSlime poisonSlime = new PoisonSlime("A");

        assertEquals("A", poisonSlime.getSuffix());
        assertEquals(5, poisonSlime.getPoisonCount());
    }

    @Test
    @DisplayName("PoisonSlime은 일반 공격 후 독 공격을 한다")
    void poisonSlimeAttackTest() {
        PoisonSlime poisonSlime = new PoisonSlime("A");

        Hero hero = new Hero();
        hero.setHp(100);

        poisonSlime.attack(hero);

        assertEquals(72, hero.getHp());
        assertEquals(4, poisonSlime.getPoisonCount());
    }

    @Test
    @DisplayName("독 데미지는 소수점 이하를 버린다")
    void poisonDamageFloorTest() {
        PoisonSlime poisonSlime = new PoisonSlime("A");

        Hero hero = new Hero();
        hero.setHp(83);

        poisonSlime.attack(hero);

        assertEquals(59, hero.getHp());
        assertEquals(4, poisonSlime.getPoisonCount());
    }

    @Test
    @DisplayName("독 공격은 poisonCount가 남아있을 때만 실행된다")
    void poisonAttackLimitTest() {
        PoisonSlime poisonSlime = new PoisonSlime("A");

        Hero hero = new Hero();
        hero.setHp(1000);

        poisonSlime.attack(hero);
        poisonSlime.attack(hero);
        poisonSlime.attack(hero);
        poisonSlime.attack(hero);
        poisonSlime.attack(hero);

        assertEquals(0, poisonSlime.getPoisonCount());

        int beforeHp = hero.getHp();

        poisonSlime.attack(hero);

        assertEquals(beforeHp - 10, hero.getHp());
        assertEquals(0, poisonSlime.getPoisonCount());
    }
}