package com.survivalcoding;

public class Hero {
    static final int MAX_HP = 50;
    static final int MAX_MP = 10;
    // 2. 변수명은 소문자로 시작
    private int hp = MAX_HP;
    private int mp = MAX_MP;
    private String name;

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void attach() {
        System.out.println("공격했다");
    }

}
