package io.nimbus.hackerrank.practice.datastructures.trees.medium;

import java.util.LinkedList;
import java.util.Queue;

/**
 * https://www.hackerrank.com/challenges/tree-huffman-decoding/problem
 */
public class HuffmanDecoding {

    class Node {
        public int frequency; // the frequency of this tree
        public char data;
        public Node left, right;

    }

    // got it first go, pretty unusual. But I followed the steps well.
    void decode(String s, Node root) {

        // 1. split the code into a usable data structure, a queue works nicely here. FIFO
        Queue<Character> charsQueue = new LinkedList<>();
        for (char c : s.toCharArray()) {
            charsQueue.add(c);
        }
        StringBuilder res = new StringBuilder();
        while (!charsQueue.isEmpty()) {
            res.append(findValue(charsQueue, root));
        }

        System.out.println(res.toString());
    }

    private char findValue(Queue<Character> charsQueue, Node c) {

        // base case for recursive algorithm, if a leaf, return
        if (isLeaf(c)) {
            return c.data;
        }

        // else recurse, following the rules of Huffman.
        Character poll = charsQueue.poll();
        return Character.valueOf('0').equals(poll) ? findValue(charsQueue, c.left) : findValue(charsQueue, c.right);
    }


    boolean isLeaf(Node n) {
        return n.left == null && n.right == null;
    }
}
