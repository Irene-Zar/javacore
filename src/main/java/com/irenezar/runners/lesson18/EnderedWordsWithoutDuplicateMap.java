package com.irenezar.runners.lesson18;

import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;
/**
 * Created by new_user on 3/16/2017.
 */
public class EnderedWordsWithoutDuplicateMap {
         public static void main(String[] args) {
            HashSet<String> mySet = new HashSet<String>();
            Map map = new HashMap();
            System.out.println("Enter words separated by comma:");
            Scanner scanner = new Scanner(System.in);
            String newwords = scanner.nextLine();
            String[] splittedWords = newwords.split(",");
            for (int i=0; i<splittedWords.length; i++) {
                mySet.add(splittedWords[i]);
            }
            System.out.println("Enter key word:");
            String keyword = scanner.nextLine();
            map.put(keyword,mySet);
            System.out.println(map.get(keyword));

        }

}
