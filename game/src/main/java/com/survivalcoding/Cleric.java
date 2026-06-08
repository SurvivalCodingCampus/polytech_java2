package com.survivalcoding;

import java.util.Random;

public class Cleric {
    int hp;
    int mp;
    final int maxhp = 50;
    final int maxmp = 10;

    void selfAid() {
        mp -= 5;
        hp = maxhp;
    }

    int pray(int sec) {
        Random random = new Random();
        int recovery = random.nextInt(3);
        if (sec >= 3) {
            recovery = random.nextInt(3, 5);
        }
        int HealMP = Math.min(this.maxmp - this.mp, recovery);
        this.mp += HealMP;
        if (this.mp > this.maxmp) {
            this.mp = 10;
        }
        return HealMP;
    }
}
