package Learn_jav_Strings;

public class Demo_functions {
	
//	User-Defined functions
	/*
	 * 1.without argument without return function.
	 * 2.with argument without return function
	 * 3.without argument with return function
	 * 4.with argument with return function
	 * 5.Recursive Function
	 * 
	 * Syntax of Function : 
	 * ##############function declaration#######################
	 * public static void function_name(arguments/parameters){
	 * 		//block of code
	 * }
	 * 
	 * #################function call##########################
	 * function_name(argument/parameters values);
	 * 
	 */
	
//	1.without argument without return function.
	public static void fire() {
		System.out.println("Fire Mode is ON...................");
		}
	
//	 2.with argument without return function
	public static void add(int a, int b) {
		int c = a+b;
		System.out.println("Add Value : "+c);
		}
	
//	3.without argument with return function
	public static String Demo() {
		String c = "Meera";
		
		return c;
		
	}
	
	
//	4.with argument with return function
	public static String palindrome(int num) {
		int a = num; // 121  --> 121
		int b = 0;
		int t = a;
		
		while(t>0) {
			int d=t%10; //get the last digit in numbers
			b = b*10+d;
			t = t/10; //remove the last digit in numbers
		}
		
		/*
		 * 121>0
		 * d = 121%10 --> 12.1 -> d=1
		 * b = 0*10+1 -->  b = 1
		 * t = 121/10  -->  t = 12
		 * 
		 * 12>0
		 * d = 12%10 --> 1.2 -> d=2
		 * b = 1*10+2 -->  b = 12
		 * t = 12/10  -->  t = 1
		 * 
		 *  1>0
		 * d = 1%10 --> 0.1 -> d=1
		 * b = 12*10+1 -->  b = 121
		 * t = 1/10  -->  t = 0
		 * 
		 * t = 0
		 * 0>0 => false
		 * 
		 */
		
		if(b == a) {
			return b+" is a Plaindrome";
		}
		else {
			return b+" is Not a Plaindrome";
		}	
	}
	
	
//	Recursive Function
	public static int fact(int n){
		if(n==1 || n==0) {
			return 1;
		}
		else {
			return n*fact(n-1);
		}
	}
	
	/*
	 * n = 5
	 * 5*fact(4) --> 5*
	 * 4*fact(3) --> 5*4* = 20*
	 * 3*fact(2) --> 20*3* = 60*
	 * 2*fact(1) --> 60*2* = 120*
	 * => 120*1  => 120..
	 */

	public static void main(String[] args) {
		
//		fire();
//		System.out.println("Hema");
//		fire();
		
//		add(5,100);
//		add(5,50);
		
//		System.out.println(Demo());
//		String name = Demo();
//		System.out.println(name);
		
//		System.out.println(palindrome(153));
		
		
		int f = fact(5);
		System.out.println("Factorial Value : "+f);

	}

}
