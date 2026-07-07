package com.survivalcoding;

public class Word {
    private String letters;

    public Word(String letters) {
        this.letters = letters;
    }

    // i번째 글자가 모음인지?
    public boolean isVowel(int i) {
        return letters.substring(i, i + 1).equals("a");
    }
    // i번째 글자가 자음인지?

    public boolean isConsonant(int i) {
        return false;
    }

}
