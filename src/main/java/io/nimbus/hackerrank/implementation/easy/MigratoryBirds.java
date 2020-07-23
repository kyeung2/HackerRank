package io.nimbus.hackerrank.implementation.easy;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * https://www.hackerrank.com/challenges/migratory-birds/problem
 */
public class MigratoryBirds {

    static int migratoryBirds(List<Integer> arr) {

        // create frequency map collecting via count.
        Map<Integer, Long> collect = arr.stream().collect(
                Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                )
        );

        // get the max frequency
        long maxFrequency = collect.values().stream().mapToLong(Long::longValue).max().orElseThrow(()->new RuntimeException("shouldn't happen"));

        // get all the bird-type keys that have this frequency and return the smallest bird-type id.
        return collect.entrySet().stream()
                .filter(e -> e.getValue() == maxFrequency)
                .mapToInt(Map.Entry::getKey)
                .min()
                // forced to use java 8 in the website, could have just been .orElseThrow()
                .orElseThrow(()->new RuntimeException("shouldn't happen"));
    }
}
