package com.irenezar.app.homework.lesson4;

/**
 * Created by new_user on 2/6/2017.
 */
public class BiggerNumber {
    public static String findbigger(double num1, double num2){
        if (num1 > num2)
            return ("Number 1 is bigger");
        else if (num1 < num2)
            return ("Number 2 is bigger");
        else return ("Numbers are the same");
    }
}
