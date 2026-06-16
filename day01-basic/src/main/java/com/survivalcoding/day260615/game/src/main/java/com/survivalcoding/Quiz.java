package com.survivalcoding;

public class Quiz {
    public static void main(String[] args) {
        Hero hero1 = new Hero();
//        hero1.hp = 100;
//        Hero hero2 = hero1;
//        hero2.hp = 200;

        System.out.println(hero1.getHp());   // 200

        int number = 100;
        int number2 = number;
        number2 = 200;


        System.out.println(number); // ?

        System.out.println("================");

        System.out.println(hero1.getHp());
        System.out.println(hero1.getName());

        System.out.println("================");

        Hero hero3 = new Hero("오준석");
        System.out.println(hero3.getHp());
        System.out.println(hero3.getName());

        // 공용 자금
        System.out.println(Hero.money);

        Hero.money = 200;
    }
}
