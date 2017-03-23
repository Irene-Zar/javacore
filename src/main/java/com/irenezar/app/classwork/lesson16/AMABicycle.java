package com.irenezar.app.classwork.lesson16;

/**
 * Created by new_user on 3/9/2017.
 */
    public class AMABicycle implements Bicycle {

        @Override
        public void changeCadence(int newValue) {
            System.out.println(newValue);
        }

        @Override
        public void changeGear(int newValue) {
            System.out.println(newValue);
        }
    }
