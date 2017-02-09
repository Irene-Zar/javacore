package com.irenezar.runners.lesson5;

/**
 * Created by new_user on 2/9/2017.
 */
public class IncrementRunner {
    public static void main(String[] args){
int a = 1;
        System.out.println("Original a value " + a);
        System.out.println("Post-increment a " + a++);
        System.out.println("After post-increment " + a);
        System.out.println("Pre-increment a " + ++a);
        System.out.println("After pre-increment " + a);
    }
}
