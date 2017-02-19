package com.irenezar.runners.lesson10;

import java.util.Scanner;

/**
 * Created by new_user on 2/16/2017.
 */
public class WordCount {
    public static void main(String[] args) {
        System.out.println("Enter a sentence:");
        Scanner scanner = new Scanner(System.in);
        String mySentence = scanner.nextLine();
        String[] splittedSentence = mySentence.split(" ");
        int wordCount = splittedSentence.length;
        System.out.println(wordCount);

    }
}
