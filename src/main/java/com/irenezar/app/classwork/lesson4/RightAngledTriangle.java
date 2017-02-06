package com.irenezar.app.classwork.lesson4;

import com.sun.org.apache.xpath.internal.operations.String;

import java.util.Scanner;

/**
 * Created by new_user on 1/26/2017.
 */
public class RightAngledTriangle {
    public static java.lang.String calculate(double a, double b, double c){
        if ((c*c==a*a+b*b) || (b*b==a*a+c*c) || (a*a==c*c+b*b))
            return ("Triangle is right-angled");
        else
            return ("Triangle is not right-angled");
    }
}
