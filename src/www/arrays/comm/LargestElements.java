package www.arrays.comm;

public class LargestElements {

	public static void main(String[] args) {
		int [] a= {1,2,3,4,11,23,53,34};
//		for(int i=0;i<a.length-1;i++) {
//			if(a[i]>a[i+1]) {
//				System.out.println(a[i]);
//			}
//		}
		
		int max=Integer.MIN_VALUE;
		for(int i=0;i<a.length-1;i++) {
			int cur_elem=a[i];
			if(cur_elem>max) {
				System.out.println(a[i]);
			}
		}

	}

}
