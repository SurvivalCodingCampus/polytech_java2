package com.survivalcoding;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // 인스턴스 생성
        Hero hero = new Hero();
        Cleric cleric = new Cleric();

        int MP, MaxHP, MaxMP;

        hero.name = "Cleric";
        cleric.hp = 50;
        cleric.mp = 10;
        MaxHP = cleric.maxhp;
        MaxMP = cleric.maxmp;
        System.out.println(hero.name + " Create");

        cleric.selfAid();
        System.out.println(hero.name + " MP -5");
        System.out.println("Now MP " + cleric.mp);

        int result = cleric.pray(1);
        System.out.println(result);
        System.out.println("Now MP" + cleric.mp);
    }
}