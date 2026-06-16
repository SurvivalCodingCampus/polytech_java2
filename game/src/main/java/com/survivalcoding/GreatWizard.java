package com.survivalcoding;

public class GreatWizard extends Wizard {
    private int maxHp = 300;

    GreatWizard(String name, int hp, int mp) {
        super(name, hp, mp);
        setMp(150);
    }

    @Override
    void heal() {
        if (getMp() < 5) {
            System.out.println("마나가 부족합니다.");
        } else {
            setMp(getMp() - 5);
            setHp(getHp() + 25);
            System.out.println("힐을 시전했습니다. " + getName() + " HP : " + getHp());
        }
    }

    void superHeal() {
        if (getMp() < 50) {
            System.out.println("마나가 부족합니다.");
        } else {
            setMp(getMp() - 50);
            setHp(maxHp);
            System.out.println("슈퍼 힐을 시전했습니다. " + getName() + " HP : " + getHp());
        }
    }
}
