package com.survivalcoding;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class test3Test {
    @Test
    void basicFormatTest() {
        assertTrue("hello".matches(".*"));
        assertTrue("A5".matches("A\\d\\d?"));
        assertTrue("A52".matches("A\\d\\d?"));
        assertFalse("A5X".matches("A\\d\\d?"));
        assertTrue("UABC".matches("U[A-Z]{3}"));
        assertFalse("Uabc".matches("U[A-Z]{3}"));
    }
}