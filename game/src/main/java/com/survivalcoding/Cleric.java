package com.survivalcoding;

//클래릭 클래스
public class Cleric {
    String name;
    int hp, mp;
    final int maxHp = 50;
    final int maxMp = 10;

    void selfAid() {
        System.out.println("셀프 에이드");
        if (mp >= 5) {
            mp -= 5;
            hp += 5;
            if (hp > maxHp) {
                hp = maxHp;
            }
        } else {
            System.out.println("마나가 부족합니다");
            return;
        }
    }
}
