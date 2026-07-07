package com.survivalcoding.day260706;

public class Word {
    private String letters;

    public Word(String letters) {
        this.letters = letters;
    }

    /**
     * i번째 글자가 모음인지?
     */
    public boolean isVowel(int i) {
        return letters.substring(i, i + 1).matches("[aeiou]");
    }

    /**
     * i번째 글자가 자음인지?
     */
    public boolean isConsonant(int i) {
        return !isVowel(i);
    }
}
