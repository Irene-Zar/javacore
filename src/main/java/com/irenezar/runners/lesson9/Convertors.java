package com.irenezar.runners.lesson9;

import com.sun.org.apache.xpath.internal.SourceTree;
import com.sun.security.auth.SolarisNumericUserPrincipal;

/**
 * Created by new_user on 2/13/2017.
 */
public class Convertors {
    public static void main(String[] args) {
        int num1 = 125;
        String mystring1 = String.valueOf(num1);
        System.out.println(mystring1);

        String mystring2 = "12";
        int num2 = Integer.valueOf(mystring2);
        System.out.println(num2);

        float num3 = 125.5f;
        String mystring3 = String.valueOf(num3);
        System.out.println(mystring3);

        String mystring4 = "12.01f";
        float num4 = Float.valueOf(mystring4);
        System.out.println(num4);

        boolean flag1 = true;
        String mystring5 = String.valueOf(flag1);
        System.out.println(mystring5);

        String mystring6 = "false";
        boolean flag2 = Boolean.valueOf(mystring6);
        System.out.println(flag2);

        double num7 = 500000.000005d;
        String mystring7 = String.valueOf(num7);
        System.out.println(mystring7);

        String mystring8 = "100000000.000000001d";
        double num8 = Double.valueOf(mystring8);
        System.out.println(num8);

    }
}
