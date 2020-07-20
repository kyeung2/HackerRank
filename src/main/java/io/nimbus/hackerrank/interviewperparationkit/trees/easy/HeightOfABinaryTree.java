package io.nimbus.hackerrank.interviewperparationkit.trees.easy;

import io.nimbus.hackerrank.interviewperparationkit.trees.Node;

public class HeightOfABinaryTree {

    public static int height(Node root) {
        return recurse(root) - 1;
    }

    private static int recurse(Node node) {
        // // this means previous iteration was a left. could use this function directly and make this base case
        // return -1. But kind of confusing, so split,
        if (node == null)
            return 0;

        return Math.max(recurse(node.left), recurse(node.right)) + 1;
    }
}


