package io.nimbus.hackerrank.interviewperparationkit.linkedlists.easy;

class DoublyLinkedListNode {
    int data;
    DoublyLinkedListNode next;
    DoublyLinkedListNode prev;

    public DoublyLinkedListNode(int data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "DoublyLinkedListNode{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }
}
