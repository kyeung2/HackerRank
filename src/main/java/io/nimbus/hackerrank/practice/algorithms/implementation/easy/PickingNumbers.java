package io.nimbus.hackerrank.practice.algorithms.implementation.easy;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * https://www.hackerrank.com/challenges/picking-numbers/problem
 */
public class PickingNumbers {

    public static int pickingNumbers(List<Integer> a) {
        a.sort(Comparator.naturalOrder());

        List<Integer> currentChain = new ArrayList<>();
        int longestChain = 0;

        for (Integer e : a) {

            if (currentChain.isEmpty() ||
                    // the instructions was for all having a difference of <=1 not just the next.
                    currentChain.stream().allMatch(it -> Math.abs(it - e) <= 1)) {
                currentChain.add(e);

            } else {
                if (currentChain.size() > longestChain) {
                    longestChain = currentChain.size();
                }

                currentChain.clear();
                // didn't see that when the current chain is processed, the current element needs to be added.
                currentChain.add(e);
            }
        }
        // first attempt didn't see that, once iteration is complete, need to do the final check for the final chain.
        if (currentChain.size() > longestChain) {
            longestChain = currentChain.size();
        }

        return longestChain;
    }

    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>(List.of(1, 1, 2, 2, 4, 4, 5, 5, 5));
        System.out.println(pickingNumbers(a));
    }
}