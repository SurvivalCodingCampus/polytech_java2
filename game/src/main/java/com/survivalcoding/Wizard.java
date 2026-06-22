package com.survivalcoding;

public class Wizard {
    static final int MAX_MP = 100;
    int hp;
    int mp = MAX_MP;
    Wand wand;
    private String name;

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {

        if (hp < 0) {
            hp = 0;

        }
        this.hp = hp;
    }

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        if (mp < 0) {
            throw new IllegalArgumentException("마법사의 MP는 0이상이어야 함");

        }
        this.mp = mp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null) {
            throw new IllegalArgumentException("이름은 null이 아니어야 함");

        }
        if(name.length() <= 2){
            throw new IllegalArgumentException("이름이 짧음");
        }
        this.name = name;
    }

    public Wand getWand() {
        return wand;
    }

    public void setWand(Wand wand) {
        if (wand == null) {
            throw new IllegalArgumentException("마법사의 지팡이는 null이 아니어야 함");

        }
        this.wand = wand;
    }

    void heal(Hero hero) {
        int recoverPoint =  20;
        int usedPoint = 10;

        hero.setHp(hero.getHp() + recoverPoint);
        hero.setMp(hero.getMp() - usedPoint);
    }
}
