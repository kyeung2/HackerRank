package io.nimbus.hackerrank.implementation.easy;

/**
 * https://www.hackerrank.com/challenges/divisible-sum-pairs/problem
 */
public class DivisibleSumPairs {

    static int divisibleSumPairs(int n, int k, int[] ar) {
        int totalPairs = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if ((ar[i] + ar[j]) % k == 0) {
                    totalPairs++;
                }
            }
        }

        return totalPairs;
    }

    public static void main(String[] args) {
        System.out.println(divisibleSumPairs(6, 3, new int[]{1, 3, 2, 6, 1, 2}));
    }
}


