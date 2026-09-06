package Exception_demo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Demo_Serializer implements Serializable {
	
	String movie = "Kaithi";
	int play_hours = 1;

	public static void main(String[] args) throws IOException {
		Demo_Serializer ss = new Demo_Serializer();
//		System.out.println(ss.movie);
//		System.out.println(ss.play_hours);
		
		FileOutputStream f = new  FileOutputStream("C:\\Users\\Livewire\\Desktop\\Movie_data.txt");
		
		ObjectOutputStream os = new ObjectOutputStream(f);
		
		os.writeObject(ss);
		
		os.flush();
		os.close();
		
		System.out.println("Data Serialized");
		
		

	}

}
