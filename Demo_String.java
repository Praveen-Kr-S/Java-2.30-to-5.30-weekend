package Learn_Strings;

public class Demo_String {

	public static void main(String[] args) {
		
//		String Literal
		String s1 = "Sahana";
		String s2 = "Sahana";
//		Index        012345
		
//		new Keyword method
//		String s3 = new String("Sahana");
//		String s4 = new String("Sahana");
//		System.out.println(s1 == s2);
//		System.out.println(s1 == s3);
//		System.out.println(s2.equals(s3));
//		System.out.println(s4 == s3);
		
//		String Build-in-functions
		
//		variable.Build-in-functions()
		
//		System.out.println(s2.toUpperCase());
//		System.out.println(s2.toLowerCase());
//		System.out.println(s2.charAt(4));
//		System.out.println(s2.indexOf('n'));
//		System.out.println("Hema Shree".codePointAt(3));
//		System.out.println("Praveen".codePointBefore(3));
//		System.out.println("Python Program".codePointCount(2, 6));
//		System.out.println("Hello Javaaa".compareTo("Hel"));
//		String name = "Poorna";
//		System.out.println(name.concat(" S"));
//		System.out.println(name);
//		System.out.println(name.contains("z"));
//		System.out.println(name.contentEquals("PoornA"));
//		System.out.println(name.equals("PoornA"));
//		System.out.println(name.equalsIgnoreCase("POORNA"));
//		System.out.println("Livewire in Salem".endsWith("salem"));
//		System.out.println("Livewire in Salem".startsWith("Li"));
//		System.out.println("".isBlank());
//		System.out.println(" ".isEmpty());
//		System.out.println("Java".length());
//		String n = "Hello";
//		String n1 = n.replace("H", "h");
//		System.out.println("n1 :"+n1);
//		System.out.println("n :"+n);
//		
//		System.out.println("bye".replaceAll("bye", "Hello"));
//		System.out.println("      Nisha S                  ");
//		System.out.println("      Nisha S                  ".strip());
//		System.out.println("Hello Guys".substring(6));
//		System.out.println("      K  um ar ".trim());
//		String d = "Hello Praveen, I am From Livewire";
//		String d1[] = d.splitWithDelimiters(" ",5);
//		for(String a: d1) {
//			System.out.println(a);
//		}
		
//		String Tasks
//		Count the no of Strings
		
//		
//		String m = "Praveen Kumar";
//		int c = 0;
//		for(int i=0;i<m.length();i++) {
//			c++;
//		}
//		System.out.println("Count Letters : "+c);
		
//		Count the Digit of String
		
		String n = "Praveen123357@gmail.com";
		int c = 0;
		for(int i=0;i<n.length();i++) {
			if(Character.isDigit(n.charAt(i))) {
				c++;
			}
		}
		
		System.out.println("Digits Count : "+c);
		
		
		
		
		
		
		
		

	}

}
