package io.nimbus.hackerrank.problemsolving.implementation.easy;

/**
 * https://www.hackerrank.com/challenges/beautiful-days-at-the-movies/problem
 */
public class BeautifulDaysAtTheMovies {

    static int beautifulDays(int i, int j, int k) {

        int count = 0;
        for (int x = i; x <= j; x++) {
            int y = reverseInt(x);
            if (Math.abs(x - y) % k == 0)
                count++;
        }

        return count;
    }

    // I've seen on a search that you can you modulo 10, but not necessary for this exercise.
    // in any case, if needed the implementation of this method can change, signature is fine.
    private static int reverseInt(int x) {
        StringBuilder b = new StringBuilder();
        b.append(x);
        b.reverse();
        return Integer.parseInt(b.toString());
    }
}
