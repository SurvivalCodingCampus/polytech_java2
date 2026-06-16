package com.survivalcoding;

public class GreatWizard extends Wizard {

    public GreatWizard() {
        this.mp = 150;
        this.heal = 25;
        this.mpCost = 5;
    }

    public void heal(Hero hero) {
        super.heal(hero);
    }

    public void superHeal(Hero hero) {
        if (this.mp >= 50) {
            hero.setHp(Hero.MAX_HP);
            this.mp -= 50;
            System.out.println("슈퍼 힐을 시전했습니다. " + hero.name + "HP : " + hero.getHp());
        } else {
            System.out.println("마나가 부족합니다");
        }
    }
}
