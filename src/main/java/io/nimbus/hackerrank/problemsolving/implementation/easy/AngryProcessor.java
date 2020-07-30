package io.nimbus.hackerrank.problemsolving.implementation.easy;

import java.util.Arrays;

/**
 * https://www.hackerrank.com/challenges/angry-professor/problem
 */
public class AngryProcessor {

    static String angryProfessor(int k, int[] a) {

        long numberOfStudentsOnTime = Arrays.stream(a).filter(time -> time <= 0).count();
        return numberOfStudentsOnTime >= k ? "NO" : "YES";
    }
}
