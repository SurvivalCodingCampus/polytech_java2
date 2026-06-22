package com.survivalcoding;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GreatWizardTest {

    @Test
    void heal() {
        //준비
        String name = "홍홍홍";
        int hp = 10;
        Hero hero = new Hero(name, hp);
        GreatWizard greatWizard = new GreatWizard();
        //실행
        greatWizard.heal(hero);
        //검증
        assertEquals(hp + 25, hero.getHP());
        assertEquals(145, greatWizard.getMp());
    }

    @Test
    void superHeal() {
        //준비
        String name = "홍홍홍";
        int hp = 10;
        Hero hero = new Hero(name, hp);
        GreatWizard greatWizard = new GreatWizard();
        //실행
        greatWizard.superHeal(hero);
        //검증
        assertEquals(hero.getMaxHP(), hero.getHP());
        assertEquals(100, greatWizard.getMp());
    }
}