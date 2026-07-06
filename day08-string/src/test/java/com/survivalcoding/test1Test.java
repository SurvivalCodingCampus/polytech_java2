package com.survivalcoding;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class test1Test {
    @Test
    void creatStringTest() {
        StringBuilder str = new StringBuilder();
        for (int i = 1; i <= 100; i++) {
            str.append(String.format("%d,", i));
        }
        String[] a = str.toString().split(",");

        assertEquals("1", a[0]);
        assertEquals("100", a[99]);
        assertEquals(100, a.length);
    }
}