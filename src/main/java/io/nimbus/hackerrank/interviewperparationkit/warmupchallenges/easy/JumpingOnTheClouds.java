package io.nimbus.hackerrank.interviewperparationkit.warmupchallenges.easy;

/**
 * https://www.hackerrank.com/challenges/jumping-on-the-clouds/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup
 */
public class JumpingOnTheClouds {

    static int jumpingOnClouds(int[] c) {

        int jumps = 0;
        // algorithm to avoid 1's and you can progress with step+2 or +1
        int length = c.length;
        for (int i = 0; i < length - 1; ) {
            jumps++;
            if (i + 2 < length && c[i + 2] != 1)
                i += 2;
            else
                i++;
        }

        return jumps;
    }

    public static void main(String[] args) {
        System.out.println(jumpingOnClouds(new int[]{0, 1, 0, 0, 0, 1, 0}));
    }

}
