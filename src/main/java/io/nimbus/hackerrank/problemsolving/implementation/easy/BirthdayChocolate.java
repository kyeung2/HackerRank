package io.nimbus.hackerrank.problemsolving.implementation.easy;

import java.util.List;

/**
 * https://www.hackerrank.com/challenges/the-birthday-bar/problem
 */
public class BirthdayChocolate {

    static int birthday(List<Integer> s, int d, int m) {

        int splits = 0;
        // this m-1 or <=  is a little tricky. List.subList(s,e) end index is exclusive.
        for (int i = 0; i + m  <= s.size(); i++) {

            List<Integer> segment = s.subList(i, i + m);
            if (segment.stream().mapToInt(Integer::intValue).sum() == d) {
                splits++;
            }
        }
        return splits;
    }

    public static void main(String[] args) {
        System.out.println(birthday(List.of(1, 2, 1, 3, 2), 3, 2));
        System.out.println(birthday(List.of(4), 4, 1));
    }
}
