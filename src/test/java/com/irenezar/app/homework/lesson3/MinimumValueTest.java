package com.irenezar.app.homework.lesson3;

import org.junit.Test;
import org.junit.Assert;

import static org.junit.Assert.*;

/**
 * Created by new_user on 1/26/2017.
 */
public class MinimumValueTest {
    @Test
    public void minimum() {
        MinimumValue minimumValue = new MinimumValue();
        Assert.assertEquals(3, minimumValue.minimum(7,3));
    }

}