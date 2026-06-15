package com.survivalcoding;

public class Cleric2 {
    static int maxHp = 50;
    static int maxMp = 10;
    String name;
    int Hp;
    int Mp;

    public Cleric2(String name, int Hp, int Mp) {
        this.name = name;
        this.Hp = Hp;
        this.Mp = Mp;
    }

    public Cleric2(String name, int Hp) {
        this.name = name;
        this.Hp = Hp;
        this.Mp = Cleric2.maxMp;
    }

    public Cleric2(String name) {
        this.name = name;
        this.Hp = Cleric2.maxHp;
        this.Mp = Cleric2.maxMp;

    }
}