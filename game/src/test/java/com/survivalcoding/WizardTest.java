package com.survivalcoding;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WizardTest {

    @Test
    @DisplayName("get,set,TNI Test")
    void WizardTest_() {
        //준비
        Wizard wizard = new Wizard();
        Wand wand = new Wand();
        int power = 1;
        int hp = 2;
        int mp = 3;
        String WName = "홍길순";
        String WiName = "홍길동";

        //실행
        wand.setName(WName);
        wand.setPower(power);
        wizard.setHp(hp);
        wizard.setMp(mp);
        wizard.setName(WiName);
        wizard.setWand(wand);

        //검증
        assertEquals(WName, wand.getName());
        assertEquals(power, wand.getPower());
        assertEquals(hp, wizard.getHp());
        assertEquals(mp, wizard.getMp());
        assertEquals(WiName, wizard.getName());
        assertEquals(wand, wizard.getWand());

    }
}