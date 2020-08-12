package io.nimbus.hackerrank.practice.datastructures.linkedlist.easy;

import io.nimbus.hackerrank.practice.datastructures.linkedlist.SinglyLinkedListNode;

import java.util.Stack;

/**
 * https://www.hackerrank.com/challenges/get-the-value-of-the-node-at-a-specific-position-from-the-tail/problem?h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen
 */
public class GetNodeValue {

    static int getNode(SinglyLinkedListNode head, int positionFromTail) {

        SinglyLinkedListNode c = head;
        Stack<Integer> stack = new Stack<>();
        while (c != null) {
            stack.push(c.data);
            c = c.next;
        }

        for (int i = 0; i < positionFromTail; i++) {
            stack.pop();
        }
        return stack.peek();
    }


    // interesting trick
    static int getNode_alternative(SinglyLinkedListNode head, int k) {
        SinglyLinkedListNode curr   = head;
        SinglyLinkedListNode runner = head;

        /* Move runner into the list by k elements */
        for (int i = 0; i < k; i++) {
            runner = runner.next;
        }

        /* Move both pointers */
        while (runner.next != null) {
            curr = curr.next;
            runner = runner.next;
        }

        return curr.data;
    }
}
