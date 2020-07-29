package io.nimbus.hackerrank.implementation.medium;

import java.math.BigInteger;

/**
 * https://www.hackerrank.com/challenges/extra-long-factorials/problem
 */
public class ExtraLongFactorials {

    static void extraLongFactorials(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }

        System.out.println(result.toString());
    }

    public static void main(String[] args) {
        extraLongFactorials(25);
    }
}
