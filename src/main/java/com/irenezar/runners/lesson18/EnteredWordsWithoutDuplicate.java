package com.irenezar.runners.lesson18;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by new_user on 3/16/2017.
 */
public class EnteredWordsWithoutDuplicate {

        public static void main(String[] args) {
            HashSet<String> mySet = new HashSet<String>();
            System.out.println("Enter words separated by comma:");
            Scanner scanner = new Scanner(System.in);
            String newwords = scanner.nextLine();
            String[] splittedWords = newwords.split(",");
            for (int i=0; i<splittedWords.length; i++) {
                mySet.add(splittedWords[i]);
            }
            System.out.println(mySet);
        }


}
