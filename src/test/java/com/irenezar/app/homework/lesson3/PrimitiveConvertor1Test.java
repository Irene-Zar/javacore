package com.irenezar.app.homework.lesson3;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Test;
import org.junit.Assert;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

@RunWith(JUnitParamsRunner.class)

public class PrimitiveConvertor1Test {
    @Test
    @FileParameters(value = "src/test/resources/inttochar.csv",
            mapper = CsvWithHeaderMapper.class)
    public void intToChar(int number, char result) {
        Assert.assertEquals(result,PrimitiveConvertor1.intToChar(number));
    }

    @Test
    public void intToChar2() {
        PrimitiveConvertor1 primitiveConvertor2 = new PrimitiveConvertor1();
        Assert.assertNotEquals('f', primitiveConvertor2.intToChar(114));
    }

}