package com.survivalcoding;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordTest {

    @Test
    void isVowel() {
        Word w = new Word("eo");
        assertTrue(w.isVowel(1));
    }

    @Test
    void isConsonant() {
        Word w = new Word("dfd");

        assertTrue(w.isConsonant(2));
    }
}