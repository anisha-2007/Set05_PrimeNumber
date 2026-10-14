package com.lab;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void testPrimeNumber() {
        assertTrue(App.isPrime(7));
    }

    @Test
    public void testNonPrimeNumber() {
        assertFalse(App.isPrime(8));
    }

    @Test
    public void testOneIsNotPrime() {
        assertFalse(App.isPrime(1));
    }

    @Test
    public void testTwoIsPrime() {
        assertTrue(App.isPrime(2));
    }
}