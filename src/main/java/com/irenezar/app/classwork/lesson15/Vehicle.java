package com.irenezar.app.classwork.lesson15;

/**
 * Created by new_user on 3/6/2017.
 */
public class Vehicle {
    public void move(){
            System.out.println("Drive!");
        }

    public static void move2(Vehicle vehicle){
        vehicle.move();
    }
}
