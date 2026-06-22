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
    @DisplayName("초기 마나는 100이 되어야 한다")
    void baseMp() {
        Wizard wizard = new Wizard();

        assertEquals(100, wizard.getMp());
    }

    @Test
    @DisplayName("heal 쓰면 mp10을 소모하고 hp가 20을 회복시켜야 한다")
    void heal() {
        int baseHp = 30;
        int baseMp1 = 10;
        int baseMp2 = 9;
        int testMp = 10;
        int baseHeal = 20;


        //Given
        Wizard wizard = new Wizard();
        Hero hero = new Hero();
        hero.setHp(baseHp);


        //When
        wizard.setMp(baseMp1);
        wizard.heal(hero);
        //Then

        assertEquals(baseHp + baseHeal, hero.getHp());
        assertEquals(baseMp1 - testMp, wizard.getMp(), "힐을 시전했습니다.");

        wizard.setMp(baseMp2);
        wizard.heal(hero);
    }
}