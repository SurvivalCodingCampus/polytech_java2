package com.survivalcoding;

public class Hero {
    String name;
    int hp;

    void attack() {
        //sout
        hp -= 1;
        System.out.println("공격했다");
    }
}


