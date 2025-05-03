import java.util.*;
public class IncomeTAX {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the income : ");
		float income =sc.nextFloat();
		if(income< 50000) {
			System.out.println("No Tax");
		}
		
		else if(income<=100000) {
			System.out.println("TAX : "+(income*0.1));
		}
             
		else {
			System.out.println("TAX : "+(income*0.2));
		}
	}

}
