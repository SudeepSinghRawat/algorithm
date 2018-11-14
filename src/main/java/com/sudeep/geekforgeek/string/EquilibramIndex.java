package com.sudeep.geekforgeek.string;

public class EquilibramIndex {

	public static void main(String[] args) {
		int arr[]  = {-1,3,5,-2,-4};
		
		int res[] =  new int[arr.length];
		
		
		
		int sum = 0;
		for(int i = 0 ; i <arr.length; i++) {
			sum += arr[i];
			res[i] = sum;
			
		}
		
		for(int i : res) {
			System.out.print(i+ " ");
			
		}
		System.out.println();
		
		boolean status = false;
		int index = -1;
		for(int i = 1 ; i < arr.length-1;i++) {
			System.out.println(res[i-1] + " " +  res[arr.length-1] +" "+res[i] );
			if(res[i-1] == (res[arr.length-1]- res[i])) {
				status = true;
				index = i;
				break;
			}
		}
		
		System.out.println(index);
				
		 
		 //2nd approch with left sum with right sum , calculate the sum in for loop
		

	}

}
