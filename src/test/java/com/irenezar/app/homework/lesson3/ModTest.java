package com.irenezar.app.homework.lesson3;

import org.junit.Test;
import org.junit.Assert;

import static org.junit.Assert.*;

/**
 * Created by new_user on 1/26/2017.
 */
public class ModTest {
    @Test
    public void mod() {
        Mod mod = new Mod();
        Assert.assertEquals(1, mod.mod(16, 3));
    }

    @Test
    public void mod2() {
        Mod mod2 = new Mod();
        Assert.assertNotEquals(2, mod2.mod(16, 3));
    }
}