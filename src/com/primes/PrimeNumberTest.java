package com.primes;

import org.junit.Test;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.Arrays;

public class PrimeNumberTest {
    @Test
    public void findPrimes() {
        ArrayList arr = new ArrayList(Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29));
        Assert.assertEquals(PrimeNumber.checkPrime(30), arr);
    }

    @Test
    public void forLongLists() {
        int bound = 100000000;
        int expected = 5761455;
        PrimeNumber.checkPrime(bound);
        Assert.assertEquals(expected, PrimeNumber.numberOfPrimes);

    }
}
