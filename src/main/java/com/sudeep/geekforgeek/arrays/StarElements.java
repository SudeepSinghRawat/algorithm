package com.sudeep.geekforgeek.arrays;

import java.io.IOException;
import java.util.Stack;

import com.sudeep.input.Print;
import com.sudeep.input.Scan;

/**
 * Given an unsorted array. The task is to find all the star and super star
 * elements in the array. Star are those elements which are strictly greater
 * than all the elements on its right side. Super star are those elements which
 * are strictly greater than all the elements on its left and right side.
 * 
 * Note: Assume first element (A[0]) is greater than all the elements on its
 * left side, And last element (A[n-1]) is greater than all the elements on its
 * right side.
 * 
 * Input: The first line of input contains an integer T denoting the number of
 * test cases. Then T test cases follow. Each test case consists of two lines.
 * First line of each test case contains an Integer N denoting size of array and
 * the second line contains N space separated elements.
 * 
 * Output: For each test case, print the space separated star elements and then
 * in new line print super star elements. If no super star element present in
 * array then print "-1".
 * 
 * Constraints: 1<=T<=200 1<=N<=106 1<=A[i]<=106
 * 
 * Example: Input: 2 6 4 2 5 7 2 1 3 8 6 5
 * 
 * Output: 7 2 1 7 8 6 5 8
 *
 *
 */

public class StarElements {

	public static void main(String[] args) throws IOException {
		Print print = new Print();
		Scan scan = new Scan();

		int T = scan.scanInt();
		for (int tc = 0; tc < T; tc++) {
			int n = scan.scanInt();
			int arr[] = new int[n];

			for (int i = 0; i < n; i++) {
				arr[i] = scan.scanInt();
			}
			Stack<Integer> rightMax = new Stack<Integer>();
			int max = 0;
			int allMax = -1;
			int lastMaxIndex = n-1;
			for (int i = n - 1; i >= 0; i--) {
				if (arr[i] > max || i == n-1) {
					rightMax.push(arr[i]);
					max = arr[i];
					lastMaxIndex = i;
				}
				if(arr[i]>=max) {
					if(lastMaxIndex == i) {
						allMax = arr[i];
					}
					else {
						allMax = -1;
					}
				}
				
				
			}
			while (!rightMax.isEmpty()) {
				print.print(rightMax.pop() + " ");
			}
			print.printLine(" ");
			print.printLine(allMax + "");
		}
		print.close();

	}

}
