package com.survivalcoding;

import java.util.Random;

public class Cleric {
    String name;
    int HP;
    int MP;
    final int maxHP = 50;
    final int maxMP = 10;


    void selfAid() {
        if (MP >= 5) {
            this.MP -= 5;
            this.HP = maxHP;
        }
    }

    int pray(int sec) {
        int randomNUM = new Random().nextInt(3);
        int actualRecovery = sec + randomNUM;


        // [수정] 회복하기 전 진짜 내 MP를 상자에 따로 기억해둡니다.
        int beforeMP = this.MP;

        // 일단 MP를 더합니다.
        this.MP = this.MP + actualRecovery;

        // 만약 더한 MP가 최대치(10)를 넘어가면, 강제로 10으로 맞춥니다.
        if (this.MP > this.maxMP) {
            this.MP = this.maxMP;
        }

        // 진짜로 회복된 양 = (원래 MP가 10으로 깎인 후의 현재 MP) - (회복 전 MP)
        return this.MP - beforeMP;
    }
}
