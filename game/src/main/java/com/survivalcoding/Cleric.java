package com.survivalcoding;

import java.util.Random;

public class Cleric {
    String name;
    int hp;
    static final int max_HP = 50;
    int mp;
    static final int max_MP = 10;
    final Random rand = new Random();

    Cleric(String charName, int charHP, int charMP) {
        this.name = charName;
        this.hp = charHP;
        this.mp = charMP;
    }

    Cleric(String charName, int charHP) {
        this(charName, charHP, max_MP);
    }

    Cleric(String charName) {
        this(charName, max_HP, max_MP);
    }
    

    void selfAid() {
        if (mp < 5) {
            System.out.println("low mp");
            return;
        }
        mp -= 5;
        hp = max_HP;
        System.out.println("self Aid");
        System.out.println(hp);
    }

    int pray(int sec) {
        if (mp >= max_MP) {
            System.out.println("max mp");
            mp = max_MP;
            return mp;
        }
        final int recover = sec + rand.nextInt(3);
        final int actualRecover = Math.min(max_MP - mp, recover);
        mp += actualRecover;
        return actualRecover;
    }

//    void pray(int prayTime) {
//        int randomMP = (int) ((Math.random() * 2) + prayTime);
//        mp += randomMP;
//        System.out.println("pray");
//        if (mp >= maxMP) {
//            System.out.println("max mp");
//            mp = maxMP;
//            return;
//        }
//        System.out.println(mp);
//    }
}
