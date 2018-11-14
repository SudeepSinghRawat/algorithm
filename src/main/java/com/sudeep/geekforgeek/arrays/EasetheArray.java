package com.sudeep.geekforgeek.arrays;

import java.io.IOException;

/**
 * Given an array of integers of size N. Assume ‘0’ as invalid number and all other as valid number. Write a program that modifies the array in such a way that if next number is  valid number and is same as current number, double the current number value and replace the next number with 0. After the modification, rearrange the array such that all 0’s are shifted to the end and the sequence of the valid number or new doubled number is maintained as in the original array.

Examples:

Input : arr[] = {2, 2, 0, 4, 0, 8}
Output : 4 4 8 0 0 0

Input : arr[] = {0, 2, 2, 2, 0, 6, 6, 0, 0, 8}
Output :  4 2 12 8 0 0 0 0 0 0
Input:
The first line of the input contains an integer T, denoting the number of test cases. Then T test case follows. First line of each test contains an integer N denoting the size of the array. Then next line contains N space separated integers denoting the elements of the array.

Output:
For each test case print space separated elements of the new modified array on a new line.

Constraints:
1<=T<=103
1<=N<=105

Example:
Input:
2
5
2 2 0 4 4
5
0 1 2 2 0
Output:
4 8 0 0 0
1 4 0 0 0
 */

import com.sudeep.input.Print;
import com.sudeep.input.Scan;

public class EasetheArray {

	public static void main(String[] args) throws IOException {
		Print print = new Print();
		Scan scan  = new Scan();
		int T = scan.scanInt();
		for(int tc = 0; tc <T; tc++) {
			int n  = scan.scanInt();
			int arr[] = new int[n];
			for(int i = 0; i <n ; i++) {
				arr[i] = scan.scanInt();
			}
			int point = 0;
			for(int i = 0; i<n-1; i++) {
				
				if(arr[i] == arr[i+1] && arr[i] !=0) {
					
					arr[i] *= 2;
					arr[i+1] = 0;
					if(i != point) {
						arr[point] = arr[i];
						arr[i] = 0;
					}
					point++;
				}
				else if(arr[i] >0 && i == point) {
					
					point++;
				}
				else if(arr[i] > 0) {
					arr[point] = arr[i];
					arr[i] = 0;
					point++;
				}	
				
			}
			if(point != n-1) {
				arr[point] = arr[n-1];
				arr[n-1] = 0;
			}
			
			for(int i = 0 ; i<n; i++) {
				print.print(arr[i]+" ");
			}
			print.printLine(" ");
 		}
		print.close();

	}

}
