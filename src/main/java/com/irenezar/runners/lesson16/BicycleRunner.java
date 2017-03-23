package com.irenezar.runners.lesson16;

import com.irenezar.app.classwork.lesson16.ACMEBicycle;
import com.irenezar.app.classwork.lesson16.AMABicycle;
import com.irenezar.app.classwork.lesson16.Bicycle;

/**
 * Created by new_user on 3/9/2017.
 */

    public class BicycleRunner {
        public static void main(String[] args) {
            Bicycle bicycle = new ACMEBicycle();
            bicycle.changeGear(2);

            ACMEBicycle amceBicycle = new ACMEBicycle();
            amceBicycle.printStates();

            Bicycle amabicycle1 = new AMABicycle();
            Bicycle amabicycle2 = new AMABicycle();
            Bicycle amabicycle3 = new AMABicycle();

            manageAllBicycle(bicycle, 7,7);
            manageAllBicycle(amabicycle1,2,4);
            manageAllBicycle(amabicycle2,3,7);
            manageAllBicycle(amabicycle3,8,1);

            amabicycle1.getSpeed();

        }

        public static void manageAllBicycle(Bicycle bicycle, int gear, int cadence){
            bicycle.changeGear(gear);
            bicycle.changeCadence(cadence);
        }
    }
