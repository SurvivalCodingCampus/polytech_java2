package com.survivalcoding;

public class Wizard {
    private Wand wand;
    private int hp;
    private int mp;
    private String name;

    void heal(Hero hero) {
        int basePoint = 10;
        int recovPoint = (int) (basePoint * this.wand.getPower());
        hero.setHP(hero.getHP() + recovPoint);
    }

    public Wand getWand() {
        return wand;
    }

    public void setWand(Wand wand) {
        if (wand == null) {
            throw new IllegalArgumentException("마법사의 지팡이는 null 일 수 없다.");
        }
        this.wand = wand;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        if (hp < 0) {
            this.hp = 0;
        } else {
            this.hp = hp;
        }
    }

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        if (mp < 0) {
            throw new IllegalArgumentException("마법사의 MP는 0 이상이어야 한다.");
        }
        this.mp = mp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null) {
            throw new IllegalArgumentException("마법사의 이름은 null일 수 없습니다.");
        }
        if (name.length() < 3) {
            throw new IllegalArgumentException("마법사의 이름은 반드시 3문자 이상이어야 한다.");
        }
        this.name = name;
    }
}
