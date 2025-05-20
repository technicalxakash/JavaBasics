package www.practice.comm;
public class PrimeNumbersssss {

	public static void main(String[] args) {
		
		int a =89;
		boolean isprime=true;
		for(int i=2;i<=a;i++) {
			
			if(i%a==0 && i%2==0) {
				isprime=false;
				break;
			}
			
				}
		if(isprime) System.out.println("it is a  prime");
		else System.out.println("it is a  not  prime");

	}
		}

	


