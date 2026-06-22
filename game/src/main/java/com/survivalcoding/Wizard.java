package com.survivalcoding;

public class Wizard {
    private int hp;
    private int mp = 100;
    private String name;
    private Wand wand;


    Wizard(String name, int hp, int mp, Wand wand) {
        if (wand == null) {
            throw new IllegalArgumentException("지팡이는 필수로 있어야 합니다.");
        }
        this.wand = wand;
        setName(name);
        setMp(mp);
        if (hp < 0) {
            setHp(0);
        } else {
            setHp(hp);
        }
    }

    Wizard(String name, int hp, int mp) {
        setName(name);
        setHp(hp);
        setMp(mp);
    }

    public Wand getWand() {

        return wand;
    }

    public void setWand(Wand wand) {
        if (wand == null) {
            throw new IllegalArgumentException("지팡이는 필수로 있어야 합니다.");
        }
        this.wand = wand;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        if (hp < 0) {
            throw new IllegalArgumentException("마법사의 HP는 0 이상이어야 합니다.");
        }
        this.hp = hp;
    }

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        if (mp < 0) {
            throw new IllegalArgumentException("마법사의 MP는 0이상이어야 한다.");
        }
        this.mp = mp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null) {
            throw new IllegalArgumentException("마법사의 이름을 반드시 입력해야 합니다.");
        }
        if (name.length() <= 2) {
            throw new IllegalArgumentException("마법사의 이름은 반드시 3문자 이상이어야 한다.");
        }
        this.name = name;
    }

    void heal(Hero hero) {
        if (this.mp < 10) {
            System.out.println("마나가 부족합니다.");
        } else {
            this.mp -= 10;
            hero.setHp(hero.getHp() + 20);
            System.out.println("힐을 시전했습니다. " + hero.getName() + " HP : " + hero.getHp());
        }
    }
}
// 이전 heal 메서드
//    void heal(Hero hero) {
//        int basePoint = 10;
//        int recovPoint = (int) (basePoint * this.wand.getPower());
//        hero.setHp(hero.getHp() + recovPoint);
//    }

