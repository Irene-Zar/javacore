package com.irenezar.app.classwork.lesson3;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

@RunWith(JUnitParamsRunner.class)


public class MathFuncTest {

    @Test
    @FileParameters(value = "src/test/resources/testdata.csv",
            mapper = CsvWithHeaderMapper.class)

    public void multiplyTest(int argA, int argB, int expOut){
        Assert.assertEquals(expOut, MathFunc.multiply(argA, argB));
    }

}
