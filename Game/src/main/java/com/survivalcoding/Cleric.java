package com.survivalcoding;

public class Cleric {
    static final int MAX_HP = 50;
    static final int MAX_MP = 10;
    static final int SELF_AID_MP_COST = 5; // 매직넘버를 없애기 위해 상수 설정

    String name;
    int hp = MAX_HP;
    int mp = MAX_MP;

    void selfAid() {
        if (mp < SELF_AID_MP_COST) {
            System.out.println("MP가 부족합니다.");
            return;
        }

        mp -= SELF_AID_MP_COST;
        hp = MAX_HP;

        System.out.println("셀프 에이드");
    }

    int pray(int sec) {
        int beforeMp = this.mp;

        this.mp += sec + new java.util.Random().nextInt(3);

        if (this.mp > this.MAX_MP) {
            this.mp = this.MAX_MP;
        }

        return this.mp - beforeMp;

    }
}
