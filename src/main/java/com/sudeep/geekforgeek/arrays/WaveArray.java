package com.sudeep.geekforgeek.arrays;

import java.io.IOException;
import java.util.Arrays;

/**
 * Given an array A of integers. Sort the array into a wave-like array and
 * return it. In other words, arrange the elements into a sequence such that a1
 * >= a2 <= a3 >= a4 <= a5.....
 * 
 * Input: The first line contains an integer T, depicting total number of test
 * cases. Then following T lines contains an integer N depicting the size of
 * square matrix and next line followed by the value of array.
 * 
 * Output: Print the array into wave-like array.
 * 
 * Constraints: 1 ≤ T ≤ 130 1 ≤ N ≤ 104 0 ≤ A[i] ≤105
 * 
 * Example: Input: 1 5 5 7 3 2 8 Output: 3 2 7 5 8
 * 
 * Explanation: Testcase 1: Array elements after sorting it in wave form are 3,
 * 2, 7, 5, 8.
 * 
 * @author sudee
 *
 */

public class WaveArray {

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
			Arrays.sort(arr);
			for (int i = 0; i < n - 1; i = i + 2) {
				arr[i] = arr[i] + arr[i + 1];
				arr[i + 1] = arr[i] - arr[i + 1];
				arr[i] = arr[i] - arr[i + 1];
			}
			for (int i : arr) {
				print.print(i + " ");
			}
			print.printLine("");
		}
		print.close();

	}

	public static void approch2() throws IOException {
		Scan scan = new Scan();
		Print print = new Print();

		int T = scan.scanInt();

		for (int tc = 0; tc < T; tc++) {
			int n = scan.scanInt();
			int arr[] = new int[n];

			for (int i = 0; i < n; i++) {
				arr[i] = scan.scanInt();
			}
			for (int i = 0; i < n; i += 2) {
				print.print(" Main ");
				
				for(int v: arr) {
					print.print(v+" ");
					
				}
				print.printLine("");
				// If current even element is smaller
				// than previous
				if (i > 0 && arr[i - 1] > arr[i]) {
					swap(arr, i - 1, i);
				}

				// If current even element is smaller
				// than next
				if (i < n - 1 && arr[i] < arr[i + 1]) {
					swap(arr, i, i + 1);
				}

			}
			print.printLine("");
		}
		print.close();

	}

	static void swap(int arr[], int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}

}
