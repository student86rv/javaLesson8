package com.company;

public class MyTree {

    private Node root;

    public void add(int value) {
        if (root == null) {
            root = new Node(value);
        } else {
            addInTree(root, value);
        }
    }

    private void addInTree(Node node, int value) {
        Node newNode = new Node(value);
        if (value > node.value) {
            if (node.right == null) {
                node.right = newNode;
                return;
            } else {
                addInTree(node.right, value);
            }
        }
        if (value < node.value) {
            if (node.left == null) {
                node.left = newNode;
                return;
            } else {
                addInTree(node.left, value);
            }
        }
    }

    public void addOtherTree(MyTree tree) {
        Node node1 = root;
        Node node2 = tree.root;
        sumTree(node1, node2);
    }

    private void sumTree(Node node1, Node node2) {
        //result =>node1
        if (node1 == null && node2 == null) {
            return;
        } else if (node1 == null) {
            node1 = new Node(0);
        } else if (node2 == null) {
            node2 = new Node(0);
        }
        node1.value += node2.value;

        sumTree(node1.left, node2.left);
        sumTree(node1.right, node2.right);
    }

    public Node getRoot() {
        return root;
    }
}
