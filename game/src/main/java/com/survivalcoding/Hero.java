package com.survivalcoding;

import java.util.Objects;
import java.util.Random;

public class Hero {
    public static int money = 100;

    private String name;
    private int hp;
    private Sword sword;

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

        Hero hero = new Hero("");
        hero.name = "홍길동";
    }

//    public Hero() {
//        this.name = "홍길동";
//        hp = 100;
//        System.out.println("Hero 생성자 호출");
//    }

    public Hero(String name) {
        this(name, 100);
    }

    public Hero(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    public Hero(String name, int hp, Sword sword) {
        this.name = name;
        this.hp = hp;
        this.sword = sword;
    }

    // 나는 공격하면 hp 가 1씩 빠진다
    public void attack() {
        hp -= 1;
        // sout
        System.out.println("공격했다");
    }

    public void run() {
        System.out.println("달렸다");
    }

    public Sword getSword() {
        return sword;
    }

    public void setSword(Sword sword) {
        this.sword = sword;
    }

    @Override
    public final boolean equals(Object o) {
        if (!(o instanceof Hero hero)) return false;

        return hp == hero.hp && Objects.equals(name, hero.name) && Objects.equals(sword, hero.sword);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(name);
        result = 31 * result + hp;
        result = 31 * result + Objects.hashCode(sword);
        return result;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                ", sword=" + sword +
                '}';
    }
}
