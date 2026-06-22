package com.survivalcoding.day260622;

import java.util.Random;

public class Cleric {
    static final int maxHP = 50;
    static final int maxMP = 10;
    final int selfAidMpCost = 5;
    final Random rand = new Random();

    String name;
    int hp = maxHP;
    int mp = maxMP;

    public Cleric(String name) {
        this.name = name;
    }

    public Cleric(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    public Cleric(String name, int hp, int mp) {
        this.name = name;
        this.hp = hp;
        this.mp = mp;
    }

    void selfAid() {
        if (mp < selfAidMpCost) {
            return;
        }

        mp -= selfAidMpCost;
        hp = maxHP;
    }

    int pray(int sec) {
        final int recover = sec + rand.nextInt(3);
        final int actualRecover = Math.min(maxMP - mp, recover);
        mp += actualRecover;
        return actualRecover;
    }
}
