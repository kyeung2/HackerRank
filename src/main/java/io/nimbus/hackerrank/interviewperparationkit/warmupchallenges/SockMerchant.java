package io.nimbus.hackerrank.interviewperparationkit.warmupchallenges;

import java.util.HashMap;
import java.util.Map;

/**
 * https://www.hackerrank.com/challenges/sock-merchant/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup
 */
public class SockMerchant {

    static int sockMerchant(int n, int[] ar) {
        Map<Integer, Integer> frequency = new HashMap<>();
        for (int i : ar) {
            frequency.put(i, frequency.getOrDefault(i, 0) + 1);
        }

        return frequency.values()
                .stream()
                .mapToInt(count -> count / 2)
                .sum();
    }
}
