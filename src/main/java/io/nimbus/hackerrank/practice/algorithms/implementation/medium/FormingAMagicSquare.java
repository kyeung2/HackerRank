package io.nimbus.hackerrank.practice.algorithms.implementation.medium;

/**
 * https://www.hackerrank.com/challenges/magic-square-forming/problem?h_r=next-challenge&h_v=zen
 */
public class FormingAMagicSquare {

    // according to wiki, the magic constant is  M=n(n^{2}+1)/2}.
    // constraint 1: since the exercise, n is always 3, the sum we need is always 15.
    // constraint 2: we know that repeats are not allowed so 1..9 needs to appear exactly onces.

    /**
     * I couldn't solve this on my own.
     * <p>
     * Someone observed that that are 8 combinations of 15:
     * 9 5 1
     * 7 5 3
     * 2 5 8
     * 4 5 6
     * 2 9 4
     * 6 1 8
     * 6 7 2
     * 8 3 4
     * <p>
     * of which, to fit into a magic square,
     * 1. the middle row,
     * 2. middle column
     * 3. forward and 4. backwards diagonals.
     * all must have the same number, and of the 8 combinations only 5 fits. i.e.
     * <p>
     * * 9 5 1
     * * 7 5 3
     * * 2 5 8
     * * 4 5 6
     * <p>
     * therefore, inferred constraint 3, 5 must be in the middle.
     * <p>
     * constraint 4, the middle row, column, and diagonals must use those 4 combinations of 15.
     * <p>
     * <p>
     * Similar thinking, the corner numbers must appear 3 times, horizontal, vertical and diagonal, forming an arrow.
     * of the 8 combinations that appear 3 times, and one is one of the diagonals already identified means:
     * <p>
     * constraint 5
     * 2 5 8
     * 4 5 8
     * <p>
     * are the diagonals
     * <p>
     * 2 _ 4
     * _ 5 _
     * 6 _ 8
     * <p>
     * People used one, and did mirror images horizontal then rotations equaling 8 possible squares
     * <p>
     * Mirrors
     * 4 9 2 | 2 9 4
     * 3 5 7 | 7 5 3
     * 8 1 6 | 6 1 8
     * -------------
     * 8 1 6 | 6 1 8
     * 3 5 7 | 7 5 3
     * 4 9 2 | 2 9 4
     * <p>
     * Rotations
     * 8 3 4 | 4 3 8
     * 1 5 9 | 9 5 1
     * 6 7 2 | 2 7 6
     * -------------
     * 6 7 2 | 2 7 6
     * 1 5 9 | 9 5 1
     * 8 3 4 | 4 3 8
     * <p>
     * then they hardcode it, and do a comparison of the different for the lowest "cost" difference.
     */
    private static final int[][] SQUARE_1 = {{4, 9, 2}, {3, 5, 7}, {8, 1, 6}};
    private static final int[][] SQUARE_2 = {{4, 3, 8}, {9, 5, 1}, {2, 7, 6}};
    private static final int[][] SQUARE_3 = {{2, 9, 4}, {7, 5, 3}, {6, 1, 8}};
    private static final int[][] SQUARE_4 = {{2, 7, 6}, {9, 5, 1}, {4, 3, 8}};
    private static final int[][] SQUARE_5 = {{8, 1, 6}, {3, 5, 7}, {4, 9, 2}};
    private static final int[][] SQUARE_6 = {{8, 3, 4}, {1, 5, 9}, {6, 7, 2}};
    private static final int[][] SQUARE_7 = {{6, 7, 2}, {1, 5, 9}, {8, 3, 4}};
    private static final int[][] SQUARE_8 = {{6, 1, 8}, {7, 5, 3}, {2, 9, 4}};
    private static final int[][][] ALL = {SQUARE_1, SQUARE_2, SQUARE_3, SQUARE_4, SQUARE_5, SQUARE_6, SQUARE_7, SQUARE_8};

    static int formingMagicSquare(int[][] s) {
        int lowestCost = Integer.MAX_VALUE;
        for (int[][] square : ALL) {
            int cost = getCost(square, s);
            if (cost < lowestCost) {
                lowestCost = cost;
            }
        }

        return lowestCost;
    }

    // using a hard coded list of combinations. Doesn't feel like the right approach.
    private static int getCost(int[][] square, int[][] s) {
        int totalCost = 0;
        for (int i = 0; i < square.length; i++) {
            int[] squareRow = square[i];
            int[] sRow = s[i];
            for (int j = 0; j < squareRow.length; j++) {
                int squareData = squareRow[j];
                int sData = sRow[j];
                totalCost += Math.abs(squareData - sData);
            }
        }

        return totalCost;
    }

    public static void main(String[] args) {
        System.out.println(formingMagicSquare(new int[][]{
                {4, 8, 2},
                {4, 5, 7},
                {6, 1, 6}
        }));
    }
}
