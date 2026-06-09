package com.survivalcoding;

import java.util.Random;

public class Cleric {
    static final int maxHp = 50;
    static final int maxMp = 10;
    final int selfAidMpCost = 5;

    String name;
    int hp;
    int mp;

    public Cleric(String name, int hp, int mp) {
        this.name = name;
        this.hp = hp;
        this.mp = mp;
    }

    public Cleric(String name, int hp) {
        this(name, hp, maxMp);
    }

    public Cleric(String name) {
        this(name, maxHp, maxMp);
    }

    void selfAid() {
        if (mp < selfAidMpCost) {
            return;
        }
        mp -= selfAidMpCost;
        hp = maxHp;
    }

    int pray(int sec) {
        int beforeMp = mp;
        int rec = sec + new Random().nextInt(3);

        mp = Math.min(mp + rec, maxMp);

        return mp - beforeMp;
    }

    void attack() {
        hp--;
    }
}
