package com.irenezar.app.homework.lesson3;

import org.junit.Test;
import org.junit.Assert;

import static org.junit.Assert.*;

/**
 * Created by new_user on 1/26/2017.
 */
public class SquareRootTest {
    @Test
    public void sqroot() {
        SquareRoot squareRoot = new SquareRoot();
        Assert.assertEquals(3, squareRoot.sqroot(9), 0.1);
    }
    @Test
    public void sqroot2() {
        SquareRoot squareRoot2 = new SquareRoot();
        Assert.assertNotEquals(0, squareRoot2.sqroot(9));
    }
}