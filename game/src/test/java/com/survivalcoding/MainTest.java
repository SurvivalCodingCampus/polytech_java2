package com.survivalcoding;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MainTest {

    @Test
    @DisplayName("정상적으로 회복되었습니다.")
    void main() {
        Hero hero = new Hero();
        Cleric cleric = new Cleric();

        int MP, MaxHP, MaxMP;

        hero.name = "Cleric";
        cleric.hp = 50;
        cleric.mp = 10;
        MaxHP = cleric.maxhp;
        MaxMP = cleric.maxmp;
        System.out.println(hero.name + " Create");

        cleric.selfAid();
        System.out.println(hero.name + " MP -5");
        System.out.println("Now MP " + cleric.mp);

        int result = cleric.pray(1);
        System.out.println(result);
        System.out.println("Now MP " + cleric.mp);
    }
}