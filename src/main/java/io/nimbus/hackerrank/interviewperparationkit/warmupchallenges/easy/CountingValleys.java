package io.nimbus.hackerrank.interviewperparationkit.warmupchallenges.easy;

/**
 * https://www.hackerrank.com/challenges/counting-valleys/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup&h_r=next-challenge&h_v=zen
 */
public class CountingValleys {

    static int countingValleys(int n, String s) {

        int valleyCount = 0;
        int elevation = 0;
        boolean inValley = false;
        for (char c : s.toCharArray()) {
            elevation += (c == 'D') ? -1 : 1;

            if (!inValley && elevation < 0) {
                inValley = true;
                valleyCount++;
            }
            if (elevation == 0) {
                inValley = false;
            }
        }

        return valleyCount;
    }
}
