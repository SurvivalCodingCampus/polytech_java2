package com.survivalcoding;

public class Hero {
    static int money = 100;

    String name;
    int hp;

    static void setRandomMoney() {
        Hero hero = new Hero();
        hero.name = "XXX";
    }

    Hero() {
        this.name = "default";
        hp = 100;
    }

    Hero(String name) {
        this.name = name;
        hp = 100;
    }

    void attack() {
        hp -= 1;
        System.out.println("attack");
    }
}
