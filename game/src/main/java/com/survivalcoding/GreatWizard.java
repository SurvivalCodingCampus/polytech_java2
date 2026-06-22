package com.survivalcoding;

public class GreatWizard extends Wizard {
    private int maxHp = 300;

    GreatWizard(String name, int hp, int mp) {
        super(name, hp, mp);
        setMp(150);
    }

    @Override
    void heal(Hero hero) {
        if (getMp() < 5) {
            System.out.println("마나가 부족합니다.");
        } else {
            setMp(getMp() - 5);
            hero.setHp(hero.getHp() + 25);
            System.out.println("힐을 시전했습니다. " + hero.getName() + " HP : " + hero.getHp());
        }
    }

    void superHeal(Hero hero) {
        if (getMp() < 50) {
            System.out.println("마나가 부족합니다.");
        } else {
            setMp(getMp() - 50);
            hero.setHp(hero.getMaxHp());
            System.out.println("슈퍼 힐을 시전했습니다. " + hero.getName() + " HP : " + hero.getHp());
        }
    }
}
