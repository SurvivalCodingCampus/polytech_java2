package com.survivalcoding;

public class PoisonSlime extends Slime {

    private int poisonCount = 5;    //독 공격 가능 횟수

    public PoisonSlime(String suffix) {
        super(suffix);
    }

    @Override
    public void attack(Hero hero) {
        super.attack(hero);

        if (poisonCount != 0) {
            System.out.println("추가로, 독 포자를 살포했다!");
            int poisonDamage = hero.getHp() / 5;    //독데미지
            hero.setHp(hero.getHp() - poisonDamage);
            System.out.println(poisonDamage + "포인트 데미지");
            this.poisonCount--; //독 공격 가능 횟수 차감
        }
    }

}
