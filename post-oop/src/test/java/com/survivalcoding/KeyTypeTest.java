package com.survivalcoding;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KeyTypeTest {
    private final int PADLOCK_NUMBER = 1024;
    private final int NULL_NUMBER = 512;

    @Test
    @DisplayName("제네릭 Type 형태")
    void TYPETEST() {
        StrongBox<String> stringbox = new StrongBox<>(KeyType.PADLOCK);
        stringbox.put("1024 보물");

        StrongBox<Integer> intbox = new StrongBox<>(KeyType.PADLOCK);
        intbox.put(1004);

        for (int i = 0; i < PADLOCK_NUMBER; i++) {
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

        for (int i = 0; i < NULL_NUMBER; i++) {
            stringbox.get();
            intbox.get();
        }

        assertEquals(null, stringbox.get());
        assertEquals(null, intbox.get());
    }

}