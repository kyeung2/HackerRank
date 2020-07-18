package io.nimbus.hackerrank.warmup.easy;

import java.util.Collections;

public class Staircase {

    static void staircase(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(repeat(" ", n - i - 1) + repeat("#", i + 1));
        }
    }

    static String repeat(String s, int count) {
        // String::repeat for Java 11
        return String.join("", Collections.nCopies(count, s));
    }
}
