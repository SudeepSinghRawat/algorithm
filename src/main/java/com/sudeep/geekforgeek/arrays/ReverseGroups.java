package com.sudeep.geekforgeek.arrays;

import java.io.IOException;

import com.sudeep.input.Print;
import com.sudeep.input.Scan;

/*
 * 
 * Given an array of positive integers. Reverse every sub-array of K group elements.

Input:
The first line of input contains a single integer T denoting the number of test cases. Then T test cases follow. Each test case consist of two lines of input. The first line of each test case consists of an integer N(size of array) and an integer K separated by a space. The second line of each test case contains N space separated integers denoting the array elements.

Output:
For test case, print the modified array.

Constraints:
1 ≤ T ≤ 200
1 ≤ N ≤ 107
1 ≤ A[i] ≤ 1018

Example:
Input
1
5 3
1 2 3 4 5

Output
3 2 1 5 4*/

public class ReverseGroups {
	public static void main(String[] args) throws IOException {
		Scan scan = new Scan();
		Print print = new Print();
		int T = scan.scanInt();
		
		for(int tc = 0; tc < T; tc++) {
			int n = scan.scanInt();
			int  k = scan.scanInt();
			int arr[] = new int[n];
			if(k >=n) {
				k = n;
			}
			for(int i  = 0; i <n ; i++) {
				arr[i] = scan.scanInt();
			}
			int windowMin = 0;
			int windowMax = k-1;
			while(n > 0) {
				
				if(windowMax >= arr.length) {
					windowMax = arr.length-1;
				}
				System.out.println(windowMin + " " +windowMax);
				for(int i = windowMax ; i >= windowMin ; i--) {
					print.print(arr[i]+" ");
				}
				windowMin = windowMax+1;
				windowMax += k;
				
				n = n-k;
				
				
				/*for(int i = loopVale-1 ; i>=min;i--) {
					print.print(arr[i]+" ");
					//System.out.println(arr[i]);
				}
				min = k;
				k *= 2;*/
				
				
			}
			print.printLine("");
			
		}
		print.close();

	}

}

