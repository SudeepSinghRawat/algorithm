package com.sudeep.geekforgeek.arrays;

public class KadaneAlgorithm {

	public static void main(String[] args) {
		
		int arr[] = { 1,2,3};
		int n = 3;
		int maxSoFar = arr[0];
		int currMax = arr[0];

		for (int i = 1; i < n; i++) {
			currMax = Math.max(arr[i], currMax+arr[i]);
			maxSoFar = Math.max(maxSoFar, currMax);
		}
		System.out.println(maxSoFar);
		
		
	}

}
