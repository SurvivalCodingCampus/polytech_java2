package com.survivalcoding.day260609.day260609;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    @DisplayName("클레릭 생성자 테스트")
    void clericConstructorTest() {
        final String testName = "아서스";
        final int customHp = 35;
        final int customHp2 = 40;
        final int customMp = 5;

        Cleric c1 = new Cleric(testName, customHp2, customMp);

        assertEquals(testName, c1.name, "이름이 올바르게 설정되어야 합니다.");
        assertEquals(customHp2, c1.hp, "지정한 HP로 초기화되어야 합니다.");
        assertEquals(customMp, c1.mp, "지정한 MP로 초기화되어야 합니다.");

        Cleric c2 = new Cleric(testName, customHp);

        assertEquals(testName, c2.name);
        assertEquals(customHp, c2.hp);
        assertEquals(Cleric.maxMp, c2.mp, "MP를 지정하지 않으면 maxMp로 초기화되어야 합니다.");

        Cleric c3 = new Cleric(testName);

        assertEquals(testName, c3.name);
        assertEquals(Cleric.maxHp, c3.hp, "HP를 지정하지 않으면 maxHp로 초기화되어야 합니다.");
        assertEquals(Cleric.maxMp, c3.mp, "MP를 지정하지 않으면 maxMp로 초기화되어야 합니다.");
    }
}