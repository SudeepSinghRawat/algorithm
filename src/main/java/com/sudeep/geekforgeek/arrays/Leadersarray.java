package com.sudeep.geekforgeek.arrays;

import java.io.IOException;
import java.util.Stack;

import com.sudeep.input.Print;
import com.sudeep.input.Scan;

public class Leadersarray {

	public static void main(String[] args) throws IOException {
		Scan scan = new Scan();
		Print print = new Print();
		int T  = scan.scanInt();
		for(int  tc= 0 ; tc<T; tc++) {
			int n  = scan.scanInt();
			int arr[] = new int[n];
			for(int i = 0 ; i < n; i++) {
				arr[i] = scan.scanInt();
			}
			int max = arr[n-1];
			Stack<Integer> ans = new Stack<Integer>();
			ans.push(max);
			for(int  i = n-2; i>= 0 ; i--) {
				if(arr[i] >= max) {
					max = arr[i];
					ans.push(max);
				}
			}
			while(ans.isEmpty() == false) {
				//System.out.println(ans.peek());
				print.print(ans.pop()+" ");
			}
			print.printLine("");
			
 		}
		print.close();

	}

}
