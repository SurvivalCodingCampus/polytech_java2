package com.survivalcoding;

import java.util.Random;

public class Hero {
    public String name;
    public int hp;
    //Sword sword;
    static int money = 100;

    static void setRandomMoney() {
        money = new Random().nextInt(1000);

        Hero hero = new Hero();
        hero.name = "홍길동";
    }


    //setter 값을 입력
    void setHp(int hp) {
        this.hp = hp;
    }

    void setName(String name) {
        if (name == null) {
            throw new IllegalArgumentException("이름이 null 일 수는 없습니다.");
        }
        if (name.length() < 3) {
            throw new IllegalArgumentException("이름은 3글자 이상이여야 합니다.");
        }
        this.name = name;
    }

    // getter 값을 불러오기
    int getHp() {
        return hp;
    }

    Hero() {
        this.name = "홍길동";

        hp = 100;

    }

    Hero(String name) {
        this.hp = 100;
        this.name = name;
    }

    void attack() {
        hp -= 1;
        System.out.println("공격했다");
    }
}
