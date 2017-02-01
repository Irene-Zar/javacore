package com.irenezar.app.homework.lesson3;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by new_user on 1/26/2017.
 */
public class PrimitiveConvertor21Test {
    @Test
    public void floatToChar() {
    PrimitiveConvertor2 primitiveConvertor21 = new PrimitiveConvertor2();
    Assert.assertNotEquals('d', primitiveConvertor21.floatToChar(48.25f));
    }

}