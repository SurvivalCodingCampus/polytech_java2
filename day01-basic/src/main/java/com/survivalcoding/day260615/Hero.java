package com.survivalcoding.day260615;

import java.util.Random;

public class Hero {
    private int hp;
    Sword sword;
    public static int money = 100;

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() <= 1) {
            throw new IllegalArgumentException("이름은 2글자 이상이어야 한다");
        }
        this.name = name;
    }

    public void bye() {
        System.out.println("빠이");
    }

    private void die(){
        System.out.println("죽었다");
    }

    void sleep(){
        this.hp = 100;
        System.out.println(this.name + "는 잠을 자고 회복했다!");
    }

    public void attack(Kinoko enmy){
        System.out.println("반격을 받았다");
        this.hp -= 12;
        if(this.hp < 1){
            die();
        }
    }

    public static void setRandomMoney() {
        money = new Random().nextInt(1000);

        Hero hero = new Hero();
        hero.name = "홍길동";
    }

    public Hero() {
        this("홍길동", 100);
        System.out.println("Hero 생성자 호출");
    }

    public Hero(String name) {
        this(name, 100);
    }

    public Hero(String name, int hp) {
        this.name = name;
        this.hp = hp;
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
}
