package com.survivalcoding;

import java.util.Random;

public class Cleric {
    final int maxHP = 50;
    final int maxMP = 10;
    final int selfAidMpCost = 5;
    final Random rand = new Random();

    String name;
    int hp = maxHP;
    int mp = maxMP;

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
