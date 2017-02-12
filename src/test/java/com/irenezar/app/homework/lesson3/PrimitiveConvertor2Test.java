package com.irenezar.app.homework.lesson3;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;
@RunWith(JUnitParamsRunner.class)


public class PrimitiveConvertor2Test {
    @Test
    @FileParameters(value = "src/test/resources/floattochar.csv",
            mapper = CsvWithHeaderMapper.class)
    public void floatToChar(float number, char result) {
    Assert.assertEquals(result, PrimitiveConvertor2.floatToChar(number));
    }
    @Test
    public void floatToChar2() {
        PrimitiveConvertor2 primitiveConvertor22 = new PrimitiveConvertor2();
        Assert.assertNotEquals('d', primitiveConvertor22.floatToChar(48.25f));
    }
}