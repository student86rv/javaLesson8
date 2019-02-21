package com.company;

public class Main {

    public static void main(String[] args) {

        MyTree tree = new MyTree();
        int[] values = {15, 9, 19, 11, 21, 7, 17};
        for (int i = 0; i < values.length; i++) {
            tree.add(values[i]);
        }
        System.out.println("tree:");
        printTree(tree.getRoot());
        System.out.println();

        MyTree tree2 = new MyTree();
        int[] values2 = {16, 10, 24, 5, 12, 13, 26};
        for (int i = 0; i < values2.length; i++) {
            tree2.add(values2[i]);
        }
        System.out.println("tree2:");
        printTree(tree2.getRoot());
        System.out.println();

        tree.addOtherTree(tree2);
        System.out.println("sum:");
        printTree(tree.getRoot());
        System.out.println();

        Node root = new Node(1);
        Node node1 = new Node(3);
        Node node2 = new Node(2);
        root.left = node1;
        root.right = node2;
        Node node3 = new Node(5);
        Node node4 = new Node(4);
        node1.left = node3;
        node1.right = node4;

        System.out.println("root:");
        printTree(root);
        System.out.println();

        Node root2 = new Node(2);
        root2.left = new Node(1);
        Node node5 = new Node(3);
        root2.right = node5;
        node5.right = new Node(7);

        System.out.println("root2:");
        printTree(root2);
        System.out.println();

        sumTree(root, root2);
        System.out.println("sum:");
        printTree(root);
    }

        private static Node sumTree(Node node1, Node node2) {
        if (node1 == null) {
            return node2;
        }
        if (node2 == null) {
            return node1;
        }

        node1.value += node2.value;

        node1.left = sumTree(node1.left, node2.left);
        node1.right = sumTree(node1.right, node2.right);

        return node1;
    }

    public static void printTree(Node node) {
        if (node == null) {
            return;
        }
        printTree(node.left);
        System.out.print(node.value + " ");
        printTree(node.right);
    }
}
