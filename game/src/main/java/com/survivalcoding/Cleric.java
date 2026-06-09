package com.survivalcoding;

public class Cleric {
    static final int MAX_HP = 50;
    static final int MAX_MP = 10;
    static final int SELF_AID_MP_COST = 5;

    String name;
    int hp;
    int mp;

    public Cleric(String name) {
        this(name, MAX_HP, MAX_MP);
    }

    public Cleric(String name, int hp) {
        this(name, hp, MAX_MP);
    }

    public Cleric(String name, int hp, int mp) {
        this.name = name;
        this.hp = hp;
        this.mp = mp;
    }

    void status() {
        System.out.println(name);
        System.out.println(hp + "/" + MAX_HP);
        System.out.println(mp + "/" + MAX_MP);
    }

    void selfAid() {
        if (mp >= SELF_AID_MP_COST) {
            mp -= SELF_AID_MP_COST;
            hp = MAX_HP;
        }
    }

    public int pray(int sec) {

        int beforeMp = mp;
        int mpRecovery = (int) (Math.random() * 3) + sec;

        mp += mpRecovery;
        if (mp >= MAX_MP) {
            mp = MAX_MP;
        }

        return mp - beforeMp;
    }
}
