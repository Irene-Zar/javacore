package com.irenezar.runners.lesson15;

import com.irenezar.app.classwork.lesson15.Bicycle;
import com.irenezar.app.classwork.lesson15.Feet;
import com.irenezar.app.classwork.lesson15.Vehicle;

/**
 * Created by new_user on 3/6/2017.
 */
public class VehicleRunner {
    public static void main(String[] args) {
        Vehicle bicycle = new Bicycle();
        Vehicle feet = new Feet();
        Vehicle car = new Vehicle();
        Vehicle.move2(bicycle);
        Vehicle.move2(feet);
        Vehicle.move2(car);
    }
}
