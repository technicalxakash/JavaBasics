package www.Sortingg.comm;

import java.util.Arrays;
import java.util.Scanner;



public class InsertionnSort {


	static void Insertionn(int[] arr) {
		for(int i=1;i<arr.length;i++) {

			int key=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>key) {

				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
		}
	}
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of an array : ");
		int n=sc.nextInt();
		int [] arr=new int[n];

		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();	
		}

		Insertionn(arr);
		for(Integer a:arr) {
			System.out.print(a);
		}

	}


}




