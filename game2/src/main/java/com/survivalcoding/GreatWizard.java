package com.survivalcoding;

import static com.survivalcoding.Hero.MaxHP;

public class GreatWizard extends Wizard {
    private int Mp = 150;

    @Override
    public int getMp() {
        return Mp;
    }

    @Override
    public void setMp(int mp) {
        Mp = mp;
    }

    public GreatWizard() {
        super();
    }


    @Override
    void heal(Hero hero) {
        int basePoint = 25;
        int baseMp = 5;

        if (this.getMp() >= 5) {
            hero.setHp(hero.getHp() + basePoint);
            this.setMp(this.getMp() - baseMp);
            System.out.println("힐을 시전했습니다.");
            System.out.println(hero + "HP :" + hero.getHp());
        } else {
            System.out.println("마나가 부족합니다");
        }
    }

    void superHeal(Hero hero) {

        int basePoint = MaxHP;
        int baseMp = 50;


        if (this.getMp() >= 50) {
            hero.setHp(basePoint);
            this.setMp(this.getMp() - baseMp);
            System.out.println("슈퍼 힐을 시전했습니다");
            System.out.println(hero + "HP :" + hero.getHp());
        } else {
            System.out.println("마나가 부족합니다");
        }
    }
}
