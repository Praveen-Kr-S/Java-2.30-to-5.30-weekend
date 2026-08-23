package Learn_oopos;

//compile time polymorphism
/*
 * we need single class with same named multiple function
 * we pass the different arguments in every functions
 * --> Argument types -> COUNT,DATA-TYPE
 */
class Calculator{
	void logic(int a,int b) {
			System.out.println("2 Arguments Add Value : "+(a+b));
		}
	
	void logic(int a,int b, int c) {
			System.out.println("Multiple Value : "+(a*b*c));
		}
	
	void logic(int a,String b) {
		System.out.println(a+" "+b);
	}

	void logic(int a,int b, int c, int d) {
		System.out.println("4 Arguments Add Value : "+(a+b+c+d));
		}	
}

// Runtime polymorphism/method overriding.
/* 
 * we multiple class with same functions
 * and inherited the all classes
 * 
 */

class City{
	void name() {
		System.out.println("City Name : Salem");
	}
}

class State extends City{
	void name() {
		super.name();
		System.out.println("State Name : Tamilnadu");
	}
}

class Country extends State{
	void name() {
		super.name();
		System.out.println("Country Name : India");
	}
}

//final

//final  class ss{
//	final int a = 10;
//	final void name() {
//		System.out.println("State Name : Tamilnadu");
//	}
//}
//
//class cc extends ss{
//	void name() {
//		super.name();
//		System.out.println("Country Name : India");
//	}
//}

//Abstraction
//class Data{
//	void details(){
//	System.out.println("Company : Zoho");
//	System.out.println("Team : Java Team");
//	System.out.println("App Name : Zohopay");
//	System.out.println("Sensitive content");
//	}
//}
//
//abstract class Zohopay extends Data{
//	abstract void details();
//	
////	void demo() {
////		System.out.println("Poorna..");
////	}
//
//}
//
//class Vendor extends Zohopay{
//
//	@Override
//	void details() {
//		System.out.println("Company : Zoho");
//		System.out.println("Team : Java Team");
//		System.out.println("App Name : Zohopay");
//	}
//	
//}



//Abstraction using interface method

//interface Zohopay{
//	void details();
//	
//}
//
//class Vendor implements Zohopay{
//	@Override
//	public void details() {
//		System.out.println("Company : Zoho");
//		System.out.println("Team : Java Team");
//		System.out.println("App Name : Zohopay");
//	}
//		
//}

//multiple inheritance

interface aauthor{
	void author_name();
}
interface price{
	void book_price();
}
class ebook implements aauthor,price{
	@Override
	public void book_price() {
		System.out.println("Book Price Rs : 560");	
	}
	@Override
	public void author_name() {
		System.out.println("Author Name : Nisha");	
	}
	public void book_name() {
		System.out.println("Book Name : Learn Java Full Stack");	
	}
} 	


//Encapsulation
/*Access Specifier
 * public --> Anyone Can Access the data.
 * protected --> Access the own class and inherited Child class.
 * private -->  Access only own class.
 */

class Accout_Data{
	public String name = "Poorna";
	protected String ac_no = "12345678123";
	private int pin = 6543;
	
	void show() {
		System.out.println(this.pin);
	}
}

class bank extends Accout_Data {
	void demo() {
		System.out.println(super.name);
		System.out.println(super.ac_no);
//		System.out.println(super.pin);
	}
}






public class Oops_polymorphism {

	public static void main(String[] args) {
		Calculator c = new Calculator();
//		c.logic(30, 40);
//		c.logic(1, "Nisha");
//		c.logic(5, 5, 5);
//		c.logic(10, 20, 40, 100);
		
		
//		Country cc = new Country();
//		cc.name();
		
		
//		Vendor v = new Vendor();
//		v.details();
//		v.demo();
		
		
//		ebook eb = new ebook();
//		eb.book_name();
//		eb.author_name();
//		eb.book_price();
		
//		Accout_Data ac = new Accout_Data();
//		System.out.println(ac.name);
//		System.out.println(ac.ac_no);
//		System.out.println(ac.pin);
		
		bank bb = new bank();
		bb.demo();
		bb.show();
	

	}

}
