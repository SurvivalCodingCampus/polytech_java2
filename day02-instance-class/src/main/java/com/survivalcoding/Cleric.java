package com.survivalcoding;

import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Cleric {
    final int maxHp = 50;
    final int maxMp = 10;
    final int selfAidMpCost = 5;

    String name;
    int hp = maxHp;
    int mp = maxMp;

    // MP를 5 소비하고 HP를 최대 50까지 회복한다.
    void selfAid() {
        if (mp < selfAidMpCost) {
            return;
        }
        mp -= selfAidMpCost;
        hp = maxHp;
    }

    // 기도한 시간에 0~2의 랜덤 보정을 더해 MP를 회복한다.
    int pray(int sec) {
        int beforeMp = mp;
        int rec = sec + new Random().nextInt(3);

        mp = Math.min(mp + rec, 10);

        return mp - beforeMp;
    }

    void attack() {
        hp--;
    }
}


//