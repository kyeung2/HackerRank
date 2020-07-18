package io.nimbus.hackerrank.warmup.easy;

/**
 * https://www.hackerrank.com/challenges/birthday-cake-candles/problem?h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen
 */
public class BirthdayCakeCandles {

    static int birthdayCakeCandles(int[] ar) {

        int tallest = -1;
        int tallestCount = 0;
        for (int i : ar) {
            if (tallest == -1) {
                tallest = i;
            }
            if (i > tallest) {
                tallest = i;
                tallestCount = 0;
            }
            if (i == tallest) {
                tallestCount++;
            }

        }
        return  tallestCount;
    }



    public static void main(String[] args) {
        System.out.println(  birthdayCakeCandles(new int[]{82, 49, 82, 82, 41, 82, 15, 63, 38 ,25}));
    }
}

