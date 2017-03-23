package com.irenezar.runners.lesson12;

import com.irenezar.app.classwork.lesson12.Bicycle;

/**
 * Created by new_user on 2/23/2017.
 */
public class BicycleRunner {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle();
        System.out.println(bicycle.getWheelsize());
        bicycle.setWheelsize(28);
        System.out.println(bicycle.getWheelsize());
    }
}
