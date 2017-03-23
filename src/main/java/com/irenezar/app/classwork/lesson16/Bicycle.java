package com.irenezar.app.classwork.lesson16;

/**
 * Created by new_user on 3/9/2017.
 */
public interface Bicycle {
    String MODEL = "Google1";
    void changeCadence (int newValue);
    void changeGear (int newValue);
    default void getSpeed () {
        System.out.println("Default speed is 10 km/hour");
    }
}
