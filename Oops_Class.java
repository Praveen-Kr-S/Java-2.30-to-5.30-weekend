package Learn_oopos;

//class syntax
/*
 * class class_name{
 * 	set of attributes and functions
 * }
 */


class Car{
	String brand = null;
	String model = null;
	String color = null;
	int top_speed = 0;
	int price = 0;
	
	public void engine() {
		System.out.println(this.brand+" Car Engine Start,Run,Off");
	}
}


class Mobile{
	String brand = null;
	String model = null;
	String color = null;
	int RAM = 0;
	int ROM = 0;
	int price = 0;
	
	public Mobile(String b,String m,String c,int ra, int ro,int p) {
		this.brand = b;
		this.model = m;
		this.color = c;
		this.RAM = ra;
		this.ROM = ro;
		this.price = p;
		
		System.out.println("Brand : "+this.brand);
		System.out.println("Model : "+this.model);
		System.out.println("Color : "+this.color);
		System.out.println("Ram : "+this.RAM+"GB");
		System.out.println("Rom : "+this.ROM+"GB");
		System.out.println("Price : "+this.price);
		
		System.out.println("-------------------------------");

	}
}



public class Oops_Class {
	

	public static void main(String[] args) {
		
	
		
//		classname variable = new classname(); 
		
	/*
		Car c1 = new Car();

				
		c1.brand = "TATA";
		c1.model = "Nexon";
		c1.color = "White";
		c1.top_speed = 180;
		c1.price = 1500000;
		System.out.println("Brand : "+c1.brand);
		System.out.println("Model : "+c1.model);
		System.out.println("Color : "+c1.color);
		System.out.println("Top_speed : "+c1.top_speed);
		System.out.println("Price : "+c1.price);
		c1.engine();
		
		System.out.println("----------------------");
		
		Car c2 = new Car();
		c2.brand = "Hyundai";
		c2.model = "i20";
		c2.color = "black";
		c2.top_speed = 160;
		c2.price = 1200000;
		System.out.println("Brand : "+c2.brand);
		System.out.println("Model : "+c2.model);
		System.out.println("Color : "+c2.color);
		System.out.println("Top_speed : "+c2.top_speed);
		System.out.println("Price : "+c2.price);
		c2.engine();
		
		System.out.println("----------------------");
		
		Car c3= new Car();
		c3.brand = "Voleswagon";
		c3.model = "Polo GT";
		c3.color = "Red";
		c3.top_speed = 200;
		c3.price = 1600000;
		System.out.println("Brand : "+c3.brand);
		System.out.println("Model : "+c3.model);
		System.out.println("Color : "+c3.color);
		System.out.println("Top_speed : "+c3.top_speed);
		System.out.println("Price : "+c3.price);
		c3.engine();
	*/

		
//		Constructor Function
		
		/*
		 * class className{
		 * 		//set of variables
		 * 		public className(arg){
		 * 			//block of code
		 * 	}
		 * 
		 * }
		 * 
		 * classname variable = new classname(arg_value); 
		 * 
		 * 
		 */
		
		
		Mobile m1 = new Mobile("Realme","11 Pro Plus","Green",12,256,30000);
		Mobile m2 = new Mobile("Realme","P3 Ultra","Red",12,256,32000);
		Mobile m3 = new Mobile("Samsung","S25","White",12,512,67000);






		

		
	}

}



