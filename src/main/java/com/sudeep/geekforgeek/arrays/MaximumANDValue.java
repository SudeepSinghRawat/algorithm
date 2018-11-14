package com.sudeep.geekforgeek.arrays;

import java.io.IOException;

import com.sudeep.input.Print;
import com.sudeep.input.Scan;

public class MaximumANDValue {

	public static void main(String[] args) throws IOException {
		Scan scan  = new Scan();
		Print print = new Print();
		
		int T = scan.scanInt();
		
		for(int tc = 0; tc < T; tc++) {
			int n  = scan.scanInt();
			int arr[] = new int[n];
			for(int i =0; i <n; i++) {
				arr[i] = scan.scanInt();
			}
			
			int max = 0;
			for(int i= 0; i <n; i++) {
				for(int j = i+1; j <n;j++) {
					max = Math.max(max, (arr[i] & arr[j]));
				}
			}
			print.printLine(max+"");
		}
		print.close();

	}

}
