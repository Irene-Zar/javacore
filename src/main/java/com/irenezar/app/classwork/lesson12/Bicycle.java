package com.irenezar.app.classwork.lesson12;

/**
 * Created by new_user on 2/23/2017.
 */
public class Bicycle {
    private  int wheelsize;
    private  String color;
    private int wheelcount;
    private int speed;
    public Bicycle(int wheelsize, String color, int wheelcount, int speed){
        this.wheelsize = wheelsize;
        this.color = color;
        this.wheelcount = wheelcount;
        this.speed = speed;
    }
    public Bicycle(String color){
        this();
        this.color = color;
    }
    public Bicycle(int wheelcount){
        this();
        this.wheelcount = wheelcount;
    }
    public Bicycle() {
        wheelcount = 2;
        color = "black";
        wheelsize = 26;
        speed = 20;
    }
    public int getWheelsize () {
        return wheelsize;
    }

    public void setWheelsize(int wheelsize){
        this.wheelsize = wheelsize;
    }

}
