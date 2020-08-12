package io.nimbus.hackerrank.practice.datastructures.trees.easy;

import io.nimbus.hackerrank.practice.datastructures.trees.Node;

/**
 * https://www.hackerrank.com/challenges/tree-preorder-traversal/problem
 */
public class PreorderTraversal {

    public static void preOrder(Node root) {
        if (root != null) {
            //visit
            System.out.print(root.data + " ");
            //left
            preOrder(root.left);
            //right
            preOrder(root.right);
        }
    }
}


