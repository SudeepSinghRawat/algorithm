package com.sudeep.geekforgeek.string;

import java.util.HashSet;
import java.util.Set;

public class SubArrayOfZero {

	public static void main(String[] args) {
		int arr[] = { 6,1,3-4,8,2 };

		int res[] = new int[arr.length];
		Set<Number>  arrarys = new HashSet<Number>();
		int sum = 0;
		int index = -1;
		boolean status = false;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			System.out.println(sum + " "+ arrarys.contains(sum));
			if(arrarys.contains(sum)) {
				status  = true;
				index =  i;
				break;
				
			}
			else {
				arrarys.add(sum);
			}

		}
		
		if(status) {
			System.out.println(index);
		}
		else {
			System.out.println("NO");
		}

	}

}
