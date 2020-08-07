package io.nimbus.hackerrank.practice.datastructures.linkedlist.easy;

class SinglyLinkedListNode {

    int data;
    SinglyLinkedListNode next;

    public SinglyLinkedListNode(int data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "SinglyLinkedListNode{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }
}
