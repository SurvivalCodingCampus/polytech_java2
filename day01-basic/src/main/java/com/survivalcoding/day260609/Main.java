package com.survivalcoding.day260609;

public class Main {
    public static void main(String[] args) {
//        Sword sword = new Sword();
//        sword.name = "불의 검";
//        sword.damage = 10;
//
//        Hero hero = new Hero();
//        hero.name = "김영웅";
//        hero.hp = 100;
//        hero.sword = sword;
//
//        System.out.println("현재의 무기는 " + hero.sword.name);

        Hero hero1 = new Hero();
        hero1.name = "스랄";
        hero1.hp = 100;

        Hero hero2 = new Hero();
        hero2.name = "아서스";

        Wizard wizard = new Wizard();
        wizard.name = "제이나";
        wizard.hp = 50;

        wizard.heal(hero1);
        wizard.heal(hero2);
        wizard.heal(hero2);
    }
}