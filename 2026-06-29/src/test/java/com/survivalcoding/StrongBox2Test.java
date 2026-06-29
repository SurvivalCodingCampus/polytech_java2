package com.survivalcoding;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class StrongBox2Test {

    @Test
    @DisplayName("PADLOCK 열쇠는 1024번째 get 호출 전까지 null을 반환하고, 1024번째에 아이템을 반환해야 한다.")
    void padlockKeyTest() {
        // given
        StrongBox2<String> box = new StrongBox2<>(KeyType.PADLOCK);
        String treasure = "전설의 보검";
        box.put(treasure);

        // when
        for (int i = 1; i < 1024; i++) {
            assertNull(box.get());
        }

        String resultItem = box.get();

        // then
        assertEquals(treasure, resultItem);
    }

    @Test
    @DisplayName("BUTTON 열쇠는 10000번째 get 호출 전까지 null을 반환해야 한다.")
    void buttonKeyLimitTest() {
        // given
        StrongBox2<String> box = new StrongBox2<>(KeyType.BUTTON);
        box.put("황금 마차");

        // when
        String currentResult = null;
        for (int i = 1; i < 10000; i++) {
            currentResult = box.get();
        }

        // then
        assertNull(currentResult);
    }
}