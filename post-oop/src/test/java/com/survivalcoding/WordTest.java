package com.survivalcoding;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class WordTest {
    private final int VOWEL = 3;
    private final int CONSO = 0;
    private final String LETTER1 = "Banana";
    private final String LETTER2 = "Strawberry";

    @Test
    @DisplayName("i 번째 모음인지 테스트 A, E, I, O, U")
    void loVowel() {
        Word word1 = new Word(LETTER1);
        Word word2 = new Word(LETTER2);

        assertTrue(word1.isVowel(VOWEL));
        assertTrue(word2.isVowel(VOWEL));

        assertFalse(word1.isVowel(CONSO));
        assertFalse(word2.isVowel(CONSO));
    }

    @Test
    @DisplayName("i 번째 자음인지 테스트 A, E, I, O, U 이외")
    void ConsonantTest() {
        Word word1 = new Word(LETTER1);
        Word word2 = new Word(LETTER2);

        assertTrue(word1.isConsonant(CONSO));
        assertTrue(word2.isConsonant(CONSO));

        assertFalse(word1.isConsonant(VOWEL));
        assertFalse(word2.isConsonant(VOWEL));
    }
}