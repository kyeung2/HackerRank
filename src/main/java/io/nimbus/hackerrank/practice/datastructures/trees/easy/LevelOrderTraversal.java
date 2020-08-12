package io.nimbus.hackerrank.practice.datastructures.trees.easy;

import io.nimbus.hackerrank.practice.datastructures.trees.Node;

import java.util.LinkedList;
import java.util.Queue;

/**
 * https://www.hackerrank.com/challenges/tree-level-order-traversal/problem?h_r=next-challenge&h_v=zen
 */
public class LevelOrderTraversal {

    public static void levelOrder(Node root) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node r = queue.poll();

            System.out.print(r.data + " ");
            if (r.left != null) {
                queue.add(r.left);
            }
            if (r.right != null) {
                queue.add(r.right);
            }
        }
    }


}


