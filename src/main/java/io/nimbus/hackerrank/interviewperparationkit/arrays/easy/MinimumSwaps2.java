package io.nimbus.hackerrank.interviewperparationkit.arrays.easy;

/**
 * https://www.hackerrank.com/challenges/minimum-swaps-2/problem
 */
public class MinimumSwaps2 {


    // cannot use the selection sort algorithm as the quadratic time complexity is not good enough for the task.
    static int minimumSwaps(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {

            // since there are no duplicates, this check sees if it is in the correct position
            // so while not in correct position...
            // e.g. 4, 3, 1, 2
            while (arr[i] != i + 1) {// swap until you have the correct value, which is i+1.
                int temp = arr[i];// use the value as an index...
                arr[i] = arr[temp - 1];// using a quirk that the value is in-fact the index position-1
                arr[temp - 1] = temp;// index 3 gets the 4 value
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(minimumSwaps(new int[]{4, 3, 1, 2}));
    }
}
