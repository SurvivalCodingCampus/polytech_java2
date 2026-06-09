package com.survivalcoding;

public class Cleric {
    final int MAXHP = 50;
    final int MAXMP = 10;
    String name;
    int HP = 50;
    int MP = 10;

    void selfAid() {
        System.out.println("셀프 에이드");
        MP = -5;
        HP = MAXHP;
    }

    int pray(int time) {
        int RN = (int) (Math.random() * 3); //0~2 랜덤
        int heelmp = 0;
        System.out.println("기도하기");
        try {
            Thread.sleep(time * 1000); // 1*time초 동안 멈춤
            if ((RN + time) > MAXMP) {
                heelmp = MAXMP;
            } else {
                heelmp = (RN + time);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return heelmp;
    }
}
