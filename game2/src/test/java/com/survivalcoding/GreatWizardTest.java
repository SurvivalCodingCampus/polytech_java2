package com.survivalcoding;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class GreatWizardTest {

    @Test
    @DisplayName("GreatWizard 초기 MP는 150이어야 한다")
    void getMp() {
        GreatWizard greatWizard = new GreatWizard();

        assertEquals(150, greatWizard.getMp());
    }

    @Test
    @DisplayName("GreatWizard는 MP5를 소비하여 HP 25를 회복해야 한다.")
    void heal() {
        int baseHp = 30;
        int baseMp1 = 5;
        int baseMp2 = 4;
        int testMp = 5;
        int baseHeal = 25;


        //Given
        GreatWizard greatwizard = new GreatWizard();
        Hero hero = new Hero();
        hero.setHp(baseHp);


        //When
        greatwizard.setMp(baseMp1);
        greatwizard.heal(hero);
        //Then

        assertEquals(baseHp + baseHeal, hero.getHp());
        assertEquals(baseMp1 - testMp, greatwizard.getMp(), "힐을 시전했습니다.");

        greatwizard.setMp(baseMp2);
        greatwizard.heal(hero);
    }

    @Test
    @DisplayName("슈퍼힐을 시전하면 HP가 최대값이 되고 MP를 50소모되어야 한다")
    void superHeal() {
        int basePoint = 100; //히어로 클래스 히어로 체력 100설정
        int baseMp = 50;
        int baseMp2 = 49;
        int testHp = 30;
        int testMp = 50;


        //Given
        Hero hero = new Hero();
        GreatWizard greatWizard = new GreatWizard();
        hero.setHp(testHp);

        greatWizard.setMp(baseMp);
        greatWizard.superHeal(hero);

        assertEquals(basePoint, hero.getHp());
        assertEquals(baseMp - testMp, greatWizard.getMp(), "슈퍼 힐을 시전했습니다.");

        greatWizard.setMp(baseMp2);
        greatWizard.superHeal(hero);

    }
}