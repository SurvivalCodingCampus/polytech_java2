package com.survivalcoding;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WandTest {
    @Test
    @DisplayName("마법사 테스트")
    void test() {
        //given
        Hero hero = new Hero();
        GreatWizard greatWizard = new GreatWizard(150);
        //when 1
        for (int i = 0; i < 5; i++) {
            greatWizard.heal(hero);
        }
        //then 1
        assertEquals(225, hero.getHp());
        //when 2
        greatWizard.superHeal(hero);
        //then 2
        assertEquals(100, hero.getHp());
    }

}