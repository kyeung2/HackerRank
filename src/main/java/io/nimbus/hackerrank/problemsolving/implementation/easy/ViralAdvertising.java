package io.nimbus.hackerrank.problemsolving.implementation.easy;

/**
 * https://www.hackerrank.com/challenges/strange-advertising/problem
 */
public class ViralAdvertising {

    static int viralAdvertising(int n) {

        // simple but didn't get it correct the first try. Didn't read the description carefully enough.
        //
        int cumulative = 0;
        int shared = 5;
        for (int i = 0; i < n; i++) {
            int liked = shared / 2;
            cumulative += liked;
            shared = liked * 3;// each of those, i.e. multiply.
        }
        return cumulative;
    }

    public static void main(String[] args) {
        System.out.println(viralAdvertising(1));
        System.out.println(viralAdvertising(2));
        System.out.println(viralAdvertising(3));
        System.out.println(viralAdvertising(4));
        System.out.println(viralAdvertising(5));
    }
}
