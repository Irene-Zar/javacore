package com.irenezar.runners.lesson5;

import java.util.Scanner;

/**
 * Created by new_user on 2/8/2017.
 */
public class WhileLoopRunner {

    public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a:");
            int a = scanner.nextInt();
            System.out.println("Enter b:");
            int b = scanner.nextInt();
            while (a>b) {
                System.out.print(a);
                System.out.println(b);
                a = a-1;
            }
    }
}
