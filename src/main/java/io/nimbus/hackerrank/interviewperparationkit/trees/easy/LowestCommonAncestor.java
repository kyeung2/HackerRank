package io.nimbus.hackerrank.interviewperparationkit.trees.easy;

import io.nimbus.hackerrank.interviewperparationkit.trees.Node;

import java.util.ArrayList;
import java.util.List;

public class LowestCommonAncestor {

    public static Node lca(Node root, int v1, int v2) {

        // so algo should be, find path of A, add to a set
        // find path of B, work up if contains, then return.

        // A->B->C->D
        // A->B->E->F
        // B
        List<Node> path1 = findPath(root, v1);
        List<Node> path2 = findPath(root, v2);
        for (int i = path2.size() - 1; i >= 0; i--) {

            Node node = path2.get(i);
            if (path1.contains(node)) {
                return node;
            }
        }

        return root;
    }

    private static List<Node> findPath(Node root, int v1) {

        List<Node> path = new ArrayList<>();
        Node temp = root;
        while (temp.data != v1) {
            path.add(temp);
            temp = v1 < temp.data  ? temp.left : temp.right;
        }
        path.add(temp);
        return path;
    }
}




