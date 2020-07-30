package io.nimbus.hackerrank.practice.algorithms.implementation.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * https://www.hackerrank.com/challenges/bon-appetit/problem
 */
public class BonAppetit {


    // k index of idea she didn't eat.
    static void bonAppetit(List<Integer> bill, int k, int b) {

        List<Integer> itemsSheHad = new ArrayList<>(bill);
        itemsSheHad.remove(k);
        int actualCost = itemsSheHad.stream().mapToInt(Integer::intValue).sum() / 2;
        int owed = b - actualCost;

        System.out.println(owed == 0 ? "Bon Appetit" : owed);
    }
}
