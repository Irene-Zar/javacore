package com.irenezar.runners.lesson7;

import com.irenezar.app.classwork.lesson4.CircleArea;
import com.irenezar.app.classwork.lesson4.CircleAreaCompare;
import com.irenezar.app.classwork.lesson4.EvenOdd;
import com.irenezar.app.classwork.lesson4.RightAngledTriangle;
import com.irenezar.app.homework.lesson4.BiggerNumber;

import java.util.Scanner;

/**
 * Created by new_user on 2/9/2017.
 */
public class MenuWithSwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1 to calculate circle area");
        System.out.println("Enter 2 to find which circle area is larger");
        System.out.println("Enter 3 to find whether number is odd or even");
        System.out.println("Enter 4 to find out if a triangle is right angled");
        System.out.println("Enter 5 to find out which number is bigger");
        int number = (int) scanner.nextInt();

        switch (number) {
            case 1:
                System.out.println("Enter radius of a circle:");
                double radius = scanner.nextDouble();
                CircleArea circleArea = new CircleArea();
                System.out.println(circleArea.calculate(radius));
                break;

            case 2:
                System.out.println("Enter radius of circle 1:");
                double radius1 = scanner.nextDouble();
                System.out.println("Enter radius of circle 2:");
                double radius2 = scanner.nextDouble();
                CircleAreaCompare circleAreaCompare = new CircleAreaCompare();
                System.out.println(circleAreaCompare.calculateBigger(radius1, radius2));
                break;

            case 3:
                System.out.println("Enter integer number: ");
                int num = (int) scanner.nextDouble();
                EvenOdd evenOdd = new EvenOdd();
                if (evenOdd.isOdd(num) == true)
                    System.out.println("Number is odd");
                else System.out.println("Number is even");
                break;

            case 4:
                System.out.println("Enter one side of a triangle:");
                double side1 = scanner.nextDouble();
                System.out.println("Enter second side of a triangle:");
                double side2 = scanner.nextDouble();
                System.out.println("Enter third side of a triangle:");
                double side3 = scanner.nextDouble();
                RightAngledTriangle rightAngledTriangle = new RightAngledTriangle();
                System.out.println(rightAngledTriangle.calculate(side1, side2, side3));
                break;

            case 5:
                System.out.println("Enter number one:");
                double numb1 = scanner.nextDouble();
                System.out.println("Enter number two:");
                double numb2 = scanner.nextDouble();
                BiggerNumber biggerNumber = new BiggerNumber();
                System.out.println(biggerNumber.findbigger(numb1, numb2));
                break;
            default: System.out.println("Such program does not exist");

        }
    }
}