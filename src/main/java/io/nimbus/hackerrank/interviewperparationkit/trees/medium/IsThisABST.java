package io.nimbus.hackerrank.interviewperparationkit.trees.medium;

import io.nimbus.hackerrank.interviewperparationkit.trees.Node;

public class IsThisABST {

    public boolean checkBST(Node root) {
        return checkBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private boolean checkBST(Node n, int minValue, int maxValue) {
        if (n != null) {

            boolean isValueInBounds = n.data >= minValue && n.data < maxValue;

            return isValueInBounds &&
                    checkBST(n.left, minValue, n.data) &&
                    checkBST(n.right, n.data, maxValue);
        }
        // leaf not scenario
        return true;
    }

}

