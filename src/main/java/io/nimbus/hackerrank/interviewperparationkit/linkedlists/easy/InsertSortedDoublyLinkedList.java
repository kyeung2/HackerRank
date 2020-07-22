package io.nimbus.hackerrank.interviewperparationkit.linkedlists.easy;

/**
 * https://www.hackerrank.com/challenges/insert-a-node-into-a-sorted-doubly-linked-list/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=linked-lists
 */
public class InsertSortedDoublyLinkedList {

    static DoublyLinkedListNode sortedInsert(DoublyLinkedListNode head, int data) {

        DoublyLinkedListNode located = head;
        while (located.data < data) {
            if (located.next == null) {
                break;
            }
            located = located.next;
        }

        //Note: always formalise the algorithm in terms of use cases, edge to edge and average. TDD as design.
        DoublyLinkedListNode newNode = new DoublyLinkedListNode(data);
        // scenario 1, insert before head
        // newNode || located
        if (located.prev == null && located.data >= data) {
            newNode.next = located;
            located.prev = newNode;
            return newNode;
        }

        // scenario 2, insert at tail
        // located || newNode
        if (located.next == null && located.data <= data) {
            located.next = newNode;
            newNode.prev = located;
            return head;
        }

        // scenario 3, insert in middle
        //   prev || newNode || located
        DoublyLinkedListNode prev = located.prev;
        prev.next = newNode;
        newNode.prev = prev;
        newNode.next = located;
        located.prev = newNode;

        return head;
    }

    public static void main(String[] args) {
        // scenario 1, insert before head
        {
            DoublyLinkedListNode head = new DoublyLinkedListNode(2);
            DoublyLinkedListNode ret = sortedInsert(head, 1);
            System.out.println(ret);
        }

        // scenario 2, insert at tail
        {
            DoublyLinkedListNode head = new DoublyLinkedListNode(1);
            DoublyLinkedListNode ret = sortedInsert(head, 2);
            System.out.println(ret);
        }

        // scenario 3, insert same
        {
            DoublyLinkedListNode head = new DoublyLinkedListNode(1);
            DoublyLinkedListNode ret = sortedInsert(head, 1);
            System.out.println(ret);
        }

        // scenario 3, insert in between
        {
            DoublyLinkedListNode head = new DoublyLinkedListNode(1);
            DoublyLinkedListNode tail = new DoublyLinkedListNode(3);
            head.next = tail;
            tail.prev = head;
            DoublyLinkedListNode ret = sortedInsert(head, 2);
            System.out.println(ret);
        }

    }
}
