package com.survivalcoding;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClericTest {

    @Test
    @DisplayName("selfAid를 하면 mp가 5 소모되고 hp가 최대(50)가 된다")
    void selfAid() {
        // Given
        Cleric cleric = new Cleric();
        cleric.HP = 10;
        cleric.MP = 10;

        // When
        cleric.selfAid();

        // Then
        assertEquals(50, cleric.HP, "HP는 최대 HP(50)로 회복되어야 합니다.");
        assertEquals(5, cleric.MP, "MP는 5가 소모되어 5가 남아야 합니다.");
    }

    @Test
    @DisplayName("pray를 하면 기도한 시간(초)과 랜덤 값을 더해 MP를 회복한다.")
    void pray() {
        // Given
        Cleric cleric = new Cleric();
        cleric.MP = 5;
        int sec = 3;

        // When
        int actualRecover = cleric.pray(sec);

        // Then
        System.out.println("실제 회복된 MP: " + actualRecover);

        // 3초 기도하면 회복량은 3 + 0~2 이므로 3~5 사이
        assertTrue(actualRecover >= 3 && actualRecover <= 5,
                "3초 기도하면 실제 회복량은 3~5 사이여야 합니다.");

        // 기존 MP 5에서 actualRecover만큼 회복되어야 함
        assertEquals(5 + actualRecover, cleric.MP,
                "MP는 실제 회복량만큼 증가해야 합니다.");

        // 최대 MP 10을 넘으면 안 됨
        assertTrue(cleric.MP <= 10,
                "MP는 최대 MP(10)를 넘으면 안 됩니다.");
    }
}