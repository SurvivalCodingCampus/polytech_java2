package com.survivalcoding;

//캡슐화
public class Wand {
    private String name; // 사람 이름이 아닌 지팡이의 이름
    private double wandPower;
    private int mp;
    private int hp;

    public void setName(String name) {
        if (name == null) {
            throw new IllegalArgumentException("이름은 null이 아니어야 함");
        }
        if (name.length() <= 3) {
            throw new IllegalArgumentException("이름은 3문자 이상이어야 함");
        }
        //is.name = name; //존재하지 않는 단어라 오류
        this.name = name; //예약어, 키워드라서 잘됨
    }

    public void setWandPower(double wandPower) {
        if (wandPower <= 5.0 || wandPower >= 100.0) {
            throw new IllegalArgumentException("마력은 0.5 이상, 100.0 이하여야 함"); //예외문, 타당성 검사 || 작동 중지
        }
        //is.power = power;
        this.wandPower = wandPower;
    }

    public void setMp(int mp) {
        if (mp < 0) {
            throw new IllegalArgumentException("MP는 0이상이어햐 함");
        }
        this.mp = mp;
    }

    //HP가 음수가 되는 상황에서는 대신 0을 설정 되도록 한다.라고 했으므로 멈추게 하지 않아야 함
    public void setHp(int hp) {
        if (hp < 0) {
            this.hp = hp;
        } else {
            this.hp = hp;
        }
    }


    public double getWandPower() {
        return wandPower;
    }

    public String getName() {
        return name;
    }

    public int getMp() {
        return mp;
    }

    public int getHp() {
        return hp;
    }
}



