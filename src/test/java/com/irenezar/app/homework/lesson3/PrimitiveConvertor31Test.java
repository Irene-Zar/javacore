package com.irenezar.app.homework.lesson3;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by new_user on 1/26/2017.
 */
public class PrimitiveConvertor31Test {
    @Test
    public void charToInt(){
        PrimitiveConvertor3 primitiveConvertor31 = new PrimitiveConvertor3();
        Assert.assertNotEquals(100, primitiveConvertor31.charToInt('h'));
    }
}