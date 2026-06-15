package com.survivalcoding;

import java.util.Random;

public class Hero {
    String name;
    int hp;
    //Sword sword;
    static int money = 100;

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
        this.hp = 100;
        this.name = name;
    }

    void attack() {
        hp -= 1;
        System.out.println("공격했다");
    }
}
