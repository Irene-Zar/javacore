package com.irenezar.app.homework.lesson3;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Test;
import org.junit.Assert;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

@RunWith(JUnitParamsRunner.class)

public class SubtractTest {
    @Test
    @FileParameters(value = "src/test/resources/subtractpositive.csv",
            mapper = CsvWithHeaderMapper.class)
    public void subtractpositive(float a, float b, float result){
           Assert.assertEquals(result, Subtract.sub(a,b),0.01);}

    @Test
    public void subtractnegative(){
        Subtract subtract2 = new Subtract();
        Assert.assertNotEquals(5, subtract2.sub(20,5));}
    }