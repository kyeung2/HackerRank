package io.nimbus.hackerrank.practice.algorithms.warmup.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * https://www.hackerrank.com/challenges/compare-the-triplets/problem
 */
public class CompareTheTriplets {

    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {

        int aScore = 0;
        int bScore = 0;
        for (int i = 0; i < a.size(); i++) {

            int aValue = a.get(i);
            int bValue = b.get(i);
            if (aValue > bValue) {
                aScore++;
            } else if (aValue < bValue) {
                bScore++;
            }

        }
        List<Integer> result = new ArrayList<>();
        result.add(aScore);
        result.add(bScore);

        return result;
    }
}
