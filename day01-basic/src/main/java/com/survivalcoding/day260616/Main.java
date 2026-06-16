package com.survivalcoding.day260616;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Hero hero = new Hero("홍길동", 100);
        hero.run();

        SuperHero superHero = new SuperHero("한석봉", 50);
        superHero.run();

    }
}