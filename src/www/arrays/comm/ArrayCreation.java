package www.arrays.comm;

import java.util.Scanner;

public class ArrayCreation {

	public static void main(String[] args) {

		//int [] array;//decalarartion
		
		//int[] arrayy= new int[size];//intialzations
		
		//int[] arr=new int[10];
		
		//int [] values= {1,2,3,4,5,6};
		
		//values[1]=1;//updation
		
//		for(Integer a:values ) {
//			System.out.println(a); //whole array printing
//		}
		
//		for(int i=0;i<values.length;i++) {
//			System.out.println(values[i]);//whole array printing
//		}
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter the elements of an arrays : ");
//		int[] numbers=new int[5];
//		for(int i=0;i<numbers.length;i++) {
//			 numbers[i]=sc.nextInt();
//			
//		}
//		System.out.println("enter the elements of an arrays are :");
//		for(int i=0;i<numbers.length;i++) {
//			System.out.println(numbers[i]);
//			
//		}
		//call of refernce=changes made to the arryas inside the function affect the original array
		int [] values= {1,2,3,4,5,6};
		arraysChangeValues(values);
		for(Integer i:values) {
			System.out.println(i);
		}
		
		
		
	}
	static void arraysChangeValues(int[] values) {
		
		values[0]=1000;
	}

}
