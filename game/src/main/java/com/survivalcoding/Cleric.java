package com.survivalcoding;

import java.util.Random;

public class Cleric {
    int hp;
    int mp;
    static final int maxHp = 50;
    static final int maxMp = 10;
    String name;

    Cleric(String name, int hp, int mp) {
        this.name = name;
        this.hp = hp;
        this.mp = mp;
    }

    Cleric(String name, int hp) {
        this.name = name;
        this.hp = hp;
        this.mp = Cleric.maxMp;
    }

    Cleric(String name) {
        this.name = name;
        this.hp = Cleric.maxHp;
        this.mp = Cleric.maxMp;
    }

    void selfAid() {
        if (mp < 5) {
            // MP가 부족한 경우 처리
            return;
        }
        mp -= 5;
        hp = maxHp;
    }

    int pray(int sec) {
        Random random = new Random();
        int recovery = sec + random.nextInt(3);
        int HealMP = Math.min(maxMp - this.mp, recovery);
        this.mp += HealMP;
        return HealMP;
    }
}
