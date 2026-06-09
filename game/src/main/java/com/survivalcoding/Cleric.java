package com.survivalcoding;

import java.util.Random;

public class Cleric {
    int hp = 50;
    int mp = 10;
    final int maxHp = 50;
    final int maxMp = 10;
    String name;

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
        int HealMP = Math.min(this.maxMp - this.mp, recovery);
        this.mp += HealMP;
        return HealMP;
    }
}
