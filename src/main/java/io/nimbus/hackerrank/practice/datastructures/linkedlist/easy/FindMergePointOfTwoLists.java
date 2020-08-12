package io.nimbus.hackerrank.practice.datastructures.linkedlist.easy;

import io.nimbus.hackerrank.practice.datastructures.linkedlist.SinglyLinkedListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * https://www.hackerrank.com/challenges/find-the-merge-point-of-two-joined-linked-lists/problem?h_r=next-challenge&h_v=zen
 */
public class FindMergePointOfTwoLists {

    // a little tricky. Reading the task I thought the link was the data but was the node's identity therefore == on
    // node not node.data
    static int findMergeNode(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {

        Set<SinglyLinkedListNode> list1Data = getData(head1);
        SinglyLinkedListNode current = head2.next;
        while (current != null) {
            if (list1Data.contains(current)) {
                return current.data;
            }

            current = current.next;
        }

        return -1;
    }

    private static Set<SinglyLinkedListNode> getData(SinglyLinkedListNode n) {
        SinglyLinkedListNode current = n;

        Set<SinglyLinkedListNode> ret = new HashSet<>();
        while (current != null) {

            ret.add(current);
            current = current.next;
        }
        return ret;
    }
}
