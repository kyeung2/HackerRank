package io.nimbus.hackerrank.practice.datastructures.trees.easy;

import io.nimbus.hackerrank.practice.datastructures.trees.Node;

/**
 * https://www.hackerrank.com/challenges/tree-postorder-traversal/problem?h_r=next-challenge&h_v=zen
 */
public class PostorderTraversal {

    public static void postOrder(Node root) {
        if (root != null) {
            //left
            postOrder(root.left);
            //right
            postOrder(root.right);
            //visit
            System.out.print(root.data + " ");
        }
    }
}


