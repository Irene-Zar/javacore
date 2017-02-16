package com.irenezar.runners.lesson9;

/**
 * Created by new_user on 2/13/2017.
 */
public class CharsToString {
   public static void main(String[] args) {
        char[] charArray = {'a','b','c'};
        String mystring = "";
        for (int i = 0; i < charArray.length; i++) {
            mystring += charArray[i];
            }
        System.out.println(mystring);
    }
}