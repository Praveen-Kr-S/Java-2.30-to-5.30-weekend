package Learn_loops;

import java.util.Scanner;

public class Learn_for_loop {
	
	public static void main(String[] args) {
//		
//		Syntax of for loop
//					1					2				4
//		for (variable initialization; condition; update-inc,dec){
//					3
//		    // Code block to be executed
//		}
		
//		1.for increment
		
//		for(int i=1;i<=50;i++) {
//			System.out.println(i+" Poorna");
//		}
//		
		//1<=5-true --> 1
		//2<=5-true --> 2
		//3<=5-true --> 3
		//4<=5-true --> 4
		//5<=5-true --> 5
		//6<=5-false
		
//		2.for decrement
//		for(int i=10;i>5;i--) {
//			System.out.println(i+" Poorna");
//		}
		
//		3.infinite for loop
		
//		for(int i=10;i>=5;i++) {
//			System.out.println(i+" Poorna");
//		}
		
//		Nested for loop
		/*
		 * 
		 * for (variable initialization; condition; update-inc,dec){
		 * 		for (variable initialization; condition; update-inc,dec){
		 * 			// Code block to be executed
		 * 		}
		 * }
		 * 
		 */
		
		
		/*
		//square pattern
		for(int i=0;i<=4;i++) {
			for(int j=0; j<=4;j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		
		System.out.println("*******************");
		
		//increment pattern/ half pyramid
				for(int i=0;i<=4;i++) {
					for(int j=0; j<=i;j++) {
						System.out.print(i+" ");
					}
					System.out.println();
				}
				
		System.out.println("*******************");
		
//		 * i=0
//		 * j=0;0<=0 ==> *
//		 * j=1;1<=0 ==> false
//		 * 
//		 * i=1
//		 * j=0;0<=1 ==> *
//		 * j=1;1<=1 ==> * * 
//		 * j=2;2<=1 ==> false 
//		 * 
//		 * i=2
//		 * j=0;0<=2 ==> *
//		 * j=1;1<=2 ==> * * 
//		 * j=2;2<=2 ==> * * *  
//		 * j=3;3<=2 ==> false
//		 * 
//		 * i=3
//		 * j=0;0<=3 ==> *
//		 * j=1;1<=3 ==> * * 
//		 * j=2;2<=3 ==> * * *  
//		 * j=3;3<=3 ==> * * * * 
//		 * j=4;4<=3 ==> false
//		 * 
//		 * i=4
//		 * j=0;0<=4 ==> *
//		 * j=1;1<=4 ==> * * 
//		 * j=2;2<=4 ==> * * *  
//		 * j=3;3<=4 ==> * * * * 
//		 * j=4;4<=4 ==> * * * * * 
//		 * j=5;5<=4 ==> false
//		 * 
//		 * i=5 => 5<=4 => false
//		 * 
//		 *  
		 
		
		
		//decrement pattern/ Inverted half pyramid
		for(int i=0;i<=4;i++) {
			for(int j=4; j>=i;j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		System.out.println("*******************");
		
		//Full Pyramid
		for(int i=0;i<=4;i++) {
			
			for(int j=4; j>=i;j--) {
				System.out.print(" "+" ");
			}
			
			for(int j=0; j<=i;j++) {
				System.out.print(i+" ");
			}
			
			for(int j=0; j<=i-1;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println("*******************");
		
		
//		Hollow Pattern-->Square
		System.out.println("*****i value square*****");
		for(int i=0;i<=4;i++) {
			for(int j=0; j<=4;j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
		System.out.println("*****j value square*****");
		
		for(int i=0;i<=4;i++) {
			for(int j=0; j<=4;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		System.out.println("*******************");
//		1.Hollow square
		for(int i=0;i<=4;i++) {
			for(int j=0; j<=4;j++) {
				if(i==0 || i==4 || j==0 || j==4) {
					System.out.print("*"+" ");
				}
				else {
					System.out.print(" "+" ");
				}
				
			}
			System.out.println();
		}
		
		System.out.println("*******************");
//		2.Plus square
		for(int i=0;i<=4;i++) {
			for(int j=0; j<=4;j++) {
				if(i==2 || j==2) {
					System.out.print("*"+" ");
				}
				else {
					System.out.print(" "+" ");
				}
				
			}
			System.out.println();
		}
		System.out.println("*******************");
//		cross-pattern
		
		for(int i=0;i<=4;i++) {
			for(int j=0; j<=4;j++) {
				if(i==j || i+j == 4) {
					System.out.print("*"+" ");
				}
				else {
					System.out.print(" "+" ");
				}	
			}
			System.out.println();
		}
		*/
		
		
//		while loop
		
		/*
		 * Syntax of while loop
		 * 
		 * step-1
		 * variable initialization
		 * 
		 * step-2
		 * while(condition){
		 * 
		 * 		step-3
		 * 		//block of code 
		 * 
		 * 		step-4
		 * 		inc/dec
		 * }
		 */
		
//		1.while increment
//		int i = 1;
//		while(i<=5) {
//			System.out.println(i);
//			i++;
//		}
		
		System.out.println("*******************");
//		2.while decrement
//		i = 10;
//		while(i>=6) {
//			System.out.println(i);
//			i--;
//		}	
		
		System.out.println("*******************");
//		3.Infinity while loop
		
//		type-1(condition is true)
//		i = 10;
//		while(true) {
//			System.out.println(i);
//			i--;
//		}			
//		
		
//		type-2(inc/dec)
//		i = 10;
//		while(i>=6) {
//			System.out.println(i);
//			i++;
//		}
		
		
		
		
//		do-while loop
		
		/*
		 * do{
		 * 		step-1
		 * 		variable initialization
		 * 		step-2
		 * 		block of code
		 * 		step-3
		 * 		inc/dec
		 * 
		 * 		step-4
		 * } while(condition)
		 */
		
//		int j = 1;
//		do{
//			System.out.println(j);
//			j++;
//		}while(j<=5);
		
		
//		Jumping & Transfer Statements - break,continue
//		1.break
//		int i = 1;
//		while(i<=5) {
//			
//			if(i == 3) {
//				break;
//			}
//			System.out.println(i);
//			i++;
//		}
		
//		2.continue
		
//		for(i = 1;i<=10;i++) {
//			if(i == 6 || i==3) {
//				continue;
//			}
//			else {
//				System.out.println(i);
//			}
//		}
		
		
		
		
//		for loop
		
//		1.factorial
		
		/*
		 * 5-->5*4*3*2*1 => 120
		 */
		
		Scanner scan = new Scanner(System.in);
//		System.out.print("Enter Value : ");
//		int v = scan.nextInt();
//		int f = 1;
//		for(int i = 1; i <= v;i++) {
//			f=f*i;
//		}
//		System.out.println(v+" Factorial Value : "+f);
		/*
		 * v=5
		 * f=1*1 = 1
		 * f=1*2 = 2
		 * f=2*3 = 6
		 * f=6*4 = 24
		 * f=24*5 = 120
		 */
		
//		Fibonacci Series -> 0,1
		/*
		 * 0+1=1=2=3=5=8=13
		 */
		
//		int n1=0;
//		int n2=1;
//		for(int i=1;i<=6;i++) {
//			int n3 = n1+n2;
//			System.out.println(n3);
//			n1=n2;
//			n2=n3;
//		}
		
		
		
//	Palindrome
//		153 -> 351 -> not Palindrome
//		121 -> 121 -> Palindrome
		
//		System.out.print("Enter Value : ");
//		int a = scan.nextInt();
//		int b = 0; //store the reverse value 
//		int t = a;
//		
//		while(t>0) {
//			int d = t%10; // get the last digit
//			b=b*10+d; // b+=pow.Math(d,power_value)
//			t=t/10; // remove the last digit
//		}
//		if(b==a) {
//			System.out.println(b+" is Palindrome");
//		}
//		else {
//			System.out.println(b+" is not a Palindrome");
//		}
		
		/*
		 * iteration -> 1
		 * 121>0
		 * d = 121 % 10 -> 1
		 * b = 0*10+1 => 1
		 * t = 121/10 => 12
		 * 
		 * iteration -> 2
		 * 12>0
		 * d = 12 % 10 -> 2
		 * b = 1*10+2 => 12
		 * t = 12/10 => 1
		 * 
		 * iteration -> 3
		 * 1>0
		 * d = 1 % 10 -> 1
		 * b = 12*10+1 => 121
		 * t = 1/10 => 0
		 * 
		 * iteration -> 3
		 * 0>0 -> false
		 */
		
//		153 -> 
		
		
	}
}
