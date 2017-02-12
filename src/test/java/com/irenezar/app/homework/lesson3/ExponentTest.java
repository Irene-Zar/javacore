package com.irenezar.app.homework.lesson3;

import junitparams.FileParameters;
import junitparams.mappers.CsvWithHeaderMapper;
import junitparams.JUnitParamsRunner;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)

public class ExponentTest {
    @Test
    @FileParameters(value = "src/test/resources/exponentpositive.csv",
            mapper = CsvWithHeaderMapper.class)
    public void exponentpositive(float number, float result) {
        Assert.assertEquals(result, Exponent.exp(number),0.1);
    }

    @Test
    public void exponentnegative() {
        Exponent exponent2 = new Exponent();
        Assert.assertNotEquals(0,exponent2.exp(2.7f),0.1);
    }
}
