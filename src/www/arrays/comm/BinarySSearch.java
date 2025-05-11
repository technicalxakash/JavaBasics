package www.arrays.comm;

import java.util.Arrays;

public class BinarySSearch {

	public static void main(String[] args) {
//		int arr[]= {2,1,3,45,4,25};
//		Arrays.sort(arr);
//		System.out.println(Arrays.toString(arr));
//		int key=45;
//		int low=0;
//		int high=arr.length-1;
//		boolean found=false;
//		while(low<=high) {
//
//			int mid=(low+high)/2;
//
//			if(key==arr[mid]) {
//				System.out.println(mid);
//				found=true;	 
//				break;
//			}
//			else if(key<arr[mid]) {
//				high=mid-1;
//
//			}
//			else if(key>arr[mid]) {
//				low=mid+1;
//
//			}
//
//		}
//
//		if (!found) {
//			System.out.println("Key not found.");
//
//		}

		int[] arr= {1,2,32,11,22,342,121,413,344,231};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		int key=121;
		
		int low=0;
		int high=arr.length-1;
		while(low<=high) {

			int mid=(low+high)/2;
		if(key==arr[mid]) {
			System.out.println(mid);
			break;
		}
		else if(key<arr[mid]) {
			high=mid-1;
		
		}
		else if(key>arr[mid]) {
			low=mid+1;
		
		}
		}

	}
}
