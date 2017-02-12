package com.irenezar.app.homework.lesson3;

import junitparams.FileParameters;
import junitparams.mappers.CsvWithHeaderMapper;
import junitparams.JUnitParamsRunner;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)

/**
 * Created by new_user on 1/26/2017.
 */
public class MinimumValueTest {
    @Test
    @FileParameters(value = "src/test/resources/minvaluepositive.csv",
            mapper = CsvWithHeaderMapper.class)
    public void minvaluepositive(int a, int b, int result) {
        Assert.assertEquals(result, MinimumValue.minimum(a,b));
    }

    @Test
    public void minvaluenegative() {
        MinimumValue minimumValue2 = new MinimumValue();
        Assert.assertNotEquals(7, minimumValue2.minimum(7,3));
    }

}