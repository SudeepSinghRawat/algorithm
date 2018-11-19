package com.sudeep.geekforgeek.heap;

import java.util.PriorityQueue;

public class KlagrgerNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10,20,5,30,78,18};
		int k = 3;
		PriorityQueue<Integer> pa= new PriorityQueue<Integer>(3);
		
		for(int i = 0; i<6; i++) {
			if(i < k) {
				pa.add(arr[i]);
			}
			else {
				int a = arr[i];
				if(a>pa.peek()) {
					pa.poll();
					pa.add(a);
				}
			}
		}
		
		System.out.println(pa);
		
		
		//System.out.println(pa.poll()*-1);

	}

}
