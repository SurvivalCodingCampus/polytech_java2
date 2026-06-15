package com.survivalcoding.day260609;

import java.util.Random;

public class Cleric {
    static final int maxHp = 50;
    static final int maxMp = 10;
    int hp;
    int mp;
    String name;


    Cleric(String name){
        this(name, maxHp, maxMp);
    }

    Cleric(String name, int hp){
        this(name, hp, maxMp);
    }

    Cleric(String name, int hp, int mp){
        this.name = name;
        this.hp = hp;
        this.mp = mp;
    }

    void selfAid() {
        this.mp -= 5;
        this.hp = maxHp;
    }

    int pray(int sec) {
        Random point = new Random();
        int randomPoint = point.nextInt(sec, sec + 3);
        int realRecovery = randomPoint;

        if (this.mp + randomPoint > maxMp) {
            realRecovery = maxMp - this.mp;
        }

        this.mp += realRecovery;

        System.out.println(this.name + "는 mp를 " + realRecovery + "만큼 회복하였다.");

        return realRecovery;
    }
}
