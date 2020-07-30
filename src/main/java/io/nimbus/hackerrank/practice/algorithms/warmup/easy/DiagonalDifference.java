package io.nimbus.hackerrank.practice.algorithms.warmup.easy;

import java.util.List;

/**
 * https://www.hackerrank.com/challenges/diagonal-difference/problem?h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen
 */
public class DiagonalDifference {

    public static int diagonalDifference(List<List<Integer>> arr) {

        int count1 = 0;
        int count2 = 0;

        int size = arr.size();
        for (int i = 0; i < size; i++) {
            count1 += arr.get(i).get(i);// o,o, 1,1, 2,2
            count2 += arr.get(i).get(size - 1 - i);// 0,2, 1,1, 2,0
        }

        return Math.abs(count1 - count2);
    }

}
