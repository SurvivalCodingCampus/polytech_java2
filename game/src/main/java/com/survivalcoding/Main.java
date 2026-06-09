package com.survivalcoding;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // 인스턴스 생성
        Hero hero = new Hero();

        hero.hp = 10;
        hero.attack();  // 9
        hero.attack();  // 8

        System.out.println(hero.hp);    // 8

        int a = 10;
        long l = 10L; // literal 리터럴
    }
}