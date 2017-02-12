package com.irenezar.app.homework.lesson3;

import junitparams.FileParameters;
import junitparams.mappers.CsvWithHeaderMapper;
import junitparams.JUnitParamsRunner;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)

public class AddTest {
    @Test
    @FileParameters(value = "src/test/resources/addpositive.csv",
            mapper = CsvWithHeaderMapper.class)
    public void addpositive(int a, int b, int result){
        Assert.assertEquals(result, Add.add(a, b));
}

    @Test
    public void addnegative(){
        Add add2 = new Add();
        Assert.assertNotEquals(4,add2.add(1,1));}
}
