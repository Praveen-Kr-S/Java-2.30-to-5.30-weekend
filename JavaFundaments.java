package Learn_Java;

public class JavaFundaments {

	public static void main(String[] args) {
//		variables
//		data-type variable_name = data;
		/*
		String name = "Nisha";
		int AGE = 2;
		String City = "Salem";
		int max_value = 100;
		String p2hone1 = "7894561236";
		
		System.out.println(name);
		System.out.println(AGE);
		System.out.println(City);
		System.out.println(max_value);
		System.out.println(p2hone1);
	*/
		
//		Keywords in java
		
//		it have 52 keywords in java
		
		
		
//		Datatypes
		
		/*
		boolean check = true; // false
		System.out.println(check);
		
		char c = '@';
		System.out.println(c);
		
		//integer
		byte b = 127;
		System.out.println("byte : "+b);
		
		short s = 32767;
		System.out.println("short : "+s);
		
		int i = 298652417;
		System.out.println("int : "+i);
		
		long l  = 32767748;
		System.out.println("long : "+l);
		
		
//		floting-point
		float f = 34.4564764f;
		System.out.println("float :"+f);
		
		double d = 34.456476486886;
		System.out.println("double :"+d);
		*/
		
//		Type Casing
//		1.widening -> lower to higher data-type
		/*
		byte b1 = 120;
		System.out.println("byte : "+b1);
		short s1 = b1;
		System.out.println("short : "+s1);
		*/
//		2.Narrowing -> higher to lower data-type
//		short s2 = 130;
//		System.out.println("short : "+s2);
//		byte b2 = (byte) s2;
//		System.out.println("byte : "+b2);
		
		
//		Arithmetic Operators
		/*
		int a = 10;
		int b = 2;
		System.out.println(a+b);
		System.out.println(a-b);
		int c = a*b;
		System.out.println(c);
		System.out.println(a/b);
		System.out.println(a%b);
		*/
		
//		Assignment operator
		/*
		int a = 10;
		System.out.println(a);
		a+=5;
		System.out.println(a);
		a-=7;
		System.out.println(a);
		a*=5;
		System.out.println(a);
		a/=5;
		System.out.println(a);
		a%=3;
		System.out.println(a);
		
		
		// assignment tasks
//		1. ac balance maintance
		
		int balance = 25000;
		System.out.println("Total Balance : "+balance);
		// debit = 3000
		balance-=3000;
		System.out.println("Remaining Blanace :"+balance);
		// credit = 13000
		balance+=13000;
		System.out.println("Remaining Blanace :"+balance);
		*/
		
		
//		Logical Operator
//		&& - and, || - or, !() - not
		/*
		int a = 10;
		int b = 20;
		int c = 10;
		System.out.println(a==c && a!=b && b <= c);
		System.out.println(a!=c || a==b || b >= c);
		System.out.println(!(a!=c || a==b || b <= c));
		*/
		
//		Arithmetic tasks
//		1.find average of 3 numbers
		
		int num1 = 30;
		int num2 = 40;
		int num3 = 20;
		
		double average_value = (num1+num2+num3)/3;
		
		System.out.println("average_value :"+average_value);
		
//		2.find area of circle
//		pi*(r*r)
		double pi = 3.14;
		int r = 40;
		
		double area_of_circle = pi*(r*r);
		
		System.out.println("area_of_circle :"+area_of_circle);	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
