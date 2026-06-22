package com.survivalcoding;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WizardTest {

//    @Test
//    @DisplayName("Heal은 지팡이의 power 계수만큼 회복")
//    void heal() {
//        Wizard wizard = new Wizard();
//
//        Wand wand = new Wand();
//        wand.setName("기다란완드");
//        wand.setPower(1.0);
//
//        wizard.setWand(wand);
//
//        Hero hero = new Hero();
//        hero.setHp(30);
//
//        wizard.heal(hero);
//
//        assertEquals(40, hero.getHp());
//    }
//
//    @Test
//    @DisplayName("Wizard Hp Getter / Setter")
//    void getHp() {
//        Wizard wizard = new Wizard();
//
//        wizard.setHp(30);
//
//        assertEquals(30, wizard.getHp());
//    }
//
//    @Test
//    @DisplayName("Wizard Mp Getter / Setter")
//    void getMp() {
//        Wizard wizard = new Wizard();
//
//        wizard.setMp(5);
//
//        assertEquals(5, wizard.getMp());
//    }
//
//    @Test
//    @DisplayName("Wizard Name")
//    void getName() {
//        Wizard wizard = new Wizard();
//
//        wizard.setName("마법사");
//
//        assertEquals("마법사", wizard.getName());
//    }
//
//
//    @Test
//    @DisplayName("Wand 상세정보")
//    void getWand() {
//        Wizard wizard = new Wizard();
//
//        Wand wand = new Wand();
//        wand.setName("기다란완드");
//        wand.setPower(2.0);
//
//        wizard.setWand(wand);
//
//        assertSame(wand, wizard.getWand());
//    }
//
//    @Test
//    @DisplayName("마법사 이름은 null일 수 없다")
//    void setName_null() {
//        Wizard wizard = new Wizard();
//
//        assertThrows(IllegalArgumentException.class, () -> {
//            wizard.setName(null);
//        });
//    }
//
//    @Test
//    @DisplayName("마법사 이름은 3문자 이상이어야 한다")
//    void setName_under3Characters() {
//        Wizard wizard = new Wizard();
//
//        assertThrows(IllegalArgumentException.class, () -> {
//            wizard.setName("ab");
//        });
//    }
//
//    @Test
//    @DisplayName("마법사의 지팡이는 null일 수 없다")
//    void setWand_null() {
//        Wizard wizard = new Wizard();
//
//        assertThrows(IllegalArgumentException.class, () -> {
//            wizard.setWand(null);
//        });
//    }
//
//    @Test
//    @DisplayName("마법사의 MP는 0 미만일 수 없다")
//    void setMp_negative() {
//        Wizard wizard = new Wizard();
//
//        assertThrows(IllegalArgumentException.class, () -> {
//            wizard.setMp(-1);
//        });
//    }
//
//    @Test
//    @DisplayName("마법사의 HP가 음수이면 0으로 설정된다")
//    void setHp_negativeBecomesZero() {
//        Wizard wizard = new Wizard();
//
//        wizard.setHp(-10);
//
//        assertEquals(0, wizard.getHp());
//    }
    @Test
    @DisplayName("마법사의 MP 초기값이 100인지 확인")
    void wizardInitialMpTest() {
        Wizard wizard = new Wizard();

        assertEquals(100, wizard.getMp());
    }

        @Test
        @DisplayName("힐을 사용하면 용사 HP가 20 회복되고 마법사 MP가 10 줄어드는지 확인")
        void healSuccessTest() {
            Wizard wizard = new Wizard();

            Hero hero = new Hero();
            hero.setHp(100);

            wizard.heal(hero);

            assertEquals(120, hero.getHp());
            assertEquals(90, wizard.getMp());
        }

        @Test
        @DisplayName("힐 성공했을 때 출력문이 잘 나오는지 확인")
        void healSuccessPrintTest() {
            Wizard wizard = new Wizard();

            Hero hero = new Hero();
            hero.setHp(100);

            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            PrintStream originalOut = System.out;
            System.setOut(new PrintStream(outputStream));

            wizard.heal(hero);

            System.setOut(originalOut);

            String output = outputStream.toString();

            assertTrue(output.contains("힐을 시전했습니다. 대상 HP: 120"));
        }

        @Test
        @DisplayName("MP가 부족하면 힐이 안 되고 마나 부족 메시지가 나오는지 확인")
        void healFailByLackOfMpTest() {
            Wizard wizard = new Wizard();
            wizard.setMp(5);

            Hero hero = new Hero();
            hero.setHp(100);

            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            PrintStream originalOut = System.out;
            System.setOut(new PrintStream(outputStream));

            wizard.heal(hero);

            System.setOut(originalOut);

            String output = outputStream.toString();

            assertEquals(100, hero.getHp());
            assertEquals(5, wizard.getMp());
            assertTrue(output.contains("마나가 부족합니다"));
        }

        @Test
        @DisplayName("MP가 딱 10일 때 힐이 되는지 확인")
        void healWhenMpIsExactlyTenTest() {
            Wizard wizard = new Wizard();
            wizard.setMp(10);

            Hero hero = new Hero();
            hero.setHp(50);

            wizard.heal(hero);

            assertEquals(70, hero.getHp());
            assertEquals(0, wizard.getMp());
        }
}