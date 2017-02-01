package com.irenezar.app.classwork.lesson3;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by new_user on 1/23/2017.
 */
public class MathFuncTest {
    @Test
    public void multiply() {
        MathFunc mathFunc = new MathFunc();
        Assert.assertEquals(6, mathFunc.multiply(2,3));
    }

}