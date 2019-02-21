//package com.company;

public class MyTree {
 
    private Node root;

    public void add(int value) {
        if (root == null) {
           root = new Node(value);
        } 
		else {
			addInTree(root, value);
		}   
    }
	
	private void addInTree(Node node, int value) {
		Node newNode = new Node(value);
		if (value > node.value) {
			if (node.right == null) {
				node.right = newNode;
				return;
			}
			else {
				addInTree(node.right, value);
			}
		}
		if (value < node.value) {
			if (node.left == null) {
				node.left = newNode;
				return;
			}
			else {
				addInTree(node.left, value);
			}
		}	
	}

    public Node getRoot() {
        return root;
    }
}
