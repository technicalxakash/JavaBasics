package www.Sortingg.comm;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSoort {

	public static void main(String[] args) {
		
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the size of an array : ");
			int n=sc.nextInt();
			int[] a=new int[n];
			System.out.println("enter the array elements : ");
			for(int i=0;i<a.length;i++) {
				a[i]=sc.nextInt();
			}
			
			for(int i=0;i<a.length-1;i++) {
				
				for(int j=0;j<a.length-i-1;j++) {
					if(a[j]>a[j+1]) {
						int temp=a[j];
						a[j]=a[j+1];
						a[j+1]=temp;
						
					}
				}
			}
			System.out.print("[");
			for(Integer i:a) {
			
				System.out.print(i);
               if(i != a.length) {
            	   System.out.print(",");
            	   
               }
               
			}
			System.out.print("]");
	}

}

//output=enter the size of an array : 
//	5
//	enter the array elements : 
//	3
//	2
//	4
//	1
//	5
//	[1,2,3,4,5]




