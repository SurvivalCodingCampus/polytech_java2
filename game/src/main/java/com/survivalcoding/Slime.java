package com.survivalcoding;

public class Slime {
    private final String suffix;
    private int hp = 100;

    public Slime(String suffix) {
        this.suffix = suffix;
    }

    public String getSuffix() {
        return suffix;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    void attack(Hero hero) {
        System.out.println("슬라임 " + suffix + "이/가 공격했다");
        System.out.println("10의 데미지");
        hero.setHp(hero.getHp() - 10);
    }
}
