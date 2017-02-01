package com.irenezar.app.classwork.lesson4;

import java.util.Scanner;

/**
 * Created by new_user on 1/26/2017.
 */
public class CircleArea {
    public static void calculate(){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter radius: ");
        double radius = scanner.nextDouble();
        double circleArea = Math.PI*radius*radius;
        System.out.println("Area is " + circleArea);
    }
}
