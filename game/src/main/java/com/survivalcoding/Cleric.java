package com.survivalcoding;

public class Cleric {
    final int MAX_HP = 50;
    final int MAX_MP = 10;

    String name;
    int HP = MAX_HP;
    int MP = MAX_MP;

    void selfAid() {
        MP -= 5;
        HP = MAX_HP;
    }

    int pray(int sec) {
        int random = (int) (Math.random() * 3);
        int recovery = sec + random;
        int beforeMP = MP;

        MP += recovery;
        if (MP > MAX_MP) {
            MP = MAX_MP;
        }

        return MP - beforeMP;
    }
}
