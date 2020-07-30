package io.nimbus.hackerrank.problemsolving.implementation.easy;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

/**
 * https://www.hackerrank.com/challenges/find-digits/problem
 */
public class FindDigits {

    static int findDigits(int n) {
        return (int) split(n).stream()
                .filter(digit -> digit != 0 && n % digit == 0)
                .count();
    }

    @NotNull
    private static List<Integer> split(int n) {
        int number = n;
        List<Integer> res = new ArrayList<>();
        while (number > 0) {
            res.add(number % 10);
            number = number / 10;
        }
        return res;
    }

    public static void main(String[] args) {

        System.out.println(findDigits(1012));
    }
}
