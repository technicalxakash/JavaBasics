import java.util.Scanner;
//ternary operator is a shorthand way of wiriting an if-else statement
//synatx=>(Condition)?(Expression1):(Expression2)
/*
public class TernaryOperator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the num1 : ");
		float num1 =sc.nextFloat();
		System.out.print("Enter the num2 : ");
		float num2 =sc.nextFloat();
		System.out.print("Enter the num3 : ");
		float num3 =sc.nextFloat();
		String largest="";
		
		
		
		largest=(num1>num2 && num1>num3) ? "num1":(num2>num1 && num2>num3)? "num2" :(num3>num1 && num3>num2)? "num3":" ";
		System.out.println(largest);
	}

	
}

public class TernaryOperator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the num1 : ");
		float num1 =sc.nextFloat();
		System.out.print("Enter the num2 : ");
		float num2 =sc.nextFloat();
		System.out.print("Enter the num3 : ");
		float num3 =sc.nextFloat();
		String largest="";
		
		
		
		
		System.out.println((num1>num2 && num1>num3) ? "num1":(num2>num1 && num2>num3)? "num2" :(num3>num1 && num3>num2)? "num3":"all are equal");
	}

	
}
*/
//determine if a student passes or fails based on thier exam score

public class TernaryOperator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the marks : ");
		int marks =sc.nextInt();
		
		String Marrks="";
		
	Marrks=(marks>65)?"pass":"fail";
	System.out.println(Marrks);
	
	}}