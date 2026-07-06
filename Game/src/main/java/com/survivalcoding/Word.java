package com.survivalcoding;

public class Word {
    private String letters;

    public Word(String letters) {
        this.letters = letters;
    }

    public boolean isVowel(int i) {
        return letters.substring(i, i + 1).equals("a")
                || letters.substring(i, i + 1).equals("e")
                || letters.substring(i, i + 1).equals("i")
                || letters.substring(i, i + 1).equals("o")
                || letters.substring(i, i + 1).equals("u");
    }

    public boolean isConsonant(int i) {
        return !letters.substring(i, i + 1).equals("a")
                && !letters.substring(i, i + 1).equals("e")
                && !letters.substring(i, i + 1).equals("i")
                && !letters.substring(i, i + 1).equals("o")
                && !letters.substring(i, i + 1).equals("u");
    }
}