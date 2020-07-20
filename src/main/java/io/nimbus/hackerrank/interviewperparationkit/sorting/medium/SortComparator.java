package io.nimbus.hackerrank.interviewperparationkit.sorting.medium;

import java.util.Comparator;

/**
 * https://www.hackerrank.com/challenges/ctci-comparator-sorting/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=sorting&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen
 */
public class SortComparator implements Comparator<Player> {
    // complete this method
    public int compare(Player a, Player b) {
        int scoreComparison =Integer.compare(b.score, a.score) ;
        return scoreComparison != 0 ? scoreComparison :a.name.compareTo(b.name) ;
    }
}

class Player {

    String name;
    int score;


    public Player(String name, int score) {
        this.name = name;
        this.score = score;
    }

}