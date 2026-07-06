package com.survivalcoding;

public class Word {
    private String letters;

    public Word(String letters) {
        this.letters = letters;
    }

    // i번째 글자가 모음인지?
    public boolean isVowel(int i) {
        if (letters == null || i < 0 || i >= letters.length()) {
            return false;
        }
        String target = letters.substring(i, i + 1).toLowerCase();
        return "aeiou".contains(target);
    }
}
