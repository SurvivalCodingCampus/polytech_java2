package com.survivalcoding;

public class PoisonSlime extends Slime {
    private int poisonCount = 5;

    public int getPoisonCount() {
        return poisonCount;
    }

    public void setPoisonCount(int poisonCount) {
        this.poisonCount = poisonCount;
    }

    public PoisonSlime(String name) {
        super(name);
    }

    @Override
    void attack(Hero hero) {

        if (this.getPoisonCount() > 0) {
            super.attack(hero);
            System.out.println("추가로, 독 포자를 살포했다!");
            hero.setHp(hero.getHp() - (int) (hero.getHp()) / 5);
            System.out.println("~포인트 데미지");
            this.poisonCount--;
        } else {
            super.attack(hero);
        }
    }
}
