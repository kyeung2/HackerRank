package io.nimbus.hackerrank.practice.algorithms.implementation.easy;

import java.util.Arrays;

/**
 * https://www.hackerrank.com/challenges/circular-array-rotation/problem
 */
public class CircularArrayRotation {

    static int[] circularArrayRotation(int[] a, int k, int[] queries) {
        // I didn't figure this one out on my own. I could see that modulo was going to be needed.
        // but didn't see that "rotate right" k value was the offset I needed.
        int n = a.length;
        int[] rotated = new int[n];
        for (int i = 0; i < n; i++) {
            // the insight is k is an offset, so shifting by k positions to the right, then you modulo
            // so that it loops back.
            int offsetIndex = (i + k) % n;
            rotated[offsetIndex] = a[i];
        }

        return queryPositions(queries, rotated);
    }

    private static int[] queryPositions(int[] queries, int[] rotated) {
        int[] res = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int query = queries[i];
            res[i] = rotated[query];
        }
        return res;
    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(circularArrayRotation(new int[]{3, 4, 5}, 2, new int[]{0, 1, 2})));
    }

}
