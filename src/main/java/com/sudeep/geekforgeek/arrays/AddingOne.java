package com.sudeep.geekforgeek.arrays;

import java.io.IOException;

import com.sudeep.input.Print;
import com.sudeep.input.Scan;

/**
 * Given a non-negative integer represented as an array of digits. Your task is
 * to add 1 to the number ( increment the number by 1). The digits are stored
 * such that the most significant digit is at the starting index of the array.
 * 
 * Example: If the array has [4, 5, 6], the resultant array should be [4, 5, 7]
 * as 456 + 1 = 457.
 * 
 * Input: The first line of input contains an integer T denoting the number of
 * test cases. The first line of each test case contains a single integer N
 * denoting the size of the array. The second line contains N space-separated
 * integers A1, A2, ..., AN denoting the elements of the array.
 * 
 * Output: Print the resultant array.
 * 
 * Constraints: 1 ≤ T ≤ 300 1 ≤ N ≤ 107 0 ≤ A[i] ≤ 9
 * 
 * Example: Input: 2 4 5 6 7 8 3 9 9 9
 * 
 * Output: 5 6 7 9 1 0 0 0
 * 
 * @author sudee
 *
 */

public class AddingOne {

	public static void main(String[] args) throws IOException {
		Scan scan = new Scan();
		Print print = new Print();

		int T = scan.scanInt();
		for (int tc = 0; tc < T; tc++) {
			int n = scan.scanInt();
			int arr[] = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = scan.scanInt();
			}
			boolean status = true;
			for (int i = n - 1; i >= 0; i--) {
				if (arr[i] == 9) {
					arr[i] = 0;
				} else {
					arr[i]++;
					status = false;
					break;
				}
			}
			if (status) {
				print.print("1 ");
			}
			for (int i = 0; i < n; i++) {
				print.print(arr[i] + " ");
			}
			print.printLine("");

		}
		print.close();

	}

}
