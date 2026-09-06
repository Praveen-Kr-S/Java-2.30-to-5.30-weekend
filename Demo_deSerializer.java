package Exception_demo;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Demo_deSerializer {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		FileInputStream f = new FileInputStream("C:\\Users\\Livewire\\Desktop\\Movie_data.txt");
		ObjectInputStream oi = new ObjectInputStream(f);
		
		Demo_Serializer ss = (Demo_Serializer) oi.readObject();
		
		System.out.println("Movie Name : "+ss.movie);
		System.out.println("Play Time : "+ss.play_hours);
		
	}

}
