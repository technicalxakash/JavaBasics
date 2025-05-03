
public class ReverseANumber {

	public static void main(String[] args) {
		
		int num=123;
		
		int revNum=0;
		int lastdigit=0;
		while(num>0) {
			lastdigit=num%10;
			revNum=revNum*10+lastdigit;
			num=num/10;
		}
		System.out.println(revNum);

	}

}
