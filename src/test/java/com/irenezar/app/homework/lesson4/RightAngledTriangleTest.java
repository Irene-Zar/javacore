package com.irenezar.app.homework.lesson4;

import com.irenezar.app.classwork.lesson4.RightAngledTriangle;
import org.junit.Test;
import org.junit.Assert;

import static org.junit.Assert.*;

/**
 * Created by new_user on 2/2/2017.
 */
public class RightAngledTriangleTest {
    @Test
    public void calculate() {
        RightAngledTriangle rightAngledTriangle = new RightAngledTriangle();
        Assert.assertEquals("Triangle is right-angled", rightAngledTriangle.calculate(3,4, 5));
            }

    @Test
    public void calculate2() {
        RightAngledTriangle rightAngledTriangle = new RightAngledTriangle();
        Assert.assertEquals("Triangle is not right-angled", rightAngledTriangle.calculate(5,6, 7));
    }

    @Test
    public void calculate3() {
        RightAngledTriangle rightAngledTriangle = new RightAngledTriangle();
        double a = Math.random();
        double b = Math.random();
        double c = Math.random();
        Assert.assertNotEquals("", rightAngledTriangle.calculate(a,b,c));
    }
}