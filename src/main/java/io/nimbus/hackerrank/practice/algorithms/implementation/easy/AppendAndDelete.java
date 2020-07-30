package io.nimbus.hackerrank.practice.algorithms.implementation.easy;

/**
 * https://www.hackerrank.com/challenges/append-and-delete/problem
 */
public class AppendAndDelete {

    // this was tricky. Definitely more scenarios than immediately obvious. Needed to look at the instructions and create use cases before coding.
    static String appendAndDelete(String s, String t, int k) {
        int prefixLength = getPrefixLength(s, t);
        int totalDifferent = s.length() + t.length() - (prefixLength * 2);
        // s1. = mean you can delete everything
        // s2. > means you have remaining moves but since delete on "" == "", the result is the same
        if (k >= s.length() + t.length())
            return "Yes";
        // s3. all the moves can be deletes if the total extra characters is the same as number of moves.
        if (k == totalDifferent)
            return "Yes";
        // s4. we have extra moves but they are even, so we can delete then append cancelling out the pair of extra moves.
        if (k > totalDifferent && (k - totalDifferent) % 2 == 0)
            return "Yes";
        // s5. none of the above, not enough moves, extra moves an odd number.
        return "No";
    }

    private static int getPrefixLength(String s, String t) {

        int length = 0;
        for (int i = 0; i < s.length() && i < t.length(); i++) {

            if (s.charAt(i) == t.charAt(i))
                length++;
            else
                break;
        }

        return length;
    }

    public static void main(String[] args) {


        System.out.println("should be Yes: " + appendAndDelete("12345", "abcde", 10));//s1
        System.out.println("should be Yes: " + appendAndDelete("12345", "abcde", 11));//s2
        System.out.println("should be Yes: " + appendAndDelete("hello123", "helloabc", 6));//s3
        System.out.println("should be Yes: " + appendAndDelete("hello123", "helloabc", 8));//s4
        System.out.println("should be Yes: " + appendAndDelete("a", "a", 2));
        System.out.println("should be Yes: " + appendAndDelete("a", "a", 3));
        System.out.println("should be Yes: " + appendAndDelete("abcdef", "fedcba", 15));
        System.out.println("should be Yes: " + appendAndDelete("abc", "def", 6));
        System.out.println("should be Yes: " + appendAndDelete("hackerhappy", "hackerrank", 9));
        System.out.println("should be Yes: " + appendAndDelete("aba", "aba", 7));
        System.out.println("should be Yes: " + appendAndDelete("aaaaaaaaaa", "aaaaa", 7));
        System.out.println("should be No: " + appendAndDelete("ashley", "ash", 2));
        System.out.println("should be No: " + appendAndDelete("y", "yu", 2));// s5, extra moves 1, odd
        System.out.println("should be No: " + appendAndDelete("aaa", "aaa", 3));
        System.out.println("should be No: " + appendAndDelete("abc", "123", 5));// s5, not enough moved


    }
}
