package com.survivalcoding;

public class Cleric {
    static final int MAXHP = 50;
    static final int MAXMP = 10;
    final int SelfAidCost = 5;
    String name;
    int HP = MAXHP;
    int MP = MAXMP;


    public Cleric(String name) {
        this.name = name;
        this.HP = MAXHP;
        this.MP = MAXMP;
    }

    public Cleric(String name, int hp) {
        this.name = name;
        this.HP = hp;
        this.MP = MAXMP;
    }

    public Cleric(String name, int hp, int mp) {
        this.name = name;
        this.HP = hp;
        this.MP = mp;
    }


    void selfAid() {
        System.out.println("셀프 에이드 시전");
        if (MP >= SelfAidCost) {
            MP -= SelfAidCost;
            HP = MAXHP;
            System.out.println("HP가 최대로 회복되었습니다.");
        } else {
            System.out.println("셀프 에이드 사용에 실패하였습니다.");
        }
    }

    int pray(int time) {
        final int RN = (int) (Math.random() * 3); //0~2 랜덤
        int heelmp = 0;
        System.out.println("기도하기 시전");
        if (time <= 0) {
            System.out.println("기도의 시간이 충분하지 않습니다.");
            return 0;
        } else {
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
        }
        System.out.println("MP가 " + heelmp + " 만큼 회복됨니다.");
        return heelmp;
    }

}
