package io.nimbus.hackerrank.practice.datastructures.arrays.hard;

import java.util.Arrays;

/**
 * https://www.hackerrank.com/challenges/crush/problem
 */
public class ArrayManipulation {


    /**
     * solution found on the web. https://www.youtube.com/watch?v=hDhf04AJIRs&list=PLSIpQf0NbcCltzNFrOJkQ4J4AAjW3TSmA
     * Essentially, adding markers into the at the ranges, taking O(1) time. Then iterate through cumulatively adding
     * from previous.
     */
    static long arrayManipulation(int n, int[][] queries) {

        long[] res = new long[n + 2];//+2 as, +1 as the indexing of the queries start from 1, and +1 so the below algorithm can be simpler

        // m queries
        for (int[] query : queries) {

            int a = query[0];
            int b = query[1];
            int k = query[2];
            res[a] += k;
            res[b + 1] -= k;
        }

        //getMax() iterates through n

        // therefore overall complexity is O(n + m)
        return getMax(res);
    }

    private static long getMax(long[] res) {
        long max = Long.MIN_VALUE;
        long sum = 0;
        for (int i = 0; i < res.length; i++) {
            sum += res[i];
            max = Math.max(max, sum);
        }
        return max;
    }


//    // this brute force implementation works, though too slow.
//    static long arrayManipulation(int n, int[][] queries) {
//        long[] res = new long[n];
//        Arrays.fill(res, 0);
//        for (int[] query : queries) {

//
//            for (int i = a - 1; i < b; i++) {
//                res[i] += k;
//            }
//        }
//        return Arrays.stream(res).max().orElseThrow(() -> new RuntimeException("Something went wrong"));
//    }

    public static void main(String[] args) {
        System.out.println(arrayManipulation(5, new int[][]{
                {1, 2, 100},
                {2, 5, 100},
                {3, 4, 100}
        }));
    }

}
