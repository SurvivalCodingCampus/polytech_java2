package com.survivalcoding;

public class Hero {
    String name;
    private int hp;

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    void attack() {
        System.out.println("공격했다.");
    }
}
