package com.irenezar.runners.lesson10;

import com.irenezar.app.homework.lesson9.PalindromeCheckCharComparisonFromPresentation;
import com.irenezar.app.homework.lesson9.PalindromeCheckWithReversedValueInLoop;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by new_user on 2/21/2017.
 */
public class ArrayParserRunner {
    public static void main(String[] args) {
        System.out.println("Enter numbers separated with semicolon:");
        Scanner scanner = new Scanner(System.in);
        String numbers = scanner.nextLine();
        String[] splittedArray = numbers.split(";");
        Arrays.sort(splittedArray);
        StringBuilder builder = new StringBuilder();

        System.out.println("Enter 1 to sort ascending");
        System.out.println("Enter 2 to sort descending");
        int number = (int) scanner.nextInt();
        switch (number) {
            case 1:
                for (int i = 0; i < splittedArray.length; i++) {
                    builder.append(splittedArray[i]);
                }
                System.out.println(builder);
                break;
            case 2:
                for (int i = splittedArray.length - 1; i >= 0; i--) {
                    builder.append(splittedArray[i]);
                }
                System.out.println(builder);
                break;
            default:
                System.out.println("Such program does not exist");
        }
    }
}