package io.nimbus.hackerrank.interviewperparationkit.greedy.easy;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * https://www.hackerrank.com/challenges/luck-balance/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=greedy-algorithms
 */
public class LuckBalance {

    private static final int IMPORTANT = 1;

    static int luckBalance(int k, int[][] contests) {
        int totalLuck = 0;
        List<Integer> importantLucks = new ArrayList<>();
        for (int[] contest : contests) {
            int luck = contest[0];
            int importance = contest[1];
            if (importance == IMPORTANT) {
                importantLucks.add(luck);
            }
            totalLuck += luck;
        }
        int minimalLuckLost = 0;
        if (k <= importantLucks.size()) {
            importantLucks.sort(Comparator.naturalOrder());
            minimalLuckLost = importantLucks.subList(0, importantLucks.size() - k).stream().mapToInt(Integer::intValue).sum();
        }
        // it should not have been added to the total in the first place. then remove. so twice.
        return totalLuck - minimalLuckLost - minimalLuckLost;
    }

    public static void main(String[] args) {
        int[][] contests = new int[][]{
                {5, 1},
                {2, 1},
                {1, 1},
                {8, 1},
                {10, 0},
                {5, 0},
        };
        System.out.println(luckBalance(3, contests));

//        int[][] contests = new int[][]{
//                {5, 0},
//                {5, 0},
//                {5, 0},
//                {5, 0}
//
//        };
//        System.out.println(luckBalance(4, contests));
    }
}
