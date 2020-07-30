package io.nimbus.hackerrank.practice.algorithms.implementation.easy;

/**
 * https://www.hackerrank.com/challenges/sherlock-and-squares/problem
 */
public class SherlockAndSquares {

    static int squares_slow(int a, int b) {
        int count = 0;
        for (int i = a; i <= b; i++) {
            double sqrt = Math.sqrt(i);
            if (sqrt == Math.floor(sqrt)) {
                count++;
            }
        }

        return count;
    }

    static int squares(int a, int b) {
        // neat trick
        // so 3-26, root for 26 is floor(5.XXX) == 5, ceil(root of 3 = 1.XXX) = 2. (inclusive range of 2,3,4,5 = 4, therefore 5-2 +1)
        return (int) (Math.floor(Math.sqrt(b)) - Math.ceil(Math.sqrt(a)) + 1);
    }

}
