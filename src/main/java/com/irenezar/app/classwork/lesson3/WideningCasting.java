package com.irenezar.app.classwork.lesson3;

/**
 * Created by new_user on 1/23/2017.
 */
public class WideningCasting {
    byte byte1 = 127;
    short short1 = 0;
    int int1 = 0;
    long long1 = 0L;
    float float1 = 0.0f;
    double double1 = 0.0d;
    public void widening1 (){
        double1 = float1 = long1 = int1 = short1 = byte1;
        System.out.println(double1);}
}