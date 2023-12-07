package com.teachmeskills.lesson11.hw.task3;

import com.teachmeskills.lesson11.hw.task3.utills.Utils;

import java.util.Arrays;

/**
 * An arbitrary string is given.
 * Print a new line to the console, which duplicates each letter from
 * starting line.
 * For example, "Hello" -> "HHeelllloo".
 */
public class Runner {
    public static void main(String[] args) {
        String string = "hello";
        Utils.duplicate(string);
    }
}
