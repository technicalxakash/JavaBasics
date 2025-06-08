package www.programs.comm;

import java.util.Scanner;

public class PrimeNumberss {

	public static boolean isprime(int num) {
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
				return false;
			}
	}
		return true;
	}
	public static void main(String[] args) {
		

		int num=13;
		if(isprime(num)) {
			System.out.println(num+" it is a prime number");
			}
		else {
			System.out.println(num+" it is not a prime number");
		}
		
		}
		
	}

