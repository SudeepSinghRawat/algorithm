package com.sudeep.geekforgeek.arrays;

import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import com.sudeep.input.Print;
import com.sudeep.input.Scan;

/**
 * Given an array of distinct integers, print all the pairs having positive
 * value and negative value of a number that exists in the array.
 * 
 * NOTE: If there is no such pair in the array , print "0".
 * 
 * Input: The first line consists of an integer T i.e number of test cases. The
 * first line of each test case consists of an integer n.The next line of each
 * test case consists of n spaced integers.
 * 
 * Output: Print all the required pairs in the increasing order of their
 * absolute numbers.
 * 
 * Constraints: 1<=T<=100 1<=n<=1000 -1000<=a[i]<=1000
 * 
 * Example: Input: 2 6 1 -3 2 3 6 -1 8 4 8 9 -4 1 -1 -8 -9
 * 
 * Output: -1 1 -3 3 -1 1 -4 4 -8 8 -9 9
 *
 *
 */

public class PairswithPositiveNegativevalues {

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
			Map<Integer, Integer> pairCount = new HashMap<Integer, Integer>();
			for (int i = 0; i < n; i++) {
				if (arr[i] > 0) {
					int key = arr[i];
					if (pairCount.containsKey(key)) {
						int value = pairCount.get(key);
						pairCount.put(key, ++value);
					} else {
						pairCount.put(key, 1);
					}
				}
				if (arr[i] < 0) {
					int key = -arr[i];
					if (pairCount.containsKey(key)) {
						int value = pairCount.get(key);
						pairCount.put(key, ++value);
					} else {
						pairCount.put(key, 1);
					}
				}
			}
			boolean status = false;
			for (Map.Entry<Integer, Integer> temp : pairCount.entrySet()) {
				if (temp.getValue() > 1) {
					int val = temp.getKey();
					for (int l = 0; l < (temp.getValue() / 2); l++) {
						print.print(-val + " " + (val) + " ");
						status = true;
					}

				}
			}
			if (status) {
				print.printLine("");
			} else {
				print.printLine("0");
			}

		}
		print.close();

	}

}
