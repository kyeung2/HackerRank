package io.nimbus.hackerrank.stringmanipulation.easy;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * https://www.hackerrank.com/challenges/ctci-making-anagrams/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=strings
 */
public class MakingAnagrams {

    // so the idea here is to create 2 frequency maps and compare. Cannot do a set theory difference as repeats are removed.
    static int makeAnagram(String a, String b) {
        Map<Character, Long> frequencyA = getFrequency(a);
        Map<Character, Long> frequencyB = getFrequency(b);

        long frequencyDifferencesA = frequencyA.entrySet()
                .stream()
                .mapToLong(e ->
                        Math.abs(e.getValue() - frequencyB.getOrDefault(e.getKey(), 0L))
                ).sum();

        long uniqueBCount = frequencyB.entrySet().stream()
                .filter(e -> !frequencyA.containsKey(e.getKey()))
                .mapToLong(Map.Entry::getValue)
                .sum();

        return (int) (frequencyDifferencesA + uniqueBCount);
    }

    private static Map<Character, Long> getFrequency(String a) {
        return a.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                ));
    }

    public static void main(String[] args) {
        System.out.println(makeAnagram("", ""));
        System.out.println(makeAnagram("a", "a"));
        System.out.println(makeAnagram("aaa", "a"));
        System.out.println(makeAnagram("fcrxzwscanmligyxyvym", "jxwtrhvujlmrpdoqbisbwhmgpmeoke"));
    }
}

