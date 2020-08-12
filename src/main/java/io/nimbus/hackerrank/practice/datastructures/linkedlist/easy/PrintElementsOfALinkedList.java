package io.nimbus.hackerrank.practice.datastructures.linkedlist.easy;

import io.nimbus.hackerrank.practice.datastructures.linkedlist.SinglyLinkedListNode;

/**
 * https://www.hackerrank.com/challenges/print-the-elements-of-a-linked-list/problem
 */
public class PrintElementsOfALinkedList {

    static void printLinkedList(SinglyLinkedListNode head) {
        SinglyLinkedListNode current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}
