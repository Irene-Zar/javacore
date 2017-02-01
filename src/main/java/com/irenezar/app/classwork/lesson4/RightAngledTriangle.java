package com.irenezar.app.classwork.lesson4;

import java.util.Scanner;

/**
 * Created by new_user on 1/26/2017.
 */
public class RightAngledTriangle {
    public static void calculate(){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a: ");
        double a = scanner.nextDouble();
        System.out.println("Enter b: ");
        double b = scanner.nextDouble();
        System.out.println("Enter c: ");
        double c = scanner.nextDouble();
        if ((c*c==a*a+b*b) || (b*b==a*a+c*c) || (a*a==c*c+b*b))
            System.out.print("Triangle is right-angled");
        else
            System.out.print("Triangle is not rignt-angled");
    }
}
