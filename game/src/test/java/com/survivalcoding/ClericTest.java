package com.survivalcoding;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClericTest {

    @Test
    @DisplayName("selfAid를 하면 mp가 -5 HP가 최대가된다")
    void selfAid() {
        //준비
        Cleric cleric = new Cleric();
        cleric.HP = 1;
        cleric.MP = 10;

        //실행
        cleric.selfAid();

        //검증
        assertEquals(50, cleric.HP);
    }

    @Test
    @DisplayName("pray를 사용하면 기도한 초+0~2의 값을 mp회복된다")
    void pray() {
        //준비
        Cleric cleric = new Cleric();
        cleric.HP = 50;
        cleric.MP = 0;

        //실행
        int cost = cleric.pray(1);
        cleric.MP += cost;

        //검증
        assertEquals(0 + cost, cleric.MP);
    }
}