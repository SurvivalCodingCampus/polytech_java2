package com.survivalcoding;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class StrongBoxTest {
    @Test
    void StrongBoxTest() {
        //given

        StrongBox<String> box = new StrongBox<>(KeyType.PADLOCK);


        box.put("보물");

        for (int i = 0; i < 1023; i++) {
            assertNull(box.get());
        }

        assertEquals("보물", box.get());

    }

}