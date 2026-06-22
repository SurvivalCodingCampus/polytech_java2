package com.survivalcoding;

public class GreatWizard extends Wizard {
    private static final int INITIAL_MP = 150;
    private static final int HEAL_POINT = 25;
    private static final int HEAL_MP_COST = 5;
    private static final int SUPER_HEAL_MP_COST = 50;

    public GreatWizard() {
        setMp(INITIAL_MP);
    }

    @Override
    public void heal(Hero hero) {
        if (getMp() < HEAL_MP_COST) {
            System.out.println("마나가 부족합니다");
            return;
        }

        hero.setHp(hero.getHp() + HEAL_POINT);
        setMp(getMp() - HEAL_MP_COST);

        System.out.println("힐을 시전했습니다. 대상 HP: " + hero.getHp());
    }

    public void superHeal(Hero hero) {
        if (getMp() < SUPER_HEAL_MP_COST) {
            System.out.println("마나가 부족합니다");
            return;
        }

        hero.setHp(Hero.MAX_HP);
        setMp(getMp() - SUPER_HEAL_MP_COST);

        System.out.println("슈퍼 힐을 시전했습니다. 대상 HP: " + hero.getHp());
    }
}