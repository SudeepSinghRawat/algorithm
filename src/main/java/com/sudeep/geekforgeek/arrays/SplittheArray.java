package com.sudeep.geekforgeek.arrays;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.sudeep.input.Print;
import com.sudeep.input.Scan;

/**
 * 
 * Given an array A of n integers, the task is to count the number of ways to
 * split given array elements into two disjoint groups such that XOR of elements
 * of each group is equal.
 * 
 * Input:
 * 
 * The first line of the input contains a single integer T, denoting the number
 * of test cases. Then T test cases follow. Each test-case has two lines of the
 * input, the first line contains an integer denoting the size of an array N and
 * the second line of input contains N positive integers . Output:
 * 
 * For each testcase, print no. of ways to split an array in a separate line.
 * Constraints:
 * 
 * 1<=T<=100
 * 
 * 1<=N<=100
 * 
 * 1<=arr<=100
 * 
 * 
 * Example:
 * 
 * Input:
 * 
 * 2
 * 
 * 3
 * 
 * 1 2 3
 * 
 * 4
 * 
 * 5 2 3 2
 * 
 * Output:
 * 
 * 3
 * 
 * 0
 * 
 * Explanation:
 * 
 * Testcase 1: {(1), (2, 3)}, {(2), (1, 3)}, {(3), (1, 2)} are three ways with
 * equal XOR value of two groups.
 * 
 * Testcase 2: Not possible
 *
 */

public class SplittheArray {

	public static void main(String[] args) throws IOException {
		Print print = new Print();
		Scan scan = new Scan();

		int T = scan.scanInt();
		for (int tc = 0; tc < T; tc++) {
			int n = scan.scanInt();
			int arr[] = new int[n];
			Map<Integer, Integer> hp = new HashMap<Integer, Integer>();

			for (int i = 0; i < n; i++) {
				arr[i] = scan.scanInt();
			}
			for (int i = 0; i < n; i++) {
				for (int j = i + 1; j < n; j++) {
					int key = arr[i] ^ arr[j];
					if (hp.containsKey(key)) {
						int value = hp.get(key);
						hp.put(key, ++value);
					} else {
						hp.put(key, 0);
					}
				}
				if (hp.containsKey(arr[i])) {
					int value = hp.get(arr[i]);
					hp.put(arr[i], ++value);
				} else {
					hp.put(arr[i], 0);
				}

			}
			System.out.println(hp);
			int count = 0;
			for(Map.Entry<Integer,Integer> keys: hp.entrySet()) {
				if(keys.getValue()>0) {
					System.out.println(keys.getKey());
					count++;
				}
			}
			print.printLine(count+"");
		}
		print.close();

	}

}
