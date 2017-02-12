package com.irenezar.app.homework.lesson3;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Test;
import org.junit.Assert;
import org.junit.runner.RunWith;


@RunWith(JUnitParamsRunner.class)

public class SquareRootTest {
    @Test
    @FileParameters(value = "src/test/resources/squarerootpositive.csv",
            mapper = CsvWithHeaderMapper.class)
    public void squarerootpositive(float a, float result) {
        Assert.assertEquals(result, SquareRoot.sqroot(a), 0.01);
    }

    @Test
    public void squarerootnegative() {
        SquareRoot squareRoot2 = new SquareRoot();
        Assert.assertNotEquals(0, squareRoot2.sqroot(9));
    }
}