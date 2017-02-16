package com.irenezar.runners.lesson9;

/**
 * Created by new_user on 2/16/2017.
 */
public class Palindrome3 {
    public static void main(String[] args) {
        String palindrome = "Moom";
        palindrome = palindrome.toLowerCase();
        boolean ispalindrome = true;
        for (int i=0, j=palindrome.length()-1; i < palindrome.length()/2-1; i++, j--) {
            if (palindrome.charAt(i) == palindrome.charAt(j))
            ispalindrome = true;
            else ispalindrome = false;
        }
        System.out.println(ispalindrome);
    }
}
