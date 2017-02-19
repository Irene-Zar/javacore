package com.irenezar.runners.lesson10;

import java.util.Scanner;

/**
 * Created by new_user on 2/16/2017.
 */
public class CipherCoding {
    public static void main(String[] args) {
        String regular = "abcdefghijklmnopqrstuvwxyz1234567890 !";
        String coded = "zyxwvutsrqponmlkjihgfedcba0987654321! ";
        System.out.println("Enter a password:");
        Scanner scanner = new Scanner(System.in);
        String enteredCode = scanner.nextLine();
        StringBuilder value = new StringBuilder(enteredCode);
        StringBuilder codedvalue = new StringBuilder();
        for (int j = 0; j < value.length(); j++) {
            for (int i = 0; i < regular.length(); i++) {
                if (value.charAt(j) == regular.charAt(i)){
                    codedvalue.append(coded.toCharArray()[i]);
                }
            }
        }
        System.out.println(codedvalue.toString());
    }
}
