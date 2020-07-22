package io.nimbus.hackerrank.implementation.easy;

/**
 * https://www.hackerrank.com/challenges/breaking-best-and-worst-records/problem
 */
public class BreakingTheRecords {
    static int[] breakingRecords(int[] scores) {
        int highCount = 0;
        int lowCount = 0;
        if (scores.length > 0) {

            int currentHighRecord = scores[0];
            int currentLowRecord = scores[0];
            for (int score : scores) {
                if (score > currentHighRecord) {
                    currentHighRecord = score;
                    highCount++;
                }
                if (score < currentLowRecord) {
                    currentLowRecord = score;
                    lowCount++;
                }
            }
        }

        return new int[]{highCount, lowCount};
    }
}
