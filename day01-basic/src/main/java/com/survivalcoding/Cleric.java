package com.survivalcoding;

import java.util.Random;

public class Cleric {
    final int maxHp = 50;
    final int maxMp = 10;
    int hp = maxHp;
    int mp = maxMp;
    String name;

    void selfAid() {
        this.mp -= 5;
        this.hp = maxHp;
    }

    int pray(int sec) {
        Random point = new Random();
        int randompoint = point.nextInt(sec, sec + 2);
        int realRecovery = randompoint;
        if (this.mp + randompoint > maxMp) {
            realRecovery = maxMp - this.mp;
        }

        this.mp += realRecovery;

        System.out.println(this.name + "는 mp를 " + realRecovery + "만큼 회복하였다.");

        return realRecovery;
    }
}
