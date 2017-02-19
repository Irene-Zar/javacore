package com.irenezar.runners.lesson10;

import java.util.Scanner;

/**
 * Created by new_user on 2/16/2017.
 */
public class CharsToStringWithStringBuilder {
    public static void main(String[] args) {
        char[] charArray = {'a','b','c'};
        StringBuilder builder = new StringBuilder();
        for (int i=0; i<charArray.length; i++)
        {
            builder.append(charArray[i]);
        }
        System.out.println(builder.toString());
    }
}
