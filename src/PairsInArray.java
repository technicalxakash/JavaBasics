
public class PairsInArray {

	public static void main(String[] args) {
		int[] a= {5,2,3,4,1,6,7};
		int sum=10;
		
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length;j++) {
				if((i+j)==sum) {
					System.out.println(i+" "+j);
				}
			}
		}

	}

}
