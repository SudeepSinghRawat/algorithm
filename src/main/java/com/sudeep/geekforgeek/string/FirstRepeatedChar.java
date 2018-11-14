package com.sudeep.geekforgeek.string;

public class FirstRepeatedChar {

	public static void main(String[] args) {
		
		String s = "geekforgeeks";
		int arr[] = new int[256];
		
		int res = Integer.MAX_VALUE;
		
		
		for(int i  = 0; i < s.length(); i++) {
			int index = (int)s.charAt(i);
			if(arr[index] == 0 ) {
				arr[index]  = i+1;
			}
			else {
				res = Integer.min(res, arr[index]);
			}
			
		}
		
		System.out.println(res-1);

	}

}
