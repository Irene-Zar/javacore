package com.irenezar.runners.lesson16;

import com.irenezar.app.classwork.lesson16.MenuItems;
import com.irenezar.app.homework.lesson9.PalindromeCheckCharComparison;
import com.irenezar.app.homework.lesson9.PalindromeCheckCharComparisonFromPresentation;
import com.irenezar.app.homework.lesson9.PalindromeCheckWithReversedValueInLoop;
import com.irenezar.app.homework.lesson9.PalindromeCheckWithStringbuilder;

import java.util.Scanner;

/**
 * Created by new_user on 3/9/2017.
 */

public class PalindromeMenuWithEnum {
   public static void main(String[] args) {
       System.out.println("Enter a word to check whether it is a palindrome:");
       Scanner scanner = new Scanner(System.in);
       String palindrome = scanner.nextLine();
       System.out.println("Enter ONE to define palindrome by char comparison (from presentation)");
       System.out.println("Enter TWO to define palindrome by comparison with reversed string:");
       System.out.println("Enter THREE to define palindrome by char comparison:");
       System.out.println("Enter FOUR to define palindrome with method using Stringbuilder):");
       String result = "";
       try {
           MenuItems item = MenuItems.valueOf(scanner.nextLine().toUpperCase());

           switch (item) {
               case ONE:
                   result = PalindromeCheckCharComparisonFromPresentation.definepalindrome(palindrome);
                   break;
               case TWO:
                   result = PalindromeCheckWithReversedValueInLoop.definepalindrome(palindrome);
                   break;
               case THREE:
                   result = PalindromeCheckCharComparison.definepalindrome(palindrome);
                   break;
               case FOUR:
                   result = PalindromeCheckWithStringbuilder.definepalindrome(palindrome);
                   break;
                          }

           System.out.println((result));
       }
       catch (IllegalArgumentException e) {
           System.out.println("Invalid menu selection");
       }
   }
}