package com.irenezar.app.homework.lesson9;

/**
 * Created by new_user on 2/19/2017.
 */
public class PalindromeCheckCharComparison {
    public static String definepalindrome (String palindrome){
        String reversedpalindrome = "";
        for (int i = palindrome.length() - 1; i >= 0; i--) {
            reversedpalindrome = reversedpalindrome += palindrome.charAt(i);
        }
        if (reversedpalindrome.compareToIgnoreCase(palindrome) == 0)
            return ("Palindrome");
        else return ("Not palindrome");
    }
}
