package io.nimbus.hackerrank.practice.datastructures.linkedlist.easy;

/**
 * https://www.hackerrank.com/challenges/compare-two-linked-lists/problem
 */
public class MergeTwoSortedLinkedLists {

    static SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {

        SinglyLinkedListNode h;
        // questionable not reassigning the input parameters makes much difference in clarity
        SinglyLinkedListNode pointer1;
        SinglyLinkedListNode pointer2;

        if (head1.data < head2.data) {
            h = head1;
            pointer1 = head1.next;
            pointer2 = head2;
        } else {
            h = head2;
            pointer1 = head1;
            pointer2 = head2.next;
        }

        SinglyLinkedListNode n = h;

        // first attempt tried to add all 3 cases into 1 loops, mistake. Keep the logic simple.
        while (pointer1 != null && pointer2 != null) {

            if (pointer1.data < pointer2.data) {
                n.next = pointer1;
                pointer1 = pointer1.next;
            } else {
                n.next = pointer2;
                pointer2 = pointer2.next;
            }

            // I didn't think to have the moving of the current node n outside, it is needed to continue.
            n = n.next;
        }

        if (pointer1 != null) {
            n.next = pointer1;
        } else {
            n.next = pointer2;
        }

        return h;
    }

    public static void main(String[] args) {
        SinglyLinkedListNode a = new SinglyLinkedListNode(1);
        SinglyLinkedListNode a2 = new SinglyLinkedListNode(2);
        SinglyLinkedListNode a3 = new SinglyLinkedListNode(3);
        a.next = a2;
        a2.next = a3;
        SinglyLinkedListNode b = new SinglyLinkedListNode(3);
        SinglyLinkedListNode b2 = new SinglyLinkedListNode(4);
        b.next = b2;

        SinglyLinkedListNode x = mergeLists(a, b);
        System.out.println(x);
    }

}
