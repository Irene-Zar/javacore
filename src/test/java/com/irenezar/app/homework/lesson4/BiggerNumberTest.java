package com.irenezar.app.homework.lesson4;

import com.irenezar.app.homework.lesson4.BiggerNumber;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by new_user on 2/6/2017.
 */
public class BiggerNumberTest {
    @Test
    public void biggerNumber() {
        BiggerNumber biggerNumber = new BiggerNumber();
        Assert.assertEquals("Number 1 is bigger", biggerNumber.findbigger(2.6d,2.5d));
    }

    @Test
    public void biggerNumber2() {
        BiggerNumber biggerNumber = new BiggerNumber();
        Assert.assertEquals("Number 2 is bigger", biggerNumber.findbigger(2.0d,2.5d));
    }
    @Test
    public void biggerNumber3() {
        BiggerNumber biggerNumber = new BiggerNumber();
        Assert.assertEquals("Numbers are the same", biggerNumber.findbigger(1.111d,1.111d));
    }

}
