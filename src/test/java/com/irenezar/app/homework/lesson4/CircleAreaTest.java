package com.irenezar.app.homework.lesson4;

import com.irenezar.app.classwork.lesson4.CircleArea;
import org.junit.Test;
import org.junit.Assert;

import static org.junit.Assert.*;

/**
 * Created by new_user on 2/2/2017.
 */
public class CircleAreaTest {
    @Test
    public void calculate()  {
        CircleArea circleArea = new CircleArea();
        Assert.assertEquals(3.1415d, circleArea.calculate(1), 0.1);

    }

}