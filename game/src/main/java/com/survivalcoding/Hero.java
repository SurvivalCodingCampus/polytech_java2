package com.survivalcoding;

import java.util.Random;

public class Hero {
    private String name;
    private int hp = 0;
    private int maxHP = 100;
    //Sword sword;
    static int money = 100;

    static void setRandomMoney() {
        money = new Random().nextInt(1000);

        Hero hero = new Hero();
        hero.name = "홍길동";
    }

    public void maxHp() {
        this.hp = maxHP;
    }

    //setter 값을 입력
    public void setHp(int hp) {

        this.hp = hp;
    }

    // getter 값을 불러오기
    int getHp() {
        return hp;
    }

    void setName(String name) {
        if (name == null) {
            throw new IllegalArgumentException("이름이 null 일 수는 없습니다.");
        }
        if (name.length() < 3) {
            throw new IllegalArgumentException("이름은 3글자 이상이여야 합니다.");
        }
        this.name = name;
    }

    Hero() {
        this.name = "홍길동";

        hp = 100;

    }

    Hero(String name) {
        this.hp = 100;
        this.name = name;
    }

    void attack() {
        hp -= 1;
        System.out.println("공격했다");
    }

    void heroRun() {
        System.out.println("RUN");
    }
}
