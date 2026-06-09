package com.survivalcoding;


public class Hero {
    String name;
    int hp;
    int mp;

    Hero() {
        this.hp = 40;
        this.mp = 5;
        this.name = "아서스";
    }

    Hero(String name) {
        this.hp = 35;
        this.name = name;
    }


    public static void main(String[] args) {

        Hero hero = new Hero();
        System.out.println(hero.name);
        System.out.println(hero.hp);
        System.out.println(hero.mp);

        Hero hero1 = new Hero("아서스");
        System.out.println(hero1.name);
        System.out.println(hero1.hp);
        System.out.println(hero1.mp);

    }

    void attack() {
        //sout
        hp -= 1;
        System.out.println("공격했다");
    }
}


