package com.survivalcoding;

public class Slime {
    final String suffix;
    int hp;

    public Slime(String suffix) {
        this.suffix = suffix;
    }

    public String getSuffix() {
        return this.suffix;
    }

    public int getHp() {
        return this.hp;
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
