package com.survivalcoding;

public class Cleric {
    static final int MAX_HP = 50;
    static final int MAX_MP = 10;

    String name;
    int HP = MAX_HP;
    int MP = MAX_MP;

    public Cleric(String name, int HP, int MP) {
        this.name = name;
        this.HP = HP;
        this.MP = MP;
    }

    public Cleric(String name, int HP) {
        this(name, HP, MAX_MP);
    }

    public Cleric(String name) {
        this(name, MAX_HP, MAX_MP);
    }

    /* 이름을 지정하지 않았으므로 인스턴스화 할 수 없다.
    public Cleric() {
    }
     */

    void selfAid() {
        if (HP < 5) {
            return;
        }
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
