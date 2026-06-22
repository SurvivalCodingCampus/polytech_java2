package com.survivalcoding;

public class GreatWizard extends Wizard {
    int mp = 150;

    public GreatWizard(int mp) {
        super.wizard(mp);
    }


    public void heal(Hero hero) {
        super.heal(hero);
        super.setMp(getMp() + 5);
        hero.setHp(hero.getHp() + 5);
    }

    public void superHeal(Hero hero) {
        super.setMp(getMp() - 40);
        hero.maxHp();
        System.out.println("슈퍼 힐을 시전 했습니다. 대상 HP: " + hero.getHp());
    }
}
