package io.nimbus.hackerrank.practice.datastructures.arrays.easy;

import java.util.Arrays;

/**
 * https://www.hackerrank.com/challenges/array-left-rotation/problem
 */
public class LeftRotation {

    static void leftRotate(int[] a, int d, int n) {
        if (d % n != 0) {
            int[] res = new int[n];
            int rightDelta = n - d;
            for (int i = 0; i < n; i++) {
                res[(i + rightDelta) % n] = a[i];
            }
            print(res);
        } else
            print(a);
    }

    private static void print(int[] res) {
        for (int re : res) {
            System.out.print(re + " ");
        }
    }

    public static void main(String[] args) {
        leftRotate(new int[]{1, 2, 3, 4, 5}, 4, 5);
        leftRotate(new int[]{1, 2, 3, 4, 5}, 10, 5);
    }
}
