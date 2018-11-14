package com.sudeep.geekforgeek.arrays;

import java.util.HashMap;
import java.util.Scanner;

public class Subarray {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int T = input.nextInt();
		
		for(int tc = 0; tc<T; tc++) {
			int n  = input.nextInt();
			int arr[] = new int[n];
			boolean status = false;
			for(int i =0; i <n; i++ ) {
				arr[i] = input.nextInt();
			}
			HashMap< Integer, Integer> val = new  HashMap<Integer, Integer>();
			int sum = 0;
			for(int i = 0; i< n; i++) {
				sum += arr[i];
				System.out.println(sum);
				if(sum == 0 || arr[i] == 0 || val.get(sum) != null) {
					System.out.println("im here");
					status = true;
					break;
				}
				val.put(sum, i);
			}
			if(status) {
				System.out.println("Yes");
			}
			else {
				System.out.println("No");
			}
			
		}

	}

}
