package com.survivalcoding.day260616;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PoisonSlimeTest {
    private static final String POISON_SLIME_NAME = "A";

    private static final int HERO_INITIAL_HP = 100;
    private static final int SLIME_ATTACK_DAMAGE = 10;
    private static final int POISON_DAMAGE_DIVISOR = 5;

    private static final int HERO_HP_AFTER_NORMAL_ATTACK = HERO_INITIAL_HP - SLIME_ATTACK_DAMAGE;
    private static final int EXPECTED_POISON_DAMAGE = HERO_HP_AFTER_NORMAL_ATTACK / POISON_DAMAGE_DIVISOR;
    private static final int EXPECTED_HERO_HP_AFTER_POISON_ATTACK =
            HERO_HP_AFTER_NORMAL_ATTACK - EXPECTED_POISON_DAMAGE;

    @Test
    @DisplayName("PoisonSlime의 attack은 일반 공격 후 독 데미지를 추가로 준다")
    void attackDealsNormalDamageAndPoisonDamage() {
        PoisonSlime poisonSlime = new PoisonSlime(POISON_SLIME_NAME);
        Hero hero = new Hero();

        hero.setHp(HERO_INITIAL_HP);

        poisonSlime.attack(hero);

        assertEquals(EXPECTED_HERO_HP_AFTER_POISON_ATTACK, hero.getHp());
    }
}