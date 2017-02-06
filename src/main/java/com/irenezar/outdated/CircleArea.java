package com.irenezar.outdated;

import java.util.Scanner;

/**
 * Created by new_user on 2/5/2017.
 */
public class CircleArea {
    public static void calculate2(){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter radius: ");
        double radius = scanner.nextDouble();
        double circleArea = Math.PI*radius*radius;
        System.out.println("Area is " + circleArea);
    }
}
