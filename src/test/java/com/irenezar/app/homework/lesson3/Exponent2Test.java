package com.irenezar.app.homework.lesson3;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by new_user on 1/26/2017.
 */
public class Exponent2Test {
    @Test
    public void expon() {
        Exponent exponent2 = new Exponent();
        Assert.assertNotEquals(0,exponent2.exp(2.7f),0.1);
    }
}
