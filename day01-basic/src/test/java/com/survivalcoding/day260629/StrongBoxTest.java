package com.survivalcoding.day260629;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StrongBoxTest {

    // 매직 넘버를 제거하기 위한 상수 정의
    private static final int LIMIT_PADLOCK = 1024;
    private static final int LIMIT_BUTTON = 10000;

    @Test
    @DisplayName("다양한 데이터 타입(String, Integer, 객체)이 제네릭하게 잘 작동하는지 테스트")
    void testVariousGenericTypes() {
        // String 타입 테스트
        StrongBox<String> stringBox = new StrongBox<>(KeyType.PADLOCK);
        stringBox.put("비밀 문서");

        // Integer 타입 테스트
        StrongBox<Integer> integerBox = new StrongBox<>(KeyType.PADLOCK);
        integerBox.put(7777);

        // 사용자 정의 객체 타입 테스트
        class Jewelry { }
        StrongBox<Jewelry> objectBox = new StrongBox<>(KeyType.PADLOCK);
        Jewelry myGold = new Jewelry();
        objectBox.put(myGold);

        // 한도 직전까지 열기
        for (int i = 0; i < LIMIT_PADLOCK - 1; i++) {
            stringBox.get();
            integerBox.get();
            objectBox.get();
        }

        // LIMIT_PADLOCK 번째 호출 시 각 타입별 데이터가 형변환 없이 정확히 나오는지 검증
        assertEquals("비밀 문서", stringBox.get());
        assertEquals(7777, integerBox.get());
        assertEquals(myGold, objectBox.get());
    }

    @Test
    @DisplayName("열쇠 종류별(PADLOCK, BUTTON)로 사용 횟수 한도가 독립적으로 정확히 작동하는지 테스트")
    void testKeyTypeLimitsAndCounters() {
        // 1. PADLOCK 금고 (한도 1024)
        StrongBox<String> padlockBox = new StrongBox<>(KeyType.PADLOCK);
        padlockBox.put("패드락 보물");

        // 2. BUTTON 금고 (한도 10000)
        StrongBox<String> buttonBox = new StrongBox<>(KeyType.BUTTON);
        buttonBox.put("버튼 보물");

        // PADLOCK 한도 직전까지는 둘 다 null이어야 함
        for (int i = 1; i < LIMIT_PADLOCK; i++) {
            assertNull(padlockBox.get());
            assertNull(buttonBox.get());
        }

        // 정확히 1024번째 호출 시 PADLOCK 금고는 열려야 하고, BUTTON 금고는 아직 안 열려야 함
        assertEquals("패드락 보물", padlockBox.get());
        assertNull(buttonBox.get(), "BUTTON 금고는 1024번 호출로 열리면 안 됩니다.");

        // BUTTON 금고를 한도 직전(9999번째)까지 추가 호출
        for (int i = LIMIT_PADLOCK; i < LIMIT_BUTTON - 1; i++) {
            assertNull(buttonBox.get());
        }

        // 정확히 10000번째 호출 시 BUTTON 금고도 열려야 함
        assertEquals("버튼 보물", buttonBox.get());
    }

    @Test
    @DisplayName("생성자에 열쇠(KeyType) 정보가 null로 들어왔을 때 예외가 발생하는지 확인")
    void testNullKeyTypeException() {
        // 생성 시점에 의도치 않게 null이 들어오는 비정상적인 상황에 대응하는지 검증
        // 만약 StrongBox 생성자에서 null 체크를 안 하면 get() 호출 시 NullPointerException이 납니다.
        assertThrows(NullPointerException.class, () -> {
            StrongBox<String> brokenBox = new StrongBox<>(null);
            brokenBox.get();
        });
    }
}