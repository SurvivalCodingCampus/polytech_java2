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

    public boolean isVowel(int i) {
        if (letters.substring(i, i + 1).equals("a") || letters.substring(i, i + 1).equals("A")) {
            return true;
        } else if (letters.substring(i, i + 1).equals("e") || letters.substring(i, i + 1).equals("E")) {
            return true;
        } else if (letters.substring(i, i + 1).equals("i") || letters.substring(i, i + 1).equals("I")) {
            return true;
        } else if (letters.substring(i, i + 1).equals("o") || letters.substring(i, i + 1).equals("O")) {
            return true;
        }
        return (letters.substring(i, i + 1).equals("u")) || (letters.substring(i, i + 1).equals("U"));
    }

    public boolean isConsonant(int i) {
        return !this.isVowel(i);
    }
}
