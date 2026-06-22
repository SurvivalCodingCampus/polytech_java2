package com.survivalcoding;

import java.util.Random;

public class Hero {
    static final int MAX_HP = 100;
    static int money = 100;

    String name;
    int hp;
    Sword sword;

    Hero() {
        this.name = "임용사";
        this.hp = 100;
    }

    Hero(String name) {
        this.name = name;
        this.hp = 99;
    }

    public Hero(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    public int getHp() {
        return this.hp;
    }

    public void setHp(int hp) {
        this.hp = Math.min(hp, MAX_HP);
    }

    static void setRandomMoney() {
        money = new Random().nextInt(1000);
        System.out.println("초기금 : " + money);
    }

    // 나는 공격하면 hp 가 1씩 빠진다
    void attack() {
        hp -= 1;
        // sout
        System.out.println("공격했다");
    }

    void run() {
        System.out.println(this.name + "는 도망쳤다!");
        System.out.println("GAME OVER");
        System.out.println("최종 HP는" + this.hp + "입니다");
    }

    void sit(int sec) {
        //앉은 초 수만큼 hp 증가
        this.hp += sec;

        System.out.println(this.name + "는" + sec + "초 앉았다");
        System.out.println("HP가" + sec + "포인트 회복되었다");
    }

    void slip() {
        this.hp -= 5;
        System.out.println(this.name + "는 넘어졌다!");
        System.out.println("5의 데미지!");
    }

    void sleep() {
        this.hp = 100;
        System.out.println(this.name + "는 잠을 자고 회복했다!");
    }
}
