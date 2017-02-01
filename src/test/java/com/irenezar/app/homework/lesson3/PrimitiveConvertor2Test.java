package com.irenezar.app.homework.lesson3;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by new_user on 1/26/2017.
 */
public class PrimitiveConvertor2Test {
    @Test
    public void floatToChar() {
    PrimitiveConvertor2 primitiveConvertor2 = new PrimitiveConvertor2();
    Assert.assertEquals('0', primitiveConvertor2.floatToChar(48.25f));
    }

}