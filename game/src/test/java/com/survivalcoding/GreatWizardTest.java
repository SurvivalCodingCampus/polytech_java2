package com.survivalcoding;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GreatWizardTest {
    private Wizard wizard;
    private GreatWizard greatWizard;
    private int WHP = 100;
    private int WMP = 100;
    private int GHP = 200;
    private int GMP = 150;

    @BeforeEach
    void Every() {
        wizard = new Wizard("마법사", WHP, WMP);
        greatWizard = new GreatWizard("위대한마법사", GHP, GMP);
    }

    @Test
    @DisplayName("Wizard heal에 따른 마나 감소와 체력 증가")
    void wizradHeal() {
        wizard.heal();
        assertEquals(90, wizard.getMp());
        assertEquals(120, wizard.getHp());

        for (int i = 0; i < 10; i++) {
            wizard.heal();
        }
        assertEquals(0, wizard.getMp());
        assertEquals(300, wizard.getHp());
    }

    @Test
    @DisplayName("GreatWizard Heal 계산")
    void greatWizardHeal() {
        greatWizard.heal();
        assertEquals(145, greatWizard.getMp());
        assertEquals(225, greatWizard.getHp());

        greatWizard.superHeal();
        assertEquals(95, greatWizard.getMp());
        assertEquals(300, greatWizard.getHp());
    }
}