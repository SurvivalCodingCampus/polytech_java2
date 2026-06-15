package com.survivalcoding.test;

import com.survivalcoding.Hero;
import com.survivalcoding.Person;
import com.survivalcoding.Wand;
import com.survivalcoding.Wizard;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Kim", 2000);
        System.out.println("name: " + person.getName());
        System.out.println("birthYear: " + person.getBirthYear());
        System.out.println("age: " + person.getAge());

        Wand wand = new Wand();
        wand.setName("Magic Wand");
        wand.setPower(1.5);

        Wizard wizard = new Wizard();
        wizard.setName("Wizard Kim");
        wizard.setHp(50);
        wizard.setMp(10);
        wizard.setWand(wand);

        Hero hero = new Hero();
        hero.setHp(30);
        wizard.heal(hero);

        System.out.println("wizard: " + wizard.getName());
        System.out.println("wand: " + wizard.getWand().getName());
        System.out.println("hero HP after heal: " + hero.getHp());
    }
}
