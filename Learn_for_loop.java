package Learn_loops;

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
		/*
		 * i=0
		 * j=0;0<=0 ==> *
		 * j=1;1<=0 ==> false
		 * 
		 * i=1
		 * j=0;0<=1 ==> *
		 * j=1;1<=1 ==> * * 
		 * j=2;2<=1 ==> false 
		 * 
		 * i=2
		 * j=0;0<=2 ==> *
		 * j=1;1<=2 ==> * * 
		 * j=2;2<=2 ==> * * *  
		 * j=3;3<=2 ==> false
		 * 
		 * i=3
		 * j=0;0<=3 ==> *
		 * j=1;1<=3 ==> * * 
		 * j=2;2<=3 ==> * * *  
		 * j=3;3<=3 ==> * * * * 
		 * j=4;4<=3 ==> false
		 * 
		 * i=4
		 * j=0;0<=4 ==> *
		 * j=1;1<=4 ==> * * 
		 * j=2;2<=4 ==> * * *  
		 * j=3;3<=4 ==> * * * * 
		 * j=4;4<=4 ==> * * * * * 
		 * j=5;5<=4 ==> false
		 * 
		 * i=5 => 5<=4 => false
		 * 
		 *  
		 */
		
		
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
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
