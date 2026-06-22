package com.survivalcoding;

public class Slime {

    final String suffix;
    int hp;

    public Slime(String suffix) {
        this.suffix = suffix;
        this.hp = 50;
    }

    // 생성자, getter, setter 작성

    void attack(Hero hero) {
        System.out.println("슬라임 " + suffix + "이/가 공격했다");
        System.out.println("10의 데미지");

        hero.setHp(hero.getHp() - 10);
    }
}
