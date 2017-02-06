package com.irenezar.app.homework.lesson3;

import org.junit.Test;
import org.junit.Assert;

import static org.junit.Assert.*;

/**
 * Created by new_user on 1/26/2017.
 */
public class PrimitiveConvertor3Test {
    @Test
    public void charToInt(){
        PrimitiveConvertor3 primitiveConvertor3 = new PrimitiveConvertor3();
        Assert.assertEquals(104, primitiveConvertor3.charToInt('h'));
    }
    @Test
    public void charToInt2(){
        PrimitiveConvertor3 primitiveConvertor32 = new PrimitiveConvertor3();
        Assert.assertNotEquals(100, primitiveConvertor32.charToInt('h'));
    }
}