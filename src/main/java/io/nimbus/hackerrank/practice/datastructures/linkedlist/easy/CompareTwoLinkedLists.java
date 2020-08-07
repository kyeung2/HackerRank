package io.nimbus.hackerrank.practice.datastructures.linkedlist.easy;

/**
 * https://www.hackerrank.com/challenges/compare-two-linked-lists/problem
 */
public class CompareTwoLinkedLists {

    static boolean compareLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {

        SinglyLinkedListNode thisNode = head1;
        SinglyLinkedListNode thatNode = head2;
        while (thisNode != null && thatNode != null) {

            if (thisNode.data != thatNode.data)
                return false;

            thisNode = thisNode.next;
            thatNode = thatNode.next;

            if (thisNode != null && thatNode == null || thisNode == null && thatNode != null) return false;
        }

        return true;
    }


}
