package io.nimbus.hackerrank.practice.algorithms.warmup.easy;

import java.util.stream.LongStream;

/**
 * https://www.hackerrank.com/challenges/a-very-big-sum/problem?h_r=next-challenge&h_v=zen
 */
public class AVeryBigSum {

    // Complete the aVeryBigSum function below.
    static long aVeryBigSum(long[] ar) {
        return LongStream.of(ar).sum();
    }

}
