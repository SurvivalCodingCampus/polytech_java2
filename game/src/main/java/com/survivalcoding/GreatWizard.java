package com.survivalcoding;

public class GreatWizard extends Wizard {

    public GreatWizard(String name, int hp, int maxhp, int mp, int maxmp) {
        super(name, hp, maxhp, mp, maxmp);
    }

    @Override
    public void heal(Hero hero) {
        if (mp >= 5) {
            mp -= 5;
            hero.incrementHP(25);
            System.out.printf("대마법사의 강력한 힐! %s HP : %d\n", hero.getName(), hero.getHp());
        } else {
            System.out.println("마나가 부족합니다.");
        }
    }

    public void SuperHeal(Hero hero) {
        if (mp >= 50) {
            mp -= 50;
            hero.incrementHP(hero.getMaxhp()); // 최대 체력만큼 힐
            System.out.printf("슈퍼 힐을 시전했습니다. %s HP : %d\n", hero.getName(), hero.getHp());
        } else {
            System.out.println("마나가 부족합니다.");
        }
    }
}