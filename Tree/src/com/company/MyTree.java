package com.company;

public class MyTree {
    private int size;
    private Node root;

    public void add(int value) {
        Node newNode = new Node(value);
        if (root == null) {
            root = newNode;
        } else if (newNode.value > root.value) {

            Node tmp = root.right;
            while (tmp.right.value < newNode.value) {
                tmp = tmp.right;
                //if (tmp.left)
            }



//            root.right = newNode;
//            newNode.parent = root;
        } else if (newNode.value < root.value){
            root.left = newNode;
            newNode.parent = root;
        }
        size++;
    }

    public Node getRoot() {
        return root;
    }
}
