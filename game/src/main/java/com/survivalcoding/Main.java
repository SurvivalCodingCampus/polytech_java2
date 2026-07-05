package com.survivalcoding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // 인스턴스 생성
        Hero hero = new Hero("");

        hero.setHp(10);
        hero.attack();  // 9
        hero.attack();  // 8

        System.out.println(hero.getHp());    // 8

        int a = 10;
        long l = 10L; // literal 리터럴

        List<Hero> heroes = new ArrayList<>();
        heroes.add(new Hero("홍길동"));
        heroes.add(new Hero("김삿갓"));
        heroes.add(new Hero("이순신"));

        // 오름차순
//        Collections.sort(heroes);

        // 내림차순, 익명클래스
        Collections.sort(heroes, new Comparator<Hero>() {
            @Override
            public int compare(Hero o1, Hero o2) {
                return o1.getName().compareTo(o2.getName()) * -1;
            }
        });

        // 오름차순
        Collections.sort(heroes, (o1, o2) -> o1.getName().compareTo(o2.getName()));
//        Collections.sort(heroes);

        // 내림차순
        Collections.sort(heroes, (o1, o2) -> o1.getName().compareTo(o2.getName()) * -1);

        System.out.println(heroes);

        // 깊은 복사 (인스턴스를 새로 만들면서 값이 동일)
        Hero hero1 = new Hero("홍길동", 100, new Sword("검", 100));
        Hero hero2 = new Hero(hero1.getName(), hero1.getHp(),
                new Sword(hero1.getSword().getName(), hero1.getSword().getDamage())
        );

        System.out.println(hero1.getSword().hashCode());
        System.out.println(hero2.getSword().hashCode());

        System.out.println(hero1.equals(hero2));    // true
        System.out.println(hero1 == hero2);     // false

    }
}