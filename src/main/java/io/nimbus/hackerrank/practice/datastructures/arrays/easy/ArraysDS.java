package io.nimbus.hackerrank.practice.datastructures.arrays.easy;

import java.util.Arrays;

/**
 * https://www.hackerrank.com/challenges/arrays-ds/problem
 */
public class ArraysDS {

    static int[] reverseArray(int[] a) {
        int n = a.length;
        int[] res = new int[n];

        for (int i = 0; i < n; i++) {
            res[i] = a[n - 1 - i];
        }

        return res;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(reverseArray(new int[]{1, 4, 3, 2})));
    }
}
