package com.sudeep.geekforgeek.arrays;

import java.io.IOException;

import com.sudeep.input.Print;
import com.sudeep.input.Scan;

public class PositiveandNegativeElements {

	public static void main(String[] args) throws IOException {
		Print print = new Print();
		Scan scan = new Scan();
		
		int T = scan.scanInt();
		for(int tc = 0; tc<T;tc++) {
			int n  = scan.scanInt();
			int arr[] = new int[n];
			int oddindex = 1;
			int evenIdex = 0;
			for(int i =0 ; i <n; i++) {
				int num = scan.scanInt();
				if(num >0) {
					arr[evenIdex] = num;
					evenIdex += 2;
				}
				else {
					arr[oddindex] = num;
					oddindex += 2;
				}
			}
			for(int i =0; i <n; i++) {
				print.print(arr[i]+" ");
			}
			print.printLine("");
				
		}
		print.close();

	}

}
