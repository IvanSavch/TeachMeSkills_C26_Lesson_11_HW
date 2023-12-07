package com.teachmeskills.lesson11.hw.task2;

import com.teachmeskills.lesson11.hw.task2.utils.Utils;

import java.util.Arrays;

/**
 * Given a string of arbitrary length with arbitrary words.
 * Find the shortest word in a line and display it on the screen.
 * Find the longest word in a line and display it on the screen.
 * If there are several such words, then print the last one.
 */
public class Runner {
    public static void main(String[] args) {
        String word = "hello my little friend";
        Utils.showWords(word);
    }
}
