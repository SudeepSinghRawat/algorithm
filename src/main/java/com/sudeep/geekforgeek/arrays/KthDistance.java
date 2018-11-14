package com.sudeep.geekforgeek.arrays;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import com.sudeep.input.Print;
import com.sudeep.input.Scan;

public class KthDistance {

	public static void main(String[] args) throws IOException {
		Print print = new Print();
		Scan scan = new Scan();

		int T = scan.scanInt();
		for (int tc = 0; tc < T; tc++) {
			int k = scan.scanInt();
			int n = scan.scanInt();
			int arr[] = new int[n];

			for (int i = 0; i < n; i++) {
				arr[i] = scan.scanInt();

			}
			boolean status = false;
			Set<Integer> set = new HashSet<Integer>();
			for(int i = 0; i<n;i++) {
				if(set.contains(arr[i])) {
					status = true;
					break;
				}
				set.add(arr[i]);
				
				if(i>=k) {
					set.remove(arr[i-k]);
				}
			}
			if(status) {
				print.printLine("True");
			}
			else {
				print.printLine("False");
			}

		}
		print.close();

	}

}
