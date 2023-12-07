package com.teachmeskills.lesson11.hw.task1.utils;

import java.util.Arrays;

/**
 * На вход передать строку (будем считать, что это некий стандартный номер документа в заданном формате).
 * Номер документа имеет формат xxxx-yyy-xxxx-yyy-xyxy, где x — это любая цифра, а y — это буква латинского алфавита (могут быть большие и маленькие).
 * - Вывести на экран в одну строку два первых блока по 4 цифры.
 * - Вывести на экран номер документа, но блоки из трех букв заменить на *** (каждая буква заменятся на *).
 * - Вывести на экран только одни буквы из номера документа в формате yyy/yyy/y/y в нижнем регистре.
 * - Вывести на экран буквы из номера документа в формате "Letters:yyy/yyy/y/y" в верхнем регистре(реализовать с помощью класса StringBuilder).
 * - Проверить содержит ли номер документа последовательность "abc" и вывети сообщение содержит или нет(причем, abc и ABC считается одинаковой последовательностью).
 * - Проверить начинается ли номер документа с последовательности 555.
 * - Проверить заканчивается ли номер документа на последовательность 1a2b.
 * Все эти методы реализовать в отдельном классе в статических методах, каждая задача - в отдельном методе.
 * Методы на вход (входным параметром) будут принимать вводимую на вход программы строку.
 */
public class Utils {
    public static void first(String documents) {
        String[] array = documents.split("-");
        System.out.println(array[0] + " " + array[2]);
    }

    public static void second(String documents) {
        String a = documents.replaceAll("[a-zA-Z]{3}", "***");
        System.out.println(a);
    }

    public static void showOnlyLetters(String documents) {
        String[] a = documents.split("-");
        System.out.println(a[1].toLowerCase() + "/" + a[3].toLowerCase() + "/" + documents.toLowerCase().charAt(19) + "/" + documents.toLowerCase().charAt(21));
    }

    public static void showOnlyLettersToUpperCase(String documents) {
        StringBuilder builder = new StringBuilder("Letter:");
        String[] a = documents.split("-");
        builder.append(a[1].toUpperCase()).append("/").append(a[3].toUpperCase()).append("/").append(documents.toUpperCase().charAt(19)).append("/").append(documents.toUpperCase().charAt(21));
        System.out.println(builder);
    }

    public static void contains(String documents) {
        if (documents.toLowerCase().contains("abc")) {
            System.out.println("yes");
        } else System.out.println("no");
    }

    public static void startWith(String documents) {
        if (documents.startsWith("555")) {
            System.out.println("yes");
        } else System.out.println("no");
    }

    public static void endWith(String documents) {
        if (documents.endsWith("1a2b")){
            System.out.println("yes");
        } else System.out.println("no");
    }

}
