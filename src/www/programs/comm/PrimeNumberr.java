//package www.programs.comm;
//
//public class PrimeNumberr {
//
//	public static void main(String[] args) {
//		
//		int number=5;
//		for(int i=2;i<number/2;i++) {
//			if(number%i==0) {
//				System.out.println("it is not a prime number");
//			}
//		}
//  System.out.println("it is a prime number");
//	}
//
//}


//package www.programs.comm;
//
//import java.util.Scanner;
//
//public class PrimeNumberr {
//	
//	static boolean isprime(int n) {
//		
//		for(int i=2;i<=n/2;i++) {
//			if(n%i==0) {
//				return false;
//			}
//		}
//		
//		return true;
//	}
//	
//	public static void main(String[] args) {
//		
//		Scanner sc=new Scanner(System.in);
//		
//		System.out.println("enter the number : ");
//		int n=sc.nextInt();
//		System.out.println(isprime(n));
//}
//	
//
//
//
//}



package www.programs.comm;

import java.util.Scanner;

public class PrimeNumberr {
	
	static boolean isprime(int n) {
		
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				return false;
			}
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		

		 for (int i = 1; i <= 10; i++) {
	            if (isprime(i)) {
	                System.out.println(i);
	            }
	        }
	    }
	}