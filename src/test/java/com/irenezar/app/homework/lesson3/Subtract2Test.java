package com.irenezar.app.homework.lesson3;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by new_user on 1/26/2017.
 */
public class Subtract2Test {
    @Test
    public void sub(){
           Subtract subtract2 = new Subtract();
            Assert.assertNotEquals(5, subtract2.sub(25,15));}
    }