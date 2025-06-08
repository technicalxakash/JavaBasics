package Arrays2D;

public class SpiralMatrix {

	public static void main(String[] args) {
		int count=1;
		int[][] myarr=new int[4][4];
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				myarr[i][j]=count++;
			}
		}	
		for(int i=0;i<4;i++) {
		for(int j=0;j<4;j++) {
			System.out.print(myarr[i][j]+" ");
		}
		System.out.println();
	}
int startrow=0;
int startcol=0;
int endrow=myarr.length-1;
int endcol=myarr[0].length-1;

while(startcol<=endcol && startrow<=endrow) {

for(int top=startcol;top<=endcol;top++) {
	System.out.print(myarr[startrow][top]+" ");

}
for(int right=startrow+1;right<=endrow;right++) {
	System.out.print(myarr[right][endcol]+" ");
}

for(int bottom=endcol-1;bottom>=startcol;bottom--) {
	System.out.print(myarr[endrow][bottom]+" ");
	
}

for(int left=endrow-1;left>=startrow+1;left--) {
	System.out.print(myarr[left][startcol]+" ");
}

startcol++;
endcol--;
startrow++;
endrow--;
}
		
	}

}
