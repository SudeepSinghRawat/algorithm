package com.sudeep.geekforgeek.string;

public class AnagramNumber {
	public static void main(String[] args) {
		int a = (char) 'a';
		System.out.println(a);
		
		String s1 = "geek";
		String s2 = "ege";
		
		int arr[] = new int[255];
		
		for(int i  = 0 ; i < s1.length(); i++) {
			int index = (int) s1.charAt(i);
			arr[index]++;
		}
		
		for(int  i = 0 ; i <s2.length();i++) {
			int index = (int) s2.charAt(i);
			arr[index]--;
		}
		
		boolean status = true;
		
		for(int  i = 0; i < 255;i++) {
			if(arr[i]!= 0) {
				status = false;
				break;
			}
		}
		
		if(status) {
			System.out.println("Yes");
		}
		else {
			System.out.println("NO");
		}
	}

}
