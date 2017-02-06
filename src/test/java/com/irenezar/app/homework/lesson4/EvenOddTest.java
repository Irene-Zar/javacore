package com.irenezar.app.homework.lesson4;

import com.irenezar.app.classwork.lesson4.EvenOdd;
import com.sun.javafx.geom.Crossings;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by new_user on 2/2/2017.
 */
public class EvenOddTest {
    @Test
    public void isOdd() {
      EvenOdd evenOdd = new EvenOdd();
        assertTrue(evenOdd.isOdd(5));
      }

    @Test
    public void isOdd2() {
        EvenOdd evenOdd = new EvenOdd();
        assertFalse(evenOdd.isOdd(6));
    }
}