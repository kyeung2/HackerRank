package io.nimbus.hackerrank.practice.datastructures.linkedlist;

public class SinglyLinkedListNode {

    public int data;
    public SinglyLinkedListNode next;

    public SinglyLinkedListNode(int data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "node{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }
}
