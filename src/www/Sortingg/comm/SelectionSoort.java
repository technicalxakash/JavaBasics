package www.Sortingg.comm;

import java.util.Scanner;

public class SelectionSoort {

	static void selection(int[] a) {
   for(int i=0;i<a.length-1;i++) {
			
			int min_i=i;
			for(int j=i+1;j<a.length;j++) {
				if(a[j]<a[min_i]) {
					min_i=j;
				}

			}
			
			int temp=a[i];
			a[i]=a[min_i];
			a[min_i]=temp;
	}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the size of an array :");
		int n=sc.nextInt();
		int [] a=new int[n];
		
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		
		selection(a);
		for(Integer i:a) {
			System.out.println(i);
		}
		
	}

}
