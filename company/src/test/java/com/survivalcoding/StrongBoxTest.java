package com.survivalcoding;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StrongBoxTest {
    final String testStringPut = "Test";
    StrongBox<String> testStringBox;
    int repeatCount;

    @Test
    @DisplayName("금고 생성 여부 확인")
    void put() {
        // Given
        testStringBox = new StrongBox<>();
        // When
        testStringBox.put(testStringPut);

        // then
        assertEquals(testStringPut, testStringBox.get(), "생성 실패");
    }

    @Test
    @DisplayName("열쇠 별 사용 횟수 확인")
    void get() {
        // Given
        KeyType[] keys = new KeyType[4];
        keys[0] = KeyType.PADLOCK;
        keys[1] = KeyType.BUTTON;
        keys[2] = KeyType.DIAL;
        keys[3] = KeyType.FINGER;

        testStringBox = new StrongBox<>();

        testStringBox.put(testStringPut);

        // When - then
        for (KeyType key : keys) {
            for (repeatCount = 0; repeatCount < key.getMaxDurability() - 1; repeatCount++) {
                assertNull(testStringBox.get(key), repeatCount + "번째에서 Null값이 반환되지 않음");
            }
            assertNotNull(testStringBox.get(key), "사용 횟수에 도달했음에도 값이 반환되지 않음");
            assertEquals(repeatCount + 1, key.getMaxDurability(), "반환된 값이 실제 횟수와 다름");
        }
    }

}