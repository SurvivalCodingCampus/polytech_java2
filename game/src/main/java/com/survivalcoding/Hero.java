package com.survivalcoding;

public class Hero {
    String name;
    private int hp;

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        if (hp < 0) {
            throw new IllegalArgumentException("HP는 0 이상이어야 합니다.");
        }
        this.hp = hp;
    }

    void attack() {
        System.out.println("공격했다.");
    }
}
