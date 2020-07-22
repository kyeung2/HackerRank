package io.nimbus.hackerrank.implementation.easy;

/**
 * https://www.hackerrank.com/challenges/kangaroo/problem
 */
public class Kangaroo {

    static String kangaroo(int x1, int v1, int x2, int v2) {

        // I didn't figure this out on my own..


        // so the second kangaroo needs to be slower than the first for it to be possible for them to intersect
        boolean canCatchUp = (v2 < v1);
        if (canCatchUp) {
            // formula is:
            // where j is the number of jumps
            // x1 + j * v1 = x2 + j * v2
            // x1 - x2 = (j * v2) - (j * v1)
            // x1 - x2 = j * (v2 - v1)
            // (x1 - x2)/(v2 - v1) = j
            // therefore a whole number means they will intersect perfectly on a jump
            // a fraction means intersection in mid air. Therefore.
            boolean willIntersectOnLand = (x1 - x2) % (v2 - v1) == 0;
            if (willIntersectOnLand) {
                return "YES";
            }
        }

        return "NO";
    }

    public static void main(String[] args) {
        System.out.println(kangaroo(21, 6, 47, 3));
    }
}
