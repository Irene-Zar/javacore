package com.irenezar.app.classwork.lesson16;

import com.irenezar.app.classwork.lesson12.*;

/**
 * Created by new_user on 3/9/2017.
 */
public class ACMEBicycle extends BicycleBase implements Bicycle {

    @Override
    public void changeCadence(int newValue) {
        this.cadence = newValue;
        System.out.println(cadence);
    }
    @Override
    public void changeGear(int newValue) {
        this.gear = newValue;
        System.out.println(gear);
    }
    public void printStates(){
        System.out.println("AMCEBicycle{" +
                "speed=" + speed +
                ", cadence=" + cadence +
                ", gear=" + gear +
                ", model=" + MODEL +
                '}');
    }
}
