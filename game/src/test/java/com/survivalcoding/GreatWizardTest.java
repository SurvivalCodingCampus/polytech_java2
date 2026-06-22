package com.survivalcoding;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GreatWizardTest {
    private Hero hero;
    private Wizard wizard;
    private GreatWizard greatWizard;
    private int WHP = 100;
    private int WMP = 100;
    private int GHP = 200;
    private int GMP = 150;

    @BeforeEach
    void Every() {
        hero = new Hero("유해진", WHP);
        wizard = new Wizard("마법사", WHP, WMP);
        greatWizard = new GreatWizard("위대한마법사", GHP, GMP);
    }

    @Test
    @DisplayName("Wizard heal에 따른 마나 감소와 Hero 체력 증가")
    void wizradHeal() {
        wizard.heal(hero);
        assertEquals(90, wizard.getMp());
        assertEquals(120, hero.getHp());

        for (int i = 0; i < 10; i++) {
            wizard.heal(hero);
        }
        assertEquals(0, wizard.getMp());
        assertEquals(300, hero.getHp());
    }

    @Test
    @DisplayName("GreatWizard Heal에 따른 마나 감소와 Hero 체력 증가")
    void greatWizardHeal() {
        greatWizard.heal(hero);
        assertEquals(145, greatWizard.getMp());
        assertEquals(125, hero.getHp());

        greatWizard.superHeal(hero);
        assertEquals(95, greatWizard.getMp());
        assertEquals(300, hero.getHp());
    }
}