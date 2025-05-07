import java.util.Scanner;

public class ArmStrongNumbers {

	public static void main(String[] args) {
//		int num=123;
//		int sum=0;
//		int lastDigit=0;
		
		//logic
//		lastDigit=num%10;
//		lastDigit=lastDigit*lastDigit*lastDigit;
//		sum=sum+lastDigit;
//		
//		num=num/10;
//		lastDigit=num%10;
//		lastDigit=lastDigit*lastDigit*lastDigit;
//		sum=sum+lastDigit;
//		
//		
//		num=num/10;
//		lastDigit=num%10;
//		lastDigit=lastDigit*lastDigit*lastDigit;
//		sum=sum+lastDigit;
//		System.out.println(sum);
		
		

		//armstrong with static input
//		while(num>0) {
//			lastDigit=num%10;
//			lastDigit=(int) Math.pow(lastDigit, 3);
//			sum=sum+lastDigit;
//			num=num/10;
//	
//		}
//		System.out.println(sum);
		
		
		
		//with dynamic input
//		Scanner sc=new Scanner(System.in);
//		System.out.print("Enter the numbers : ");
//    int num=sc.nextInt();
//    int temp=num;
//	int	lastDigit=0;
//	int count=0;
//	int sum=0;
//		
//	
//	while(temp>0) {
//		lastDigit=num%10;
//		count=count+1;	
//		temp=temp/10;
//	}
//	System.out.println("the number count is "+count);
//	int power=count;
//	temp=num;
//			while(temp>0) {
//				
//			lastDigit=temp%10;
//			
//				lastDigit=(int) Math.pow(lastDigit,power);
//				sum=sum+lastDigit;
//				temp=temp/10;
//
//			}
//
// System.out.println("Armstrong numbers are : "+sum);
//
//	}
//
//}
		
		int lastdigit=0;
		int sum=0;
	  int num=1234;
	  while(num>0) {
	  lastdigit=num%10;
	  lastdigit=(int) Math.pow(lastdigit, 4);
	  sum=sum+lastdigit;
	  num=num/10;
	  }
	  System.out.println(sum);
	}}
