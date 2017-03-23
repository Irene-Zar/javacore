package com.irenezar.runners.lesson10;

import java.util.Scanner;

/**
 * Created by new_user on 2/16/2017.
 */
public class CipherCoding {
    public static void main(String[] args) {
        String regular = "abcdefghijklmnopqrstuvwxyz1234567890 !";
        String coded = "zyxwvutsrqponmlkjihgfedcba0987654321! ";
        System.out.println("Enter a word:");
        Scanner scanner = new Scanner(System.in);
        StringBuilder enteredValue = new StringBuilder(scanner.nextLine());
        StringBuilder codedvalue = new StringBuilder();
        for (int j = 0; j < enteredValue.length(); j++) {
            for (int i = 0; i < regular.length(); i++) {
                if (enteredValue.charAt(j) == regular.charAt(i)) {
                    codedvalue.append(coded.toCharArray()[i]);
                }
            }
        }
        System.out.println("Coded value is "+codedvalue.toString());
        StringBuilder decodedvalue = new StringBuilder();
        for (int k = 0; k < codedvalue.length(); k++) {
            for (int l = 0; l < coded.length(); l++) {
                if (codedvalue.charAt(k) == coded.charAt(l)){
                    decodedvalue.append(regular.toCharArray()[l]);
                }
            }
        }
        System.out.println("Decoded value is "+decodedvalue.toString());
    }
}
