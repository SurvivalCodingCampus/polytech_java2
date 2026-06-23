package com.survivalcoding;

public class PoisonSlime extends Slime {
    private int poisonCount = 5;

    public PoisonSlime(String suffix) {
        super(suffix);
    }

    public int getPoisonCount() {
        return poisonCount;
    }

    @Override
    void attack(Hero hero) {
        if (poisonCount > 0) {
            super.attack(hero);
            System.out.println("추가로, 독 포자를 살포했다!");
            int poisonDamage = hero.getHp() / 5;
            hero.setHp(hero.getHp() - poisonDamage);
            System.out.println(poisonDamage + "포인트 데미지");
            poisonCount--;
            return;
        }
        if (poisonCount <= 0) {
            super.attack(hero);
        }
    }

}
