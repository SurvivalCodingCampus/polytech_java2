package com.survivalcoding;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClericTest {

    @Test
    @DisplayName("코드를 재확인 하셔야 합니다.")
    void main() {
        // given(준비)
        int MP, MaxHP, MaxMP;

        // when(실행)
        Cleric cleric = new Cleric("Cleric");

        // then(검증)
        
        cleric.hp = 50;
        cleric.mp = 10;
        MaxHP = Cleric.maxHp;
        MaxMP = Cleric.maxMp;
        System.out.println(cleric.name + " Create");
        assertEquals("Cleric", cleric.name, "Cleric 캐릭터를 생성하지 못했습니다.");

        cleric.selfAid();
        System.out.println(cleric.name + " MP -5");
        assertEquals(5, cleric.mp, "Cleric MP 5가 소모되어야 합니다.");
        System.out.println("Now MP " + cleric.mp);
        assertEquals(5, cleric.mp, "현재 MP 5가 되지 않았습니다..");

        int result = cleric.pray(1);
        System.out.println(result);
        assertTrue(result >= 0 || result < 5, "MP 회복량이 정상적으로 회복되지 않았습니다.");
        System.out.println("Now MP " + cleric.mp);
    }
}