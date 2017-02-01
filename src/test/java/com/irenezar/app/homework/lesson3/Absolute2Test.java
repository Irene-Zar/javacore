package com.irenezar.app.homework.lesson3;

import org.junit.Test;
import org.junit.Assert;

import static org.junit.Assert.*;

/**
 * Created by new_user on 1/26/2017.
 */
public class Absolute2Test {
    @Test
    public void abs2() {
        Absolute absolute2 = new Absolute();
        Assert.assertNotEquals(1,absolute2.absol(-5.01f),0.01);
    }
}
