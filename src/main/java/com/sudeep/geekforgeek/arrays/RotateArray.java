package com.sudeep.geekforgeek.arrays;

import java.io.IOException;

import com.sudeep.input.Print;
import com.sudeep.input.Scan;

/**
 * 
 * Given an array of size N, rotate it by D elements.
 * 
 * Input: The first line of the input contains T denoting the number of
 * testcases. First line of test case is the number of elements N, next line
 * contains D. Subsequent line will be the array elements.
 * 
 * Output: For each testcase, in a new line, output the rotated array.
 * 
 * Constraints: 1 <= T <= 200 1 <= N <= 107 D <= N 1 <= arr[i] <= 103
 * 
 * Example: Input: 2 5 2 1 2 3 4 5 10 3 2 4 6 8 10 12 14 16 18 20
 * 
 * Output: 3 4 5 1 2 8 10 12 14 16 18 20 2 4 6
 * 
 * Explanation : Testcase 1: 1 2 3 4 5 when rotated by 2 elements, it becomes 3
 * 4 5 1 2
 *
 */

public class RotateArray {

	public static void main(String[] args) throws IOException {
		Print print = new Print();
		Scan scan = new Scan();
		int T = scan.scanInt();
		for (int tc = 0; tc < T; tc++) {
			int n = scan.scanInt();
			int d = scan.scanInt();
			int ans[] = new int[n];
			for (int i = 0; i < n; i++) {
				int num = scan.scanInt();
				int val = i - d;
				if (val < 0) {
					val += n;
				}
				ans[val] = num;
			}
			for (int i : ans) {
				print.print(i + " ");
			}
			print.printLine("");
		}
		print.close();

	}

}
