package com.survivalcoding;

public class GreatWizard extends Wizard {

    public GreatWizard() {
        super();
        this.setMp(150);
    }

    @Override
    void heal(Hero hero) {
        if (this.getMp() < 5) {
            System.out.println("마나가 부족합니다.");
            return;
        }

        this.setMp(this.getMp() - 5);
        hero.setHP(hero.getHP() + 25);
        System.out.println("힐을 시전 했습니다. 대상 HP : " + hero.getHP());
    }

    public void superHeal(Hero hero) {
        if (this.getMp() < 50) {
            System.out.println("마나가 부족합니다.");
            return;
        }
        this.setMp(this.getMp() - 50);
        hero.setHP(hero.getMaxHP());
        System.out.println("슈퍼 힐을 시전했습니다. 대상 HP: " + hero.getHP());
    }
}
