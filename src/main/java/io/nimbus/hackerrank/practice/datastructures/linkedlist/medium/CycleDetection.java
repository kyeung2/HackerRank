package io.nimbus.hackerrank.practice.datastructures.linkedlist.medium;

import io.nimbus.hackerrank.practice.datastructures.linkedlist.SinglyLinkedListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * https://www.hackerrank.com/challenges/detect-whether-a-linked-list-contains-a-cycle/problem?h_r=next-challenge&h_v=zen
 */
public class CycleDetection {

    static boolean hasCycle(SinglyLinkedListNode head) {
        SinglyLinkedListNode current = head;

        Set<SinglyLinkedListNode> unique = new HashSet<>();
        while (current != null) {
            if (!unique.add(current))
                return true;
            else
                current = current.next;
        }

        return false;
    }
}
