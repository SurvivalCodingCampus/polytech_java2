package com.survivalcoding;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PoisonSlimeTest {

    @Test
    void attack() {
        //준비
        String name = "모험가";
        String suffix = "A";
        int hp = 100;
        int nattack;
        Hero hero = new Hero(name, hp);
        PoisonSlime poisonSlime = new PoisonSlime(suffix);
        //실행
        poisonSlime.attack(hero);
        //검증
        assertEquals(72, hero.getHP());
        assertEquals(4, poisonSlime.getPoisonCount());
        //실행
        poisonSlime.attack(hero);
        //검증
        assertEquals(50, hero.getHP());
        assertEquals(3, poisonSlime.getPoisonCount());
    }
}