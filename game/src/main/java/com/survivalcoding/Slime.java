package com.survivalcoding;

public class Slime {
    private static final int DEFAULT_HP = 50;
    private static final int ATTACK_DAMAGE = 10;

    final String suffix;
    int hp = DEFAULT_HP;

    public Slime(String suffix) {
        this.suffix = suffix;
    }

    public String getSuffix() {
        return suffix;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    void attack(Hero hero) {
        System.out.println("슬라임 " + suffix + "이/가 공격했다");
        System.out.println(ATTACK_DAMAGE + "의 데미지");

        hero.setHp(hero.getHp() - ATTACK_DAMAGE);
    }
}
