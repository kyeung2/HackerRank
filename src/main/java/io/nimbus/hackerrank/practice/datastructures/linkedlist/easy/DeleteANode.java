package io.nimbus.hackerrank.practice.datastructures.linkedlist.easy;

import io.nimbus.hackerrank.practice.datastructures.linkedlist.SinglyLinkedListNode;

/**
 * https://www.hackerrank.com/challenges/delete-a-node-from-a-linked-list/problem?h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen
 */
public class DeleteANode {

    static SinglyLinkedListNode deleteNode(SinglyLinkedListNode head, int position) {

        if (position == 0) {
            return head.next;
        }

        SinglyLinkedListNode parent = head;
        for (int i = 0; i < position - 1; i++) {
            parent = parent.next;
        }
        SinglyLinkedListNode nodeToDelete = parent.next;
        parent.next = nodeToDelete.next;
        return head;
    }

}
