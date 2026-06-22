package com.survivalcoding;

public class PoisonSlime extends Slime {
    private static final int INITIAL_POISON_COUNT = 5;
    private static final int POISON_DAMAGE_DIVISOR = 5;

    private int poisonCount = INITIAL_POISON_COUNT;

    public PoisonSlime(String suffix) {
        super(suffix);
    }

    @Override
    void attack(Hero hero) {
        super.attack(hero);
        if (poisonCount > 0) {
            System.out.println("추가로, 독 포자를 살포했다!");

            int poisonDamage = hero.getHp() / POISON_DAMAGE_DIVISOR;
            hero.setHp(hero.getHp() - poisonDamage);

            System.out.println(poisonDamage + "포인트 데미지");

            poisonCount--;
        }
    }

    public int getPoisonCount() {
        return poisonCount;
    }
}
