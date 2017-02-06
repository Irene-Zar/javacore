package com.irenezar.app.homework.lesson3;

import org.junit.Test;
import org.junit.Assert;

import static org.junit.Assert.*;

/**
 * Created by new_user on 1/26/2017.
 */
public class AbsoluteTest {
    @Test
    public void abs() {
        Absolute absolute1 = new Absolute();
        Assert.assertEquals(3.12, absolute1.absol(-3.11f), 0.1);
        }

    @Test
    public void abs2() {
        Absolute absolute2 = new Absolute();
        Assert.assertNotEquals(1,absolute2.absol(-5.01f),0.01);
    }

}
