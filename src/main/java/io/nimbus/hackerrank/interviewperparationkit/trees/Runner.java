package io.nimbus.hackerrank.interviewperparationkit.trees;

import io.nimbus.hackerrank.interviewperparationkit.trees.medium.IsThisABST;

public class Runner {


    public static Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        } else {
            Node cur;
            if (data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String[] args) {

//        int[] dataArray = {5, 3, 8, 2, 4, 6, 7};
//        int[] dataArray = {1, 2 ,3 ,4 ,5 ,6 ,7};
        int[] dataArray = {1, 2, 4, 3, 5, 6, 7};


        Node root = createTree(dataArray);

        IsThisABST isThisABST = new IsThisABST();
        System.out.println(isThisABST.checkBST(root));

    }

    private static Node createTree(int[] dataArray) {
        Node root = null;
        for (int datum : dataArray) {
            root = insert(root, datum);
        }
        return root;
    }
}
