package com.irenezar.app.homework.lesson3;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by new_user on 1/26/2017.
 */
public class SquareRoot2Test {
    @Test
        public void sqroot2() {
        SquareRoot squareRoot2 = new SquareRoot();
        Assert.assertNotEquals(0, squareRoot2.sqroot(9));
    }
}