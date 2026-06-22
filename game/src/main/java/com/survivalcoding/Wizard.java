package com.survivalcoding;

public class Wizard {
    private static final int INITIAL_MP = 100;
    private static final int HEAL_POINT = 20;
    private static final int HEAL_MP_COST = 10;

    private int hp;
    private int mp = INITIAL_MP;
    private String name;
    private Wand wand;

    public void heal(Hero hero) {
        if (mp < HEAL_MP_COST) {
            System.out.println("마나가 부족합니다");
            return;
        }

        hero.setHp(hero.getHp() + HEAL_POINT);
        mp -= HEAL_MP_COST;

        System.out.println("힐을 시전했습니다. 대상 HP: " + hero.getHp());
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
        if (name == null || name.length() < 3) {
            throw new IllegalArgumentException("마법사의 이름은 null일 수 없고, 3문자 이상이여야 합니다.");
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
}
