package com.survivalcoding;

public class Wizard {
    private int hp;
    private int mp;
    //private int mp = 100;
    private String name;
    private Wand wand;

    public void wizard(int mp) {
        //if (this.mp < mp) {
        this.mp = mp;
        //}
    }

    public void heal(Hero hero) {
        if (this.mp <= 0) {
            System.out.println("마나가 부족합니다.");
        }
        this.mp -= 10;
        hero.setHp(hero.getHp() + 20);
        System.out.println("힐을 시전 하였습니다. 대상 HP: " + hero.getHp());
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    public int getMp() {
        return mp;
    }

}

//    public String getName() {
//        return name;
//    }
//
//    public Wand getWand() {
//        return wand;
//    }

//setter
//    public void setHp(int hp) {
//        if (hp < 0) hp = 0;        // HP가 음수면 0으로
//        if (hp > 999) hp = 999;
//        this.hp = hp;
//    }
//
//    public void setMp(int mp) {
//        if (mp < 0) mp = 0;        // HP가 음수면 0으로
//        if (mp > 999) mp = 999;
//        this.mp = mp;
//    }
//
//    public void setName(String name) {
//        if (name == null) {
//            throw new IllegalArgumentException("이름이 null 일 수는 없습니다.");
//        }
//        if (name.length() < 3) {
//            throw new IllegalArgumentException("이름은 3글자 이상이여야 합니다.");
//        }
//
//        this.name = name;
//    }
//
//    public void setWand(Wand wand) {
//        if (wand == null) {
//            throw new IllegalArgumentException("지팡이가 null일 수는 없습니다.");
//        }
//        this.wand = wand;
//    }
//setter
//    public void heal(Hero hero) {
//        int basePoint = 10;
//        int recovPoint = (int) (basePoint * this.wand.getPower());
//        hero.setHp(hero.getHp() + recovPoint);
//    }

//getter
//    public int power() {
//
//    }


