package com.survivalcoding.day260622;

import com.survivalcoding.day260616.Slime;

import java.util.Random;

public class Hero implements Attackable {
    public static int money = 100;

    private String name;
    private int hp;

    public Hero() {
        this("홍길동", 100);
    }

    public Hero(String name) {
        this(name, 100);
    }

    public Hero(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() <= 1) {
            throw new IllegalArgumentException("이름은 2글자 이상이어야 한다");
        }
        this.name = name;
    }

    public static void setRandomMoney() {
        money = new Random().nextInt(1000);

        Hero hero = new Hero();
        hero.name = "홍길동";
    }

    // 나는 공격하면 hp 가 1씩 빠진다
    @Override
    public void attack(Slime slime) {
        hp -= 10;
        // sout
        System.out.println("공격했다");
    }

    public void run() {
        System.out.println("달렸다");
    }
}
