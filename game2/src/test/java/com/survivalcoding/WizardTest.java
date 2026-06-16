package com.survivalcoding;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class WizardTest {

    @Test
    @DisplayName("HP가 0보다 작을 때 0이 되어야 한다")
    void setHp() {
        int test = -1;
        //Given
        Wizard wizard = new Wizard();

        //When
        wizard.setHp(test);

        //Then
        assertEquals(0, wizard.getHp(), "HP가 0이 되었습니다.");
    }

    @Test
    @DisplayName("마법사의 MP는 0 이상이여야 한다")
    void setMp() {
        int test = -1;
        //Given
        Wizard wizard = new Wizard();

        //Then
        assertThrows(IllegalArgumentException.class, () -> {
            wizard.setMp(test);
        });
    }

    @Test
    @DisplayName("마법사의 이름은 null이 아니거나 3문자 이상이어야 한다.")
    void setName() {
        String test = "H";
        String test2 = null;

        //Given
        Wizard wizard = new Wizard();

        //Then
        assertThrows(IllegalArgumentException.class, () -> {
            wizard.setName(test);
        });

        assertThrows(IllegalArgumentException.class, () -> {
            wizard.setName(test2);
        });
    }

    @Test
    @DisplayName("마법사의 지팡이는 null 일 수 없다.")
    void setWand() {
        Wand test = null;

        //Given
        Wizard wizard = new Wizard();

        //Then

        assertThrows(IllegalArgumentException.class, () -> {
            wizard.setWand(test);
        });
    }

    @Test
    @DisplayName("heal 쓰면 지팡이의 마력만큼 HP가 회복되어야 한다")
    void heal() {
        double test = 1.5;
        int test2 = 10;
        int test3 = 30;


        //Given
        Wizard wizard = new Wizard();
        Wand wand = new Wand();
        Hero hero = new Hero();
        wand.setPower(test);
        int basePoint = test2;
        hero.setHp(test3);
        wizard.setWand(wand);

        //When
        wizard.heal(hero);
        //Then
        assertEquals(test * test2 + test3, hero.getHp());

    }
}