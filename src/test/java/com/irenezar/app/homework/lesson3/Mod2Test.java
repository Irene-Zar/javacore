package com.irenezar.app.homework.lesson3;

import org.junit.Test;
import org.junit.Assert;

import static org.junit.Assert.*;

/**
 * Created by new_user on 1/26/2017.
 */
public class Mod2Test {
    @Test
    public void mod() {
        Mod mod2 = new Mod();
        Assert.assertNotEquals(2, mod2.mod(16,3));}
}
