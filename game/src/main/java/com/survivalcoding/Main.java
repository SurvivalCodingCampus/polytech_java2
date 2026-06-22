package com.survivalcoding;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //용사 이름, hp를 설정
        Hero hero = new Hero("김용사");
        Hero hero2 = new Hero();

        SuperHero superHero = new SuperHero("홍길동", 100);
        superHero.run();

        PoisonSlime poisonSlime = new PoisonSlime("독");
        poisonSlime.setHp(100);
        poisonSlime.attack(superHero);

//        Wizard wizard = new Wizard();
//        wizard.heal(hero);

        GreatWizard grateWizard = new GreatWizard();
        grateWizard.heal(superHero);
        grateWizard.superHeal(superHero);


        //hero.name = "김용사";
        //hero.hp = 100;
//        System.out.println("용사" + hero.name + "를 생성했습니다!");
//        System.out.println("용사의 체력은" + hero.hp + "입니다!");
//        System.out.println("용사의 재력은" + Hero.money + "입니다!");
//        Hero.money = 200;
//        System.out.println("용사의 재력은" + Hero.money + "입니다!");
//
//        System.out.println("용사" + hero2.name + "를 생성했습니다!");
//        System.out.println("용사의 체력은" + hero2.hp + "입니다!");
//        Hero.setRandomMoney();
//        System.out.println("용사의 재력은" + Hero.money + "입니다!");
//
//        Wizard wizard = new Wizard();
//        wizard.name = "김법사";
//        wizard.hp = 50;

//        wizard.heal(hero);

        //검 이름, 데미지 설정
//        Sword sword = new Sword();
//        sword.name = "불의 검";
//        sword.damage = 10;
//        System.out.println("현재 무기는" + sword.name + "입니다!");
//
//        Kinoko kinoko1 = new Kinoko();
//        kinoko1.hp = 50;
//        kinoko1.suffix = 'A';
//
//        Kinoko kinoko2 = new Kinoko();
//        kinoko2.hp = 51;
//        kinoko2.suffix = 'B';

        //용사에게 5초 앉기 , 넘어지기 , 25초앉기 , 도망을 지시
//        hero.sit(5);
//        hero.slip();
//        hero.sit(25);
//        hero.run();

        //용사 공격
//        hero.attack();  // 9
//        hero.attack();  // 8

//        System.out.println(hero.hp);    // 8

//        int a = 10;
//        long l = 10L; // literal 리터럴
    }
}