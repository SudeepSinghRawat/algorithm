package com.sudeep.geekforgeeks.tree;

public class HeightofTree {

	public static void main(String[] args) {
		Node n  = new Node(10);
		n.left =new Node (20);
		n.right = new Node(30);
		System.out.println(height(n));
		System.out.println(height(null));

	}
	
	public static int height(Node root) {
		int height  = 0;
		Node n  = root;
		while( n != null) {
			height++;
			n =n.left;
		}
		return height;
		
	}

}

class Node {
	public  int key;
	public Node left, right; 
	Node(int key) {
		this.key = key;
		this.left = null;
		this.right = null;
	}
	
}
