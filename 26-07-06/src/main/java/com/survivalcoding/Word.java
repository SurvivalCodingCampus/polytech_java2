package com.survivalcoding;

public class Word {
    private String letters;

    public Word(String letters) {
        this.letters = letters;
    }

    public boolean isVowel(int i) {
        if (i < 0 || i >= letters.length()) return false;
        String type = checkLetterType(letters.charAt(i));
        return type.equals("모음");
    }

    public boolean isConsonant(int i) {
        if (i < 0 || i >= letters.length()) return false;
        String type = checkLetterType(letters.charAt(i));
        return type.equals("자음");
    }

    private String checkLetterType(char c) {
        char ch = Character.toLowerCase(c);

        if (ch < 'a' || ch > 'z') return "예외";
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') return "모음";

        return "자음";
    }
}
