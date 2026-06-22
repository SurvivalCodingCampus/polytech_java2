package com.survivalcoding.day260616;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreatWizardTest {
    private static final int INITIAL_GREAT_WIZARD_MP = 150;

    private static final int HERO_INITIAL_HP = 50;
    private static final int HEAL_POINT = 25;
    private static final int HEAL_MP_COST = 5;
    private static final int EXPECTED_HP_AFTER_HEAL = HERO_INITIAL_HP + HEAL_POINT;
    private static final int EXPECTED_MP_AFTER_HEAL = INITIAL_GREAT_WIZARD_MP - HEAL_MP_COST;

    private static final int HERO_DAMAGED_HP = 30;
    private static final int SUPER_HEAL_MP_COST = 50;
    private static final int EXPECTED_MP_AFTER_SUPER_HEAL = INITIAL_GREAT_WIZARD_MP - SUPER_HEAL_MP_COST;

    private static final int INSUFFICIENT_MP_FOR_HEAL = HEAL_MP_COST - 1;
    private static final int INSUFFICIENT_MP_FOR_SUPER_HEAL = SUPER_HEAL_MP_COST - 1;

    private GreatWizard greatWizard;
    private Hero hero;

    @BeforeEach
    void setUp() {
        greatWizard = new GreatWizard();
        hero = new Hero();
    }

    @Test
    @DisplayName("오버라이딩된 heal은 용사의 HP를 25 회복하고 MP를 5 소비한다")
    void healRecoversHeroHpAndConsumesMp() {

        hero.setHp(HERO_INITIAL_HP);

        greatWizard.heal(hero);

        assertEquals(EXPECTED_HP_AFTER_HEAL, hero.getHp());
        assertEquals(EXPECTED_MP_AFTER_HEAL, greatWizard.getMp());
    }

    @Test
    @DisplayName("superHeal은 용사의 HP를 최대 HP까지 회복하고 MP를 50 소비한다")
    void superHealRecoversHeroHpToMaxHpAndConsumesMp() {

        hero.setHp(HERO_DAMAGED_HP);
        int expectedHeroHp = hero.getMaxHp();

        greatWizard.superHeal(hero);

        assertEquals(expectedHeroHp, hero.getHp());
        assertEquals(EXPECTED_MP_AFTER_SUPER_HEAL, greatWizard.getMp());
    }

    @Test
    @DisplayName("heal은 MP가 부족하면 HP와 MP를 변경하지 않는다")
    void healDoesNotChangeHpAndMpWhenMpIsNotEnough() {

        hero.setHp(HERO_INITIAL_HP);
        greatWizard.setMp(INSUFFICIENT_MP_FOR_HEAL);

        greatWizard.heal(hero);

        assertEquals(HERO_INITIAL_HP, hero.getHp());
        assertEquals(INSUFFICIENT_MP_FOR_HEAL, greatWizard.getMp());
    }

    @Test
    @DisplayName("superHeal은 MP가 부족하면 HP와 MP를 변경하지 않는다")
    void superHealDoesNotChangeHpAndMpWhenMpIsNotEnough() {

        hero.setHp(HERO_DAMAGED_HP);
        greatWizard.setMp(INSUFFICIENT_MP_FOR_SUPER_HEAL);

        greatWizard.superHeal(hero);

        assertEquals(HERO_DAMAGED_HP, hero.getHp());
        assertEquals(INSUFFICIENT_MP_FOR_SUPER_HEAL, greatWizard.getMp());
    }
}