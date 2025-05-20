package www.practice.comm;

public class ArmstrongNumbers {

	public static void main(String[] args) {

     int num=123;
     int lastdigit=0;
     int count=0;
     int temp=num;
     
     while(num>0) {
    	 lastdigit=num%10;
    	 count=count+1;
    	 num=num/10;
     }
     
          
        
         int sum=0;
		int armnumber=0;
		while(temp>0) {
		     lastdigit=temp%10;
		     armnumber=(int)Math.pow(lastdigit, count);
		     sum=sum+armnumber;
		     temp=temp/10;
		     
}

		System.out.println(sum);
	     
     
	}

}
