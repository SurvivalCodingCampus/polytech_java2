package com.survivalcoding;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StrongBoxTest {

    @Test
    @DisplayName("금고에서 get() 메서드를 호출할 때 마다 사용횟수를 카운트하고 각 열쇠의 사용횟수에 도달하기 전에는 null을 리턴한다.\n" +
            "즉, 사용횟수에 도달하면 금고 안의 제품을 꺼낼 수 있다")
    void get() {
        for (KeyType keyType : KeyType.values()) {
            keyTypeTest(keyType);
        }
//        keyTypeTest(KeyType.PADLOCK);
//        keyTypeTest(KeyType.BUTTON);
//        keyTypeTest(KeyType.DIAL);
//        keyTypeTest(KeyType.FINGER);
    }

    // 헬퍼 메소드
    void keyTypeTest(KeyType keyType) {
        final String expected = "!!!";

        StrongBox<String> box = new StrongBox<>(keyType);
        box.put(expected);

        for (int i = 0; i < box.getMaxCount() - 1; i++) {
            assertNull(box.get());
        }

        String result = box.get();
        assertNotNull(result);
        assertEquals(expected, result);
    }
}