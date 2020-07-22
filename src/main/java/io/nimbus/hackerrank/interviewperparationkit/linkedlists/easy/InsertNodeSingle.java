package io.nimbus.hackerrank.interviewperparationkit.linkedlists.easy;

/**
 * https://www.hackerrank.com/challenges/insert-a-node-at-a-specific-position-in-a-linked-list/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=linked-lists
 */
public class InsertNodeSingle {


    static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int data, int position) {

        SinglyLinkedListNode currentNode = head;
        int currentPosition = 0;

        while (currentPosition < position - 1) {

            currentNode = currentNode.next;
            currentPosition++;
        }

        SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
        SinglyLinkedListNode temp = currentNode.next;
        currentNode.next = newNode;
        newNode.next = temp;

        return head;
    }

}
