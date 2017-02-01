package com.irenezar.app.homework.lesson3;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by new_user on 1/26/2017.
 */
public class ExponentTest {
    @Test
    public void expon() {
        Exponent exponent = new Exponent();
        Assert.assertEquals(1,exponent.exp(2.7f),0.1);
    }
}
