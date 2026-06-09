package com.survivalcoding;

public class Cleric {
    static final int MaxHP = 50;
    static final int MaxMP = 10;

    String name;
    int HP;
    int MP;

    Cleric(String name, int HP, int MP) {
        this.name = name;
        this.HP = HP;
        this.MP = MP;
    }

    Cleric(String name, int HP) {
        this(name, HP, MaxMP);
    }

    Cleric(String name) {
        this(name, MaxHP, MaxMP);
    }

    void selfAid() {
        MP -= 5;
        HP = MaxHP;
    }

    int pray(int time) {
        int random = (int) (Math.random() * 2);
        int increment = time + random;

        if (MP + increment > MaxMP) {
            increment = MaxMP - MP;
            MP = MaxMP;
            return increment;
        } else {
            MP += increment;
            return increment;
        }
    }
}
