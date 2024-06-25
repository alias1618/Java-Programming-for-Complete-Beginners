package com.in28minutes.arrays._27_Coding_Exercise_Longest_Word_Finder;

public class StringMagic {
    public String findLongestWord(String sentence) {
        if (sentence.isEmpty()) {
        return "";
    }
    String[] words = sentence.split(" ");
    String longestWord = "";
    int maxLength = 0;

        for (String word : words) {
        if (word.length() > maxLength) {
            longestWord = word;
            maxLength = word.length();
        }
    }

    return longestWord;
    }
}
