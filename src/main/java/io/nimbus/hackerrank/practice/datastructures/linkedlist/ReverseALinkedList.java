package io.nimbus.hackerrank.practice.datastructures.linkedlist;

import java.util.Stack;

/**
 * https://www.hackerrank.com/challenges/reverse-a-linked-list/problem
 */
public class ReverseALinkedList {

    static SinglyLinkedListNode reverse(SinglyLinkedListNode head) {

        Stack<SinglyLinkedListNode> stack = new Stack<>();
        SinglyLinkedListNode current = head;
        while (current != null) {
            stack.push(current);
            current = current.next;
        }

        SinglyLinkedListNode newHead = stack.peek();
        while (!stack.isEmpty()) {
            SinglyLinkedListNode x = stack.pop();

            if (!stack.isEmpty())
                x.next = stack.peek();
            else
                x.next = null;
        }

        return newHead;
    }

}
