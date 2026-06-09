package com.survivalcoding;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClericTest {

    Cleric cleric;

    @BeforeEach
    void setUp() {
        cleric = new Cleric("아서스");
    }

    @Test
    void selfAid_WhenHpIsLow_ThenHpBecomesMaxAndMpDecreases() {
        // Given: HP가 20인 성직자
        cleric.HP = 20;

        // When: selfAid 사용
        cleric.selfAid();

        // Then: HP는 50(Max)
        assertEquals(50, cleric.HP);
    }

    @Test
    void pray_WhenTimeIsGiven_ThenMpIncreasesByTimeAndRandom() {
        // Given: MP가 0인 성직자
        cleric.MP = 0;
        int prayTime = 3;

        // When: 3초간 기도
        int recovered = cleric.pray(prayTime);

        // Then: 최소 3 이상 회복되고, MP 상태가 업데이트 된다
        assertTrue(recovered >= 3 && recovered <= 4);
        assertEquals(recovered, cleric.MP);
    }

    @Test
    void pray_WhenMpExceedsMax_ThenMpShouldBeMaxAndReturnOnlyNeededAmount() {
        // Given: MP가 8인 성직자 (MaxMP는 10)
        cleric.MP = 8;

        // When: 5초간 기도 (실제 회복 가능한 양은 2)
        int recovered = cleric.pray(5);

        // Then: MP는 10을 넘지 않고, 반환값은 실제 회복된 2여야 한다
        assertEquals(10, cleric.MP);
        assertEquals(2, recovered);
    }

    @Test
    void constructor_Test() {
        // Given + When : 이름 아서스 , HP 40 , MP 5
        Cleric c1 = new Cleric("아서스", 40, 5);

        // Then : 아서스 , 40 , 5 검증
        assertEquals("아서스", c1.name);
        assertEquals(40, c1.HP);
        assertEquals(5, c1.MP);

        // Given + When : 이름 아서스 , HP 35 , MaxMP 10
        Cleric c2 = new Cleric("아서스", 35);

        // Then : 아서스 , 35 , 10 검증
        assertEquals("아서스", c2.name);
        assertEquals(35, c2.HP);
        assertEquals(10, c2.MP);

        // Given + When : 이름 아서스 , MaxHP 50 , MaxMP 10 ( 이미 위에서 @BeforeEach로 생성된 인스턴스 활용 )

        // Then : 아서스 , 50 , 10 검증
        assertEquals("아서스", cleric.name);
        assertEquals(50, cleric.HP);
        assertEquals(10, cleric.MP);
    }
}