package com.irenezar.app.homework.lesson3;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Test;
import org.junit.Assert;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

@RunWith(JUnitParamsRunner.class)

public class ModTest {
    @Test
    @FileParameters(value = "src/test/resources/modpositive.csv",
            mapper = CsvWithHeaderMapper.class)
    public void mod(int a, int b, int result) {
        Assert.assertEquals(result, Mod.mod(a,b));
    }

    @Test
    public void mod2() {
        Mod mod2 = new Mod();
        Assert.assertNotEquals(2, mod2.mod(16, 3));
    }
}