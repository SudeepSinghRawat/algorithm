package com.sudeep.geekforgeek.arrays;

import java.io.IOException;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import com.sudeep.input.Print;
import com.sudeep.input.Scan;

/**
 * Given an array of numbers, the task is to print only those numbers which have
 * only 1, 2 and 3 as their digits.
 * 
 * Input: The first line of input contains an integer T denoting the number of
 * test cases. Then T test cases follow. Each test case consists of two lines.
 * First line of each test case contains an integer N and the second line
 * contains N space separated array elements.
 * 
 * Output: For each test case, In new line print the required elements in
 * increasing order. if there is no such element present in the array print
 * "-1".
 * 
 * Constraints: 1<=T<=100 1<=N<=106 1<=A[i]<=106
 * 
 * Example: Input: 2 3 4 6 7 4 1 2 3 4
 * 
 * Output:
 * 
 * -1 1 2 3
 *
 *
 */

public class Numberscontaining {

	public static void main(String[] args) throws IOException {
		Print print = new Print();
		Scan scan = new Scan();

		int T = scan.scanInt();

		for (int tc = 0; tc < T; tc++) {
			int n = scan.scanInt();
			//Set<Integer> correctValue = new TreeSet<Integer>();
			Map<Integer, Integer> correctValues = new TreeMap<Integer, Integer>();

			for (int i = 0; i < n; i++) {
				int num = scan.scanInt();
				boolean status = true;
				int checkNum = num;
				while (checkNum > 0) {
					int rem = checkNum % 10;
					// System.out.print(rem +" "+checkNum);
					if (!(rem == 1 || rem == 2 || rem == 3)) {
						status = false;
						break;
					}
					checkNum /= 10;
					// System.out.println(rem +" "+checkNum);
				}
				if (status) {
					if(correctValues.containsKey(num)) {
						int value = correctValues.get(num);
						correctValues.put(num, ++value);
					}
					else {
						correctValues.put(num, 0);
					}
					
				}

			}
			// System.out.println(correctValue);
			if (correctValues.isEmpty()) {
				print.print("-1");
			} else {
				for(Map.Entry<Integer, Integer> val : correctValues.entrySet() ) {
					int num = val.getKey();
					for(int i = 0;  i <=val.getValue();i++) {
						print.print(num+" ");
					}
					
				}
			}
			print.printLine("");
		}
		print.close();

	}

}
