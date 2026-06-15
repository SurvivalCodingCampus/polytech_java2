package com.survivalcoding;

import java.util.Random;

public class Cleric {
    String name;
    final static int MaxHP = 50;
    final static int MaxMP = 10;
    final Random rand = new Random();
    int HP;
    int MP;

    Cleric(String name, int HP, int MP) {
        this.name = "아서스";
        this.HP = HP;
        this.MP = MP;
    }

    Cleric(String name, int HP) {
        this.name = name;
        this.HP = HP;
    }

    Cleric(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        int test1 = 40;
        int test2 = 5;
        int test3 = 35;
        Cleric cleric = new Cleric("아서스", test1, test2);
        System.out.println(cleric.name);
        System.out.println(cleric.HP);
        System.out.println(cleric.MP);

        Cleric cleric1 = new Cleric("아서스", test3);
        System.out.println(cleric1.name);
        System.out.println(cleric1.HP);
        System.out.println(Cleric.MaxMP);

        Cleric cleric3 = new Cleric("아서스");
        System.out.println(cleric3.name);
        System.out.println(Cleric.MaxHP);
        System.out.println(Cleric.MaxMP);
    }


    void selfAid() {
        if (MP < 5) {
            return;
        }
        MP -= 5;
        HP = MaxHP;
        System.out.println("성직자는 '셀프에이드' 라는 마법을 사용할 수 있고 MP를 5 소비하는것으로 자신의 HP를 최대 HP까지 회복할 수 있다.");
    }

    int test = 3;

    int pray(final int sec) {
        final int recover = sec + rand.nextInt(test);
        final int actualRecover = Math.min(MaxMP - MP, recover);
        MP += actualRecover;
        return actualRecover;
    }
}
