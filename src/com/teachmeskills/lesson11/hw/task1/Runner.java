package com.teachmeskills.lesson11.hw.task1;

import com.teachmeskills.lesson11.hw.task1.utils.Utils;

/**
 * The text is transmitted as input (we will assume that this is a certain standard document number in a given format).
 * The document number has the format xxxx-yyy-xxxx-yyy-xyxy, where x is any number, and y is a letter of the Latin alphabet (cannot be greater or less).
 * - Display the first two blocks of 4 digits in one inscription.
 * - Display the document number, but blocks of three letters are replaced with *** (each letter is replaced with *).
 * - Display only the letters from the document numbers in the format yyy/yyy/y/y in the registration record.
 * - Display the letters from the document number on the screen in the format “Letters: yyy/yyyy/y/y” in upper case (implemented using the StringBuilder class).
 * - Check the document number by length "abc" and display the message whether it contains or not (and abc and ABC are always considered the same).
 * - View whether the document number starts with the sequence 555.
 * - Look at the end of the document number at position 1a2b.
 * All these methods are implemented in a separate class in static methods, each task in a separate method.
 * The input methods (input parameter) will be entered into the input program table.
 */
public class Runner {
    public static void main(String[] args) {
        String string = "1234-abc-5678-asd-1A2B";
        Utils.first(string);
        Utils.second(string);
        Utils.showOnlyLetters(string);
        Utils.showOnlyLettersToUpperCase(string);
        Utils.contains(string);
        Utils.startWith(string);
        Utils.endWith(string);
    }
}
