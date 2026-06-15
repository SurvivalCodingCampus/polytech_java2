package com.survivalcoding;

import java.util.Random;

//클래릭 클래스
public class Cleric {
    String name; //클래릭 이름
    int hp; //클래릭 체력
    int mp; //클래릭 마나
    static final int maxHp = 50; //클래릭 최대 체력
    static final int maxMp = 10; //클래릭 최대 마나

    public Cleric(String name) {
        this.name = name;
        this.hp = maxHp;
        this.mp = maxMp;
    }

    public Cleric(String name, int hp) {
        this.name = name;
        this.hp = Math.min(hp, maxHp);
        this.mp = maxMp;
    }

    public Cleric(String name, int hp, int mp) {
        this.name = name;
        this.hp = Math.min(hp, maxHp);
        this.mp = Math.min(mp, maxMp);
    }

    //공격시 체력 -1
    void attack() {
        hp -= 1;
        // sout
        System.out.println("공격했다");
    }

    void selfAid() {
        System.out.println(this.name + "는 셀프 에이드를 사용했다!");
        if (this.mp >= 5) {
            if (hp == maxHp) {
                System.out.println(this.name + "는 체력이 가득찼다");
            } else {
                this.mp -= 5;
//                this.hp += 5;
                //Math.min(숫자1,숫자2) 중 작은 수를 선택
                int actualHeal = Math.min(maxHp - this.hp, 5);
                this.hp += actualHeal;
//                if (this.hp > maxHp) {
//                    this.hp = maxHp;
//                }
                System.out.println(this.name + "는 셀프 에이드를 성공했다!");
            }
        } else {
            System.out.println("마나가 부족합니다");
        }
    }

    //기도하기
    void pray(int sec) {
        System.out.println(this.name + "는 기도하기를 사용했다");
        //기도 보정값 추가
        Random random = new Random();
        int prayPlus = random.nextInt(3);
        sec += prayPlus;
        //this.mp += sec;
        //mp 조정
        int actualMp = Math.min(maxMp - this.mp, sec);
        this.mp += actualMp;
//        if (this.mp > maxMp) {
//            this.mp = maxMp;
//        }
        System.out.println(this.name + "는 기도하기를 성공했다");
    }

}
