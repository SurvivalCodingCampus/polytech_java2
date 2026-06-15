package com.survivalcoding.day260609;

public class Hero {
    String name;
    int hp;
    Sword sword;

    void attack(){
        System.out.println(this.name + "는 공격했다!");
        System.out.println("적에게 5포인트의 데미지를 주었다!");
    }
}
