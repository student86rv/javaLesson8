//package com.company;

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
		
        Node root = new Node(9);
        Node node1 = new Node(7);
        Node node2 = new Node(11);
        root.left = node1;
        root.right = node2;
		
		//Node node3 = new Node(5);
		//node1.left = node3;
		//Node node4 = new Node(8);
		//node1.right = node4;
		
		System.out.println("root:");
		printTree(root);
		System.out.println();
		
		Node root2 = new Node(10);
		root2.left = new Node(6);
		root2.right = new Node(14);
		System.out.println("root2:");
		printTree(root2);
		System.out.println();
		sumTree(root, root2);
		System.out.println();
		printTree(root);
		
    }
	public static void sumTree(Node node1, Node node2) {
		//result =>node1
		
		if (node1 == null && node2 == null) {
			return;
		}
		node1.value += node2.value;
		
		sumTree(node1.left, node2.left);
		sumTree(node1.right, node2.right);	
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
