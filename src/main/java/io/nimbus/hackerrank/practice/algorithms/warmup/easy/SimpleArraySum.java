package io.nimbus.hackerrank.practice.algorithms.warmup.easy;

import java.util.Arrays;

/**
 * https://www.hackerrank.com/challenges/simple-array-sum/problem
 */
public class SimpleArraySum {
    /*
     * Complete the simpleArraySum function below.
     */
    static int simpleArraySum(int[] ar) {
        return Arrays.stream(ar).sum(); // or IntStream.of()

    }
}
