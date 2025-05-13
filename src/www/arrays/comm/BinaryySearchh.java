package www.arrays.comm;

public class BinaryySearchh {

	public static void main(String[] args) {
		int []a= {1,2,3,4,5,6,7,8};
		
		
		int low=0;
		int high=a.length;
		int key=6;
		
		for(int i=0;i<a.length;i++) {
			
			int mid=(low+high)/2;
			if(key==a[mid]) {
				
				System.out.println(mid);
				break;
			}
			
			else if(key<a[mid]) {
				high=mid-1;
				
				
			}
			else {
				low=mid+1;
			}
			
		}
		

	}

}
