package com.irenezar.app.homework.lesson9;

import com.irenezar.app.homework.lesson9.*;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by new_user on 2/19/2017.
 */
public class PalindromeCheckCharComparisonTest {
    @Test
    public void definepalindromepositive() {
            PalindromeCheckCharComparison palindromeCheckCharComparison = new PalindromeCheckCharComparison();
            Assert.assertEquals("Palindrome", palindromeCheckCharComparison.definepalindrome("ababa"));
        }
    @Test
    public void definepalindromenegative() {
        PalindromeCheckCharComparison palindromeCheckCharComparison = new PalindromeCheckCharComparison();
        Assert.assertEquals("Not palindrome", palindromeCheckCharComparison.definepalindrome("ababe"));
    }
}

