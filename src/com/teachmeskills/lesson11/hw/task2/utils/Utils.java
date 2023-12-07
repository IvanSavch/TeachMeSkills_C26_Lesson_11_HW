package com.teachmeskills.lesson11.hw.task2.utils;

public class Utils {
    public static void showWords (String string) {
        String[] splitWord = string.split(" ");
        for (int i = 0; i < splitWord.length; i++) {
            for (int j = 0; j < splitWord.length - i - 1; j++) {
                String s = splitWord[i];
                if (splitWord[i].length() > splitWord[i + 1].length()) {
                    splitWord[i] = splitWord[i + 1];
                    splitWord[i + 1] = s;
                }
            }
        }
        System.out.println("Longest words: " + splitWord[splitWord.length - 1]);
        System.out.println("The shortest word: " + splitWord[0]);
    }
}
