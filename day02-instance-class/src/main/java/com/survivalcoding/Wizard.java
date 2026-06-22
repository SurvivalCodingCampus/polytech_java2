package com.survivalcoding;

public class Wizard {

    private int hp;
    private int mp = 100;
    private String name;
    private Wand wand;

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        if (hp < 0) {
            this.hp = 0;
            return;
        }
        this.hp = hp;
    }

    public int getMp() {
        return mp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.length() < 3) {
            throw new IllegalArgumentException("마법사의 이름은 null일 수 없고 3문자 이상이어야 합니다");
        }
        this.name = name;
    }

    public void setMp(int mp) {
        if (mp < 0) {
            throw new IllegalArgumentException("마법사의 MP는 0 이상이어야 합니다");
        }
        this.mp = mp;
    }

    public void setWand(Wand wand) {
        if (wand == null) {
            throw new IllegalArgumentException("마법사의 지팡이는 null일수 없습니다.");
        }
        this.wand = wand;
    }

    public void heal(Hero hero) {
        if (mp < 10) {
            System.out.println("마나가 부족합니다");
            return;
        }

        hero.setHp(hero.getHp() + 20);
        mp -= 10;
        System.out.println("힐을 시전했습니다. 대상 HP: " + hero.getHp());
    }


    public void fireball(Hero hero) {


    }


}
