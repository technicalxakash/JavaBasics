package www.practice.comm;

public class COuntNoOfDigits {

	public static void main(String[] args) {
         
	int count=0;
	int lastdigit=0;
		int num=123;
		
		while(num>0) {
			lastdigit=num%10;
			count=count+1;
			num=num/10;
			
		}
		System.out.println(count);

	}

}
