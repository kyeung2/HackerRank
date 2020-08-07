package io.nimbus.hackerrank.practice.datastructures.linkedlist.easy;

/**
 * https://www.hackerrank.com/challenges/insert-a-node-at-the-tail-of-a-linked-list/problem?h_r=next-challenge&h_v=zen
 */
public class InsertANodeAtTheTailOfALinkedList {

    static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
        SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
        if (head != null) {
            SinglyLinkedListNode tail = findTail(head);
            tail.next = newNode;
            return head;
        }
        return newNode;
    }

    private static SinglyLinkedListNode findTail(SinglyLinkedListNode head) {
        SinglyLinkedListNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        return current;
    }
}
