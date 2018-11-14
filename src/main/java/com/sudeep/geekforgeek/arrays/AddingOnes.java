package com.sudeep.geekforgeek.arrays;

import java.io.IOException;
import java.util.Arrays;

import com.sudeep.input.Print;
import com.sudeep.input.Scan;

public class AddingOnes {

	public static void main(String[] args) throws IOException {
		approch2();

		/*Print print = new Print();
		Scan scan = new Scan();

		int T = scan.scanInt();

		for (int tc = 0; tc < T; tc++) {
			int n = scan.scanInt();
			int k = scan.scanInt();
			int ans[] = new int[n];
			int arr[] = new int[k];

			for (int i = 0; i < k; i++) {
				arr[i] = scan.scanInt();
			}
			Arrays.sort(arr);

			int total = 0;
			int Kindex = 0;
			for (int i = 0; i < n; i++) {
				if (Kindex < k) {
					while (i + 1 == arr[Kindex]) {
						// System.out.println(total);
						total++;
						if (Kindex == k - 1) {
							break;
						} else {
							Kindex++;
						}
					}
				}

				ans[i] = total;
			}
			for (int i : ans) {
				print.print(i + " ");
			}
			print.printLine("");

		}
		print.close();*/

	}
	
	public static void approch2() throws IOException {
		Print print = new Print();
		Scan scan = new Scan();

		int T = scan.scanInt();

		for (int tc = 0; tc < T; tc++) {
			int n = scan.scanInt();
			int k = scan.scanInt();
			int arr[] = new int[n];

			for(int i =0; i <k;i++) {
				int num = scan.scanInt();
				arr[num-1]++;
			}
			print.print(arr[0] + " ");
			for(int i =1 ; i <n;i++) {
				arr[i] = arr[i-1]+arr[i];
				//System.out.println(ans[i-1]+ans[i]);
				print.print(arr[i] + " ");
			}
			print.printLine("");

		}
		print.close();
		
	}

}
