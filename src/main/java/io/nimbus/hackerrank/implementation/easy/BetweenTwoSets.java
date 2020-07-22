package io.nimbus.hackerrank.implementation.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * https://www.hackerrank.com/challenges/between-two-sets/problem
 */
public class BetweenTwoSets {

    public static int getTotalX(List<Integer> a, List<Integer> b) {
        List<Integer> commonFactorsOfB = findCommonFactors(b);
        List<Integer> between = commonFactorsOfB.stream().filter(x ->
                a.stream().allMatch(aElement -> isFactor(x, aElement))
        ).collect(Collectors.toList());

        return between.size();
    }


    // my brute force algorithm, iterating backwards for all number to find the common.
    // found a solution using LCM a and GCD of b, but I have no intuition for that solution so no going to look into too much.
    private static List<Integer> findCommonFactors(List<Integer> list) {

        List<Integer> commonFactors = new ArrayList<>();
        for (Integer factor = list.get(0); factor > 0; factor--) {
            if (isCommonFactor(list, factor)) {
                commonFactors.add(factor);
            }
        }

        return commonFactors;
    }
    private static boolean isCommonFactor(List<Integer> list, Integer factor) {
        return list.stream().allMatch(n -> isFactor(n, factor));
    }

    private static boolean isFactor(Integer n, Integer factor) {
        return n % factor == 0;
    }


    public static void main(String[] args) {
        System.out.println(getTotalX(List.of(2, 6), List.of(24, 36)));
    }
}
