package com.survivalcoding;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GameTest {

    private Hero targetHero;
    private Wizard wizard;
    private GreatWizard greatWizard;

    @BeforeEach
    void setUp() {
        targetHero = new Hero("전사", 50, 100);
        wizard = new Wizard("일반법사", 50, 50, 30, 50);
        greatWizard = new GreatWizard("대법사", 60, 60, 60, 100);
    }

    @Test
    @DisplayName("일반 마법사가 힐을 하면 대상의 HP가 20 오르고 마나가 10 깎여야 한다")
    void wizardHealTest() {
        wizard.heal(targetHero);

        assertEquals(70, targetHero.getHp(), "전사의 HP는 50에서 20이 더해져 70이 되어야 합니다.");
    }

    @Test
    @DisplayName("대마법사가 슈퍼힐을 쓰면 대상의 HP가 최대치로 차고 마나가 50 깎여야 한다")
    void greatWizardSuperHealTest() {
        greatWizard.SuperHeal(targetHero);

        assertEquals(100, targetHero.getHp(), "슈퍼 힐을 받으면 최대 체력인 100이 되어야 합니다.");
    }

    @Test
    @DisplayName("마나가 부족하면 힐이 나가지 않고 체력도 그대로여야 한다")
    void outOfManaTest() {
        Wizard oomWizard = new Wizard("마나없는법사", 50, 50, 5, 50);

        oomWizard.heal(targetHero);

        assertEquals(50, targetHero.getHp(), "마나가 부족하므로 타겟의 HP는 변하면 안 됩니다.");
    }

    @Test
    @DisplayName("체력을 치유했을 때 최대 체력(MaxHP)을 초과할 수 없다")
    void hpNotOverMaxHpTest() {
        Hero highHpHero = new Hero("피통전사", 90, 100);

        wizard.heal(highHpHero);

        assertEquals(100, highHpHero.getHp(), "치유량의 총합이 MaxHP를 넘어가면 MaxHP로 고정되어야 합니다.");
    }
}