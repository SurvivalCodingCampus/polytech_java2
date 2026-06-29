package com.survivalcoding;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class StrongBoxTest {
    @Test
    @DisplayName("내구도가 0 이된 다음 회차엔 금고안의 제품이 나와야 한다")
    void UNKNOWN() {
        StrongBox<KeyType> strongBox = new StrongBox<>(KeyType.PADLOCK);
        StrongBox<KeyType> strongBox1 = new StrongBox<>(KeyType.BUTTON);
        StrongBox<KeyType> strongBox2 = new StrongBox<>(KeyType.DIAL);
        StrongBox<KeyType> strongBox3 = new StrongBox<>(KeyType.FINGER);


        strongBox.put(KeyType.PADLOCK);
        strongBox1.put(KeyType.BUTTON);
        strongBox2.put(KeyType.DIAL);
        strongBox3.put(KeyType.FINGER);
        for (int i = 0; i < 1024; i++) {
            assertNull(strongBox.get());
        }
        assertEquals(KeyType.PADLOCK, strongBox.get());

        for (int i = 0; i < 10000; i++) {
            assertNull(strongBox1.get());
        }
        assertEquals(KeyType.BUTTON, strongBox1.get());

        for (int i = 0; i < 30000; i++) {
            assertNull(strongBox2.get());
        }
        assertEquals(KeyType.DIAL, strongBox2.get());

        for (int i = 0; i < 1000000; i++) {
            assertNull(strongBox3.get());
        }
        assertEquals(KeyType.FINGER, strongBox3.get());
    }

}