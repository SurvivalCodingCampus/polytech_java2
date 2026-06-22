package com.survivalcoding.day260615;

import java.util.ArrayList;
import java.util.HashSet;

public class ListExam {
    public static void main(String[] args) {
        Hero hero1 = new Hero();
        hero1.setName("이순신");
        Hero hero2 = new Hero();
        Hero hero3 = new Hero();

        ArrayList<Hero> heroes = new ArrayList<>();
        heroes.add(hero1);
        heroes.add(hero2);
        heroes.add(hero3);

        System.out.println(heroes.size());
        System.out.println(hero1.getName());
        System.out.println(heroes.get(0).getName());

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(1);

        System.out.println(numbers);
        System.out.println(numbers.contains(1));
        numbers.remove(1);

        HashSet<Integer> numberSet = new HashSet<>();
        numberSet.add(1);
        numberSet.add(1);
        numberSet.add(1);
        System.out.println(numberSet);

        System.out.println(numberSet.contains(2));
    }
}
