package com.irenezar.app.homework.lesson3;

import org.junit.Test;
import org.junit.Assert;

import static org.junit.Assert.*;

/**
 * Created by new_user on 1/26/2017.
 */
public class SubtractTest {
    @Test
    public void sub(){
           Subtract subtract = new Subtract();
            Assert.assertEquals(10, subtract.sub(25,15));}
    }