package com.irenezar.runners.lesson9;

/**
 * Created by new_user on 2/16/2017.
 */
public class Palindrome2 {
    public static void main(String[] args) {
        String palindrome = "Abcdedcba";
        String newpalindrome = "";
        for (int i = palindrome.length() - 1; i >= 0; i--) {
            newpalindrome = newpalindrome += palindrome.charAt(i);
           }
        if (newpalindrome.compareToIgnoreCase(palindrome) == 0)
           System.out.println("Palindrome");
           else System.out.println("Not palindrome");
    }
}
