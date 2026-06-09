package com.survivalcoding;

public class Cleric {
    String name;
    int hp;
    int mp;
    final int max_hp = 50;
    final int max_mp = 10;
    int pray;

    void selfAid() {
        mp -= 5;
        hp = max_hp;
        System.out.println("셀프 에이드");
    }

    int pray(int sec) {
        int beforeMp = this.mp;

        this.mp += sec + new java.util.Random().nextInt(3);

        if (this.mp > this.max_mp) {
            this.mp = this.max_mp;
        }

        return this.mp - beforeMp;

    }
}
