package com.survivalcoding.day260706;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordTest {
    private static final int TARGET_INDEX = 0;
    private static final String VOWEL_WORD = "apple";
    private static final String CONSONANT_WORD = "banana";

    @Test
    void isVowel() {
        Word vowelWord = new Word(VOWEL_WORD);
        Word consonantWord = new Word(CONSONANT_WORD);

        assertTrue(vowelWord.isVowel(TARGET_INDEX), "첫 글자 'a'는 모음이어야 합니다.");
        assertFalse(consonantWord.isVowel(TARGET_INDEX), "첫 글자 'b'는 모음이 아니어야 합니다.");
    }

    @Test
    void isConsonant() {
        Word vowelWord = new Word(VOWEL_WORD);
        Word consonantWord = new Word(CONSONANT_WORD);

        assertTrue(consonantWord.isConsonant(TARGET_INDEX), "첫 글자 'b'는 자음이어야 합니다.");
        assertFalse(vowelWord.isConsonant(TARGET_INDEX), "첫 글자 'a'는 자음이 아니어야 합니다.");
    }
}