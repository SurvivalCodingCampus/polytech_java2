package com.survivalcoding.day260608;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClericTest {

    @Test
    @DisplayName("selfAid를 사용하면 MP가 5 감소하고 HP가 최대치(50)로 회복되어야 한다")
    void selfAidTest() {
        // Given (준비)
        Cleric cleric = new Cleric();
        cleric.name = "성직자";
        cleric.hp = 10; // 테스트를 위해 HP를 낮춤

        // When (실행)
        cleric.selfAid();

        // Then (검증)
        assertEquals(50, cleric.hp, "HP가 maxHp(50)로 회복되어야 합니다.");
        assertEquals(5, cleric.mp, "MP가 5 감소하여 5가 되어야 합니다.");
    }

    @Test
    @DisplayName("pray를 사용하면 MP가 회복되어야 한다")
    void prayTest() {
        // Given
        Cleric cleric = new Cleric();
        cleric.name = "성직자";
        cleric.mp = 3; // 회복량을 확인하기 위해 MP를 낮춤

        // When
        // 3초 동안 기도하면 nextInt(3, 5)이므로 3 또는 4가 회복됩니다.
        int recoveryMp = cleric.pray(3);

        // Then
        // 1. 최종 MP 검증: 기존 3 + 회복량(3~4)이므로 최종 MP는 6 또는 7이 되어야 합니다.
        assertTrue(cleric.mp == 6 || cleric.mp == 7, "최종 MP는 6 또는 7이어야 합니다.");

        // 2. 리턴값 검증: 메서드가 반환한 회복량(recoveryMp)은 3 또는 4여야 합니다.
        assertTrue(recoveryMp == 3 || recoveryMp == 4, "반환된 회복량은 3 또는 4여야 합니다.");
    }
}