package io.nimbus.hackerrank.warmup.easy;

/**
 * https://www.hackerrank.com/challenges/mini-max-sum/problem?h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen
 */
public class MiniMaxSum {

    static void miniMaxSum(int[] arr) {

        long min = Long.MAX_VALUE;
        long max = Long.MIN_VALUE;

        long totalSum = 0;
        for (int i : arr) {
            totalSum += i;
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }
        System.out.println((totalSum - max) + " " + (totalSum - min));
    }
}
