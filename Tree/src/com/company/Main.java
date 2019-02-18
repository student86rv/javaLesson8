package com.company;

public class Main {

    public static void main(String[] args) {

        MyTree tree = new MyTree();

        tree.add(15);
        tree.add(9);;
        tree.add(19);


        printTree(tree.getRoot());

        tree.add(11);

//        printTree(tree.getRoot());

//        Node root = new Node(9);
////        Node node1 = new Node(7);
////        Node node2 = new Node(11);
////
////        root.left = node1;
////        root.right = node2;

       // printTree(root);
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
