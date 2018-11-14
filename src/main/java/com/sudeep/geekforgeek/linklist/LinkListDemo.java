package com.sudeep.geekforgeek.linklist;

class Node {
	int key;
	Node next;

	Node(int key) {
		this.key = key;
	}

	@Override
	public String toString() {
		return "Node [key=" + key + ", next=" + next + "]";
	}
	

}

class LList {
	Node head;

	LList() {
		head = null;
	}

	void pushFirst(int i) {
		Node temp = new Node(i);
		temp.next = head;
		head = temp;
	}

	@Override
	public String toString() {
		return head+"" ;
	}

}

public class LinkListDemo {
	public static void main(String[] args) {
		LList list = new LList();

		list.pushFirst(2);
		list.pushFirst(3);
		list.pushFirst(4);
		list.pushFirst(5);
		
		Node fastNode =list.head,slowNode= list.head;
		while(fastNode != null && fastNode.next!= null) {
			fastNode = fastNode.next;
			slowNode = slowNode.next;
			fastNode = fastNode.next;
		}
		System.out.println(slowNode.key);
		//System.out.println(list);

	}
}
