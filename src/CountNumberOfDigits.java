
public class CountNumberOfDigits {

	public static void main(String[] args) {
		int num=1234;
		int count=0;
		int lastdigit=0;
	
		//logic
//		lastdigit=num%10;
//		count=count+1;
//		
//		num=num/10;
//		lastdigit=num%10;
//		count=count+1;
//		
//		num=num/10;
//		lastdigit=num%10;
//		count=count+1;
//		
//		num=num/10;
//		lastdigit=num%10;
//		count=count+1;
//		
//		System.out.println(count);
		
		while(num>0) {
			lastdigit=num%10;
			count=count+1;	
			num=num/10;
		}
		System.out.println(count);

	}

}
