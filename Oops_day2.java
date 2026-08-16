package Learn_oopos;

//Single Level Inhertance
//Parent/Super class

class Ebook{
	void fun1() {
		System.out.println("Book Name : Learn Java");
	}
}


//child/sub class
class Author extends Ebook{
	void fun2() {
		System.out.println("Author Name : Pradeep");
	}
}

//Multi-level Inheritance

class battery{
	void fun1() {
		System.out.println("Store The Power");
	}
}

class telephone extends battery{
	void fun2() {
		System.out.println("Call to your Connection");
	}
}

class phone extends telephone{
	void fun3() {
		System.out.println("Use Also Media Experience");
	}
}

class smartphone extends phone {
	void fun4() {
		System.out.println("Explore the world with Internet");
	}
}


//Hierachical Inheritance

class UPI{
	void transaction() {
		System.out.println("Money Transaction Logic");
	}
}


class Gpay extends UPI{
	void Gpay_api() {
		System.out.println("GPAY API Logic for Money Transaction");
	}
}

class Pytem extends UPI{
	void Pytem_api() {
		System.out.println("PYTEM API Logic for Money Transaction");
	}
}


public class Oops_day2 {

	public static void main(String[] args) {
		
		
//		Ebook eb = new Ebook();
//		eb.fun1();
		
//		Author a = new Author();
//		a.fun2();
//		a.fun1();
		
		
//		Multi-level Inheritance
		
//		smartphone sm = new smartphone();
//		sm.fun4();
//		sm.fun3();
//		sm.fun2();
//		sm.fun1();
		
		
//		Hierachical Inheritance
//		It have only single super class with multiple Sub Classes
		
		Gpay g = new Gpay();
		g.Gpay_api();
		g.transaction();
		
		Pytem pt = new Pytem();
		pt.Pytem_api();
		pt.transaction();
		
		
	}

}
