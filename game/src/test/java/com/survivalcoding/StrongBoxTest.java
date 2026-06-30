package com.survivalcoding;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class StrongBoxTest {
    @Test
    void get() {

        KeyType keyType;
        final String extended = "!!!";


        StrongBox<String> box = new StrongBox<>(KeyType.PADLOCK);
        for (int i = 0; i < box.MaxCount() - 1; i++) {
            assertNull(box.get());
        }
//        @Contract(pure = true)
//        for (int i = 0; i < KeyType.getLimit() - 1; i++) {
//            assertNull(box.get());
//        }

        assertEquals("보물", box.get());

    }

}