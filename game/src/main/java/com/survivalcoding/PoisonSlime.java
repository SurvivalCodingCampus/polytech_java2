package com.survivalcoding;

public class PoisonSlime extends Slime {
    private int poisonCount = 5;

    public PoisonSlime(String suffix) {
        super(suffix, 50);
    }

    @Override
    public void attack(Hero hero) {
        super.attack(hero);

        if (this.poisonCount > 0) {
            System.out.println("추가로 독 포자를 살포했다!");
            int poisonDamage = hero.getHP() / 5;
            hero.setHP(hero.getHP() - poisonDamage);
            System.out.println(poisonDamage + "포인트 데미지");
            this.poisonCount--;
        }
    }

    public int getPoisonCount() {
        return poisonCount;
    }
}
