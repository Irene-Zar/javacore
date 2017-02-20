package com.irenezar.app.homework.lesson9;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by new_user on 2/19/2017.
 */
public class PalindromeCheckWithReversedValueInLoopTest {
    @Test
    public void definepalindromepositive() {
        PalindromeCheckWithReversedValueInLoop palindromeCheckWithReversedValueInLoop = new PalindromeCheckWithReversedValueInLoop();
        Assert.assertEquals("Palindrome", palindromeCheckWithReversedValueInLoop.definepalindrome("ababa"));
    }
    @Test
    public void definepalindromenegative() {
        PalindromeCheckWithReversedValueInLoop palindromeCheckWithReversedValueInLoop = new PalindromeCheckWithReversedValueInLoop();
        Assert.assertEquals("Not palindrome", palindromeCheckWithReversedValueInLoop.definepalindrome("ababe"));
    }

}