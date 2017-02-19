package com.irenezar.runners.lesson9;

import java.util.Scanner;

/**
 * Created by new_user on 2/16/2017.
 */
public class Palindrome4 {
    public static void main(String[] args) {
        System.out.println("Enter a word:");
        Scanner scanner = new Scanner(System.in);
        String palindrome = scanner.nextLine();
        StringBuilder builder = new StringBuilder(palindrome).reverse();
        if (palindrome.compareToIgnoreCase(builder.toString()) == 0){
            System.out.println ("Palindrome");
        }
        else System.out.println ("Not palindrome");
    }
}
