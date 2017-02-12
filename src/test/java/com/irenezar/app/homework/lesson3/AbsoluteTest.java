package com.irenezar.app.homework.lesson3;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Test;
import org.junit.Assert;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)

public class AbsoluteTest {
    @Test
    @FileParameters(value = "src/test/resources/absolutepositive.csv",
            mapper = CsvWithHeaderMapper.class)

    public void absolutepositive(float number, float result) {
        Assert.assertEquals(result, Absolute.convert(number), 0.1);
    }

    @Test
    public void absolutenegative() {
        Absolute absolute2 = new Absolute();
        Assert.assertNotEquals(1, absolute2.convert(-5.01f), 0.01);
    }
}