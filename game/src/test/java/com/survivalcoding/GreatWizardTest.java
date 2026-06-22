package com.survivalcoding;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class GreatWizardTest {

    @Test
    @DisplayName("GreatWizard가 Wizard를 상속받는지 확인")
    void greatWizardIsWizardTest() {
        GreatWizard greatWizard = new GreatWizard();

        assertTrue(greatWizard instanceof Wizard);
    }

    @Test
    @DisplayName("GreatWizard의 MP 초기값이 150인지 확인")
    void greatWizardInitialMpTest() {
        GreatWizard greatWizard = new GreatWizard();

        assertEquals(150, greatWizard.getMp());
    }

    @Test
    @DisplayName("heal을 사용하면 HP가 25 회복되고 MP가 5 줄어드는지 확인")
    void healSuccessTest() {
        GreatWizard greatWizard = new GreatWizard();

        Hero hero = new Hero();
        hero.setHp(100);

        greatWizard.heal(hero);

        assertEquals(125, hero.getHp());
        assertEquals(145, greatWizard.getMp());
    }

    @Test
    @DisplayName("superHeal을 사용하면 HP가 최대로 회복되고 MP가 50 줄어드는지 확인")
    void superHealSuccessTest() {
        GreatWizard greatWizard = new GreatWizard();

        Hero hero = new Hero();
        hero.setHp(30);

        greatWizard.superHeal(hero);

        assertEquals(100, hero.getHp());
        assertEquals(100, greatWizard.getMp());
    }

    @Test
    @DisplayName("superHeal 성공했을 때 출력문이 잘 나오는지 확인")
    void superHealPrintTest() {
        GreatWizard greatWizard = new GreatWizard();

        Hero hero = new Hero();
        hero.setHp(30);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        greatWizard.superHeal(hero);

        System.setOut(originalOut);

        String output = outputStream.toString();

        assertTrue(output.contains("슈퍼 힐을 시전했습니다. 대상 HP: 100"));
    }

    @Test
    @DisplayName("MP가 부족하면 heal이 안 되고 마나 부족 메시지가 나오는지 확인")
    void healFailByLackOfMpTest() {
        GreatWizard greatWizard = new GreatWizard();
        greatWizard.setMp(4);

        Hero hero = new Hero();
        hero.setHp(100);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        greatWizard.heal(hero);

        System.setOut(originalOut);

        String output = outputStream.toString();

        assertEquals(100, hero.getHp());
        assertEquals(4, greatWizard.getMp());
        assertTrue(output.contains("마나가 부족합니다"));
    }

    @Test
    @DisplayName("MP가 부족하면 superHeal이 안 되고 마나 부족 메시지가 나오는지 확인")
    void superHealFailByLackOfMpTest() {
        GreatWizard greatWizard = new GreatWizard();
        greatWizard.setMp(49);

        Hero hero = new Hero();
        hero.setHp(30);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        greatWizard.superHeal(hero);

        System.setOut(originalOut);

        String output = outputStream.toString();

        assertEquals(30, hero.getHp());
        assertEquals(49, greatWizard.getMp());
        assertTrue(output.contains("마나가 부족합니다"));
    }
}