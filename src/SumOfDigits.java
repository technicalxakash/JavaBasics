import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=123;
		int sum=0;
		int lastdigit = 0;
		
		/*  //logic
		lastdigit=num%10;
		sum=sum+lastdigit;
		
		num=num/10;
		lastdigit=num%10;
		sum=sum+lastdigit;
		
		num=num/10;
		lastdigit=num%10;
		sum=sum+lastdigit;
		System.out.println(sum);
		
         */
		
		while(num>0) {
			
			lastdigit=num%10;
			sum=sum+lastdigit;	
			num=num/10;
			
			
		}
		System.out.println(sum);
	}

}
