package com.survivalcoding;

public class Hero {
    String name = "dd";
    static int hp;

    void attack() {
        hp -= 1;
        System.out.println("공격했다");
    }
}
