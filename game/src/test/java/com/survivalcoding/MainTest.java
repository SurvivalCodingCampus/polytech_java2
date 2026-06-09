package com.survivalcoding;

import org.junit.jupiter.api.Test;

class MainTest {

    @Test
    void main() {
        Cleric cleric = new Cleric();
        cleric.HP = 50;
        cleric.MP = 10;
        int MAXHP = cleric.maxHP;
        int MAXMP = cleric.maxMP;

        cleric.selfAid();
        System.out.println("used MP " + cleric.MP);

        cleric.pray(1);
        System.out.println("heal " + cleric.MP);
    }
}