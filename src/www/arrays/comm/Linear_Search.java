package www.arrays.comm;

import java.util.Scanner;

public class Linear_Search {

	public static void main(String[] args) {
		//logic
		/*
		int [] arr= {1,2,3,4,5,6,80};
		int n=80;
		for(int i=0;i<arr.length;i++) {
			if(n==arr[i]) {
				System.out.println(i);
			}
		}
		*/
      Scanner sc=new Scanner(System.in);
    		  System.out.print("enter the value of n: ");
      			int	 n = sc.nextInt();
      			System.out.println("enter the arrays elements :");
      			int [] arr=new int[n];
      			for(int i=0;i<arr.length;i++) {
      				arr[i]=sc.nextInt();
    		
      			}	 
      			for(int i=0;i<arr.length;i++) {
      				System.out.println(arr[i]+" ");
      				
    		
      			}	

      			boolean found=false;
      			
      			System.out.println("enter the key element to be searched : ");
      			int key=sc.nextInt();
      			for(int i=0;i<arr.length;i++) {
      				
      				if(key==arr[i]) {
      					System.out.println("the index where key is found in : "+i);
      					found=true;
          				break;
      				}
      				}
      				
      			
      			if(!found) {
      				System.out.println("key not found");
      			}
      			
			
	}

}
