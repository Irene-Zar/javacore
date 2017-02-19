package com.irenezar.runners.lesson9;

import java.util.Scanner;

/**
 * Created by new_user on 2/16/2017.
 */
public class Palindrome3 {
    public static void main(String[] args) {
        System.out.println("Enter a word:");
        Scanner scanner = new Scanner(System.in);
        String palindrome = scanner.nextLine();
        palindrome = palindrome.toLowerCase();
        boolean isPalindrome;
        for (int i = 0, j = palindrome.length() - 1; i < palindrome.length()/2; i++, j--) {
            System.out.println(i);
            System.out.println(j);
            System.out.println(palindrome.length() / 2);
            System.out.println(palindrome.charAt(i));
            System.out.println(palindrome.charAt(j));
            if (palindrome.charAt(i) == palindrome.charAt(j))
            {System.out.println("Palindrome");}
            else {System.out.println("Not palindrome");}
        }
    }
}
