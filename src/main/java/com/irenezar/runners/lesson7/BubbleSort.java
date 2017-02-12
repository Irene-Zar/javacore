package com.irenezar.runners.lesson7;

/**
 * Created by new_user on 2/9/2017.
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] intArray = {7, 1, 3, 2};
        for (int j = 0; j < intArray.length; j++) {
            System.out.print(intArray[j] + " ");}
            System.out.println();
            boolean flag = true;
            do {
                flag = false;
                for (int k = 0; k < intArray.length - 1; k++) {
                    if (intArray[k] > intArray[k + 1]) {
                        int temp = intArray[k];
                        intArray[k] = intArray[k + 1];
                        intArray[k + 1] = temp;
                        flag = true;
                    }
                }
            }
            while (flag);

            for (int k = 0; k < intArray.length; k++) {
                System.out.print(intArray[k] + " ");
            }
        }
    }
