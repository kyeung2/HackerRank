package io.nimbus.hackerrank.problemsolving.implementation.medium;

import java.util.Arrays;

/**
 * https://www.hackerrank.com/challenges/climbing-the-leaderboard/problem
 */
public class ClimbingTheLeaderboard {

    /**
     * couldn't find a fast solution on my own used: https://www.youtube.com/watch?v=CAyXHTqBIBU&list=PLSIpQf0NbcCltzNFrOJkQ4J4AAjW3TSmA
     *
     * it's interesting that the solution created another array of ranks, and I went too far trying to optimise, creating
     * a count of the number of ranks and calculating the nth rank when going backwards.
     *
     * It wasn't worth the time and code complexity. As most of these exercises care about time not space.
     */
    static int[] climbingLeaderboard(int[] scores, int[] alice) {

        int n = scores.length;
        int m = alice.length;

        int[] res = new int[m];
        int[] rank = new int[n];
        rank[0] = 1;
        for (int i = 1; i < n; i++) {
            if (scores[i] == scores[i - 1]) {
                rank[i] = rank[i - 1];// same
            } else {
                rank[i] = rank[i - 1] + 1;
            }
        }

        for (int i = 0; i < m; i++) {
            int aliceScore = alice[i];

            if (aliceScore > scores[0]) { // boundary check upper limit
                res[i] = 1;
            } else if (aliceScore < scores[n - 1]) {// boundary check lower limit
                res[i] = rank[n - 1] + 1;
            } else {
                int index = binarySearch(scores, aliceScore);
                res[i] = rank[index];
            }
        }


        return res;
    }


    // a little different from a normal binary search.
    private static int binarySearch(int[] a, int key) {

        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;

            if (a[mid] == key) {
                return mid;
            } else if (a[mid] < key && key < a[mid - 1]) {//e.g. |100|90| key = 95 a[1]<95 && 95< a[0], return index of 90.
                return mid;
            } else if (a[mid] > key && key >= a[mid + 1]) {// e.g. 100|90|80 key = 85 a[1]>85 && 85>=a[2], then return of 80.
                return mid + 1;
            } else if (a[mid] < key) {
                hi = mid - 1;
            } else if (a[mid] > key) {
                lo = mid + 1;
            }
        }

        return -1;

    }


    public static void main(String[] args) {


        {
            int[] scores = {100, 90, 90, 80, 75, 60};
            int[] alice = {50, 50, 50};
            System.out.println("should be [6,6,6]: " + Arrays.toString(climbingLeaderboard(scores, alice)));
        }

        {
            int[] scores = {100, 100, 50, 40, 40, 20, 10};
            int[] alice = {5, 25, 50, 120};
            System.out.println("should be [6,4,2,1]]: " + Arrays.toString(climbingLeaderboard(scores, alice)));
        }

        {
            int[] scores = {100, 90, 90, 80, 75, 60};
            int[] alice = {50};
            System.out.println("should be 6th: " + Arrays.toString(climbingLeaderboard(scores, alice)));
        }
        {
            int[] scores = {100, 90, 90, 80, 75, 60};
            int[] alice = {60};
            System.out.println("should be 5th: " + Arrays.toString(climbingLeaderboard(scores, alice)));
        }
        {
            int[] scores = {100, 90, 90, 80, 75, 60};
            int[] alice = {90};
            System.out.println("should be 2nd: " + Arrays.toString(climbingLeaderboard(scores, alice)));
        }
        {
            int[] scores = {100, 90, 90, 80, 75, 60};
            int[] alice = {102};
            System.out.println("should be 1st: " + Arrays.toString(climbingLeaderboard(scores, alice)));
        }
        {
            int[] scores = {100, 90, 90, 80, 75, 60};
            int[] alice = {50, 102};
            System.out.println("should be 6th and 1st: " + Arrays.toString(climbingLeaderboard(scores, alice)));
        }
        {
            int[] scores = {100, 90, 90, 80, 75, 60};
            int[] alice = {50, 65, 77, 90, 102};
            System.out.println("should be [6,5,4,2,1]: " + Arrays.toString(climbingLeaderboard(scores, alice)));
        }

    }
}

// this works but is too slow for the test.
//class SlowImplementation{
//    static int[] climbingLeaderboard(int[] scores, int[] alice) {
//
//        List<Integer> ranking = getRankingsUpTo(scores, alice[0]);
//        int[] aliceRankings = new int[alice.length];
//
//        for (int i = 0; i < alice.length; i++) {
//
//            int aliceScore = alice[i];
//            aliceRankings[i] = getRank(ranking, aliceScore);
//        }
//
//        return aliceRankings;
//    }
//
//    private static int getRank(List<Integer> ranking, int aliceScore) {
//
//        for (int i = 0; i < ranking.size(); i++) {
//
//            Integer rankingScore = ranking.get(i);
//            if (rankingScore <= aliceScore) {
//                return i + 1;
//            }
//        }
//
//        return ranking.size() + 1;
//    }
//
//    private static List<Integer> getRankingsUpTo(int[] scores, int limit) {
//        List<Integer> ranking = new ArrayList<>();
//        int currentScore = -1;
//        for (int score : scores) {
//
//            if (score < limit)
//                break;
//
//            if (currentScore != score) {
//                ranking.add(score);
//                currentScore = score;
//            }
//        }
//        return ranking;
//    }
//}


//TODO this attempt wanted to go forwards, then backwards, but became very unwieldy
//class IndexHell{
//    static int[] climbingLeaderboard(int[] scores, int[] alice) {
//
//        int aliceLowScore = alice[0];
//        int rankCountUpToAliceLowScore = 0;
//        int scoreIndex = 0;
//
//        // 1. travel down the ranks until we reach alice's lowest score.
//        int uniqueScore = -1;
//        for (; scoreIndex < scores.length; scoreIndex++) {
//            int score = scores[scoreIndex];
//            if (uniqueScore != score) {
//                uniqueScore = score;
//                rankCountUpToAliceLowScore++;
//            }
//            if (score <= aliceLowScore) {
//                break;
//            }
//        }
//
//        int[] aliceRankings = new int[alice.length];
//
//        // when Alice's score was lower than all the leaderboard.
//        int aliceIndex = 0;
//        if (scores.length == scoreIndex) {
//            aliceRankings[0] = rankCountUpToAliceLowScore + 1;
//            aliceIndex = 1;
//            scoreIndex -= 1;
//        }
//
//
//        uniqueScore = -1;
//        int backwardsRankCount = 0;
//        for (int i = scoreIndex; aliceIndex < aliceRankings.length && i >= 0; i--) {
//            int score = scores[i];
//            int aliceScore = alice[aliceIndex];
//
//            if (uniqueScore != score) {
//                uniqueScore = score;
//                backwardsRankCount++;
//            }
//
//            if (aliceScore == score) {
//                int newRank = rankCountUpToAliceLowScore - backwardsRankCount + 1;
//                aliceRankings[aliceIndex] = newRank;
//                aliceIndex++;
//            }
//
//            // when our score is greater than the current greatest on the leader board
//
//            if (aliceScore > score) {
//                // if we are at the end
//                if (i - 1 < 0) {
//                    aliceRankings[aliceIndex] = 1;
//                    aliceIndex++;
//                }
//                // else if we are sandwiched in between 2 ranks
//                else if (aliceScore < scores[i - 1]) {
//                    int newRank = rankCountUpToAliceLowScore - backwardsRankCount + 1;
//                    aliceRankings[aliceIndex] = newRank;
//                    aliceIndex++;
//                }
//            }
//        }
//
//        return aliceRankings;
//    }
//
//
//}