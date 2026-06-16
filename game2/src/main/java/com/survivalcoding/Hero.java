package com.survivalcoding;


public class Hero {
    public static int money = 100;
    public static int MaxHP = 100;

    private String name;
    private int hp;
    private int mp;

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        if (hp < 0) {
            hp = 0;
        }
        this.hp = hp;
    }

    public Hero() {
        this.name = "홍길동";
        this.hp = 100;
        System.out.println("홍길동 생성자");

    }

    public Hero(String name, int hp) {
        this.name = name;
        setHp(hp);
    }

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
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

    void attack() {
        //sout
        hp -= 1;
        System.out.println("공격했다");
    }

    public void run() {
        System.out.println("달렸다");
    }
}


