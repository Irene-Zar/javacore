package com.irenezar.app.classwork.lesson4;

import java.util.Scanner;

/**
 * Created by new_user on 1/26/2017.
 */
public class CircleAreaCompare {
    public static final double PI = 3.14d;
    public static String calculateBigger(double radius1, double radius2){
        double Area1 = Math.PI*radius1*radius1;
        double Area2 = Math.PI*radius2*radius2;
        if (Area1>Area2)
        return ("Area of circle 1 is larger");
        else if (Area1<Area2)
            return ("Area of circle 2 is larger");
        else return ("Area1=Area2");
    }
}
