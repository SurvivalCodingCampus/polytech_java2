package com.survivalcoding;

public class Hero {
    private String name;
    private int hp;

    void attack() {
        System.out.println("공격했다.");
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
}
