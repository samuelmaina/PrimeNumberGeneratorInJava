package com.primes;

import java.util.ArrayList;

public class PrimeNumber {

    public static int numberOfPrimes = 0;
    public static ArrayList arr = new ArrayList<>();
    public static ArrayList checkPrime(int num) {
        boolean[] prime = new boolean[num + 1];
        markAllNumsPrime(num, prime);
        sievePrimes(num, prime);
        gatherTheSievedPrimes(num, prime);
        return arr;
    }

    private static void gatherTheSievedPrimes(int num, boolean[] prime) {
        for (int i = 2; i <= num; i++) {
            if (prime[i]) {
                numberOfPrimes++;
                arr.add(i);
            }
        }
    }

    private static void sievePrimes(int num, boolean[] prime) {
        for (int p = 2; p <= Math.sqrt(num); p++)
            if (prime[p]) {
                for (int j = p; j * p <= num; j++) {
                    prime[j * p] = false;
                }
            }
    }

    private static void markAllNumsPrime(int num, boolean[] prime) {
        for (int i = 2; i <= num; i++)
            prime[i] = true;
    }
}
