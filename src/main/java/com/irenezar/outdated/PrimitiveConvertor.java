package com.irenezar.outdated;

/**
 * Created by new_user on 1/23/2017.
 */
public class PrimitiveConvertor {
    int intstartvalue = 33;
    char charresult1 = 0;
    float floatstartvalue = 50.11f;
    char charresult2 = 0;
    char charstartvalue = 'a';
    int intresult = 0;

    public void intToChar(){
        charresult1 = (char) intstartvalue;
        System.out.println("Input int value is " + intstartvalue + ". Output char value is " + charresult1);
    }

    public void floatToChar(){
        charresult2 = (char) floatstartvalue;
        System.out.println("Input float value is " + floatstartvalue + ". Output char value is " + charresult2);
    }

    public void charToInt(){
        intresult = (int) charstartvalue;
        System.out.println("Input char value is " + charstartvalue + ". Output int value is " + intresult);
    }
}
