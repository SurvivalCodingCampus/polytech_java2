package com.survivalcoding;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WordTest {

    @Test
    void isVowel() {
        String letters = "apple";
        // 'a'(true), 'p'(false), 'p'(false), 'l'(false), 'e'(true)
        boolean[] expectedResults = {true, false, false, false, true};

        Word word = new Word(letters);


        for (int i = 0; i < letters.length(); i++) {
            boolean actual = word.isVowel(i);

            // i번째 글자를 substring으로 추출하여 실패 메시지에 활용
            String currentLetter = letters.substring(i, i + 1);

            // assertEquals(기댓값, 실제값, 실패 시 출력할 메시지)
            assertEquals(expectedResults[i], actual, i + "번째 인덱스 ('" + currentLetter + "') 검증 실패");
        }

    }

    @Test
    void isConsonant() {
        String letters = "apple";
        // 'a'(false), 'p'(true), 'p'(true), 'l'(true), 'e'(false)
        boolean[] expectedResults = {false, true, true, true, false};

        Word word = new Word(letters);


        for (int i = 0; i < letters.length(); i++) {
            boolean actual = word.isConsonant(i);

            // i번째 글자를 substring으로 추출하여 실패 메시지에 활용
            String currentLetter = letters.substring(i, i + 1);

            // assertEquals(기댓값, 실제값, 실패 시 출력할 메시지)
            assertEquals(expectedResults[i], actual, i + "번째 인덱스 ('" + currentLetter + "') 검증 실패");
        }
    }
}