package com.sudeep.geekforgeek.arrays;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.sudeep.input.Print;
import com.sudeep.input.Scan;

public class Countsubarrayswithequalnumber {

	public static void main(String[] args) throws IOException {
		
		approch2();
		
		/*Print print = new Print();
		Scan scan = new Scan();
		
		int T = scan.scanInt();
		for(int tc = 0; tc<T; tc++) {
			int n  = scan.scanInt();
			int countZero = 0;
			int countOne = 0;
			Map<Integer, Map<Integer, Integer>> couting = new HashMap<Integer, Map<Integer, Integer>>();
			for (int i = 0; i < n; i++) {
				int num = scan.scanInt();
				if (num == 0) {
					countZero++;
				} else {
					countOne++;
				}
				Map<Integer, Integer> val = new HashMap<Integer, Integer>();
				val.put(countZero, countOne);
				couting.put(i, val);
			}
			//System.out.println(couting);
			int totalValue = 0;

			for (int i = 0; i < couting.size(); i++) {
				Map<Integer, Integer> subValue = couting.get(i);
				int subIZero = (Integer) subValue.keySet().toArray()[0];
				int subIOne = subValue.get(subIZero);
				for (int j = i + 1; j < couting.size(); j++) {
					subValue = couting.get(j);
					int subJZero = (Integer) subValue.keySet().toArray()[0];
					int subJOne = subValue.get(subJZero);

					if (subIZero != subIOne && subJZero != subJOne) {
						// System.out.println(i + " outerCondtion "+j);
						if (subJZero - subIZero == subJOne - subIOne) {
							//System.out.println(i + " InnerCondition " + j);
							totalValue++;
						}
					}
				}
				if(subIOne == subIZero) {
					totalValue += subIOne;
				}

			}
			print.printLine(totalValue+"");
			
			
		}
		print.close();*/
		
		/*
		 * int totalSubArray = 0; int size = couting.size(); for(int i = 0; i <size;
		 * i++) { for(int j = 1; j < size;j++) { int firstCountZero =
		 * couting.get(i).get(0);
		 * 
		 * } }
		 */

	}
	public static void approch2() {
		int arr[] = {1,0,0,1,0,1,1};
		int n = 7;
		Map<Integer, Integer> allVal = new HashMap<Integer, Integer>();
		
		int sum = 0;
		for(int i = 0; i <n; i++) {
			sum += arr[i] ==0 ? -1 : arr[i];
			allVal.put(i, sum);
		}
		System.out.println(allVal);
	}

}
