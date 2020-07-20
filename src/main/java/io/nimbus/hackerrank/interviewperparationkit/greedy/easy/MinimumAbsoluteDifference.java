package io.nimbus.hackerrank.interviewperparationkit.greedy.easy;

import java.util.Arrays;

/**
 * https://www.hackerrank.com/challenges/minimum-absolute-difference-in-an-array/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=greedy-algorithms
 */
public class MinimumAbsoluteDifference {

    static int minimumAbsoluteDifference(int[] arr) {

        int minimumDifference = Integer.MAX_VALUE;
        // as we want the minimum difference, if the array is sorted, then by definition,
        // the minimum differences will be adjacent to each other.
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++) {

            int abs = Math.abs(arr[i] - arr[i + 1]);
            if (abs < minimumDifference) {
                minimumDifference = abs;
            }
        }
        return minimumDifference;
    }
}