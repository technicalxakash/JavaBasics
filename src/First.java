import java.util.Scanner;

public class First {

	public static void main(String[] args) {
//		System.out.print("Hello");
//		System.out.print("Hiii");
//		System.out.print("Hel");
		
//		System.out.println("*****");
//		System.out.println("****");
//		System.out.println("***");
//		System.out.println("**");
//		System.out.println("*");
		
//		int a=10,b=10;
//		System.out.print(a+b);
         
//     String a,b;
//     a="akash";
//     b="indians";
//     System.out.println(a+b);
      
		
             //datatypes
		//byte,short,int,long,float,double,char,boolean
		
		/*
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the value of a:");
		int a=sc.nextInt();
		System.out.print("Enter the value of b:");
		int b=sc.nextInt();
		System.out.println("The value of a and b when we do addition is : "+(a+b));
		
		
		output=Enter the value of a:10
				Enter the value of b:12
				The value of a and b when we do addition is : 22
	
		
		
		int a,b;
		System.out.println("Enter the value od a and b : ");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("The value of a and b when we do addition is : "+(a+b));
		
		int a,b;
		System.out.println("Enter the value od a and b : ");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("The value of a and b when we do addition is : "+(a*b));
		
		output=Enter the value od a and b : 
			10 20
			The value of a and b when we do addition is : 200
			
		
		
		//Area of circle
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the value of pie : ");
		float pie=sc.nextFloat();
		System.out.print("Enter the value of r : ");
		int r =sc.nextInt();
		double area= pie*(r*r);
		System.out.print("the area of circle is :"+area);
		
		output=Enter the value of pie : 3.14
				Enter the value of r : 12
				the area of circle is :452.1600036621094
				
				
				
				
		
		
	//1)arthematic operator=>+,-,*,/,%;
	//2)unary operators=+,=,--,++;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the value of a:");
		int a=sc.nextInt();
		System.out.print("Enter the value of b:");
		int b=sc.nextInt();
		System.out.println("The value of a : "+(++a));
		System.out.println("The value of b : "+(++b));
	//3)Relation Operator=>==,!=,>,<,>=,<=
		//returns boolean
		
			
		int num=10,num2=20;
		boolean isequal= num==num2;
		System.out.println(isequal);
		boolean isNotequal= num!=num2;
		System.out.println(isNotequal);
		boolean isGreater= num<num2;
		System.out.println(isGreater);
		
		false
		true
		true
		
		//4)Logical operator=> &&(Logical AND),||(Logical OR),!(Logical NOT)
		
		boolean con1=true ,cond2=false;
		boolean LogiANd=con1 && cond2;
		System.out.println(LogiANd);
		boolean Logior=con1 || cond2;
		System.out.println(Logior);
		boolean LogiNot=!cond2;
		System.out.println(LogiNot);
		false
		true
		true
	
		
		//5)Assigment operators=>+=,-=,/=,%=
		
		
		//type conversion
		
		1)implicit type conversion
        2)Explicit Type conversion
        */
		Scanner sc=new Scanner(System.in);
		float a,b;
		System.out.println("Enter the value od a and b : ");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("The value of a and b when we do addition is : "+(int)(a+b));
	}

}
