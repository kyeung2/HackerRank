package io.nimbus.hackerrank.implementation.easy;

import java.util.Arrays;

/**
 * https://www.hackerrank.com/challenges/the-hurdle-race/problem
 */
public class TheHurdleRace {

    static int hurdleRace(int k, int[] height) {
        int max = Arrays.stream(height).max().orElseThrow(() -> new IllegalArgumentException("height array not configured correctly for this exercise"));
        int potions = max - k;
        return Math.max(potions, 0);
    }
}
