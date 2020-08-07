package io.nimbus.hackerrank.practice.datastructures.linkedlist.easy;

import java.util.Stack;

/**
 * https://www.hackerrank.com/challenges/print-the-elements-of-a-linked-list-in-reverse/problem?h_r%5B%5D=next-challenge&h_r%5B%5D=next-challenge&h_r%5B%5D=next-challenge&h_r%5B%5D=next-challenge&h_v%5B%5D=zen&h_v%5B%5D=zen&h_v%5B%5D=zen&h_v%5B%5D=zen
 */
public class PrintInReverse {

    static void reversePrint(SinglyLinkedListNode head) {

        Stack<SinglyLinkedListNode> stack = new Stack<>();
        SinglyLinkedListNode current = head;
        while (current != null) {
            stack.push(current);
            current = current.next;
        }
        while (!stack.isEmpty()) {
            System.out.println(stack.pop().data);
        }
    }

}
