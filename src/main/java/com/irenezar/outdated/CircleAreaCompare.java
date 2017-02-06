package com.irenezar.outdated;

import java.util.Scanner;

/**
 * Created by new_user on 2/6/2017.
 */
public class CircleAreaCompare {
        public static final double PI = 3.14d;
        public static void calculateBigger2(){
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
