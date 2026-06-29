package com.survivalcoding;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class KeyTypeTest {
    int limit = KeyType.PADLOCK.getLimit();

    @Test
    @DisplayName("제네릭 Type 형태")
    void TYPETEST() {
        StrongBox<String> stringbox = new StrongBox<>(KeyType.PADLOCK);
        stringbox.put("1024 보물");

        StrongBox<Integer> intbox = new StrongBox<>(KeyType.PADLOCK);
        intbox.put(1004);

        for (int i = 0; i < limit; i++) {
            stringbox.get();
            intbox.get();
        }

        assertEquals("1024 보물", stringbox.get());
        assertEquals(1004, intbox.get());
    }

    @Test
    @DisplayName("null 반환")
    void NullTest() {
        StrongBox<String> stringbox = new StrongBox<>(KeyType.PADLOCK);
        stringbox.put("1024 보물");

        StrongBox<Integer> intbox = new StrongBox<>(KeyType.PADLOCK);
        intbox.put(1004);

        for (int i = 0; i < limit - 2; i++) {
            stringbox.get();
            intbox.get();
        }

        assertNull(stringbox.get());
        assertNull(intbox.get());
    }

}