import com.survivalcoding.Word;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class WordTest {

    @Test
    @DisplayName("Word 클래스의 자음/모음 및 예외 처리 통합 테스트")
    void testword() {
        Word apple = new Word("Apple");

        // 대소문자 모음 검증
        assertTrue(apple.isVowel(0), "'A' -> 모음 (true)");
        assertTrue(apple.isVowel(4), "'e' -> 모음 (true)");
        assertFalse(apple.isVowel(1), "'p' -> 자음이므로 모음 아님 (false)");

        // 자음 검증
        assertTrue(apple.isConsonant(1), "'p' -> 자음 (true)");
        assertFalse(apple.isConsonant(0), "'A' -> 모음이므로 자음 아님 (false)");

        // 예외 처리
        Word mixed = new Word("a1!");

        // 숫자와 특수문자 검증
        assertFalse(mixed.isVowel(1));
        assertFalse(mixed.isConsonant(1));
        assertFalse(mixed.isVowel(2));
        assertFalse(mixed.isConsonant(2));

        // 0미만 인덱스
        assertFalse(mixed.isVowel(-1));
        assertFalse(mixed.isConsonant(-1));

        // 길이 초과 인덱스
        assertFalse(mixed.isVowel(100));
        assertFalse(mixed.isConsonant(100));

        // 문자 길이와 같은 인덱스
        assertFalse(mixed.isVowel(3));
        assertFalse(mixed.isConsonant(3));
    }
}