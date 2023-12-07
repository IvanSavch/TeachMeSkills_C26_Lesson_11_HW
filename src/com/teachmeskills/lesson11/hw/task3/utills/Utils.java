package com.teachmeskills.lesson11.hw.task3.utills;

public class Utils {
    public static void duplicate (String word) {
        StringBuilder stringBuilder = new StringBuilder();
        char[] chars = word.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            stringBuilder.append(chars[i]);
            stringBuilder.append(chars[i]);
        }
        System.out.println(stringBuilder);
    }
}
