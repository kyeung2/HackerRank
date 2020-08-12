package io.nimbus.hackerrank.practice.datastructures.trees.easy;

import io.nimbus.hackerrank.practice.datastructures.trees.Node;

/**
 * https://www.hackerrank.com/challenges/tree-inorder-traversal/problem?h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen
 */
public class InorderTraversal {

    public static void inOrder(Node root) {
        if (root != null) {
            //left
            inOrder(root.left);
            //visit
            System.out.print(root.data + " ");
            //right
            inOrder(root.right);
        }
    }
}


