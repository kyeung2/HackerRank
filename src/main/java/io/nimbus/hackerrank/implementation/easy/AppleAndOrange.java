package io.nimbus.hackerrank.implementation.easy;

import java.util.stream.IntStream;

/**
 * https://www.hackerrank.com/challenges/apple-and-orange/problem
 */
public class AppleAndOrange {

    // Complete the countApplesAndOranges function below.
    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {

        System.out.println(fruitsInRange(s, t, a, apples));
        System.out.println(fruitsInRange(s, t, b, oranges));
    }

    private static long fruitsInRange(int s, int t, int tree, int[] fruits) {
        return IntStream.of(fruits)
                .map(d -> d + tree)
                .filter(landed -> landed >= s && landed <= t)
                .count();
    }
}
