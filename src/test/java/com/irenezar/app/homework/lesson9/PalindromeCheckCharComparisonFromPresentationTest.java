package com.irenezar.app.homework.lesson9;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by new_user on 2/19/2017.
 */
public class PalindromeCheckCharComparisonFromPresentationTest {
    @Test
    public void definepalindromepositive() {
        PalindromeCheckCharComparisonFromPresentation palindromeCheckCharComparisonFromPresentation = new PalindromeCheckCharComparisonFromPresentation();
        Assert.assertEquals("Palindrome", palindromeCheckCharComparisonFromPresentation.definepalindrome("ababa"));
    }

    @Test
    public void definepalindromenegative() {
        PalindromeCheckCharComparisonFromPresentation palindromeCheckCharComparisonFromPresentation = new PalindromeCheckCharComparisonFromPresentation();
        Assert.assertEquals("Not palindrome", palindromeCheckCharComparisonFromPresentation.definepalindrome("ababe"));
    }

}