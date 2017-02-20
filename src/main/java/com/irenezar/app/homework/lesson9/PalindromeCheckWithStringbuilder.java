package com.irenezar.app.homework.lesson9;

/**
 * Created by new_user on 2/19/2017.
 */
public class PalindromeCheckWithStringbuilder {
    public static String definepalindrome(String palindrome) {
        StringBuilder builder = new StringBuilder(palindrome).reverse();
        if (palindrome.compareToIgnoreCase(builder.toString()) == 0) {
            return ("Palindrome");
        } else return ("Not palindrome");
    }
}


