package com.survivalcoding;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class test2Test {
    @Test
    void pathTest() {
        test2 t = new test2();
        assertEquals("C:\\dev\\abc.txt", t.getPath("C:\\dev", "abc.txt"));
        assertEquals("C:\\dev\\abc.txt", t.getPath("C:\\dev\\", "abc.txt"));
    }
}