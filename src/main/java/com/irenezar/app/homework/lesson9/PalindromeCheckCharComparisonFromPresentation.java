package com.irenezar.app.homework.lesson9;

/**
 * Created by new_user on 2/19/2017.
 */
public class PalindromeCheckCharComparisonFromPresentation {
    public static String definepalindrome(String palindrome) {
        boolean isPalindrome = true;
        for (int i = 0; i < palindrome.length() / 2; i++) {
            isPalindrome = isPalindrome && (palindrome.charAt(i) == palindrome.charAt(palindrome.length() - i - 1));
        }
        if (isPalindrome) return ("Palindrome");
        else
            return ("Not palindrome");
    }
}
