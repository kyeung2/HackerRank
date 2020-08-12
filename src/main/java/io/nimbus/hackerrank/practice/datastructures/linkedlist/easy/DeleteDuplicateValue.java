package io.nimbus.hackerrank.practice.datastructures.linkedlist.easy;

import io.nimbus.hackerrank.practice.datastructures.linkedlist.SinglyLinkedListNode;

/**
 * https://www.hackerrank.com/challenges/delete-duplicate-value-nodes-from-a-sorted-linked-list/problem
 */
public class DeleteDuplicateValue {

    static SinglyLinkedListNode removeDuplicates(SinglyLinkedListNode head) {
        SinglyLinkedListNode current = head;

        while (current != null) {
            if (current.next != null && current.data == current.next.data) {
                current.next = findNextGreaterValue(current.next);
            }
            current = current.next;
        }

        return head;
    }

    // got a little stuck here, for when there was a duplicate at the tail, I returned n for the default case
    // where I need to return null. The method name clearly states find the NEXT greater value
    // if none is found, null is appropriate not n.
    private static SinglyLinkedListNode findNextGreaterValue(SinglyLinkedListNode n) {
        int data = n.data;
        SinglyLinkedListNode current = n;
        while (current != null) {
            if (data < current.data) {
                return current;
            }
            current = current.next;
        }

        return null;
    }

    public static void main(String[] args) {

        SinglyLinkedListNode a = new SinglyLinkedListNode(3);
        SinglyLinkedListNode a2 = new SinglyLinkedListNode(3);
        SinglyLinkedListNode a3 = new SinglyLinkedListNode(3);
        SinglyLinkedListNode a4 = new SinglyLinkedListNode(3);
        SinglyLinkedListNode a5 = new SinglyLinkedListNode(3);
        SinglyLinkedListNode a6 = new SinglyLinkedListNode(3);
        a.next = a2;
        a2.next = a3;
        a3.next = a4;
        a4.next = a5;
        a5.next = a6;
        System.out.println(removeDuplicates(a));
    }
}
