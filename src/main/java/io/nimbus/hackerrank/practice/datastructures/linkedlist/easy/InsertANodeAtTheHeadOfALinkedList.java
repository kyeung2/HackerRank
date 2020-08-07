package io.nimbus.hackerrank.practice.datastructures.linkedlist.easy;

/**
 * https://www.hackerrank.com/challenges/insert-a-node-at-the-head-of-a-linked-list/problem?h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen
 */
public class InsertANodeAtTheHeadOfALinkedList {

    static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode llist, int data) {

        SinglyLinkedListNode newHead = new SinglyLinkedListNode(data);
        newHead.next = llist;

        return newHead;
    }
}
