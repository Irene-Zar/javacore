package com.irenezar.runners.lesson9;

import java.util.Scanner;

/**
 * Created by new_user on 2/16/2017.
 */
public class Palindrome2 {
    public static void main(String[] args) {
        System.out.println("Enter a word:");
        Scanner scanner = new Scanner(System.in);
        String palindrome = scanner.nextLine();
        String reversedpalindrome = "";
        for (int i = palindrome.length() - 1; i >= 0; i--) {
            reversedpalindrome = reversedpalindrome += palindrome.charAt(i);
        }
        if (reversedpalindrome.compareToIgnoreCase(palindrome) == 0)
            System.out.println("Palindrome");
        else System.out.println("Not palindrome");
    }
}
