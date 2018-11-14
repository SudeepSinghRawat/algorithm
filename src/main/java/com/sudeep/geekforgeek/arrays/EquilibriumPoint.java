package com.sudeep.geekforgeek.arrays;

import java.io.IOException;

import com.sudeep.input.Print;
import com.sudeep.input.Scan;

public class EquilibriumPoint {

	public static void main(String[] args) throws IOException {
		Scan scan = new Scan();
		Print print = new Print();

		int T = scan.scanInt();
		for (int tc = 0; tc < T; tc++) {
			int n = scan.scanInt();
			int righSum = 0;
			int arr[] = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = scan.scanInt();
				righSum += arr[i];
			}
			if (n == 1) {
				print.printLine(arr[0] + "");
			} else {
				int leftSum = arr[0];
				int equliibriumPoin = -1;
				for (int i = 1; i < n - 1; i++) {
					if (leftSum == (righSum - arr[i] - leftSum)) {
						equliibriumPoin = i + 1;
						break;
					} else {
						leftSum += arr[i];
					}
				}
				print.printLine(equliibriumPoin + "");
			}

		}
		print.close();

	}

}
