package io.nimbus.hackerrank.interviewperparationkit.sorting.easy;

import java.util.Arrays;

/**
 * https://www.hackerrank.com/challenges/mark-and-toys/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=sorting&h_r=next-challenge&h_v=zen
 */
public class MarkAndToys {

    static int maximumToys(int[] prices, int k) {
        Arrays.sort(prices);
        int count = 0;
        int totalSpend = 0;
        for (int price : prices) {

            if (totalSpend + price <= k) {
                count++;
                totalSpend += price;
            }
        }

        return count;
    }
}
