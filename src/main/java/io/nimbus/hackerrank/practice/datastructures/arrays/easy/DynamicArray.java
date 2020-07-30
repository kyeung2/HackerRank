package io.nimbus.hackerrank.practice.datastructures.arrays.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * https://www.hackerrank.com/challenges/dynamic-array/problem
 */
public class DynamicArray {

    // silly task.
    public static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
        int lastAnswer = 0;
        List<List<Integer>> data = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            data.add(new ArrayList<>());
        }

        List<Integer> res = new ArrayList<>();
        for (List<Integer> query : queries) {
            int queryType = query.get(0);
            int x = query.get(1);
            int y = query.get(2);

            // error 1,  i % n rather than % 2, following the examples too much!
            int seqIndex = (x ^ lastAnswer) % n;
            List<Integer> seq = data.get(seqIndex);
            if (queryType == 1) {
                seq.add(y);
            } else {

                // the example was bad, it did not show the retrieval of the index, the instructions did but there
                // was a delta between the instructions and the example making me confused.
                lastAnswer = seq.get(y % seq.size());
                System.out.println(lastAnswer);
                res.add(lastAnswer);
            }
        }

        return res;
    }

    public static void main(String[] args) {
        System.out.println(dynamicArray(2, List.of(
                List.of(1, 0, 5),
                List.of(1, 1, 7),
                List.of(1, 0, 3),
                List.of(2, 1, 0),
                List.of(2, 1, 1)
        )));
    }
}
