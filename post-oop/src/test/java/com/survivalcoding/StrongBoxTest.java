package com.survivalcoding;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StrongBoxTest {

    @Test
    void test() {

        StrongBox<Integer> box =
                new StrongBox<>(KeyType.PADLOCK);

        box.put(100);

        for (int i = 0; i < 1023; i++) {
            assertNull(box.get());
        }

        assertEquals(100, box.get());

    }

}