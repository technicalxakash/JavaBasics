package www.programs.comm;

public class PrintPrimeNumbers {

	public static boolean  isprime(int num) {
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
			return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		
	 int num=11;
for(int j=2;j<=20;j++) {
	
	if (isprime(j)) {
		System.out.println(j);
	}

}
	}



}
