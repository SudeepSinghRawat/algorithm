package com.sudeep.geekforgeek.arrays;

import java.io.IOException;

import com.sudeep.input.Print;
import com.sudeep.input.Scan;

/*
 * Given an array A of N elements. Find the majority element in the array. A majority element in an array A of size N is an element that appears more than N/2 times.

Input:  
The first line of the input contains T denoting the number of testcases. The first line of the test case will be the size of array and second line will be the elements of the array.

Output: For each test case the output will be the majority element of the array.

Constraints:
1 <= T<= 100
1 <= N <= 103
0 <= Ai <= 103

Example:
Input:
2
5
3 1 3 3 2
3
1 2 3

Output:
3
-1

Explanation:
Testcase 1: Since, 3 is present more than N/2 times, so it is the majority element.
 */

public class MajorityElement {

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
			int majorIndex = 0;
			int count = 1;
			for (int i = 1; i < n; i++) {
				if (arr[majorIndex] == arr[i]) {
					count++;
				} else
					count--;

				if (count == 0) {
					majorIndex = i;
					count = 1;
				}
			}
			int val = arr[majorIndex];
			count = 0;
			for (int i = 0; i < n; i++) {
				if (val == arr[i]) {
					count++;
				}
			}
			if (count > n / 2) {
				print.printLine(val+"");
			} else {
				print.printLine("-1");
			}

		}
		print.close();

	}

}
