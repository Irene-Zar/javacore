package com.irenezar.app.homework.lesson3;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Test;
import org.junit.Assert;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

@RunWith(JUnitParamsRunner.class)

public class PrimitiveConvertor3Test {
    @Test
    @FileParameters(value = "src/test/resources/chartoint.csv",
            mapper = CsvWithHeaderMapper.class)
    public void charToInt(char value, int result){
        Assert.assertEquals(result, PrimitiveConvertor3.charToInt(value));
    }
    @Test
    public void charToInt2(){
        PrimitiveConvertor3 primitiveConvertor32 = new PrimitiveConvertor3();
        Assert.assertNotEquals(100, primitiveConvertor32.charToInt('h'));
    }
}