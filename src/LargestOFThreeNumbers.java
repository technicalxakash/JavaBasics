import java.util.Scanner;

public class LargestOFThreeNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the num1 : ");
		float num1 =sc.nextFloat();
		System.out.print("Enter the num2 : ");
		float num2 =sc.nextFloat();
		System.out.print("Enter the num3 : ");
		float num3 =sc.nextFloat();
		if(num1>num2 && num1>num3) {
			System.out.println("num1 is greater :"+num1);
		}
		else if(num2>num1 && num2>num3){
			System.out.println("num2 is greater :"+num2);
		}
		 else {
	            System.out.println("num3 is the greatest: " + num3);
	        }
sc.close();
	
	}
}
