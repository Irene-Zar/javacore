package com.irenezar.outdated;

import java.util.Scanner;

/**
 * Created by new_user on 2/6/2017.
 */
public class RightAngledTriangle {
         public static void calculate(){
            Scanner scanner= new Scanner(System.in);
             System.out.println("Enter one side of a triangle: ");
             double a = scanner.nextDouble();
            System.out.println("Enter second side of a triangle: ");
            double b = scanner.nextDouble();
            System.out.println("Enter third side of a triangle: ");
            double c = scanner.nextDouble();
            if ((c*c==a*a+b*b) || (b*b==a*a+c*c) || (a*a==c*c+b*b))
                System.out.print("Triangle is right-angled");
            else
                System.out.print("Triangle is not right-angled");
        }

}
