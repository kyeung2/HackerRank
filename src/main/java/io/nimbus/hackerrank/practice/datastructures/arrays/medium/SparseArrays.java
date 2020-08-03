package io.nimbus.hackerrank.practice.datastructures.arrays.medium;

import java.util.Arrays;

/**
 * https://www.hackerrank.com/challenges/sparse-arrays/problem
 */
public class SparseArrays {

    static int[] matchingStrings(String[] strings, String[] queries) {

        int[] res = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            String query = queries[i];
            res[i] = (int) Arrays.stream(strings).filter(s -> s.equals(query)).count();
        }

        return res;
    }
}
