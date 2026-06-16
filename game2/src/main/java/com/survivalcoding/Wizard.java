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
            hp = 0;
        }
        this.hp = hp;
    }

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        if (mp < 0) {
            throw new IllegalArgumentException("마법사의 MP는 0 이상이여야 한다");
        }
        this.mp = mp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null) {
            throw new IllegalArgumentException("이름은 null이 아니어야 함");
        }
        if (name.length() < 3) {
            throw new IllegalArgumentException("이름이 3문자 이상이여야 함");
        }


        this.name = name;
    }

    public Wand getWand() {
        return wand;
    }

    public void setWand(Wand wand) {
        if (wand == null) {
            throw new IllegalArgumentException("마법사의 지팡이는 null일 수 없다");
        }
        this.wand = wand;
    }


    void heal(Hero hero) {


        int basePoint = 20;
        int baseMp = 10;

        if (this.getMp() < 10) {
            System.out.println("마나가 부족합니다");
        } else {
            hero.setHp(hero.getHp() + basePoint);
            this.setMp(this.getMp() - baseMp);
            System.out.println("힐을 시전했습니다.");
            System.out.println(hero + "HP :" + hero.getHp());
        }
    }
}
