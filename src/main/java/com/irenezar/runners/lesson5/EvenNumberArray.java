package com.irenezar.runners.lesson5;

/**
 * Created by new_user on 2/13/2017.
 */
public class EvenNumberArray {
    public static void main(String[] args){
       int i = 0;
       for (int counter = 2; counter <= 20; counter+=2) {
           i++;
        }
        int[] intArray = new int[i];
       for (int j=0; j <= i; j++){
           intArray[i] += 2;
           System.out.print(intArray[i]);
       }
    }
}
