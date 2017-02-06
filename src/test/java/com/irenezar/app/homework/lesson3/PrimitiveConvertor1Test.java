package com.irenezar.app.homework.lesson3;

import org.junit.Test;
import org.junit.Assert;

import static org.junit.Assert.*;

/**
 * Created by new_user on 1/26/2017.
 */
public class PrimitiveConvertor1Test {
    @Test
    public void intToChar() {
        PrimitiveConvertor1 primitiveConvertor1 = new PrimitiveConvertor1();
        Assert.assertEquals('r', primitiveConvertor1.intToChar(114));
    }
    @Test
    public void intToChar2() {
        PrimitiveConvertor1 primitiveConvertor2 = new PrimitiveConvertor1();
        Assert.assertNotEquals('f', primitiveConvertor2.intToChar(114));
    }

}