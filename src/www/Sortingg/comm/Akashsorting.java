package www.Sortingg.comm;

import java.util.Arrays;

public class Akashsorting {

	public static void main(String[] args) {
		int[] a= {5,3,4,2,1};
		for(int i=0;i<a.length-1;i++) {
			for(int j=0;j<a.length-1;j++) {
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		
		}
		System.out.println(Arrays.toString(a));
	}

}
