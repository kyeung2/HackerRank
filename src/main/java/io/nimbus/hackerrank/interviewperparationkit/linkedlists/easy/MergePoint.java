package io.nimbus.hackerrank.interviewperparationkit.linkedlists.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * https://www.hackerrank.com/challenges/find-the-merge-point-of-two-joined-linked-lists/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=linked-lists
 */
public class MergePoint {
    
    static int findMergeNode(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {

        Set<Integer> list1Data = getData(head1);
        SinglyLinkedListNode current = head2.next;
        while (current != null) {
            if (list1Data.contains(current.data)) {
                return current.data;
            }

            current = current.next;
        }

        return -1;
    }

    private static Set<Integer> getData(SinglyLinkedListNode n) {
        SinglyLinkedListNode current = n.next;

        Set<Integer> ret = new HashSet<>();
        while (current != null) {

            ret.add(current.data);
            current = current.next;
        }
        return ret;
    }
}
