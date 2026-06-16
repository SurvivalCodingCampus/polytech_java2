package com.survivalcoding;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WizardTest {
    private static final String VALID_WIZARD_NAME = "Merlin";
    private static final String SHORT_WIZARD_NAME = "W";
    private static final String NULL_WIZARD_NAME = null;

    private static final int VALID_HP = 100;
    private static final int NEGATIVE_HP = -10;
    private static final int ZERO_HP = 0;

    private static final int VALID_MP = 50;
    private static final int NEGATIVE_MP = -1;

    private static final int HERO_INITIAL_HP = 100;
    private static final int HEAL_BASE_POINT = 10;
    private static final double WAND_POWER = 2.0;
    private static final int EXPECTED_HEAL_POINT = (int) (HEAL_BASE_POINT * WAND_POWER);
    private static final int EXPECTED_HERO_HP = HERO_INITIAL_HP + EXPECTED_HEAL_POINT;

    @Test
    @DisplayName("마법사의 HP를 조회한다")
    void getHpReturnsHp() {
        Wizard wizard = new Wizard();

        wizard.setHp(VALID_HP);

        assertEquals(VALID_HP, wizard.getHp());
    }

    @Test
    @DisplayName("마법사의 HP를 설정한다")
    void setHpSetsHp() {
        Wizard wizard = new Wizard();

        wizard.setHp(VALID_HP);

        assertEquals(VALID_HP, wizard.getHp());
    }

    @Test
    @DisplayName("마법사의 HP가 음수이면 0으로 설정된다")
    void setHpSetsZeroWhenHpIsNegative() {
        Wizard wizard = new Wizard();

        wizard.setHp(NEGATIVE_HP);

        assertEquals(ZERO_HP, wizard.getHp());
    }

    @Test
    @DisplayName("fireball 메서드는 예외 없이 실행된다")
    void fireballDoesNotThrowException() {
        Wizard wizard = new Wizard();
        Hero hero = new Hero();

        assertDoesNotThrow(() -> wizard.fireball(hero));
    }

    @Test
    @DisplayName("heal 메서드는 지팡이 마력에 따라 용사의 HP를 회복한다")
    void healRecoversHeroHp() {
        Wizard wizard = new Wizard();
        Wand wand = new Wand();
        Hero hero = new Hero();

        wand.setPower(WAND_POWER);
        wizard.setWand(wand);
        hero.setHp(HERO_INITIAL_HP);

        wizard.heal(hero);

        assertEquals(EXPECTED_HERO_HP, hero.getHp());
    }

    @Test
    @DisplayName("마법사의 이름을 조회한다")
    void getNameReturnsName() {
        Wizard wizard = new Wizard();

        wizard.setName(VALID_WIZARD_NAME);

        assertEquals(VALID_WIZARD_NAME, wizard.getName());
    }

    @Test
    @DisplayName("마법사의 이름을 설정한다")
    void setNameSetsName() {
        Wizard wizard = new Wizard();

        assertDoesNotThrow(() -> wizard.setName(VALID_WIZARD_NAME));
        assertEquals(VALID_WIZARD_NAME, wizard.getName());
    }

    @Test
    @DisplayName("마법사 이름이 null이면 예외가 발생한다")
    void setNameThrowsExceptionWhenNameIsNull() {
        Wizard wizard = new Wizard();

        assertThrows(
                IllegalArgumentException.class,
                () -> wizard.setName(NULL_WIZARD_NAME)
        );
    }

    @Test
    @DisplayName("마법사 이름이 3문자 미만이면 예외가 발생한다")
    void setNameThrowsExceptionWhenNameIsTooShort() {
        Wizard wizard = new Wizard();

        assertThrows(
                IllegalArgumentException.class,
                () -> wizard.setName(SHORT_WIZARD_NAME)
        );
    }

    @Test
    @DisplayName("마법사의 지팡이를 조회한다")
    void getWandReturnsWand() {
        Wizard wizard = new Wizard();
        Wand wand = new Wand();

        wizard.setWand(wand);

        assertSame(wand, wizard.getWand());
    }

    @Test
    @DisplayName("마법사의 지팡이를 설정한다")
    void setWandSetsWand() {
        Wizard wizard = new Wizard();
        Wand wand = new Wand();

        assertDoesNotThrow(() -> wizard.setWand(wand));
        assertSame(wand, wizard.getWand());
    }

    @Test
    @DisplayName("마법사의 지팡이가 null이면 예외가 발생한다")
    void setWandThrowsExceptionWhenWandIsNull() {
        Wizard wizard = new Wizard();

        assertThrows(
                IllegalArgumentException.class,
                () -> wizard.setWand(null)
        );
    }

    @Test
    @DisplayName("마법사의 MP를 조회한다")
    void getMpReturnsMp() {
        Wizard wizard = new Wizard();

        wizard.setMp(VALID_MP);

        assertEquals(VALID_MP, wizard.getMp());
    }

    @Test
    @DisplayName("마법사의 MP를 설정한다")
    void setMpSetsMp() {
        Wizard wizard = new Wizard();

        assertDoesNotThrow(() -> wizard.setMp(VALID_MP));
        assertEquals(VALID_MP, wizard.getMp());
    }

    @Test
    @DisplayName("마법사의 MP가 음수이면 예외가 발생한다")
    void setMpThrowsExceptionWhenMpIsNegative() {
        Wizard wizard = new Wizard();

        assertThrows(
                IllegalArgumentException.class,
                () -> wizard.setMp(NEGATIVE_MP)
        );
    }
}