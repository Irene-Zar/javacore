package com.irenezar.app.homework.lesson3;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by new_user on 1/26/2017.
 */
public class AddTest {
    @Test
    public void add(){
        Add add = new Add();
        Assert.assertEquals(8, add.add(5,3));}
}