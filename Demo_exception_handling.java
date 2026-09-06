package Exception_demo;

public class Demo_exception_handling {
	
	
	public static void demo() throws ArithmeticException, StringIndexOutOfBoundsException {
		int age=12;
		if(age < 18) {
			throw new StringIndexOutOfBoundsException("You are not eligible for Vote..");
		}
		System.out.println("Eligible for Vote");
		
		
//		int a=10;
//		int b=0;
//		System.out.println("Add : "+(a+b));
//		System.out.println("Sub : "+(a-b));
//		System.out.println("Division : "+(a/b));
//		
//		String name = "Praveen";
//		System.out.println(name.charAt(16));
	}
	
	
	public static void main(String[] args) {
		
//		Syntax of try-catch
//		try {
//			//block of code
//		}
//		catch (Exception e) {
//			//System.out.println(e);
//		}
		
//		try {
//			int a=10;
//			int b=0;
//			System.out.println("Add : "+(a+b));
//			System.out.println("Sub : "+(a-b));
//			System.out.println("Division : "+(a/b));
//		}
//		catch (Exception e) {
//			System.out.println(e);
//		}
		
		
//		try {
//			int ar[] = {10,20,30,40};
//			System.out.println(ar[0]);
//			System.out.println(ar[1]);
//			System.out.println(ar[2]);
//			System.out.println(ar[3]);
//			System.out.println(ar[4]);
//		}
//		catch (Exception e) {
//			System.out.println(e);
//		}
		
//		finnaly
//		try {
//			String name = "Praveen";
//			System.out.println(name.charAt(16));
//		}
//		catch (Exception e) {
//			System.out.println(e);
//		}
//		finally {
//			System.out.println("Code Excecuted...");
//		}
		
		
//		throw
		
//		try {
//			int a=10;
//			int b=2;
//			if(b==0) {
//				throw new ArithmeticException("Zero Not Divisable..");
//			}
//			System.out.println("Add : "+(a+b));
//			System.out.println("Sub : "+(a-b));
//			System.out.println("Division : "+(a/b));
//			
//			int age=12;
//			if(age < 18) {
//				throw new ArithmeticException("You are not eligible for Vote..");
//			}
//			System.out.println("Eligible for Vote");
//		}
//		catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
//		
		
//		try {
//			demo();
//		}
//		
//		catch(Exception e) {
//			System.out.println(e);
//		}
//		
//		demo();
		
		
		
	}
}
