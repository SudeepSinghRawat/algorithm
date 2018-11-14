package com.sudeep.geekforgeek.seraching;

public class CountRepeatedvalued {

	public static void main(String[] args) {
		
		approch();
		/*int arr[] = { 5, 10, 10, 10, 10, 15, 15, 15, 20 };

		int search = 10;

		int total = 0;

		int start = 0;
		int last = arr.length - 1;
		int mid = (start + last) / 2;

		while (last >= start) {
			
			System.out.println(start+ " "+ mid + " "+ last);
			
			if (search == arr[mid]) {
				for (int i = mid; i < arr.length - 1; i++) {
					System.out.println(start+ " +  "+ mid + " "+ last + " "+ arr[i]);
					if (arr[i] == search) {
						total++;
					} else {
						break;
					}
				}

				for (int i = mid-1; i >= 0; i--) {
					System.out.println(start+ " - "+ mid + " "+ last+ " "+ arr[i]);
					if (arr[i] == search) {
						total++;
					} else {
						break;
					}
				}
				break;
			}

			else if (search > arr[mid]) {
				start = mid + 1;
			} else {
				last = mid - 1;
			}
			mid = (last + start) / 2;
		}
		
		System.out.println(total);
*/
	}
	
	public static void approch() {
		int arr[] = { 5, 10,10,10, 10, 10, 10, 15, 15, 15, 20 };

		int search = 10;
		int firstIndex =  findFirst(arr, search);
		System.out.println(firstIndex);
	}

	private static int findFirst(int arr[], int search) {
		int start = 0;
		int end = arr.length-1;
		
		while(end >=  start) {
			int mid = (start+end)/ 2;
			System.out.println(start+ "  "+ mid + " "+ end + " value :"+ arr[mid]);
			if((mid == 0 || search> arr[mid-1]) && arr[mid] == search) {
				return mid;
			}
			else if(arr[mid]> search) {
				start = mid+1;
			}
			else {
				end = mid-1;
			}
		}
		return -1;
	}

}
