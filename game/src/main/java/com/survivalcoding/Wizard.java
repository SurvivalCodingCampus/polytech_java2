package com.survivalcoding;

public class Wizard {
    String name;
    int hp;
    //protected : 자식클래스 사용 가능하도록 만듬
    protected int heal = 20;
    protected int mp = 100;
    protected int mpCost = 10;

    public void heal(Hero hero) {
        System.out.println("현재 체력 : " + hero.getHp());
        if (this.mp >= 10) {
            hero.setHp(hero.getHp() + heal);
            this.mp -= mpCost;
            System.out.println("힐을 시전했습니다. " + hero.name + "HP : " + hero.getHp());
        } else {
            System.out.println("마나가 부족합니다");
        }
    }
}
