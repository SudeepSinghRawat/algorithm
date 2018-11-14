package com.sudeep.geekforgeeks.stack;

import java.util.Stack;

public class PreviousGreateElement {

	public static void main(String[] args) {
		int arr[] = {10,5,3,2,8,20,18,17,19};
		Stack<Integer> previousValue = new Stack<Integer>();
		
		for(int i = 0; i < arr.length; i++ ) {
			if(previousValue.isEmpty()) {
				System.out.println(i+1);
			}
			else if(arr[i]<arr[previousValue.peek()]) {
				System.out.println(1);
				previousValue.push(i);
			}
			else {
				
			}
		}

	}

}
