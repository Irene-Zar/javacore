package com.irenezar.runners.lesson10;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by new_user on 2/22/2017.
 */
public class LetterArray {
    public static void main(String[] args) {
        System.out.println("Enter numbers and letters separated with any symbol:");
        Scanner scanner = new Scanner(System.in);
        String array = scanner.nextLine();
        System.out.println("Enter your separating symbol:");
        String s = scanner.next();
        String[] splittedArray = array.split(s);
        StringBuilder builder = new StringBuilder();
        Pattern p = Pattern.compile("\\D");

        for (int i = 0; i < splittedArray.length; i++) {
            Matcher m = p.matcher(splittedArray[i]);
            if (m.matches() == true) {
                builder.append(splittedArray[i]);
            }
        }
        System.out.println(builder.toString());

    }
}

