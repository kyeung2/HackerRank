package io.nimbus.hackerrank.practice.algorithms.warmup.easy;

/**
 * https://www.hackerrank.com/challenges/plus-minus/problem?h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen
 */
public class PlusMinus {

    static void plusMinus(int[] arr) {
        int n = arr.length;
        double zeros = 0;
        double positives = 0;
        double negatives = 0;
        for (int i : arr) {
            if (i > 0)
                positives++;
            else if (i < 0)
                negatives++;
            else
                zeros++;
        }

        System.out.println(String.format("%.6f", positives / n));
        System.out.println(String.format("%.6f", negatives / n));
        System.out.println(String.format("%.6f", zeros / n));
    }
}
