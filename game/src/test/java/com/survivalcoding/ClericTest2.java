package com.survivalcoding;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClericTest2 {

    @Test
    void main() {
        Cleric cleric = new Cleric("아서스", 40, 5);
        // 객체가 제대로 생성되었는지 눈으로 확인 시스템
        System.out.println(cleric.name + " " + cleric.hp + " " + cleric.mp);
        assertEquals("아서스", cleric.name, "캐릭터 이름이 다릅니다.");
        assertEquals(40, cleric.hp, "HP가 40이어야 합니다.");
        assertEquals(5, cleric.mp, "MP가 5이어야 합니다.");

        Cleric cleric2 = new Cleric("아서스", 35);
        // 객체 이름, HP, 최대 MP 생성되었는지 눈으로 확인 시스템
        System.out.println(cleric2.name + " " + cleric2.hp + " " + cleric2.mp);
        assertEquals("아서스", cleric2.name, "캐릭터 이름이 다릅니다.");
        assertEquals(35, cleric2.hp, "HP가 35이어야 합니다.");
        assertEquals(10, cleric2.mp, "MP가 10이어야 합니다.");

        Cleric cleric3 = new Cleric("아서스");
        // 객체 이름, 최대 HP, 최대 MP 생성되었는지 눈으로 확인 시스템
        System.out.println(cleric3.name + " " + cleric3.hp + " " + cleric3.mp);
        assertEquals("아서스", cleric.name, "캐릭터 이름이 다릅니다.");
        assertEquals(50, cleric3.hp, "HP가 50이어야 합니다.");
        assertEquals(10, cleric3.mp, "MP가 10이어야 합니다.");

        // 다음과 같이 부르면 컴파일 자체가 되지 않음.
//        Cleric cleric4 = new Cleric();
    }
}