package com.irenezar.runners.lesson7;

import java.util.Arrays;

/**
 * Created by new_user on 2/9/2017.
 */
public class CharArray {
    public static void main(String[] args) {
        int[] intArray = {7, 244, 3, 170};
        char[] charArray = new char[4];
        for (int j = 0; j < intArray.length; j++) {
            char charresult = (char) intArray[j];
            charArray[j] = charresult;
        }

       System.out.print(Arrays.toString(charArray));
        }
    }

