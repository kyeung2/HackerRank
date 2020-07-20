package io.nimbus.hackerrank.interviewperparationkit.warmupchallenges.easy;

/**
 * https://www.hackerrank.com/challenges/repeated-string/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup
 */
public class RepeatedString {

    static long repeatedString(String s, long n) {

        long aCount = getCount(s);

        if (aCount != 0) {
            int length = s.length();
            long repeats = n / length;
            long remainder = n % length;

            return (repeats * aCount) + getCount(s.substring(0, (int) remainder));
        }

        return 0;
    }

    private static long getCount(String s) {
        return s.chars().filter(c -> c == 'a').count();
    }
}
