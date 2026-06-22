package com.survivalcoding;
//Slime (부모) -> Extends Slime(자식)

public class PoisonSlime extends Slime {
    private int poisonCnt = 5;

    public PoisonSlime(String suffix) {
        super(suffix);
    }


    @Override
    public void attack(Hero hero) {
        super.attack(hero);
        if (poisonCnt > 0) {
            System.out.println("슬라임 " + suffix + " 독 살포!");
            int damage = hero.getHp() / 5;
            hero.setHp(hero.getHp() - damage);
            System.out.println(damage + " 포인트 데미지");
            poisonCnt--;
        }

    }
}
