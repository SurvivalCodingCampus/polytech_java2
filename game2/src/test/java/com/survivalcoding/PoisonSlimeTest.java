package com.survivalcoding;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.survivalcoding.Hero.MaxHP;
import static org.junit.jupiter.api.Assertions.assertEquals;


class PoisonSlimeTest {

    @Test
    @DisplayName("A라는 PoisonSlime이 공격하면 보통슬라임과 같은 공격을 한 후 추가로 독데미지를 살포 해야한다")
    void attack() {
        int testHp = MaxHP;
        int testCount = 5;


        Hero hero = new Hero();
        PoisonSlime poisonSlime = new PoisonSlime("A");

        hero.setHp(testHp);
        poisonSlime.setPoisonCount(testCount);
        poisonSlime.attack(hero);

        assertEquals(MaxHP - 10 - ((MaxHP - 10) / 5), hero.getHp());

    }

    @Test
    @DisplayName("PoisonCount 가 1보다 작아지면 독데미지가 들어가면 안된다")
    void attack2() {
        int testHp = MaxHP;
        int testCount = 0;

        Hero hero = new Hero();
        PoisonSlime poisonSlime = new PoisonSlime("A");

        hero.setHp(testHp);
        poisonSlime.setPoisonCount(testCount);
        poisonSlime.attack(hero);

        assertEquals(testHp - 10, hero.getHp());
    }
}