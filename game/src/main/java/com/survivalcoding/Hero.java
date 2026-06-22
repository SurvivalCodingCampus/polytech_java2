package com.survivalcoding;

public class Hero {
    private String name;
    private int hp;
    private int maxHp = 300;

    Hero(String name, int hp) {
        setName(name);
        setHp(hp);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxHp() {
        return maxHp;
    }

    public void setMaxHp(int maxHp) {
        this.maxHp = maxHp;
    }

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
