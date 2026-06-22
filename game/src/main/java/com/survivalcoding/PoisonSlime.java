package com.survivalcoding;

public class PoisonSlime extends Slime{
    private int poisonCount = 5;


    public PoisonSlime(String suffix, int hp) {
        super(suffix, hp);
    }
    public PoisonSlime(String suffix) {
        super(suffix, 15); // 기본 독슬라임 hp 값: 15
    }

    @Override
    void attack(Hero hero) {
        super.attack(hero);

        if (poisonCount != 0){
            System.out.println("추가로 독 포자를 살포했다!");
            int poisonDemage = (int)(hero.getHp() / 5);
            hero.setHp(hero.getHp() - poisonDemage);

            poisonCount -= 1;
        }
    }



}
