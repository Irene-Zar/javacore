package com.irenezar.runners.lesson10;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by new_user on 2/22/2017.
 */
public class StringParser {
    public static void main(String[] args) {
        System.out.println("Enter a sentence:");
        Scanner scanner = new Scanner(System.in);
        String array = scanner.nextLine();
        System.out.println("Enter a separating word:");
        String separator = scanner.next();
        String[] splittedArray = array.split(" " + separator + " ");
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < splittedArray.length; i++) {
            System.out.println(splittedArray[i]);

        }
    }
}
