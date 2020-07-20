package io.nimbus.hackerrank.interviewperparationkit.arrays.easy;

public class ArrayLeftRotation {

    static int[] rotLeft(int[] a, int d) {
        int size = a.length;
        if (size > 1) {
            int[] ret = new int[size];
            for (int i = 0; i < size; i++) {
                int shift = (i + d) % size;
                ret[i] = a[shift];
            }

            return ret;
        }

        return a;
    }
}
