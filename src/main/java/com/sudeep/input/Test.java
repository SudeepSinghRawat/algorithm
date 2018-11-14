package com.sudeep.input;

public class Test {

	public static void main(String[] args) {
		int n = 1;
//		System.out.println(n%10);
//		System.out.println(n/10);
		
		while(n>0) {
			System.out.println(n%10);
			n /= 10;
		}
	}

}
