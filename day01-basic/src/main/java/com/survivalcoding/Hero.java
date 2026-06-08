package com.survivalcoding;

public class Hero {
    String name;
    int hp;

    void attack() {
    }

    void run() {
        System.out.println(this.name + "는 도망쳤다!");
        System.out.println("GAME OVER");
        System.out.println("최종 HP는" + this.hp + "입니다");
    }

    void sit(int sec) {
        this.hp += sec;
        System.out.println(this.name + "는" + sec + "초 앉았다.");
        System.out.println("HP가" + sec + "포이늩 회복되었다.");
    }

    void slip() {
        this.hp -= 5;
        System.out.println(this.name + "는 넘어졌다.");
        System.out.println(("5의 데미지!"));
    }

    void sleep() {
        this.hp = 100;
        System.out.println(this.name + "는 잠을 자고 회복했다!");
    }

}
