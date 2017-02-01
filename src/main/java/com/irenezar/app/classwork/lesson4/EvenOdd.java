package com.irenezar.app.classwork.lesson4;

import java.util.Scanner;

/**
 * Created by new_user on 1/26/2017.
 */
public class EvenOdd {
    public static void define(){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = (int) scanner.nextDouble();
        if (a % 2 == 1)
            System.out.print("Number is odd");
        else
            System.out.print("Number is even");
    }
}
