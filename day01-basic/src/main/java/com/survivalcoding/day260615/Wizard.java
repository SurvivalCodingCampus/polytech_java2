package com.survivalcoding.day260615;

public class Wizard {
    private double power;
    private int hp;
    private int mp;
    private String name;
    private Wand wand;

    public int getHp() {
        return hp;
    }

    public void setHp(int myHp) {

        if (myHp < 0) {
            this.hp = 0;
            return;
        }

        this.hp = myHp;
    }

    public void fireball(Hero hero) {

    }

    public void heal(Hero hero){
        int basePoint = 10;
        int recovPoint = (int) (basePoint * this.wand.getPower());
        hero.setHp(hero.getHp() + recovPoint);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.length() < 3) {
            throw new IllegalArgumentException("마법사 이름은 null일 수 없고 3문자 이상이어야 합니다.");
        }
        this.name = name;
    }

    public Wand getWand() {
        return wand;
    }

    public void setWand(Wand wand) {
        if (wand == null) {
            throw new IllegalArgumentException("마법사의 지팡이는 null일 수 없습니다.");
        }
        this.wand = wand;
    }

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        if (mp < 0) {
            throw new IllegalArgumentException("마법사의 MP은 0이상여야 합니다.");
        }
        this.mp = mp;
    }



}
