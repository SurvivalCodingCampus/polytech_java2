package com.survivalcoding;

public class Hero {
    private String name;
    private int HP;
    private int MaxHP = 100;

    public Hero(String name, int HP) {
        this.name = name;
        this.HP = HP;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    void attack() {
        //sout
        System.out.println("공격했다");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxHP() {
        return MaxHP;
    }

    public void setMaxHP(int maxHP) {
        MaxHP = maxHP;
    }
}
