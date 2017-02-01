package com.irenezar.app.classwork.lesson4;

import java.util.Scanner;

/**
 * Created by new_user on 1/26/2017.
 */
public class CircleAreaCompare {
    public static final double PI = 3.14d;
    public static void calculateBigger(){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter radius1: ");
        double radius1 = scanner.nextDouble();
        double Area1 = PI*radius1*radius1;
        System.out.println("Enter radius2: ");
        double radius2 = scanner.nextDouble();
        double Area2 = PI*radius2*radius2;
        if (Area1>Area2)
            System.out.print("Area 1 is larger");
        else
            System.out.print("Area 2 is larger");
    }
}
