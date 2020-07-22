package io.nimbus.hackerrank.interviewperparationkit.linkedlists.easy;

/**
 * https://www.hackerrank.com/challenges/reverse-a-doubly-linked-list/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=linked-lists
 */
public class ReverseDoublyLinkedList {


    static DoublyLinkedListNode reverse(DoublyLinkedListNode head) {
        return reverseRecursive(head);
    }

    // algorithm, recurse down the list. each iteration swap pointers. 2 base cases, null and at tail
    static DoublyLinkedListNode reverseRecursive(DoublyLinkedListNode n) {
        // base case 1, obvious
        if (n == null) {
            return n;
        }
        // base case 2, if we reached the tail, therefore new head. so prev = null, an
        if (n.next == null) {
            n.next = n.prev;
            n.prev = null;
            return n;
        }

        // swap the points of n ONLY. Each iteration only swaps the pointer of the current node n
        DoublyLinkedListNode prev = n.prev;
        DoublyLinkedListNode next = n.next;
        n.next = prev;
        n.prev = next;

        // continue down the list
        return reverseRecursive(next);
    }


    static DoublyLinkedListNode reverseIterative(DoublyLinkedListNode head) {


        if (head == null || head.next == null) {
            return head;
        }

        //I couldn't figure this out on my own.
        DoublyLinkedListNode current = head;
        DoublyLinkedListNode newHead = head;

        while (current != null) {
            // iteration1 prev=null, current=1
            // iteration2 prev=1, current=2
            // iteration2 prev=1, current=2
            DoublyLinkedListNode prev = current.prev;


            // iteration 1 so swap current null<-1->2 => 2<-1->null, only fixing the pointers of node 1. Pointers of 2 is still 1<-2->3
            // iteration 2 sp swap current 1<-2->3 => 3<-2->1
            current.prev = current.next;
            current.next = prev;

            // iteration 1 newHead=1
            // iteration 2 newHead=2
            newHead = current;
            // iteration 1, current=2
            // iteration 2, current=3
            current = current.prev;
        }

        return newHead;
    }


    public static void main(String[] args) {


        // s1, null
        {
            DoublyLinkedListNode ret = reverse(null);
            System.out.println(ret);
        }

        // s2, single
        {
            DoublyLinkedListNode head = new DoublyLinkedListNode(1);

            DoublyLinkedListNode ret = reverse(head);
            System.out.println(ret);
        }


        // s3, size 2
        {
            DoublyLinkedListNode head = new DoublyLinkedListNode(1);
            DoublyLinkedListNode tail = new DoublyLinkedListNode(2);
            head.next = tail;
            tail.prev = head;
            DoublyLinkedListNode ret = reverse(head);
            System.out.println(ret);
        }
    }
}
