package com.irenezar.app.homework.lesson9;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by new_user on 2/19/2017.
 */
public class PalindromeCheckWithStringbuilderTest {
    @Test
    public void definepalindromepositive() {
        PalindromeCheckWithStringbuilder palindromeCheckWithStringbuilder = new PalindromeCheckWithStringbuilder();
        Assert.assertEquals("Palindrome", palindromeCheckWithStringbuilder.definepalindrome("ababa"));
    }
    @Test
    public void definepalindromenegative() {
        PalindromeCheckWithStringbuilder palindromeCheckWithStringbuilder = new PalindromeCheckWithStringbuilder();
        Assert.assertEquals("Not palindrome", palindromeCheckWithStringbuilder.definepalindrome("ababe"));
    }

}