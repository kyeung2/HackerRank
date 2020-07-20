package io.nimbus.hackerrank.interviewperparationkit.stringmanipulation.easy;

/**
 * https://www.hackerrank.com/challenges/alternating-characters/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=strings&h_r=next-challenge&h_v=zen
 */
public class AlternatingCharacters {

    static int alternatingCharacters(String s) {

        char[] chars = s.toCharArray();
        int totalDeletions = 0;
        int consecutiveCharacters = 0;
        char previousChar = chars[0];

        for (int i = 1; i < chars.length; i++) {

            char currentChar = chars[i];
            if (currentChar == previousChar) {
                consecutiveCharacters++;
            } else {
                totalDeletions += consecutiveCharacters;
                consecutiveCharacters = 0;
                previousChar = currentChar;
            }
        }
        totalDeletions += consecutiveCharacters;

       return totalDeletions;
    }
}
