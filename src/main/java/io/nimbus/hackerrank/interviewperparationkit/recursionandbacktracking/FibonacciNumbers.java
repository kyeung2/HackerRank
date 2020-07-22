package io.nimbus.hackerrank.interviewperparationkit.recursionandbacktracking;

/**
 * https://www.hackerrank.com/challenges/ctci-fibonacci-numbers/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=recursion-backtracking
 */
public class FibonacciNumbers {

    // this will stack overflow given a large enough n.
    public static int fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
