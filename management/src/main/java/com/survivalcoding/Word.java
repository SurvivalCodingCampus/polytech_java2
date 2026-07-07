package com.survivalcoding;

public class Word {
    private String letters;

    public Word(String letters) {
        this.letters = letters;
    }

    public String getLetters() {
        return letters;
    }

    public void setLetters(String letters) {
        this.letters = letters;
    }

    @Override
    public String toString() {
        return "Word{" +
                "letters='" + letters + '\'' +
                '}';
    }

    // 퀴즈 1) 영어 모음 판별 (대소문자 모두 지원)
    public boolean isVowel(int i) {
        char lower = Character.toLowerCase(letters.charAt(i));
        return lower == 'a' || lower == 'e' || lower == 'i' || lower == 'o' || lower == 'u';
    }

    // 퀴즈 2) 영어 자음 판별 (일관성을 위해 int i를 받도록 수정)
    public boolean isConsonant(int i) {
        char ch = letters.charAt(i);
        if (!Character.isLetter(ch)) return false; // 알파벳이 아니면 false

        return !isVowel(i); // 알파벳인데 모음이 아니면 무조건 자음
    }


}
