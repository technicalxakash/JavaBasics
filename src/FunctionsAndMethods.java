
//public class FunctionsAndMethods {
//      int sum=0;
//	void add(int a ,int b) {
//		
//		sum=a+b;
//		System.out.println(sum);
//	}
	
	
//	static int add(int a,int b) {
//		
//		return a+b;
//		//System.out.println(sum);
//	}
	//public static void main(String[] args) {
//		FunctionsAndMethods obj=new FunctionsAndMethods();
//		
//		obj.add(1,2);
     
		
		//add(4,5);
		//System.out.println(add(4,5));
		
		
//	}
//
//}
//		public class FunctionsAndMethods {
//			
//		static int addNum(int x ,int y)	{
//		int a=10;
//		return x+y;	
//		}
//		
//			
//		
//		public static void main(String[] args) {
//			
//			int sum=0;
//			int a=100;
//			int b=200;
//			sum=addNum(a,b);
//			System.out.println(sum);
//		}
//		
//		}
		

//callByValue=doesn,t affect original value = meaning thebvalues of the arugements are passed to the parametrs
//callByReference =affect original value 
public class FunctionsAndMethods {
			
		static void multiply(int a ,int b) {
			a=10;
			b=2000;
		}
		
		public static void main(String[] args) {
			

				int a=20;
				int b=30;
				multiply(a, b);
				System.out.println(a*b);
		}
		
		}
		