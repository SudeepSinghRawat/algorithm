package com.sudeep.geekforgeek.seraching;

import java.util.Scanner;

public class FloorSortedArray {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int T = input.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int n = input.nextInt();
			int k = input.nextInt();

			int arr[] = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = input.nextInt();
			}
			int start = 0;
			int last = n - 1;

			int indexFound = -1;
			if (k >= arr[0] && k <= arr[n - 1]) {
				while (last >= start) {
					int mid = (start + last) / 2;
					/*
					 * System.out.println(start + " " + mid+ " "+ last + " " +arr[mid] + " "+
					 * arr[mid+1] + " "+k); System.out.println("Conditon 1" + (mid != 0 || mid !=
					 * n-1)); System.out.println("Condition 2" + ((arr[mid]> k && arr[mid+1] < k)));
					 * System.out.println("Condition 3" + ((arr[mid]<k)));
					 * System.out.println("Condition 4" + ((arr[mid+1]> k)));
					 */
					if ((mid != 0 || mid != n - 1) && ((arr[mid] < k && arr[mid + 1] > k) || arr[mid] == k)) {

						indexFound = mid;
						break;
					} else if (k > arr[mid]) {
						start = mid + 1;
					} else {
						last = mid - 1;
					}

				}
			} else if (k > arr[n - 1]) {
				indexFound = n - 1;
			}

			System.out.println(indexFound);

		}
		input.close();

	}

}
