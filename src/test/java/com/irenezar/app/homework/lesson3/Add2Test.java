package com.irenezar.app.homework.lesson3;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by new_user on 1/26/2017.
 */
public class Add2Test {
    @Test
   public void add2(){
        Add add2 = new Add();
        Assert.assertNotEquals(4,add2.add(1,1));}
}