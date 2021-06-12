package com.primes;

import java.util.ArrayList;

import static com.primes.PrimeNumber.checkPrime;

public class Main {

    public static void main(String[] args) {
        long startTime = System.nanoTime();
        ArrayList arr= checkPrime(100000000);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime)/1000000;
        System.out.println("The time it takes in milli seconds " + duration);
        System.out.println("Number of primes " + PrimeNumber.numberOfPrimes);
    }
}
