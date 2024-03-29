package com.example.hangman.model;

public class SecretWord {
    private String word;
    private char[] charArray;

    public SecretWord(String word) {
        this.word = word;
        this.charArray = word.toCharArray();
    }

    public String getWord() {
        return word;
    }

    public char[] getCharArray() {
        return charArray;
    }

    public int length() {
        return charArray.length;
    }

    public void setWord(String word) {
        this.word = word;
        this.charArray = word.toCharArray();
    }
}
