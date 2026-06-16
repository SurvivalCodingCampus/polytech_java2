package com.survivalcoding.day260608;

import java.util.Random;

public class Cleric {
    final int maxHp = 50;
    final int maxMp = 10;
    public int hp = maxHp;
    public int mp = maxMp;
    public String name;

    public void selfAid() {
        this.mp -= 5;
        this.hp = maxHp;
    }

    public int pray(int sec) {
        Random point = new Random();
        int randomPoint = point.nextInt(sec, sec + 2);
        int realRecovery = randomPoint;

        if (this.mp + randomPoint > maxMp) {
            realRecovery = maxMp - this.mp;
        }

        this.mp += realRecovery;

        System.out.println(this.name + "는 mp를 " + realRecovery + "만큼 회복하였다.");

        return realRecovery;
    }
}
