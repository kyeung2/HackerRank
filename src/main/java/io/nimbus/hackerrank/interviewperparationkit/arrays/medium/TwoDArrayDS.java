package io.nimbus.hackerrank.interviewperparationkit.arrays.medium;

/**
 * https://www.hackerrank.com/challenges/2d-array/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays
 */
public class TwoDArrayDS {

    static int hourglassSum(int[][] arr) {
        int greatestSum = Integer.MIN_VALUE;
        for (int i = 0; i + 2 < 6; i++) {// shift 2 as the hourglass width is 2
            for (int j = 0; j + 2 < 6; j++) { // shit 2 as the hourglass height is also 2
                int sum = getHourGlass(i, j, arr);
                if (sum > greatestSum) {
                    greatestSum = sum;
                }
            }
        }

        return greatestSum;
    }

    private static int getHourGlass(int row, int column, int[][] arr) {
        int row1 = arr[row][column] + arr[row][column + 1] + arr[row][column + 2];
        int row2 = arr[row + 1][column + 1];
        int row3 = arr[row + 2][column] + arr[row + 2][column + 1] + arr[row + 2][column + 2];

        return row1 + row2 + row3;
    }
}