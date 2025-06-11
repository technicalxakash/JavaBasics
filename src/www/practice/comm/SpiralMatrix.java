package www.practice.comm;

public class SpiralMatrix {

	public static void main(String[] args) {
		int [][] arr=new int[3][3];
		int count=1;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = count++;
            }
        }
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

		
		int startrow=0;
		int startcol=0;
		int endrow=arr.length-1;
		int endcol=arr[0].length-1;
		
		while(startcol<=endcol && startrow<=endrow) {
		for(int top=startcol;top<=endcol;top++) {
			System.out.print(arr[startrow][top]+" ");
		}
		for(int right=startrow+1;right<=endrow;right++) {
			System.out.print(arr[right][endcol]+" ");
		}
	
		for(int bottom=endcol-1;bottom>=startcol;bottom--) {
			System.out.print(arr[endrow][bottom]+" ");
		}
		
		for(int left=endrow-1;left>=startrow+1;left--) {
			System.out.print(arr[left][startcol]+" ");
		}
		
		startrow++;
		startcol++;
		endcol--;
		endrow--;
		
		}
	}
	

}
