package com.irenezar.runners.lesson9;

import com.irenezar.app.homework.lesson9.PalindromeCheckCharComparison;
import com.irenezar.app.homework.lesson9.PalindromeCheckCharComparisonFromPresentation;
import com.irenezar.app.homework.lesson9.PalindromeCheckWithReversedValueInLoop;
import com.irenezar.app.homework.lesson9.PalindromeCheckWithStringbuilder;

import java.util.Scanner;

/**
 * Created by new_user on 2/19/2017.
 */
public class PalindromeMenu {
    public static void main(String[] args) {
        System.out.println("Enter a word to check whether it is a palindrome:");
        Scanner scanner = new Scanner(System.in);
        String palindrome = scanner.nextLine();
        System.out.println("Enter 1 to define palindrome by char comparison (from presentation)");
        System.out.println("Enter 2 to define palindrome by comparison with reversed string:");
        System.out.println("Enter 3 to define palindrome by char comparison:");
        System.out.println("Enter 4 to define palindrome with method using Stringbuilder):");
        int number = (int) scanner.nextInt();
        String result = "";
        switch (number) {
            case 1:
                result = PalindromeCheckCharComparisonFromPresentation.definepalindrome(palindrome);
                break;
            case 2:
                result = PalindromeCheckWithReversedValueInLoop.definepalindrome(palindrome);
                break;
            case 3:
                result = PalindromeCheckCharComparison.definepalindrome(palindrome);
                break;
            case 4:
                result = PalindromeCheckWithStringbuilder.definepalindrome(palindrome);
                break;
            default:
                System.out.println("Such program does not exist");
        }

        System.out.println((result));
    }
}

