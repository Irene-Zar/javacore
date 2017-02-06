package com.irenezar.app.homework.lesson4;

import com.irenezar.app.classwork.lesson4.CircleAreaCompare;
import org.junit.Test;
import org.junit.Assert;

/**
 * Created by new_user on 2/2/2017.
 */
public class CircleAreaCompareTest {
    @Test
    public void calculateBigger() {
        CircleAreaCompare circleAreaCompare = new CircleAreaCompare();
        Assert.assertEquals("Area of circle 1 is larger", circleAreaCompare.calculateBigger(2.6d,2.5d));
    }

    @Test
    public void calculateBigger2() {
        CircleAreaCompare circleAreaCompare = new CircleAreaCompare();
        Assert.assertEquals("Area of circle 2 is larger", circleAreaCompare.calculateBigger(5.01d,5.04d));
    }

    @Test
    public void calculateBigger3() {
        CircleAreaCompare circleAreaCompare = new CircleAreaCompare();
        Assert.assertEquals("Area1=Area2", circleAreaCompare.calculateBigger(5.01d,5.01d));
    }
    @Test
    public void calculateBigger4() {
        CircleAreaCompare circleAreaCompare = new CircleAreaCompare();
        double a = Math.random();
        double b = Math.random();
        Assert.assertNotEquals("",circleAreaCompare.calculateBigger(a,b));
    }


}