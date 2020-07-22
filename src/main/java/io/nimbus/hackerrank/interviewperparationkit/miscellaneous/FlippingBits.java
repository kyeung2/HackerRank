package io.nimbus.hackerrank.interviewperparationkit.miscellaneous;

import java.util.Arrays;

/**
 * https://www.hackerrank.com/challenges/flipping-bits/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=miscellaneous
 */
public class FlippingBits {

    static long flippingBits(long n) {
        char[] binaryArray = getBinaryArray(n);
        flip(binaryArray);
        return toDecimal(binaryArray);
    }

    static char[] getBinaryArray(long n) {
        String binaryString = Long.toString(n, 2);
        char[] ret = new char[32];
        Arrays.fill(ret, '0');
        char[] binary = binaryString.toCharArray();
        System.arraycopy(binary, 0, ret, ret.length - binary.length, binary.length);
        return ret;

        // clearer but Java 11 string.repeat().
//        return ("0".repeat(32 - binaryString.length()) + binaryString).toCharArray();
    }

    private static void flip(char[] binaryArray) {
        for (int i = 0; i < binaryArray.length; i++) {
            binaryArray[i] = binaryArray[i] == '0' ? '1' : '0';
        }
    }

    private static long toDecimal(char[] binaryArray) {
        String s = String.valueOf(binaryArray);
        return Long.parseLong(s, 2);
    }


    public static void main(String[] args) {
        System.out.println(FlippingBits.flippingBits(9));
    }
}
