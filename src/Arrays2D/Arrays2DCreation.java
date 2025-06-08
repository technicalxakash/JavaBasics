package Arrays2D;

import java.util.Scanner;

public class Arrays2DCreation {

	public static void main(String[] args) {
		
//		int[][] myarr=new int[3][4];
//		for(int i=0;i<3;i++) {
//			for(int j=0;j<4;j++) {
//				myarr[i][j]=1;
//			}
//		}
//		
//		for(int i=0;i<3;i++) {
//			for(int j=0;j<4;j++) {
//				System.out.print(myarr[i][j]+" ");
//			}
//			System.out.println();
//		}
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of n row : ");
		int n=sc.nextInt();
		System.out.println("enter the size of m coloumn : ");
		int m=sc.nextInt();
		int[][] myarr=new int[n][m];
		System.out.println("Enter the array elements");
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				myarr[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				System.out.print(myarr[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
