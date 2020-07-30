package io.nimbus.hackerrank.problemsolving.implementation.easy;

import java.util.Arrays;

/**
 * https://www.hackerrank.com/challenges/permutation-equation/problem
 */
public class SequenceEquation {

    static int[] permutationEquation(int[] p) {
        int[] res = new int[p.length];
        for (int i = 0; i < p.length; i++) {
            int x = i + 1;
            int pOfX = findIndexOf(p, x) + 1;
            int pOfpOfX = findIndexOf(p, pOfX) + 1;
            res[i] = pOfpOfX;
        }
        return res;
    }

    private static int findIndexOf(int[] p, int x) {
        for (int i = 0; i < p.length; i++) {
            if (p[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(permutationEquation(new int[]{2, 3, 1})));
        System.out.println(Arrays.toString(permutationEquation(new int[]{4, 3, 5, 1, 2})));
    }

}
