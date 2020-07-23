package io.nimbus.hackerrank.implementation.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * https://www.hackerrank.com/challenges/electronics-shop/problem
 */
public class ElectricsShop {

    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        Set<Integer> totalPrices = new HashSet<>();
        for (int keyboard : keyboards) {
            for (int drive : drives) {
                int total = keyboard + drive;
                if (total <= b) {
                    totalPrices.add(total);
                }
            }
        }

        return totalPrices.stream().mapToInt(Integer::intValue).max().orElse(-1);
    }


    public static void main(String[] args) {
        System.out.println(getMoneySpent(new int[]{3, 1}, new int[]{5, 2, 8}, 10));
    }
}
