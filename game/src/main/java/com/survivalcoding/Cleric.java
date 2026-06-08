package com.survivalcoding;

import java.util.Random;

//클래릭 클래스
public class Cleric {
    String name;
    int hp, mp;
    final int maxHp = 50;
    final int maxMp = 10;

    void selfAid() {
        System.out.println(this.name + "는 셀프 에이드를 사용했다");
        if (this.mp >= 5) {
            this.mp -= 5;
            this.hp += 5;
            if (this.hp > maxHp) {
                this.hp = maxHp;
            }
        } else {
            System.out.println("마나가 부족합니다");
            return;
        }
    }

    //기도하기
    void pray(int sec) {
        System.out.println(this.name + "는 기도하기를 사용했다");
        //기도 보정값 추가
        Random random = new Random();
        int prayPlus = random.nextInt(3);
        sec += prayPlus;
        this.mp += sec;
        //mp 조정
        if (this.mp > maxMp) {
            this.mp = maxMp;
        }
    }

}
