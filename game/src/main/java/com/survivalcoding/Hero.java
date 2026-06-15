package com.survivalcoding;

import java.util.Random;

public class Hero {
    static int money = 100;

    String name;
    int hp;

    static void setRandomMoney() {
        money = new Random().nextInt(1000);

        Hero hero = new Hero();
        hero.name = "홍길동";
    }

    Hero() {
        this.name = "홍길동";
        hp = 100;
    }

    Hero(String name) {
        this.name = name;
        hp = 100;
    }

    // 나는 공격하면 hp 가 1씩 빠진다
    void attack() {
        hp -= 1;
        // sout
        System.out.println("공격했다");
    }
}
