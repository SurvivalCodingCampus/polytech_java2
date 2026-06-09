package com.survivalcoding;

import java.util.Random;

public class Cleric {
    final int maxMP = 10;
    final int maxHP = 50;
    final int selfAidMPCost = 5;
    final int randBoundary = 3;
    final Random rand = new Random();

    String name;
    int hp;
    int mp = maxMP;

    void selfAid() {
        // 5 미만일 때 실패하는 로직 구현
        if (mp < selfAidMPCost) {
            System.out.println("MP가 부족합니다.");
            return;
        }
        mp -= selfAidMPCost;
        hp = maxHP;
    }

    int pray(int second) {
        int healMP = second;
        healMP += rand.nextInt(randBoundary);
        // 최대 MP보다 더 회복 할 수 없음
        healMP = Math.min(maxMP - mp, healMP);
//        if ((healMP + mp) > maxMP) {
//            healMP = maxMP - mp;
//        }
        mp += healMP;
        return healMP;
    }
}
