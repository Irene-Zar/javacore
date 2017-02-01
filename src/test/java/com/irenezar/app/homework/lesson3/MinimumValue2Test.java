package com.irenezar.app.homework.lesson3;

/**
 * Created by new_user on 1/26/2017.
 */

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MinimumValue2Test {
    @Test
    public void minimum2() {
        MinimumValue minimumValue2 = new MinimumValue();
        Assert.assertNotEquals(7, minimumValue2.minimum(7,3));
    }

}