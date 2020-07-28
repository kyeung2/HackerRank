package io.nimbus.hackerrank.implementation.easy;

/**
 * https://www.hackerrank.com/challenges/jumping-on-the-clouds-revisited/problem
 */
public class JumpingOnTheCloudsRevisited {


    static int jumpingOnClouds(int[] c, int k) {
        int energy = 100;
        int n = c.length;
        // the starting cloudIndex needs to be modulo also, since the jump k can be >= to the entire array
        for (int cloudIndex = k % n; cloudIndex != 0; cloudIndex = (cloudIndex + k) % n) {
            int cloud = c[cloudIndex];
            energy = energy - (cloud == 1 ? 3 : 1);
        }
        int startingCloud = c[0];
        return energy - (startingCloud == 1 ? 3 : 1);
    }

    public static void main(String[] args) {
        System.out.println("should be 92: " + jumpingOnClouds(new int[]{0, 0, 1, 0, 0, 1, 1, 0
        }, 2));

        System.out.println("should be 97: " + jumpingOnClouds(new int[]{1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1
        }, 19));

    }
}
