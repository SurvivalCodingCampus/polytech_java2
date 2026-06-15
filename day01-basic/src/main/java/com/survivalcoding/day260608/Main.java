package com.survivalcoding.day260608;

public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        int num = 10;
        System.out.printf("Hello and welcome! %d", num);
        System.out.printf("Hello and welcome! %d\n", num);

        Hero hero = new Hero();

        hero.name = "준석";
        hero.hp = 100;
        System.out.println("용사" + hero.name + "를 생성했습니다!");

        Kinoko kinoko1 = new Kinoko();
        kinoko1.hp = 50;
        kinoko1.suffix = 'A';


        Kinoko kinoko2 = new Kinoko();
        kinoko2.hp = 50;
        kinoko2.suffix = 'B';

        hero.slip();
        kinoko1.run();
        kinoko2.run();
        hero.run();

        Cleric cleric = new Cleric();
        cleric.name = "유리";
        cleric.hp = 50;
        cleric.mp = 4;
        cleric.selfAid();
        cleric.pray(3);
    }
}
