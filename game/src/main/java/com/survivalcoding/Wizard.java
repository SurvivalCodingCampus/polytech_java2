package com.survivalcoding;

public class Wizard extends Hero {
    protected int mp;
    private int maxmp;

    public Wizard(String name, int hp, int maxhp, int mp, int maxmp) {
        super(name, hp, maxhp);
        this.mp = mp;
        this.maxmp = maxmp;
    }

    public void heal(Hero hero) {
        if (mp >= 10) {
            mp -= 10;
            hero.incrementHP(20);
            System.out.printf("힐을 시전했습니다. %s HP : %d\n", hero.getName(), hero.getHp());
        } else {
            System.out.println("마나가 부족합니다.");
        }
    }
}