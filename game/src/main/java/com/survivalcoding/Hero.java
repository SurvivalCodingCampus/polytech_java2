package com.survivalcoding;

public class Hero {
    private String name;
    private int hp;
    private int maxhp;

    public Hero(String name, int hp, int maxhp) {
        this.name = name;
        this.hp = hp;
        this.maxhp = maxhp;
    }

    public void attack() {
        System.out.println(name + "이(가) 공격했다!");
    }

    public void incrementHP(int amount) {
        if (amount + hp > maxhp) {
            hp = maxhp;
        } else {
            hp += amount;
        }
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getMaxhp() {
        return maxhp;
    }
}