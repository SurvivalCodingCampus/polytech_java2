package com.survivalcoding;

import java.util.Random;

public class Cleric {
    String name = "Cleric";
    final int MaxHP = 50;
    int HP = 50;
    final int MaxMP = 10;
    int MP = 10;

    void selfAid() {
        MP -= 5;
        HP = MaxHP;
        System.out.println("성직자는 '셀프에이드' 라는 마법을 사용할 수 있고 MP를 5 소비하는것으로 자신의 HP를 최대 HP까지 회복할 수 있다.");
    }

    int pray(int sec) {
        Random rand = new Random();
        int recover = sec + rand.nextInt(3);
        int actualRecover = Math.min(this.MaxMP - this.MP, recover);
        this.MP += actualRecover;
        return actualRecover;

    }
}
