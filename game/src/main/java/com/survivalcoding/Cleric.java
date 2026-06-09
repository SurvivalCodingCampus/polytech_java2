package com.survivalcoding;

public class Cleric {
    String name = "Cleric";
    int hp = 50;
    final int mhp = 50;
    int mp = 10;
    final int mmp = 10;

    void selfAid() {
        mp -= 5;
        hp = mhp;
        System.out.println("self Aid");
        System.out.println(hp);
    }

    void pray(int prayTime) {
        if (mp >= mmp) {
            System.out.println("max mp");
            mp = mmp;
        }
        int randomMP = (int) ((Math.random() * 2) + prayTime);
        mp += randomMP;
        System.out.println("pray");
        if (mp >= mmp) {
            System.out.println("max mp");
            mp = mmp;
        }
        System.out.println(mp);
    }
}
