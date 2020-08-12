package io.nimbus.hackerrank.practice.datastructures.trees.easy;

import io.nimbus.hackerrank.practice.datastructures.trees.Node;

/**
 * https://www.hackerrank.com/challenges/binary-search-tree-insertion/problem?h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen
 */
public class BstInsertion {

    public static Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        }
        if (data < root.data) {
            root.left = insert(root.left, data);
        } else {

            root.right = insert(root.right, data);
        }
        return root;
    }

    public static void main(String[] args) {
        Node a4 = new Node(4);
        Node a2 = new Node(2);
        Node a7 = new Node(7);
        Node a1 = new Node(1);
        Node a3 = new Node(3);

        a4.left = a2;
        a4.right = a7;
        a2.left = a1;
        a2.right = a3;

        System.out.println(insert(a4, 6));
    }
}


