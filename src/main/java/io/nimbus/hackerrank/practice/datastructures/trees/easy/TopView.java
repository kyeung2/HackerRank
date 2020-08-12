package io.nimbus.hackerrank.practice.datastructures.trees.easy;

import io.nimbus.hackerrank.practice.datastructures.trees.Node;

import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeMap;

/**
 * https://www.hackerrank.com/challenges/tree-top-view/problem?h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen
 */
public class TopView {

    // this solution was taken from the comments section. I didn't find the solution myself
    static class QueueNode {
        Node node;
        int distanceFromCenter;

        public QueueNode(Node node, int distanceFromCenter) {
            this.node = node;
            this.distanceFromCenter = distanceFromCenter;
        }
    }

    // 1. it uses BFS using a Queue. So the tree is visited per level
    // 2. it uses a simple property 'level' to denote the to denote how wide the node is from the center
    // 3. it uses a TreeMap to remember the natural order of the values. Then simply iterates over them to print.

    public static void topView(Node root) {
        //took a queue - similar to BFS approach
        Queue<QueueNode> queue = new LinkedList<>();
        TreeMap<Integer, String> order = new TreeMap<>();
        queue.add(new QueueNode(root, 0));

        while (!queue.isEmpty()) {
            QueueNode r = queue.poll();

            // the most important as we are BFS, if this is the first time we reach a node this wide from the center
            // then we include it. Otherwise it is covered
            if (!order.containsKey(r.distanceFromCenter)) {
                order.put(r.distanceFromCenter, Integer.toString(r.node.data));
            }

            //add node's descendants
            //all left child node distanceFromCenter = node.distanceFromCenter - 1
            //all right child node distanceFromCenter = node.distanceFromCenter + 1
            if (r.node.left != null) {
                queue.add(new QueueNode(r.node.left, r.distanceFromCenter - 1));
            }
            if (r.node.right != null) {
                queue.add(new QueueNode(r.node.right, r.distanceFromCenter + 1));
            }
        }

        System.out.println(String.join(" ", order.values()));
    }


    /*


// my original attempt. It was naive since a lower branch can grow and become visible

    public static void topView(Node root) {
        if (root != null) {
            //visit
            visit(root);
            //left
            printLeft(root.left);
            //right
            printRight(root.right);
        }
    }

    private static void visit(Node n) {
        System.out.print(n.data + " ");
    }

    private static void printRight(Node right) {
        if (right != null) {
            visit(right);
            printRight(right.right);
        }
    }
    private static void printLeft(Node left) {
        if (left != null) {
            visit(left);
            printRight(left.left);
        }
    }
 */
}


