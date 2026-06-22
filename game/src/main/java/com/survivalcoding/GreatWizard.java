package com.survivalcoding;

public class GreatWizard extends Wizard{
    private int mp = 150;
    void heal (Hero hero) {
        hero.setHp(hero.getHp() +25);
        hero.setMp(hero.getMp() -5);

    }
    void superHeal (Hero hero) {
        if (hero.getMp() < 50) {
            System.out.println("마나가 부족합니다.");
        }
        else{
            hero.setHp(Max_Hp);
            hero.setMp(hero.getMp() -50);
            System.out.println("슈퍼 힐을 시전했습니다. 대상 HP: " + hero.getHp());
        }

    }
}
