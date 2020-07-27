package io.nimbus.hackerrank.implementation.easy;

/**
 * https://www.hackerrank.com/challenges/utopian-tree/problem
 */
public class UtopianTree {

    static int utopianTree(int n) {

        int growth = 0;
        // didn't get the inequality correct the first time < and = to, as we want the nth iteration to be considered.
        for (int i = 0; i <= n; i++) {

            // on even cycles, we add 1, "summer"
            if (i % 2 == 0)
                growth++;
            // on odd we double, "spring"
            else
                growth = growth * 2;
        }

        return growth;
    }

}

