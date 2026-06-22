package com.survivalcoding;

public class GreatWizard extends Wizard {
    public GreatWizard() {
        setMp(150);
    }

    @Override
    public void heal(Hero hero) {
        if (getMp() < 5) {
            System.out.println("마나가 부족합니다");
            return;
        }
        hero.setHp(hero.getHp() + 25);
        setMp(getMp() - 5);
        System.out.println("힐을 시전했습니다. 대상 HP: " + hero.getHp());
    }

    public void superHeal(Hero hero) {
        if (getMp() < 50) {
            System.out.println("마나가 부족합니다");
            return;
        }

        hero.setHp(100);
        setMp(getMp() - 50);
        System.out.println("슈퍼 힐을 시전했습니다. 대상 HP: " + hero.getHp());
    }
}

