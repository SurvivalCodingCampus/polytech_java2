package com.survivalcoding.day260616;

public class GreatWizard extends Wizard {
    public GreatWizard() {
        super(150);
    }

    @Override
    public void heal(Hero hero) {
        int recovPoint = 25;

        if (getMp() < 5) {
            System.out.println("마나가 부족합니다");
            return;
        }

        hero.setHp(hero.getHp() + recovPoint);
        setMp(getMp() - 5);
        System.out.println("힐을 시전했습니다. 대상 HP : " + hero.getHp());
    }

    public void superHeal(Hero hero) {
        if (getMp() < 50) {
            System.out.println("마나가 부족합니다");
            return;
        }

        hero.setHp(hero.getMaxHp());
        setMp(getMp() - 50);
        System.out.println("슈퍼 힐을 시전했습니다. 대상 HP : " + hero.getHp());
    }
}
